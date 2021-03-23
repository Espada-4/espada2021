package com.espada.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: espada2021
 * @description: 规则类
 * @author: wu
 * @create: 2021-03-16 14:15
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        //随机负载均衡
        return new RandomRule();
    }
}
