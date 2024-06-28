package EX_25062024_TestNGPriority;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class lab279 {

    //parametrized
    @Parameters("browser")
    @Test(priority = 1)
    public void testDemoBrowser(String value) {

        System.out.println("Browser is" + value);

        switch (value) {
            case "FF":
                System.out.println("Fire Fox");
                break;

            case "Chrome":
                System.out.println("Chrome browser");
                break;
            case "IE":
                System.out.println("Internet Explorer");
                break;
            default:
                System.out.println("No browser selected");
        }
    }
}
