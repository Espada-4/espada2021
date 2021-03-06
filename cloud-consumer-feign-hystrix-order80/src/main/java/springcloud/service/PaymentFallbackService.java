package springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-16 17:19
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK,...";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_TimeOut,...";
    }
}
