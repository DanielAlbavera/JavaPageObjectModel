package TestCases;

import Pages.MainPage;
import Pages.ReplyPage;
import Pages.RightPanelSection;
import Pages.SearchResultsPage;
import io.qameta.allure.Step;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class HomePageTestCases extends BaseTest {

    @Test(alwaysRun = true)
    @Step("Perform a basic search")
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
        takeScreenShot("Search Result",driver);
    }

    @Test(alwaysRun = true)
    public void clickOnFirstPost() {
    @Step("Click on the first Post Link")
    public void clickOnPostLink() {
        MainPage mainPage  = new MainPage(driver);

        mainPage.pageIsLoaded();
        mainPage.clickScrollDownButton();
        mainPage.getTotalPosts();
        mainPage.clickOnFirstPost();
        takeScreenShot("Post Link",driver);
    }

    @Test(alwaysRun = true)
    public void clickOnLastPost() {
        MainPage mainPage  = new MainPage(driver);

        mainPage.pageIsLoaded();
        mainPage.clickScrollDownButton();
        mainPage.getTotalPosts();
        mainPage.clickOnLastPost();
    }

    @Test(alwaysRun = true)
    @Step("Submit a Comment")
    public void submitComment() {
        basicSearch();
        ReplyPage replyPage = new ReplyPage(driver);


        replyPage.pageIsLoaded();
        replyPage.insertComment("This is a comment to test");
        replyPage.insertName("Testing User");
        replyPage.insertEmail("email@test.com");
        replyPage.insertWebsite("www.google.com");
        replyPage.clickPostCommentButton();
        takeScreenShot("Submitted Comment", driver);
    }

}
