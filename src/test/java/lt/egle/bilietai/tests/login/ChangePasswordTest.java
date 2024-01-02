package lt.egle.bilietai.tests.login;

import lt.egle.bilietai.pages.login.ChangePasswordPage;
import lt.egle.bilietai.pages.login.LoginPage;
import lt.egle.bilietai.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangePasswordTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.openUrl("https://www.bilietai.lt/");
        LoginPage.clickOnCookiesOk();
        LoginPage.clickOnButtonPrisijungti();
    }

    @Test
    public void testChangePassword() {
        String email = "egle.kasinskaite@gmail.com";
        String expectedResult = "Slaptažodžio atkūrimo nuoroda išsiųsta į Jūsų el. paštą. Jeigu negavote, prašome pasitikrinti el. pašto spam aplanką, arba, ar tikrai turite susikūrę paskyrą su šiuo el. paštu.\n" +
                "Jeigu turite klausimų, susisiekite su mumis: info@bilietai.lt.";
        String actualResult;
        ChangePasswordPage.clickOnButtonPamirsoteSlaptazodi();
        ChangePasswordPage.writeValidEmail(email);
        ChangePasswordPage.clickOnBanner();
        ChangePasswordPage.clickOnButtonResetPassword();


        actualResult = ChangePasswordPage.readMessegeUpdatedPassword();

        Assert.assertEquals(actualResult, expectedResult);
    }


}
