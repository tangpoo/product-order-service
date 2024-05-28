package tangpoo.study.product_order_service;

public interface ProductPort {

    void save(final Product product);

    Product getProduct(Long productId);
}
