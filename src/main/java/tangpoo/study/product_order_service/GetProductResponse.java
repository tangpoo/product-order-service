package tangpoo.study.product_order_service;

import org.springframework.util.Assert;
import tangpoo.study.product_order_service.DiscountPolicy;

public record GetProductResponse(
    long id,
    String name,
    int price,
    DiscountPolicy discountPolicy
) {

    public GetProductResponse(long id, String name, int price, DiscountPolicy discountPolicy) {
        Assert.notNull(id, "상품 ID는 필수입니다.");
        Assert.hasText(name, "상품명느 필수입니다.");
        Assert.notNull(discountPolicy, "할인 정책은 필수입니다.");
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountPolicy = discountPolicy;
    }
}
