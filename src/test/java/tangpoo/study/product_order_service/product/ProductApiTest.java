package tangpoo.study.product_order_service.product;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static tangpoo.study.product_order_service.product.ProductSteps.상품등록요청;
import static tangpoo.study.product_order_service.product.ProductSteps.상품등록요청_생성;
import static tangpoo.study.product_order_service.product.ProductSteps.상품조회요청;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import tangpoo.study.product_order_service.ApiTest;
import tangpoo.study.product_order_service.product.adapter.ProductRepository;
import tangpoo.study.product_order_service.product.application.service.AddProductRequest;

class ProductApiTest extends ApiTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    void 상품등록() {
        final AddProductRequest request = 상품등록요청_생성();

        // API 요청
        final var response = 상품등록요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

    @Test
    void 상품조회() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        final Long productId = 1L;

        final var response = 상품조회요청(productId);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.jsonPath().getString("name")).isEqualTo("상품명");
    }

    @Test
    void 상품수정() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        final long productId = 1L;

        ExtractableResponse<Response> response = 상품수정요청(productId);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(productRepository.findById(1L).get().getName()).isEqualTo("상품 수정");
    }

    private static ExtractableResponse<Response> 상품수정요청(final long productId) {
        return RestAssured.given().log().all()
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .body(ProductSteps.상품수정요청_생성())
            .when()
            .patch("/products/{productId}", productId)
            .then()
            .log().all().extract();
    }
}
