package day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_TestNGAsserts {
    @Test
    public void assertEquals() {
        String actual = "Hello";
        String expected = "Hello";
        Assert.assertEquals(actual, expected, "Actual should be equal to Expected");
    }

    @Test
    public void assertEquals2() {
        String actual = "Hello";
        String expected = new String("Hello");
        Assert.assertEquals(actual, expected, "Actual should be equal to Expected");
    }

    @Test
    public void assertEquals3() {
        String[] actual = {"Hello", "2"};
        String[] expected = {"Hello", "2"};
        Assert.assertEquals(actual, expected, "Actual should be equal to Expected");
    }

    @Test
    public void assertEqualsNoOrder() {
        String[] actual = {"Hello", "2"};
        String[] expected = {"2", "Hello"};
        Assert.assertEqualsNoOrder(actual, expected, "Actual should be equal to Expected");
    }


}
