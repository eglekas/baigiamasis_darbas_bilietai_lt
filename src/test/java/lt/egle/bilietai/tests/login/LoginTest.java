package lt.egle.bilietai.tests.login;

import lt.egle.bilietai.pages.login.LoginPage;
import lt.egle.bilietai.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.bilietai.lt/");
        LoginPage.clickOnCookiesOk();
        LoginPage.clickOnButtonPrisijungti();
    }

    @Test
    public void testLogin() {
        String email = "egle.kasinskaite@gmail.com";
        String password = "Xy2xrTuR";
        String expectedResult = "Mano prisijungimas";
        String actualResult;
        LoginPage.writeValidEmail(email);
        LoginPage.writeValidPassword(password);
        LoginPage.clickOnBanner();
        LoginPage.clickOnLoginButton();

        actualResult = LoginPage.readProfileName();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNegativeLogin() {
        String email = "egle.kasinskaite@gmail.com";
        String password = "Xy2xrTuR2";
        String expectedResult = "Neteisingas el. paštas arba slaptažodis. Sistema buvo atnaujinta ir dėl to perėjome prie prisijungimo el. paštu.";
        String actualResult;
        LoginPage.writeValidEmail(email);
        LoginPage.writeFalsePassword(password);
        LoginPage.clickOnBanner();
        LoginPage.clickOnLoginButton();

        actualResult = LoginPage.readMessageWrongPassword();

        Assert.assertEquals(actualResult, expectedResult);
    }




}

