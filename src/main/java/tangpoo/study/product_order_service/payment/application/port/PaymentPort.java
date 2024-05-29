package tangpoo.study.product_order_service.payment.application.port;

import tangpoo.study.product_order_service.order.domain.Order;
import tangpoo.study.product_order_service.payment.domain.Payment;

public interface PaymentPort {

    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
