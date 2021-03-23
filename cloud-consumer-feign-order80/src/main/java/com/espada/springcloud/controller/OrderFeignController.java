package com.espada.springcloud.controller;

import com.espada.springcloud.entities.CommonResult;
import com.espada.springcloud.entities.Payment;
import com.espada.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-16 14:51
 **/
@RestController
@RequestMapping("/consumer")
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentService;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPyamentById(@PathVariable("id")Long id){
        return paymentService.getPaymentById(id);
    }

}
