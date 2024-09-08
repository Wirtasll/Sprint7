
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class OrdersClient extends BaseTest {
    private static final String LOGIN = "/api/v1/orders";


    public ValidatableResponse creatingOrder(Order order) {
        return given()
                .header("Content-type", "application/json")
                .and()
                .body(order)
                .when()
                .post(LOGIN).
                then();
    }
}
