package tangpoo.study.product_order_service.payment;

import static org.assertj.core.api.Assertions.*;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import tangpoo.study.product_order_service.ApiTest;
import tangpoo.study.product_order_service.order.OrderSteps;
import tangpoo.study.product_order_service.product.ProductSteps;

public class PaymentApiTest extends ApiTest {

    @Test
    void 상품주문() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        OrderSteps.상품주문요청(OrderSteps.상품주문요청_생성());
        final var request = PaymentSteps.주문결제요청_생성();

        final var response = PaymentSteps.주문결제요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

}
