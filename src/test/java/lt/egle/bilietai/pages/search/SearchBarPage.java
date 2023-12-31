package lt.egle.bilietai.pages.search;

import lt.egle.bilietai.pages.Common;
import lt.egle.bilietai.pages.Locator;
import lt.egle.bilietai.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchBarPage {

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }


    public static void writeText(String text) {
        Common.addText(Locator.Bilietai.SearchBarPage.writeText, text);
    }

    public static void clickOnButtonSearch() {
        Common.clickOnElement(Locator.Bilietai.SearchBarPage.buttonSearch);
    }

    public static String readMessesgeOfSelectedActivity() {
        return Common.getText(Locator.Bilietai.SearchBarPage.paragraphOfActivityName);
    }

    public static void clickOnSearchBar() {
        Common.clickOnElement(Locator.Bilietai.SearchBarPage.buttonSearchBar);
    }
}
