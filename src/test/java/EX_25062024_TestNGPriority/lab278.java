package EX_25062024_TestNGPriority;

import org.testng.annotations.Test;
//Test case dependencies.
public class lab278 {

    @Test(priority = 0)
    public void TokenGen(){
        System.out.println("Token Gen");
    }

    @Test(dependsOnMethods = "TokenGen")
    public void createBooking(){
        System.out.println("Booking created");
    }

    @Test(dependsOnMethods = "createBooking")
    public void getBooking(){
        System.out.println("Fetch Booking Id");
    }

    @Test(dependsOnMethods = "getBooking")
    public void updateBooking(){
        System.out.println("Updated booking");
    }

    @Test(dependsOnMethods = "updateBooking")
    public void deteleBooking(){
        System.out.println("Booking deleted");
    }

}
