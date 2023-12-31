package lt.egle.bilietai.pages;


import lt.egle.bilietai.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Common {
    public static void setUpEdge() {
        Driver.setUpEdgeDriver();
    }

    public static void setUpEdge(int durationOfSeconds) {
        Driver.setUpEdgeDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeWindow() {
        Driver.closeDriver();

    }

    public static void quitDriver() {
        Driver.quitDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }
    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }
    public static void addText(By locator, String text) {getElement(locator).sendKeys(text);}

    public static String getText(By locator) {
        return getElement(locator).getText();
    }

    public static boolean checkIfElementVisible(By locator) {
        return getElement(locator).isDisplayed();
    }

    public static boolean checkIfElementSelected(By locator) {

        return getElement(locator).isSelected();
    }

    public static boolean checkIfElementEnabled(By locator) {
        return getElement(locator).isEnabled();
    }

    public static List<Boolean> checkIfElementsAreSelected(By locator) {
        List<Boolean> statuses = new ArrayList<>();
        for (WebElement element : getElements(locator)) {

            statuses.add(element.isSelected());
        }

        return statuses;
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static String getElementAttributeValue(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void waitForElementOnAttributeValueChange(By locator, String attributeName, String valueContains) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeContains(locator, attributeName, valueContains));
    }

    public static void waitForElementToBeVisible(By locator
    ) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void clickOnElement(By locator) {
        getElement(locator).click();
    }

    public static boolean waitForElementToBeVisibleCustomised(By locator, int seconds) {
        boolean isVisible;
        int duration = 0;

        do {
            try {
                Thread.sleep(500);
                getElement(locator).isDisplayed();
                isVisible = true;
            } catch (NoSuchElementException e) {
                isVisible = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            }
            duration++;
        } while (!isVisible || duration / 2 >= seconds);

        return isVisible;
    }

    public static void switchToFrame(By locator) {
        Driver.getDriver().switchTo().frame(getElement(locator));

    }



}






