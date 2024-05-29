package tangpoo.study.product_order_service.payment;

import tangpoo.study.product_order_service.order.Order;

interface PaymentPort {

    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
