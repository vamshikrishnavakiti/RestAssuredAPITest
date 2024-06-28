package EX_25062024_TestNGPriority;

import org.testng.annotations.Test;

public class lab275 {
// If all Methods have same priority executed in alphabetic order.
    @Test(priority = 1)
    public void testMethod1(){
        System.out.println("TC 1");
    }
    @Test(priority = 1)
    public void testMethod2(){
        System.out.println("TC 2");
    }
    @Test(priority = 1)
    public void testMethod3(){
        System.out.println("TC 3");
    }
    @Test(priority = 1)
    public void testMethod4(){
        System.out.println("TC 4");
    }
}

