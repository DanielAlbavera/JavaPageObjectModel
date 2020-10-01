package Utils.Locator.Validation;

import Pages.RightPanelSection;
import org.openqa.selenium.WebDriver;

public class RightPanelValidation extends RightPanelSection {

    public RightPanelValidation(WebDriver driver) {
        super(driver);
    }

    public void validateSearchBar() {
        System.out.printf("%-20s %b\n","searchBar:", isEnable(searchBar));
    }

    public void validateSearchButton() {
        System.out.printf("%-20s %b\n","searchButton:", isEnable(searchButton));
    }

    public void validateRecentPostLabel() {
        System.out.printf("%-20s %b\n","recentPostLabel:", isEnable(recentPostLabel));
    }

    public void validateRecentPostLink() {
        System.out.printf("%-20s %b\n","recentPostLink:", isEnable(recentPostLink));
    }

    public void validateRecentCommentLabel() {
        System.out.printf("%-20s %b\n","recentCommentLabel:", isEnable(recentCommentLabel));
    }

    public void validateRecentCommentLink() {
        System.out.printf("%-20s %b\n","searchBar:", isEnable(recentCommentLink));
    }

    public void validateRecentCommentPostLink() {
        System.out.printf("%-20s %b\n","searchBar:", isEnable(recentCommentPostLink));
    }

    public void validateArchivesLabel() {
        System.out.printf("%-20s %b\n","archivesLabel:", isEnable(archivesLabel));
    }

    public void validateArchivesLink() {
        System.out.printf("%-20s %b\n","archivesLink:", isEnable(archivesLink));
    }

    public void validateCategoriesLabel() {
        System.out.printf("%-20s %b\n","categoriesLabel:", isEnable(categoriesLabel));
    }

    public void validateCategoriesLink() {
        System.out.printf("%-20s %b\n","categoriesLink:", isEnable(categoriesLink));
    }

    public void validateMetaLabel() {
        System.out.printf("%-20s %b\n","metaLabel:", isEnable(metaLabel));
    }

    public void validateLoginLink() {
        System.out.printf("%-20s %b\n","loginLink:", isEnable(loginLink));
    }

    public void validateEntriesRSSLink() {
        System.out.printf("%-20s %b\n","entriesRSSLink:", isEnable(entriesRSSLink));
    }

    public void validateCommentsRSSLink() {
        System.out.printf("%-20s %b\n","commentsRSSLink:", isEnable(commentsRSSLink));
    }

    public void validateWordPressOrgLink() {
        System.out.printf("%-20s %b\n","wordPressOrgLink:", isEnable(wordPressOrgLink));
    }

    public void validatePoweredByLink() {
        System.out.printf("%-20s %b\n","poweredByLink:", isEnable(poweredByLink));
    }

}
