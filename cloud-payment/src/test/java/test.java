import com.espada.springcloud.dao.PaymentDao;
import com.espada.springcloud.entities.CommonResult;
import com.espada.springcloud.entities.Payment;
import com.espada.springcloud.sercive.PaymentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.activation.DataSource;
import javax.annotation.Resource;

/**
 * @program: espada2021
 * @description:
 * @author: wu
 * @create: 2021-03-10 18:43
 **/
public class test {
    @Resource
    private PaymentService paymentService;

    @Resource
    private PaymentDao paymentDao;
    @Test
    public void test(){
        Payment payment = paymentDao.getPaymentById(Long.valueOf(1));
        System.out.println(payment);
    }
}
