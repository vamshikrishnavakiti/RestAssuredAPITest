package EX_22062024.CRUD.GET.BDDStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class lab267 {

    // Given ->
    // URL
    // Header ?, Cookies
    // base url = http://api.zippopotam.us
    // base path = /IN/500079
    // AUTH - BASIC, Digest, JWT, Bearer Token, OAuth 2.0 ?=No



    // When ->
    // Payload -? No/Yes - Json. XML -> String, Hashmap, Object Class
    // GET Method

    //Then()
    // Response Validation
    // Status Code
    // Response Body
    // Time, Header, Cookies
@Test
    public void getRequestBDDStyle(){
    RestAssured
            .given()

            .baseUri("http://api.zippopotam.us")
            .basePath("/IN/509001")
            .when().log().all().get()

            .then()
            .log().all()
            .statusCode(200);
    }
}
