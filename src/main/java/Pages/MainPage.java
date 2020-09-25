package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    //TODO Convert all this variables into one Element

    @FindBy(xpath = "//a[@class='menu-scroll-down']")
    protected WebElement scrollDownButton;

    @FindBy(xpath = "//*[@class='page-title']")
    protected WebElement postsLabel;

    @FindBy(xpath = "(//*[@class='entry-title']/a)[2]")
    protected WebElement postTitleLink;

    @FindBy(xpath = "(//div[@class='entry-meta']/a)[2]")
    protected WebElement postDateLink;

    @FindBy(xpath = "//div[@class='entry-content']/p")
    protected WebElement postMessage;

    @FindBy(xpath = "//a[@rel='home']")
    protected WebElement siteTitleLink;

    public void clickScrollDownButton() {
        click(scrollDownButton);
    }

    public void clickPostTitleLink() {
        postTitleLink.click();
    }

    public void clickPostDateLink() { postDateLink.click(); }

    @Override
    public boolean pageIsLoaded() {
        if(postsLabel.isDisplayed()) {
            System.out.println("MainPage is loaded");
            return true;
        }
        else {
            System.out.println("MainPage is not loaded");
            return false;
        }
    }

}
