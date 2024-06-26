package EX_22062024.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class lab270 {
    // NON BDD Style
    @Test
    public void createBookingNonBDDStyle(){
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

        // NON-BDD Style
  //Given
        RequestSpecification rs = RestAssured
                .given();

        rs.baseUri(Base_url);
        rs.basePath(Base_Path);
        rs.contentType(ContentType.JSON).log().all();
        rs.body(payload);

//When
        Response response = rs.when().log().all().post();
         String responseString = response.asString();
        System.out.println(responseString);
// Then
        ValidatableResponse ValidatableResponse = response.then();
        ValidatableResponse.statusCode(200);


    }

}
