package tangpoo.study.product_order_service.order;

import org.springframework.stereotype.Component;
import tangpoo.study.product_order_service.product.Product;

interface OrderPort {

    Product getProductById(final Long productId);

    void save(final Order order);
}
