package com.espada.springcloud.sercive;

import com.espada.springcloud.dao.PaymentDao;
import com.espada.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-10 18:12
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
