package tangpoo.study.product_order_service.order.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import tangpoo.study.product_order_service.order.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
