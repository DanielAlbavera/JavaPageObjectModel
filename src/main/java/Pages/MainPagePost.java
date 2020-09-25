package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPagePost extends MainPage {

    protected WebElement date;
    protected WebElement title;
    protected WebElement text;

    public MainPagePost(WebDriver driver, WebElement date, WebElement title, WebElement text) {
        super(driver);
        this.date = date;
        this.title = title;
        this.text = text;
    }

}
