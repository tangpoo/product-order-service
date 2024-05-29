package tangpoo.study.product_order_service.product;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import tangpoo.study.product_order_service.product.domain.DiscountPolicy;
import tangpoo.study.product_order_service.product.domain.Product;

class ProductTest {

    @Test
    void update() {
        final Product product = new Product("상품명", 1000, DiscountPolicy.NONE);

        product.update("상품 수정", 2000, DiscountPolicy.NONE);

        assertThat(product.getName()).isEqualTo("상품 수정");
        assertThat(product.getPrice()).isEqualTo(2000);
    }

    @Test
    void non_discounted_product() {
        final Product product = new Product("상품명", 1000, DiscountPolicy.NONE);

        final int discountPrice = product.getDiscountPrice();

        assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void fix_1000_discounted_product() {
        final Product product = new Product("상품명", 1000, DiscountPolicy.FIX_1000_AMOUNT);

        final int discountPrice = product.getDiscountPrice();

        assertThat(discountPrice).isEqualTo(0);
    }
}