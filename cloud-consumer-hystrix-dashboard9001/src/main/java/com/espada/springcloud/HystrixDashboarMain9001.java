package com.espada.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-16 18:30
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboarMain9001 {
    public static void main(String[] args){
        SpringApplication.run(HystrixDashboarMain9001.class,args);
    }
}
