package tangpoo.study.product_order_service;

import org.springframework.util.Assert;
import tangpoo.study.product_order_service.DiscountPolicy;

public record UpdateProductRequest(String name, int price, DiscountPolicy discountPolicy) {

    public UpdateProductRequest {
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "상품 가격은 0보다 커야 합니다.");
        Assert.notNull(discountPolicy, "할인 정책은 필수입니다.");
    }
}
