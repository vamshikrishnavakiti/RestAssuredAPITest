package EX_27062024;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class lab291 {

    // Payload Using Hashmap
    //Previously added payload using String

   /* String payload ="{\n" +
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
    */
    @Test
 public void testPostRequest(){
        Map<String,Object> jsonBodyHashMap = new LinkedHashMap<>();
        Faker faker = new Faker();
        String fname=faker.name().firstName();
        String lname= faker.name().lastName();



        jsonBodyHashMap.put("firstname",fname);
        jsonBodyHashMap.put("lastname",lname);
        jsonBodyHashMap.put("totalprice",faker.random().nextInt(1000));
        jsonBodyHashMap.put("depositpaid",faker.random().nextBoolean());

        Map<String,Object> bookingDatesMap = new LinkedHashMap<>();
        bookingDatesMap.put("checkin","2018-01-01");
        bookingDatesMap.put("checkout","2018-01-02");
        jsonBodyHashMap.put("bookingdates",bookingDatesMap);
        jsonBodyHashMap.put("additionneeds","Breakfast , Lunch");

        System.out.println(jsonBodyHashMap);


        String Base_url="https://restful-booker.herokuapp.com";
        String Base_Path ="/booking";

        RequestSpecification rs = RestAssured
                .given();

        rs.baseUri(Base_url);
        rs.basePath(Base_Path);
        rs.contentType(ContentType.JSON).log().all();
        rs.body(jsonBodyHashMap);

//When
        Response response = rs.when().log().all().post();
        String responseString = response.asString();
        System.out.println(responseString);
// Then
        ValidatableResponse ValidatableResponse = response.then();
        ValidatableResponse.statusCode(200);




 }

}
