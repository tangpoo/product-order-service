package tangpoo.study.product_order_service.product.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import tangpoo.study.product_order_service.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
