import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-scooter.praktikum-services.ru";
    }
    @After
    public void runAfterEveryTest() {
        System.out.println("@After executed \n");
    }
}
