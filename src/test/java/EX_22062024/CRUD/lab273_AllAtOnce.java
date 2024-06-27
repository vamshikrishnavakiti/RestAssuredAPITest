package EX_22062024.CRUD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class lab273_AllAtOnce {
    String token;
    Integer bookingID;
    RequestSpecification requestSpecification= RestAssured.given();
    ValidatableResponse validatableResponse;
    Response response;

   @BeforeSuite
    public void getToken(){
   String payload ="{\n" +
           "    \"username\" : \"admin\",\n" +
           "    \"password\" : \"password123\"\n" +
           "}";
   requestSpecification.baseUri("http://restful-booker.herokuapp.com/");
   requestSpecification.basePath("auth");
   requestSpecification.contentType(ContentType.JSON);
   requestSpecification.body(payload);


   response=requestSpecification.post();

   validatableResponse =response.then();
   validatableResponse.statusCode(200);

   // Extract token from this
   token=    response.then().log().all().extract().path("token");
       Assert.assertNotNull(token);
    }
    @BeforeTest
    public void getBookingId(){
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
        requestSpecification.baseUri("http://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
       // requestSpecification.cookie("token",token);
        requestSpecification.body(payload);

       response= requestSpecification.when().post();


       validatableResponse= response.then();
       String responseString = response.asString();
        System.out.println(responseString);

        validatableResponse.statusCode(200);
        bookingID= response.then().log().all().extract().path("bookingid");
        System.out.println(bookingID);
        Assert.assertNotNull(bookingID);


    }

    @Test
    public void testPUTRequestPositive(){
        System.out.println("Test Put request");
        String payload ="{\n" +
                "    \"firstname\" :\"Vamshi\" ,\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-02\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +

                "}";

        requestSpecification.baseUri("http://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking"+bookingID);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);

        //Put Request

        requestSpecification.body(payload).log().all();
        response=requestSpecification.when().post();


        validatableResponse.statusCode(200);
        String firstNameResponse=response.then().log().all().extract().path("bookingid");
         Assert.assertEquals(firstNameResponse,"Vamshi");


       String fullResponseJsonString= response.toString();
        System.out.println(fullResponseJsonString);

        // Verify all the keys and values pairs in the response.
        //firstname, lastname, deposite, total,checkin

        // 3 ways you can verify the response.

        //1) RA- Matchers

        validatableResponse.body("Vamshi", Matchers.equalTo("firstname"));


        //2) Testng Asserts.-
        // Assert.assertEqual(firstNameResponse,"Vamshi");
        response.then().log().all().extract().path("firstname");
        Assert.assertEquals(firstNameResponse,"Vamshi");

        //3) TestNG Assertion with JSON Path Lib

        JsonPath jsonPath = new JsonPath(fullResponseJsonString);
        String firstNameJSONPathExtracted=jsonPath.getString("firstname");
        String lastNameJSONPathExtracted=jsonPath.getString("lastname");
        Integer totalPriceJSONPathExtracted=jsonPath.getInt("totalprice");
        Assert.assertEquals(firstNameJSONPathExtracted,"Vamshi");
        Assert.assertEquals(lastNameJSONPathExtracted,"Brown");
        Assert.assertEquals(totalPriceJSONPathExtracted,"111");

        //4) AssertJ Matcher
 assertThat(firstNameJSONPathExtracted)
         .isEqualTo("Vamshi")
         .isNotBlank().isNotEmpty();

 assertThat(totalPriceJSONPathExtracted).isNotZero().isNotNegative();



    }


}
