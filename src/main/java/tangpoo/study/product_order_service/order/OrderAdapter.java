package tangpoo.study.product_order_service.order;

import org.springframework.stereotype.Component;
import tangpoo.study.product_order_service.product.Product;
import tangpoo.study.product_order_service.product.ProductRepository;

@Component
class OrderAdapter implements OrderPort {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;


    private OrderAdapter(final ProductRepository productRepository,
        OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public Product getProductById(final Long productId) {
        return productRepository.findById(productId)
            .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다."));
    }

    @Override
    public void save(final Order order) {
        orderRepository.save(order);
    }
}
