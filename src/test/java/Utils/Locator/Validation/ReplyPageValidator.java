package Utils.Locator.Validation;

import Pages.ReplyPage;
import org.openqa.selenium.WebDriver;

public class ReplyPageValidator extends ReplyPage {

    public ReplyPageValidator(WebDriver driver) {
        super(driver);
    }

    public void validateLeaveReplyLabel() {
        System.out.printf("%-20s %b\n","leaveReplyLabel:", isEnable(leaveReplyLabel));
    }

    public void validateCommentTextArea() {
        System.out.printf("%-20s %b\n","commentTextArea:", isEnable(commentTextArea));
    }

    public void validateNameTextBox() {
        System.out.printf("%-20s %b\n","nameTextBox:", isEnable(nameTextBox));
    }
    public void validateEmailTextBox() {
        System.out.printf("%-20s %b\n","emailTextBox:", isEnable(emailTextBox));
    }

    public void validateWebsiteTextBox() {
        System.out.printf("%-20s %b\n","leaveReplyLabel:", isEnable(websiteTextBox));
    }

    public void validatePostCommentButton() {
        System.out.printf("%-20s %b\n","postCommentButton:", isEnable(postCommentButton));
    }

}
