package EX_22062024.CRUD.DELETE;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab273_Deler_NonBdd {
 RequestSpecification rs;
 Response response;
 ValidatableResponse vr;
 String token="6315c83a1e00860";
 String bookingID="3837";
    String Base_url="https://restful-booker.herokuapp.com";
    String Base_Path ="/booking";

 @Test
 public void testDeleteReqNonBdd(){

 String BASE_PATH_New= Base_Path+"/"+bookingID;
     System.out.println(BASE_PATH_New);



rs.baseUri(Base_url);
rs.basePath(BASE_PATH_New);
rs.contentType(ContentType.JSON);
rs.cookie("token",token);
rs.log().all();


response =rs.when().log().all().delete();

vr= response.then().log().all();

vr.statusCode(201);
 }


}
