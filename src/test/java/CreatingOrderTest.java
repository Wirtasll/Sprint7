import io.restassured.response.ValidatableResponse;
import org.junit.Test;

public class CreatingOrderTest extends BaseTest{
    private OrdersClient ordering = new OrdersClient();

    @Test
    public void creatingOrderBlack() {
        Order order = new Order("Naruto", "Uchiha", "Konoha, 142 apt.", 4, "+7 800 355 35 35", 5, "2020-06-06", "Saske, come back to Konoha", "BLACK");
        ValidatableResponse response;
        response = ordering.creatingOrder(order);
        response.assertThat()
                .statusCode(201);
    }
    @Test
    public void creatingOrderGrey() {
        Order order = new Order("Naruto", "Uchiha", "Konoha, 142 apt.", 4, "+7 800 355 35 35", 5, "2020-06-06", "Saske, come back to Konoha", "GREY");
        ValidatableResponse response;
        response = ordering.creatingOrder(order);
        response.assertThat()
                .statusCode(201);
    }
    @Test
    public void creatingOrderNoColor() {
        Order order = new Order("Naruto", "Uchiha", "Konoha, 142 apt.", 4, "+7 800 355 35 35", 5, "2020-06-06", "Saske, come back to Konoha", null);
        ValidatableResponse response;
        response = ordering.creatingOrder(order);
        response.assertThat()
                .statusCode(201);
    }


}
