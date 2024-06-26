package EX_22062024.CRUD.PUT;

import io.qameta.allure.testng.Tag;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab271_NonBdd {
 RequestSpecification rs;
 Response response;
 ValidatableResponse vr;
 String token="6315c83a1e00860";
 String bookingID="3837";
    String Base_url="https://restful-booker.herokuapp.com";
    String Base_Path ="/booking";

 @Test
 public void testPutReqNonBdd(){

 String BASE_PATH_New= Base_Path+"/"+bookingID;
     System.out.println(BASE_PATH_New);

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

rs.baseUri(Base_url);
rs.basePath(BASE_PATH_New);
rs.contentType(ContentType.JSON);
rs.cookie("token",token);
rs.body(payload).log().all();


response =rs.when().log().all().put();

vr= response.then().log().all();

vr.body("firstname", Matchers.equalTo("jim"));
vr.body("lastname",Matchers.equalTo("Brown"));
 }


}
