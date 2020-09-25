package TestCases;

import Utils.WebDriverManager;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    public final static  String BASE_URL = "https://s1.demo.opensourcecms.com/wordpress/";

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        //browsers = chrome, firefox, ie, edge
        String browser = "chrome";
        //Generate driver for selected browser
        driver = WebDriverManager.getDriver(browser);
        //Setting up Page Load and Implicit wait values for the browser
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Browse to BASE_URL and Maximize Browser Window
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        //Closing driver
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
