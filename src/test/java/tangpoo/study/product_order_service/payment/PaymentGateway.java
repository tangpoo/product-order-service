package tangpoo.study.product_order_service.payment;

interface PaymentGateway {

    void excute(int totalPrice, String cardNumber);
}
