package EX_25062024_TestNGPriority;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.github.javafaker.PhoneNumber;
import org.testng.annotations.Test;

public class FakerDemo {
    @Test
    public void testDemo1(){
        Faker faker = new Faker();
         String username= faker.name().username();
        String ph =faker.phoneNumber().phoneNumber();
      // String phoneNumber = faker.phoneNumber().phoneNumber();

        System.out.println(username);
        System.out.println(ph);
    }
}
