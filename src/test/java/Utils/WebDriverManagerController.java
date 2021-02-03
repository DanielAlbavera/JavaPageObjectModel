package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverManagerController {

    public static WebDriver getDriver(String browser) {

        switch (browser.toLowerCase()) {
            case "chrome":
                // WITHOUT WebDriverManager
                // System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
                // return new ChromeDriver();
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "firefox":
                // WITHOUT WebDriverManager
                // System.setProperty("webdriver.gecko.driver", "C://WebDrivers/geckodriver.exe");
                // return new FirefoxDriver();
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            case "ie":
                // WITHOUT WebDriverManager
                // System.setProperty("webdriver.ie.driver", "C://WebDrivers/IEDriverServer.exe");
                // return new InternetExplorerDriver();
                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();
            case "edge":
                // WITHOUT WebDriverManager
                // System.setProperty("webdriver.edge.driver", "C://WebDrivers/MicrosoftWebDriver.exe");
                // return new EdgeDriver();
                WebDriverManager.edgedriver();
                return new EdgeDriver();
            default:
                return null;
        }
    }

    public static WebDriver getHeadlessChromeDriver() {
        // Adding Custom options
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");

        // WITHOUT WebDriverManager
        // System.setProperty("webdriver.chrome.driver", "C://WebDrivers/chromedriver.exe");
        //return new ChromeDriver(chrome_options);

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver(chrome_options);
    }

}
