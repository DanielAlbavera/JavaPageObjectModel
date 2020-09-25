package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='entry-title']/a")
    protected WebElement postTitleLink;

    @FindBy(xpath = "(//a[@rel='bookmark'])[1]")
    protected WebElement postDateLink;

    @FindBy(xpath = "//*[@class='page-title']")
    protected WebElement searchResultsLabel;

    @FindBy(xpath = "//div[@class='entry-summary']/p")
    protected WebElement postText;

    public void clickPostTitle() {
        postTitleLink.click();
    }

    public void clickPostDateLink() { postDateLink.click(); }

    public String getPostText() {
        return postText.getText();
    }

    @Override
    public boolean pageIsLoaded() {
        if(postTitleLink.isDisplayed()) {
            System.out.println("SearchResultsPage is loaded");
            return true;
        }
        else {
            System.out.println("SearchResultsPage is not loaded");
            return false;
        }
    }

}
