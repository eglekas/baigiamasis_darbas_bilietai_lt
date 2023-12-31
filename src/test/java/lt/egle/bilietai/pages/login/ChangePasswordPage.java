package lt.egle.bilietai.pages.login;

import lt.egle.bilietai.pages.Common;
import lt.egle.bilietai.pages.Locator;
import lt.egle.bilietai.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage {

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void clickOnButtonPamirsoteSlaptazodi() {
        Common.clickOnElement(Locator.Bilietai.ChangePasswordPage.buttonForgotPassword);}

    public static void writeValidEmail(String email) {
        Common.addText(Locator.Bilietai.ChangePasswordPage.buttonValidEmail, email);}

    public static void clickOnButtonResetPassword() {
        Common.clickOnElement(Locator.Bilietai.ChangePasswordPage.buttonResetPassword);}

    public static String readMessegeUpdatedPassword() {
        return Common.getText(Locator.Bilietai.ChangePasswordPage.buttonUpdatedPassword);}

    public static void clickOnBanner() {
        Common.clickOnElement(Locator.Bilietai.ChangePasswordPage.buttonX);
    }
}
