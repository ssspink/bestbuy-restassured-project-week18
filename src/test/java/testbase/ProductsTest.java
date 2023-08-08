package testbase;

import constants.Path;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import utils.PropertyReader;

/**
 * Created by Jay
 */
public class ProductsTest {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
        RestAssured.basePath = Path.PRODUCT;


    }

}
