package com.espada.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-09 17:38
 * @EnableEurekaClient 将payment注册进服务中心
 * @EnableDiscoveryClient 服务发现
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain {
    public static void main(String[] args){
        SpringApplication.run(PaymentMain.class,args);
    }
    
}

