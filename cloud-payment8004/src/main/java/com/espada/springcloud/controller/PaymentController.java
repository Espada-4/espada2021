package com.espada.springcloud.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

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
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/zk")
    public String paymentzk(){
        return "springCloud with zookeeper"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
