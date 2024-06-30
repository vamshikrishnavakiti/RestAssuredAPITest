package EX_27062024.Gson.Serialization.lab293;

import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class lab292 {
    //Payload - String, Map
    // Most Used - Class and Objects
    //Swagger API - Document
    RequestSpecification r = RestAssured
            .given();

    Response response;

    ValidatableResponse validatableResponse;


    @Description("TC#1 - Verify that create booking is working with valid payload")
    @Test
    public void testNonBDDStylePOSTPositive() {

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
        Faker faker = new Faker();
        String firstName = faker.name().firstName();

        System.out.println(firstName);

        Booking booking = new Booking();
        booking.setFirstname("Vamshi");
        booking.setLastname("Krishna");
        booking.setTotalprice(114);
        booking.setDepositpaid(true);
        Bookingdates bookingDates = new Bookingdates();
        bookingDates.setCheckin("2024-06-11");
        bookingDates.setCheckout("2024-06-12");

//        String payload = "{\n" +
//                "    \"firstname\" : \""+firstName+"\",\n" +
//                "    \"lastname\" : \"Brown\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"Breakfast\"\n" +
//                "}";

//        r.baseUri(BASE_URL);
//        r.basePath(BASE_PATH);
//        r.contentType(ContentType.JSON).log().all();
//        r.body(booking);
//
//        response = r.when().log().all().post();
//        String responseString = response.asString();
//        System.out.println(responseString);
//
//
//        validatableResponse = response.then();
//        validatableResponse.statusCode(200);


        System.out.println(booking.toString());



    }

    @Description("TC#2 - Verify that create booking not working, with 500 Error")
    @Test
    public void testNonBDDStylePOSTNegative() {

        String BASE_URL = "https://restful-booker.herokuapp.com";
        String BASE_PATH = "/booking";
  Booking booking = new Booking();
  booking.setFirstname("Vamshi");
  booking.setLastname("Krishna");
  booking.setTotalprice(150);
  booking.setDepositpaid(true);

  Bookingdates bookingdates = new Bookingdates();
  bookingdates.setCheckin("24-01-01");
  bookingdates.setCheckout("24-01-05");
  booking.setAdditionalneeds("Break Fast, Lunch");
        System.out.println(booking.toString());
        r.baseUri(BASE_URL);
        r.basePath(BASE_PATH);
        r.contentType(ContentType.JSON).log().all();
        r.body(booking);

        response = r.when().log().all().post();
        String responseString = response.asString();
        System.out.println(responseString);


        validatableResponse = response.then();
        validatableResponse.statusCode(500);




    }

}
