package day15._03_TestNGXML;

import org.testng.annotations.*;

public class CountryTests {
    @Test
    public void testCase1(){
        System.out.println("Country test case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("Country test case 2");
    }
    @Test
    public void testCase3(){
        System.out.println("Country test case 3");
    }

    @AfterTest
    public void testTearDown(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("After Suite");
    }
}
