package tangpoo.study.product_order_service.product;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static tangpoo.study.product_order_service.product.ProductSteps.*;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import tangpoo.study.product_order_service.AddProductRequest;
import tangpoo.study.product_order_service.ApiTest;

class ProductApiTest extends ApiTest {

    @Test
    void 상품등록() {
        final AddProductRequest request = 상품등록요청_생성();

        // API 요청
        final var response = 상품등록요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

    @Test
    void 상품조회(){
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        final Long productId = 1L;

        final var response = 상품조회요청(productId);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.jsonPath().getString("name")).isEqualTo("상품명");
    }

}
