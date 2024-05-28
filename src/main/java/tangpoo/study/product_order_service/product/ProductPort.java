package tangpoo.study.product_order_service.product;

public interface ProductPort {

    void save(final Product product);

    Product getProduct(Long productId);
}
