package EX_27062024.Gson.Serialization.gson;

import EX_27062024.Gson.Serialization.lab293.Booking;
import EX_27062024.Gson.Serialization.lab293.Bookingdates;
import com.google.gson.Gson;
import org.testng.annotations.Test;

public class serialization {
@Test
    public void serialization(){
        Booking booking = new Booking();
        booking.setFirstname("Vamshi");
        booking.setLastname("Krishna");
        booking.setTotalprice(150);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("24-01-01");
        bookingdates.setCheckout("24-01-05");
        booking.setAdditionalneeds("Break Fast, Lunch");

        System.out.println(booking);
        Gson gson = new Gson();
        String jsonStringofpayload =gson.toJson(booking);
        System.out.println(jsonStringofpayload);

    }
}
