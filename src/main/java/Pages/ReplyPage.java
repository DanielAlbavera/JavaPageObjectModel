package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReplyPage extends BasePage {

    public ReplyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "comment-reply-title")
    protected WebElement leaveReplyLabel;

    @FindBy(id = "comment")
    protected WebElement commentTextArea;

    @FindBy(id = "author")
    protected WebElement nameTextBox;

    @FindBy(id = "email")
    protected WebElement emailTextBox;

    @FindBy(id = "url")
    protected WebElement websiteTextBox;

    @FindBy(id = "submit")
    protected WebElement postCommentButton;

    public void insertComment(String comment) {
        type(commentTextArea, comment);
    }

    public void insertName(String name) {
        type(nameTextBox, name);
    }

    public void insertEmail(String email) {
        type(emailTextBox, email);
    }

    public void insertWebsite(String website) {
        type(websiteTextBox, website);
    }

    public void clickPostCommentButton() {
        click(postCommentButton);
    }

    @Override
    public boolean pageIsLoaded() {
        if(leaveReplyLabel.isDisplayed()) {
            System.out.println("ReplyPage is loaded");
            return true;
        }
        else {
            System.out.println("ReplyPage is not loaded");
            return false;
        }
    }

}
