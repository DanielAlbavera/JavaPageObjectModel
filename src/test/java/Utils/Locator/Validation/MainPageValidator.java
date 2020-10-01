package Utils.Locator.Validation;

import Pages.MainPage;
import org.openqa.selenium.WebDriver;

public class MainPageValidator extends MainPage {

    public MainPageValidator(WebDriver driver) {
        super(driver);
    }

   public void validateScrollDownButton() {
       System.out.printf("%-20s %b\n","scrollDownButton:", isEnable(scrollDownButton));
   }

   public void validatePostsLabel() {
       System.out.printf("%-20s %b\n","postsLabel:", isEnable(postsLabel));
   }

    public void validatePostTitleLink() {
        System.out.printf("%-20s %b\n", "postTitleLink:", isEnable(postTitleLink));
    }

    public void validatePostDateLink() {
        System.out.printf("%-20s %b\n", "postDateLink:", isEnable(postDateLink));
    }

    public void validatePostMessage() {
        System.out.printf("%-20s %b\n", "postMessage:", isEnable(postMessage));
    }

    public void validateSiteTitleLink() {
        System.out.printf("%-20s %b\n", "siteTitleLink:", isEnable(siteTitleLink));
    }

}
