package lt.egle.bilietai.pages.login;

import lt.egle.bilietai.pages.Common;
import lt.egle.bilietai.pages.Locator;
import lt.egle.bilietai.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static void openUrl(String url){
        Common.setUpEdge(8);
        Common.openUrl(url);
    }
    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickOnCookiesOk() {
        Common.waitForElementToBeClickable(Locator.Bilietai.LoginPage.buttonWaitCookiesOk);
        Common.clickOnElement(Locator.Bilietai.LoginPage.buttonCookiesOk);}

    public static void writeValidEmail(String email) {
        Common.addText(Locator.Bilietai.LoginPage.inputValidEmail, email);}

    public static void writeValidPassword(String password) {
        Common.addText(Locator.Bilietai.LoginPage.inputValidPassword, password);}

    public static void clickOnLoginButton() {
        Common.waitForElementToBeClickable(Locator.Bilietai.LoginPage.buttonWaitPrisijungti);
        Common.clickOnElement(Locator.Bilietai.LoginPage.buttonPrisijungti);}

    public static String readProfileName() {
        return Common.getText(Locator.Bilietai.LoginPage.profileLogo);
    }

    public static void clickOnButtonPrisijungti() {
        Common.clickOnElement(Locator.Bilietai.LoginPage.buttonPrisijungtiRegistruotis);}

    public static void writeFalsePassword(String password) {
        Common.addText(Locator.Bilietai.LoginPage.buttonFalsePassword, password);}

    public static String readMessageWrongPassword() {
        return Common.getText(Locator.Bilietai.LoginPage.buttonWrongPassword);}
}
