package TestCases;

import Pages.MainPage;
import Pages.ReplyPage;
import Pages.RightPanelSection;
import Pages.SearchResultsPage;
import org.testng.annotations.Test;

public class HomePageTestCases extends BaseTest {

    @Test(alwaysRun = true)
    public void basicSearch() {
        MainPage mainPage  = new MainPage(driver);
        SearchResultsPage searchPage = new SearchResultsPage(driver);
        ReplyPage replyPage  = new ReplyPage(driver);
        RightPanelSection rightPanel = new RightPanelSection(driver);

        mainPage.pageIsLoaded();
        mainPage.clickScrollDownButton();
        rightPanel.performSearch("Hello World");
        searchPage.clickPostTitle();
        replyPage.pageIsLoaded();
    }

    @Test(alwaysRun = true)
    public void clickOnPostLink() {
        MainPage mainPage  = new MainPage(driver);

        mainPage.pageIsLoaded();
        mainPage.clickScrollDownButton();
        mainPage.clickPostTitleLink();
    }

    @Test(alwaysRun = true)
    public void submitComment() {
        basicSearch();
        ReplyPage replyPage = new ReplyPage(driver);


        replyPage.pageIsLoaded();
        replyPage.insertComment("This is a comment to test");
        replyPage.insertName("Testing User");
        replyPage.insertEmail("email@test.com");
        replyPage.insertWebsite("www.google.com");
        replyPage.clickPostCommentButton();
    }

}
