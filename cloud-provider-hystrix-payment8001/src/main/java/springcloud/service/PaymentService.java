package springcloud.service;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 */
public interface PaymentService {
    
    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(Integer id);
}
