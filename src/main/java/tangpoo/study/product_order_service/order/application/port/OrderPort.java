package tangpoo.study.product_order_service.order.application.port;

import tangpoo.study.product_order_service.order.domain.Order;
import tangpoo.study.product_order_service.product.domain.Product;

public interface OrderPort {

    Product getProductById(final Long productId);

    void save(final Order order);
}
