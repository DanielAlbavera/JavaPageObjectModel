package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverManager {

    public static WebDriver getDriver(String browser) {

        if(browser.toLowerCase() == "chrome") {
            System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
            return new ChromeDriver();
        }
        else if (browser.toLowerCase() == "firefox") {
            System.setProperty("webdriver.gecko.driver", "C://WebDrivers/geckodriver.exe");
            return new FirefoxDriver();
        }
        else if (browser.toLowerCase() == "ie") {
            System.setProperty("webdriver.ie.driver", "C://WebDrivers/IEDriverServer.exe");
            return new InternetExplorerDriver();
        }
        else if (browser.toLowerCase() == "edge") {
            System.setProperty("webdriver.edge.driver", "C://WebDrivers/MicrosoftWebDriver.exe");
            return new EdgeDriver();
        }
        else {
            return null;
        }
    }

}
