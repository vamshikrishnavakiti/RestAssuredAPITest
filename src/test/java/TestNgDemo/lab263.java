package TestNgDemo;


import org.testng.annotations.*;

public class lab263 {
    @BeforeSuite
    void demo1(){
        System.out.println("Before Suite");
        System.out.println("Open DB Connection");
        System.out.println("Read CSV file");
    }
    @BeforeTest
    void demo2(){
        System.out.println("Before Test");
    }
    @BeforeClass
    void demo3(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    void demo4(){
        System.out.println("Before Method");
    }
    @Test
    void demo5(){
        System.out.println("Test Cases");
    }
    @AfterMethod
    void demo6(){
        System.out.println("After Method");
    }
    @AfterClass
    void demo7(){
        System.out.println("After Class");
    }
    @AfterTest
    void demo8(){
        System.out.println("After Test");
    }
    @AfterSuite
    void demo9(){
        System.out.println("After suite");
        System.out.println("Close DB Connection");
        System.out.println("Close all files");
    }
}
