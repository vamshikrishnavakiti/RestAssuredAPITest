package TestNgDemo;


import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class lab262 {
@Description("Verify TC 1")
   @Test(enabled = false)
    public void tc1(){
        System.out.println("TC 1");
    }
    @Description("Verify TC 2")
   @Test
    public void tc2(){
        System.out.println("TC 2");
    }
    @Description("Verify TC 3")
   @Test
    public void tc3(){
        System.out.println("TC 3");
    }
}
