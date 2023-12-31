package lt.egle.bilietai.pages.shoppingBasket;

import lt.egle.bilietai.pages.Common;
import lt.egle.bilietai.pages.Locator;
import lt.egle.bilietai.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingBasketPage {

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickOnSearchBar() {
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonSearchBar);
    }

    public static void writeText(String text) {
        Common.addText(Locator.Bilietai.ShoppingBasketPage.writeText, text);
    }

    public static void clickOnButtonSearch() {
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonSearch);
    }

    public static void clickOnSelectedActivity() {
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonActivity);
    }

    public static void clickButtonBuy() {
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonBuy);
    }

    public static void clickOnButtonAdd() {
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonAdd);
    }

    public static void clickOnButtonChooseTicket() {
        Common.waitForElementToBeClickable(Locator.Bilietai.ShoppingBasketPage.buttonWaitTicket);
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonTicket);
    }

    public static void clickOnButtonCorrect() {
        Common.waitForElementToBeClickable(Locator.Bilietai.ShoppingBasketPage.buttonWaitTinka);
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonTinka);
    }

    public static void clickOnInputBar() {
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.inputBar);
    }

    public static void inputText(String email) {
        Common.addText(Locator.Bilietai.ShoppingBasketPage.buttonWriteEmail, email);
    }

    public static void clickOnButtonPay() {
        Common.waitForElementToBeClickable(Locator.Bilietai.ShoppingBasketPage.buttonWaitPay);
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonPay);
    }

    public static void clickOnButtonBankName() {
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonBankName);
    }

    public static void clickButtonPay() {
        Common.waitForElementToBeClickable(Locator.Bilietai.ShoppingBasketPage.buttonWaitMoketi);
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonMoketi);
    }

    public static void clickOnButtonAgree() {
        Common.waitForElementToBeClickable(Locator.Bilietai.ShoppingBasketPage.buttonWaitAgree);
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonAgree);
    }

    public static void clickOnButtonNameOfBank() {
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonSelectBank);
    }

    public static void clickOnButtonContinue() {
        Common.clickOnElement(Locator.Bilietai.ShoppingBasketPage.buttonContinue);
    }

    public static String readMessageOfSelectedBankLoginTitle() {
        return Common.getText(Locator.Bilietai.ShoppingBasketPage.paragraphOfLoginTitle);
    }
}
