package Utils;

import Pages.RightPanelSection;
import Pages.SearchResultsPage;
import Utils.Locator.Validation.MainPageValidator;
import Utils.Locator.Validation.ReplyPageValidator;
import Utils.Locator.Validation.RightPanelValidation;
import Utils.Locator.Validation.SearchResultsPageValidator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LocatorValidator  {

    protected WebDriver driver;

    public final static  String BASE_URL = "https://s1.demo.opensourcecms.com/wordpress/";

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = WebDriverManager.getHeadlessChromeDriver();
        driver.get(BASE_URL);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        //Closing driver
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @Test(alwaysRun = true)
    public void validateMainPageLocators() {
        MainPageValidator mainPage = new MainPageValidator(driver);
        System.out.println("MainPage Locators Validation:\n");

        mainPage.validateScrollDownButton();
        mainPage.validatePostsLabel();
        mainPage.validatePostTitleLink();
        mainPage.validatePostDateLink();
        mainPage.validatePostMessage();
        mainPage.validateSiteTitleLink();
    }

    @Test(alwaysRun = true)
    public void validateSearchResultsLocators() {
        SearchResultsPageValidator resultsPage = new SearchResultsPageValidator(driver);
        RightPanelSection rightPanel = new RightPanelSection(driver);
        rightPanel.performSearch("Hello World");
        System.out.println("SearchResults Locators Validation:\n");

        resultsPage.validatePostTitleLink();
        resultsPage.validatePostDateLink();
        resultsPage.validateSearchResultsLabel();
        resultsPage.validatePostText();
    }

    @Test(alwaysRun = true)
    public void validateReplyPageLocators() {
        ReplyPageValidator replyValidator = new ReplyPageValidator(driver);
        RightPanelSection rightPanel = new RightPanelSection(driver);
        SearchResultsPage searchPage = new SearchResultsPage(driver);
        rightPanel.performSearch("Hello World");
        searchPage.clickPostTitle();

        System.out.println("Reply Page Locators Validation:\n");

        replyValidator.validateLeaveReplyLabel();
        replyValidator.validateCommentTextArea();
        replyValidator.validateNameTextBox();
        replyValidator.validateEmailTextBox();
        replyValidator.validateWebsiteTextBox();
        replyValidator.validatePostCommentButton();

    }

    @Test(alwaysRun = true)
    public void validateRightPanelSectionLocators() {
        RightPanelValidation rightPanel = new RightPanelValidation(driver);
        System.out.println("Right Panel Section Locators Validation:\n");

        rightPanel.validateSearchBar();
        rightPanel.validateSearchButton();
        rightPanel.validateRecentPostLabel();
        rightPanel.validateRecentPostLink();
        rightPanel.validateRecentCommentLabel();
        rightPanel.validateRecentCommentLink();
        rightPanel.validateRecentCommentPostLink();
        rightPanel.validateArchivesLabel();
        rightPanel.validateArchivesLink();
        rightPanel.validateCategoriesLabel();
        rightPanel.validateCategoriesLink();
        rightPanel.validateMetaLabel();
        rightPanel.validateLoginLink();
        rightPanel.validateEntriesRSSLink();
        rightPanel.validateCommentsRSSLink();
        rightPanel.validateWordPressOrgLink();
        rightPanel.validatePoweredByLink();

    }
}
