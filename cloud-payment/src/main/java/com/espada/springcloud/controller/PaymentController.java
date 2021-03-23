package com.espada.springcloud.controller;

import com.espada.springcloud.entities.CommonResult;


import com.espada.springcloud.entities.Payment;
import com.espada.springcloud.sercive.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-10 18:19
 **/
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;


    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("****插入结果：{result}");
        if (result > 0) {
            return new CommonResult(200, "插入成功,serverPort: " + serverPort, result);
        } else {
            return new CommonResult(404, "插入失败");
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果：{payment}");
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort: " + serverPort, payment);
        } else {
            return new CommonResult(444, "无记录");
        }
    }

    /**
     * 服务发现
     * @return
     */
    @GetMapping("/discovery")
    public Object discovery(){
        //获取服务列表
        List<String> services = discoveryClient.getServices();
        services.forEach(log::info);
        //获取具体服务下的实例列表
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach((ServiceInstance instance) -> log.info(instance.getServiceId() + "/t" + instance.getHost() + "/t" + instance.getPort() + "/t" + instance.getUri()));
        return this.discoveryClient;
    }

}
