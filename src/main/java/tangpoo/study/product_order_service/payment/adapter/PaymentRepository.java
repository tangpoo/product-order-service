package tangpoo.study.product_order_service.payment.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import tangpoo.study.product_order_service.payment.domain.Payment;

interface PaymentRepository extends JpaRepository<Payment, Long> {

}
