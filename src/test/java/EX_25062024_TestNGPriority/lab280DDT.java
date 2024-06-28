package EX_25062024_TestNGPriority;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class lab280DDT {
    //Data driven testing-TestNg
    // Mix the Data Driven with the Apache poi
    @DataProvider
      public Object[][] getData(){

          return new Object[][]{
                  new Object[]{"admin","admin"},
                   new Object[]{"admin","password"},
                  new  Object[]{"admin","password123"}
          };
    }
    @Test(dataProvider =  "getData")
    public void testAuthtogetToken(String username, String password){
        System.out.println(username);
        System.out.println(password);

    }
}
