package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverManager;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
    }

    @After
    public void tearDown() {
        System.out.println("Quitting WebDriver in TestBase...");
        DriverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
