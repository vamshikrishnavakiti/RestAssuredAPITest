package EX_27062024.Gson.Serialization.gson;

import EX_27062024.Gson.Serialization.lab293.Booking;
import com.google.gson.Gson;
import org.testng.annotations.Test;

@Test
public class deserialisation {

    public void deserialization(){
        String jsonString ="{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        Gson gson =new Gson();
        Booking booking =gson.fromJson(jsonString,Booking.class);
        System.out.println(booking.toString());
        System.out.println(booking.getFirstname());
        System.out.println(booking.getDepositpaid());
    }
}
