package lt.egle.bilietai.tests.shoppingBasket;

import lt.egle.bilietai.pages.login.LoginPage;
import lt.egle.bilietai.pages.shoppingBasket.ShoppingBasketPage;
import lt.egle.bilietai.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingBasketTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {

        LoginPage.openUrl("https://www.bilietai.lt/");
        LoginPage.clickOnCookiesOk();}
    @Test
    public void testShoppingBasket() {
        String text = "Plaukimas baidaremis Vilniuje";
        String email = "egle.kasinskaite@gmail.com";
        String expectedResult = "Sveiki!";
        String actualResult;

        ShoppingBasketPage.clickOnSearchBar();
        ShoppingBasketPage.writeText(text);
        ShoppingBasketPage.clickOnButtonSearch();
        ShoppingBasketPage.clickOnSelectedActivity();
        ShoppingBasketPage.clickButtonBuy();
        ShoppingBasketPage.clickOnButtonAdd();
        ShoppingBasketPage.clickOnButtonChooseTicket();
        ShoppingBasketPage.clickOnButtonCorrect();
        ShoppingBasketPage.clickOnInputBar();
        ShoppingBasketPage.inputText(email);
        ShoppingBasketPage.clickOnButtonPay();
        ShoppingBasketPage.clickOnButtonBankName();
        ShoppingBasketPage.clickButtonPay();
        ShoppingBasketPage.clickOnButtonAgree();
        ShoppingBasketPage.clickOnButtonNameOfBank();

        ShoppingBasketPage.clickOnButtonContinue();
        actualResult = ShoppingBasketPage.readMessageOfSelectedBankLoginTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
