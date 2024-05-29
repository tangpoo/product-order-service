package tangpoo.study.product_order_service.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import tangpoo.study.product_order_service.product.domain.DiscountPolicy;

class DiscountPolicyTest {

    @Test
    void none_discount_policy() {
        final int price = 1000;

        final int discountPrice = DiscountPolicy.NONE.applyDiscount(price);

        Assertions.assertThat(discountPrice).isEqualTo(price);
    }

    @Test
    void fix_1000_discountPolicy() {
        final int price = 2000;

        final int discountPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        Assertions.assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void over_discounted_policy() {
        final int price = 500;

        final int discountPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        Assertions.assertThat(discountPrice).isEqualTo(0);
    }
}