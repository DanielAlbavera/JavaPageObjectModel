package TestCases;

import Utils.WebDriverManagerController;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    protected WebDriver driver;

    public final static  String BASE_URL = "https://s1.demo.opensourcecms.com/wordpress/";

    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        //browsers = chrome, firefox, ie, edge
        String browser = "chrome";
        //Generate driver for selected browser

        driver = WebDriverManagerController.getDriver(browser);

        //Setting up Page Load and Implicit wait values for the browser
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Browse to BASE_URL and Maximize Browser Window
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown(){
        //Closing driver
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void takeScreenShot(String ssName,WebDriver driver) {
        Allure.addAttachment(ssName, new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }

}
