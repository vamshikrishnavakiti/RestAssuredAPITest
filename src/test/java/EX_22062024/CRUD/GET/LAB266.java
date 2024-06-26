package EX_22062024.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class LAB266 {
    //Two ways to create a REST ASSURES TEst case
    // BDD Style- Given , When , Them
    // NON-Bdd style- Classes and objects -D2

    // GET-request - http://api.zippopotam.us/IN/{pincode}
    // URL - http://api.zippopotam.us
    // Path -/in/{pincode}
    // HEADER ?
    // GET Method
    // Base url = http://api.zippopotam.us
    // Base path = /IN/500079
    // Payload - No
    //---------------------------------------------------
    //Verification
    // Status code
    // Response Body
    // Time, Header, Cookies

// NON BDD Style
    @Test
    public void getRequest(){
        RequestSpecification rs = RestAssured.given();
        rs.baseUri("http://restful-booker.herokuapp.com");
        rs.basePath("/booker/2002").log().all();
        rs.when().get();
        rs.then().log().all().statusCode(200);
    }
    @Test
    public void getNegetiveRequest(){
        RequestSpecification rs = RestAssured.given();
        rs.baseUri("http://restful-booker.herokuapp.com");
        rs.basePath("/booker/-2002").log().all();
        rs.when().get();
        rs.then().log().all().statusCode(200);
    }
}
