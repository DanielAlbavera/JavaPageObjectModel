package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPagePost extends MainPage {

    protected WebElement postElement;
    protected String dateXpath = "/header/div/child::a";
    protected String titleXpath = "/header/h3/child::a";
    protected String textXpath = "/div[@class='entry-content']/p";

    public MainPagePost(WebDriver driver, WebElement postElement) {
        super(driver);
        this.postElement = postElement;
    }

    public void clickPostTitleLink() {
        this.postElement.findElement(By.xpath(titleXpath)).click();
    }

    public void clickPostDateLink() { this.postElement.findElement(By.xpath(dateXpath)).click(); }

    public  String getPostText() {
        return this.postElement.findElement(By.xpath(textXpath)).getText();
    }
}
