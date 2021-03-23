package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-11 17:03
 * 在主启动类上加@RibbonClient注解，表示访问CLOUD-PAYMENT-SERVICE服务时，使用我们自定义的负载均衡算法
 * 添加@EnableHystrix，启用hystrix
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}
