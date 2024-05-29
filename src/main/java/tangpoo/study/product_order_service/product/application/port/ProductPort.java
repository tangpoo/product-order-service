package tangpoo.study.product_order_service.product.application.port;

import tangpoo.study.product_order_service.product.domain.Product;

public interface ProductPort {

    void save(final Product product);

    Product getProduct(Long productId);
}
