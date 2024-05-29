package tangpoo.study.product_order_service.order;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.springframework.http.MediaType;
import tangpoo.study.product_order_service.order.application.service.CreateOrderRequest;

public class OrderSteps {

    public static ExtractableResponse<Response> 상품주문요청(final CreateOrderRequest request) {
        return RestAssured.given().log().all()
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .body(request)
            .when()
            .post("/orders")
            .then()
            .log().all().extract();
    }

    public static CreateOrderRequest 상품주문요청_생성() {
        final Long productId = 1L;
        final int quantity = 2;
        return new CreateOrderRequest(productId, quantity);
    }
}
