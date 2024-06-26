package EX_22062024.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class lab269 {
@Test
    public void testBDDstylePostPositive(){
        //Post Request
        // Url
        // Body/Payload - Json
        // Header - Content Type

        String Base_url="https://restful-booker.herokuapp.com";
        String Base_Path ="/booking";
        String payload ="{\n" +
                "    \"firstname\" :\"Jim\" ,\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        //BDD Style
        RestAssured
                .given().baseUri(Base_url).basePath(Base_Path)
                .contentType(ContentType.JSON).log().all().body(payload)

                .when().log().all().post()
                .then().log().all().statusCode(200);
    }
}
