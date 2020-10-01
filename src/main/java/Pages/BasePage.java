package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public String getTextByAttribute(WebElement element) {
        return element.getAttribute("Text");
    }

    public void type(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        element.click();
    }

    public boolean isDisplayed(WebElement element) {
        try {
            System.out.println("MainPage is loaded");
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void visit(String url) {
        driver.get(url);
    }

    public boolean pageIsLoaded() {
        return true;
    }

    public boolean isEnable(WebElement element) {
        try {
            return element.isEnabled();
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }

}
