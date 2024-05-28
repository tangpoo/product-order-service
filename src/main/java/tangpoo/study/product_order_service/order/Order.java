package tangpoo.study.product_order_service.order;

import org.springframework.util.Assert;
import tangpoo.study.product_order_service.product.Product;

class Order {

    private Product product;
    private int quantity;
    private Long id;

    public Order(final Product product, final int quantity) {
        this.product = product;
        this.quantity = quantity;
        Assert.notNull(product, "상품은 필수입니다.");
        Assert.isTrue(quantity > 0, "수량은 0보다 커야 합니다.");
    }

    public void assignId(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
