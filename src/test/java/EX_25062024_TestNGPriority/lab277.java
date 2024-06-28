package EX_25062024_TestNGPriority;

import org.testng.annotations.Test;

public class lab277 {
@Test
    public void serverstart(){
        System.out.println("I will run first");
    }
@Test(dependsOnMethods = "serverstart")
    public void method1(){
        System.out.println("Method 1");
    }
}
