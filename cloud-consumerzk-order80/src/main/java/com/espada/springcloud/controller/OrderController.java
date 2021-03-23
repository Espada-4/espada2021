package com.espada.springcloud.controller;

import com.espada.springcloud.entities.CommonResult;
import com.espada.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-11 17:09
 **/
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {
    private static final String INVOKE_URL = "http://cloud-provider-payment";


    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/zk")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }

}
