package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    //TODO Convert all this variables into one Element

    @FindBy(xpath = "//a[@class='menu-scroll-down']")
    protected WebElement scrollDownButton;

    @FindBy(xpath = "//*[@class='page-title']")
    protected WebElement postsLabel;

    @FindBy(xpath = "//div/main/article[contains(@id,'post')]")
    protected List<WebElement> postsList;

    @FindBy(xpath = "//a[@rel='home']")
    protected WebElement siteTitleLink;

    public void clickScrollDownButton() {
        click(scrollDownButton);
    }

    public MainPagePost getPostById(int postIndex) {
        return new MainPagePost(driver,postsList.get(postIndex));
    }

    public void getTotalPosts() {
        System.out.println("Total of Posts: " + postsList.size());
    }

    public MainPagePost clickOnFirstPost() {
        return new MainPagePost(driver,postsList.get(0));
    }

    public MainPagePost clickOnLastPost() {
        return new MainPagePost(driver,postsList.get(postsList.size() - 1 ));
    }

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
