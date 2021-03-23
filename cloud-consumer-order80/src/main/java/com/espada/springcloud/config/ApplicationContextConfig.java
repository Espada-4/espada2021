package com.espada.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 原本发送Http请求我们会使用封装好的HttpClient工具类，
 * 而Spring为我们提供了RestTemplate工具集。
 * 它提供了多种便携访问远程Http服务的方法，
 * 是一种简单便捷的访问restful服务模板类
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-11 17:14
 * @LoadBalanced 自动负载均衡
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
