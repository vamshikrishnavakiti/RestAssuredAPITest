package org.example.Lab1;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestNgDemo {
    @BeforeSuite
    void demo5(){
        System.out.println("Before Suite");
    }
    @BeforeMethod
    void demo4(){
        System.out.println("Before Method");
    }
    @Test
    public void demo1(){
        System.out.println("Test case 1");
    }
    @Test
    public void demo2(){
        System.out.println("Test case 2");
    }
    @AfterMethod
    void demo6(){
        System.out.println("After Method");
    }

    @AfterSuite
    void demo(){
        System.out.println("After Suite");
    }
}
