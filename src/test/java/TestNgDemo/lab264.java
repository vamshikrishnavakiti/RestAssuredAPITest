package TestNgDemo;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class lab264 {
    @Description("TC 1")
    @Test
    public void testcase()
    {
        // Verify expect result with actual result
        // 2 types of assertions
        // Type 1-- Soft Assertion
//        SoftAssert s = new SoftAssert();
//        s.assertEquals("Vamshi", "Vamshi", "Not Equal");
//        s.assertAll();
      // Hard Assertion
        Assert.assertEquals("Vamshi","vamshi");
        System.out.println("End");
    }
}
