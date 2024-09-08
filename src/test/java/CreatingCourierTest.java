
import static org.hamcrest.CoreMatchers.is;

import io.restassured.response.ValidatableResponse;
import org.junit.Test;

public class CreatingCourierTest extends BaseTest{
    private CourierClient client = new CourierClient();


    @Test
    public void createCourier(){
        Courier courier = new Courier("itman", "12345", "Naruto");
        ValidatableResponse response;
        response = client.createCourier(courier);
        response.assertThat()
                .statusCode(201)
                .body("ok", is(true));

    }
    @Test
    public void createDublerCourier(){
        Courier courier = new Courier("itman", "12345", "Naruto");
        ValidatableResponse response;
        response = client.createCourier(courier);
        response.assertThat()
                .statusCode(409)
                .body("message", is("Этот логин уже используется. Попробуйте другой."));

    }
    @Test
    public void createCourierWithoutOneField(){
        Courier courier = new Courier(null, "12345", "Naruto");
        ValidatableResponse response;
        response = client.createCourier(courier);
        response.assertThat()
                .statusCode(400)
                .body("message", is("Недостаточно данных для создания учетной записи"));

    }



}