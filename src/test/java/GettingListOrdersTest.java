import org.junit.Test;
import static io.restassured.RestAssured.given;

public class GettingListOrdersTest extends BaseTest{

    @Test
    public void gettingListOrders () {
        given()
                .header("Content-type", "application/json")
                .and()
                .body("")
                .get("/v1/orders?limit=10&page=0")
                .then()
                .assertThat()
                .statusCode(200);
    }
}