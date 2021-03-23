package com.espada.springcloud.sercive;

import com.espada.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-10 18:10
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
