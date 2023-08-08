package bestbuyinfo;

import besybuyinfo.StoresSteps;
import io.restassured.http.ContentType;
import model.StorePojo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import testbase.StoreTest;

@RunWith(SerenityRunner.class)
public class StoresCRUDTest extends StoreTest {

    String name = "prime";
    String type = "BigBox";
    String address = "13333 Ridgedale Dr";
    String address2 = "13333 Ridgedale Dr";
    String city = "Hopkins";
    String state = "MN";
    String zip = "55305";
    int lat = 64;
    int lng = 94;
    String hours = "Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8";
    @Steps
    StoresSteps storesSteps;

    @Title("This will create a store")
    @Test
    public void test01() {

//        List<String> storeServices = new ArrayList<>();
//        storeServices.add("Geek Squad Services");
//        storeServices.add("Pacific Kitchen & Home");
        //storesSteps.createStore(name ,type, address, address2, city, state,zip, lat, lng,hours ).statusCode(201);

        StorePojo storePojo =new StorePojo();
        storePojo.setName(name);
        storePojo.setType(type);
        storePojo.setAddress(address);
        storePojo.setAddress2(address2);
        storePojo.setCity(city);
        storePojo.setState(state);
        storePojo.setZip(zip);
        storePojo.setLat(lat);
        storePojo.setLng(lng);
        storePojo.setHours(hours);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .body(storePojo)
                .post()
                .then().log().all();





    }

    }

