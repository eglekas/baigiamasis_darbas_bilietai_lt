package lt.egle.bilietai.tests.search;

import lt.egle.bilietai.pages.login.LoginPage;
import lt.egle.bilietai.pages.search.SearchBarPage;
import lt.egle.bilietai.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBarTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.bilietai.lt/");
        LoginPage.clickOnCookiesOk();
    }

    @Test
    public void testSearchBar() {
        String text = "plaukimas baidaremis Vilniuje";
        String expectedResult = "Plaukimas";
        String actualResult;

        SearchBarPage.clickOnSearchBar();
        SearchBarPage.writeText(text);
        SearchBarPage.clickOnButtonSearch();

        actualResult = SearchBarPage.readMessesgeOfSelectedActivity();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
