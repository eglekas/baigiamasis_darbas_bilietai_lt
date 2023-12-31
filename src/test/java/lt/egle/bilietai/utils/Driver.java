package lt.egle.bilietai.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Driver {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static void setUpEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        EdgeOptions option = new EdgeOptions();
        option.addArguments("--start-maximized");
        option.addArguments("--force-device-scale-factor=0.70");
        driver.set(new EdgeDriver(option));
    }
    public static void setUpEdgeDriver(double scaleFactor, boolean isHeadless) {
        WebDriverManager.edgedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        EdgeOptions option = new EdgeOptions();
        if (isHeadless) option.addArguments("--headless=new");
        option.addArguments("--start-maximized");
        option.addArguments("--force-device-scale-factor=" + scaleFactor);
        driver.set(new EdgeDriver(option));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
    public static void closeDriver() {
        driver.get().close();
    }
    public static void quitDriver() {

        driver.get().quit();
        driver.remove();
    }
}
