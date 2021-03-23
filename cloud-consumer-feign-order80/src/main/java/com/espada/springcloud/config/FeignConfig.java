package com.espada.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-16 15:12
 **/

@Configuration
public class FeignConfig {
    /**
     *     * feignClient日志级别配置
     *     *
     *     * @return
     *    
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        // 请求和响应的头信息,请求和响应的正文及元数据
        return Logger.Level.FULL;
    }
}
