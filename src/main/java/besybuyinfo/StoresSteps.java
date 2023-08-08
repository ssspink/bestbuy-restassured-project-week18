package besybuyinfo;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import model.StorePojo;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class StoresSteps    {

    @Step ("creating new Store with name:{0} ,type:{1}, Address{2},Address2{3}, City{4},State{5}, Zip{6},Lat{7} ,Lng{8}, Hours{9}")
    public ValidatableResponse createStore (String name, String type, String address, String address2, String city, String state,
                                            String zip, int lat, int lng, String hours){


        StorePojo storePojo= new StorePojo();
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
       // storePojo.setServices(services);

        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .when()
                .body(storePojo)
                .post()
                .then();

    }


    }








