package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RightPanelSection extends BasePage {

    public RightPanelSection(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='search-form-1']")
    protected WebElement searchBar;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement searchButton;

    @FindBy(xpath = "//*[text() = 'Recent Posts']")
    protected WebElement recentPostLabel;

    @FindBy(xpath = "(//*[text() = 'Recent Posts']/following::ul/li/a)[1]")
    protected WebElement recentPostLink;

    @FindBy(xpath = "//*[text() = 'Recent Comments']")
    protected WebElement recentCommentLabel;

    @FindBy(xpath = "(//*[text() = 'Recent Comments']/following::ul/li/span/a)")
    protected WebElement recentCommentLink;

    @FindBy(xpath = "(//*[text() = 'Recent Comments']/following::ul/li/a)[1]")
    protected WebElement recentCommentPostLink;

    @FindBy(xpath = "//*[text() = 'Archives']")
    protected WebElement archivesLabel;

    @FindBy(xpath = "(//*[text() = 'Archives']/following::ul/li/a)[1]")
    protected WebElement archivesLink;

    @FindBy(xpath = "Categories")
    protected WebElement categoriesLabel;

    @FindBy(xpath = "(//*[text() = 'Categories']/following::ul/li/a)[1]")
    protected WebElement categoriesLink;

    @FindBy(xpath = "Meta")
    protected WebElement metaLabel;

    @FindBy(xpath = "//a[text()='Log in']")
    protected WebElement loginLink;

    @FindBy(xpath = "//a[text()='Entries ']")
    protected WebElement entriesRSSLink;

    @FindBy(xpath = "//a[text()='Comments ']")
    protected WebElement commentsRSSLink;

    @FindBy(xpath = "//a[contains(@href,'wordpress') and contains(@title,'Powered by')]")
    protected WebElement wordPressOrgLink;

    @FindBy(xpath = "//a[contains(text(),'Proudly powered')]")
    protected WebElement poweredByLink;

    public void performSearch(String text) {
        type(searchBar, text);
        click(searchButton);
    }

    public void clickRecentPostLink() { recentPostLink.click(); }

    public void clickRecentCommentLink() { recentCommentLink.click(); }

    public void clickRecentCommentPostLink() { recentCommentPostLink.click(); }

    public void clickCategoryLink() { categoriesLink.click(); }

    public void clickMetaLoginLink() { loginLink.click(); }

    public void clickMetaEntriesLink() { entriesRSSLink.click(); }

    public void clickMetaCommentsLink() { commentsRSSLink.click(); }

    public void clickMetaWordPressLink() { wordPressOrgLink.click(); }

    public void clickPoweredByLink() { poweredByLink.click(); }

    public void clickArchivesLink() { archivesLink.click(); }

}
