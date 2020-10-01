package Utils.Locator.Validation;

import Pages.SearchResultsPage;
import org.openqa.selenium.WebDriver;

public class SearchResultsPageValidator extends SearchResultsPage {

    public SearchResultsPageValidator(WebDriver driver) {
        super(driver);
    }

    public void validatePostTitleLink() {
        System.out.printf("%-20s %b\n","postTitleLink:", isEnable(postTitleLink));
    }

    public void validatePostDateLink() {
        System.out.printf("%-20s %b\n","postDateLink:", isEnable(postDateLink));
    }

    public void validateSearchResultsLabel() {
        System.out.printf("%-20s %b\n","searchResultsLabel:", isEnable(searchResultsLabel));
    }

    public void validatePostText() {
        System.out.printf("%-20s %b\n","searchResultsLabel:", isEnable(postText));
    }
}
