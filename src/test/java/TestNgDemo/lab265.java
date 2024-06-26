package TestNgDemo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab265 {
    //CRUD Operation
    //Create booking, --ID
    //Create Auth - Token
    //Put--ID , Auth
    //Delete -ID
    //Get -ID "Verify it should not exit"


    String token;
    Integer bookingID;

    public String getToken(){
        token="123";
        return token;
    }
    @BeforeTest
    public void getTokenAndBookingID(){
        token = getToken();
        bookingID=123;
    }
    @Test
   public void testPUTReq(){
       System.out.println(token);
       System.out.println(bookingID);
       //PUT Code
   }
   @Test
    public void testDeleteReq(){
        System.out.println(token);
        System.out.println(bookingID);
        //Delete Code
    }
    @Test
    public void testGETReq(){
        System.out.println(token);
        System.out.println(bookingID);
        //Get Code
    }
}
