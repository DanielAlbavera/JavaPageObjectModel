package Utils.Locator.Validation;

import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public void validatePostsList() {
        System.out.println("Total posts: " + postsList.size());
        int i = 1;
        for (WebElement post : postsList) {
            System.out.printf("%-20s %b\n", " postTitle-" + i + ":", isEnable(post));
            i++;
        }
    }

    public void validateSiteTitleLink() {
        System.out.printf("%-20s %b\n", "siteTitleLink:", isEnable(siteTitleLink));
    }

}
