package tangpoo.study.product_order_service.order;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tangpoo.study.product_order_service.product.DiscountPolicy;
import tangpoo.study.product_order_service.product.Product;

class OrderTest {

    @Test
    void getTotalPrice() {
        final Order order = new Order(new Product("상품명", 1000, DiscountPolicy.FIX_1000_AMOUNT), 2);

        final int totalPrice = order.getTotalPrice();

        Assertions.assertThat(totalPrice).isEqualTo(0);
    }
}