package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

/**
 * Created by gfox on 04/05/2016.
 */
@Test(singleThreaded = true)
public class TestNGTest extends SeleniumAbstractTest {

    private static final Logger LOGGER = Logger.getLogger(Reporter.class);

    @Test(priority = 0, description = "Add and Calculate OAP")
    public void printOutMessage() {
        System.out.println("Inside Test");

        Assert.assertTrue(isOAP(40));
    }

    @Test(priority = 2, description = "Add Some Numbers")
    public void addNumbers() {
        Reporter.log("In Add Numbers Test", true);
        int num = add(2, 0);
        Assert.assertEquals(num, 2);
    }

    @Test(priority = 3, description = "Subtract Some Numbers")
    @Parameters({"value"})
    public void subtractNumbers(@Optional("") String value) {
        Reporter.log("In Subtract Numbers Test", true);
        int num = add(2, 0);
        Assert.assertEquals(num, 2, "Numbers Are Equal");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public boolean isOAP(int age) {
        return age > 64;
    }
}
