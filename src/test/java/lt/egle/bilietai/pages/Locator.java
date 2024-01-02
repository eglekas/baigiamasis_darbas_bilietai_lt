package lt.egle.bilietai.pages;

import org.openqa.selenium.By;

public class Locator {
    public  static class Bilietai {




        public static class LoginPage{

            public static By buttonPrisijungtiRegistruotis = By.xpath("//svg-icon[@name='user-account-link' and @class='user-account-icon']");
            public static By buttonWaitCookiesOk = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll' and @class='CybotCookiebotDialogBodyButton']");
            public static By buttonCookiesOk = By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll' and @class='CybotCookiebotDialogBodyButton']");
            public static By inputValidEmail = By.xpath("//input[@name='email']");
            public static By inputValidPassword = By.xpath("//input[@name='password']");
            public static By buttonWaitPrisijungti = By.xpath("//button[contains(text(), 'Prisijungti')]");
            public static By buttonPrisijungti = By.xpath("//button[contains(text(), 'Prisijungti')]");
            public static By profileLogo = By.xpath("//app-views-heading[contains(text(), 'Mano prisijungimas')]");
            public static By buttonFalsePassword = By.xpath("//input[@name='password']");
            public static By buttonWrongPassword = By.xpath("//div[contains(text(), 'Neteisingas el. paštas arba slaptažodis. Sistema buvo atnaujinta ir dėl to perėjome prie prisijungimo el. paštu.')]");
            public static By buttonX = By.xpath("//div[@class='popupbanner_close']");
        }
        public static class ChangePasswordPage{

            public static By buttonForgotPassword = By.xpath("//a[contains(text(), 'Pamiršote slaptažodį?')]");
            public static By buttonValidEmail = By.xpath("//input[@placeholder='El. paštas']");
            public static By buttonResetPassword = By.xpath("//button[contains(text(), 'Atnaujinti slaptažodį')]");
            public static By buttonUpdatedPassword = By.xpath("//div[contains(text(), 'Slaptažodžio atkūrimo nuoroda išsiųsta į Jūsų el. paštą.')]");
            public static By buttonX = By.xpath("//div[@class='popupbanner_close']");
        }

        public static class SearchBarPage{


            public static By writeText = By.xpath("//input[@class='search_component_input input_component floating_placeholder_input_element']");
            public static By buttonSearch = By.xpath("//a[@class='iconpl-search search_component_button']");
            public static By paragraphOfActivityName = By.xpath("//span[@class='searchresult_foundword']");
            public static By buttonSearchBar = By.xpath("//label[@class='floating_placeholder_label_element']");
        }

        public static class ShoppingBasketPage{


            public static By buttonSearchBar = By.xpath("//label[@class='floating_placeholder_label_element']");
            public static By writeText = By.xpath("//input[@class='search_component_input input_component floating_placeholder_input_element']");
            public static By buttonSearch = By.xpath("//a[@class='iconpl-search search_component_button']");
            public static By buttonActivity = By.xpath("//span[@class='searchresult_foundword']");
            public static By buttonBuy = By.xpath("//span[@class='buy_button_text']");
            public static By buttonAdd = By.xpath("//svg-icon[@class='button-icon plus ng-tns-c10-28']");
            public static By buttonTicket = By.xpath("//button[@class='ng-tns-c10-29']");
            public static By buttonTinka = By.xpath("//button[@class='ng-tns-c10-31']");
            public static By inputBar =By.xpath("//input[@type='email']");
            public static By buttonWriteEmail = By.xpath("//input[@type='email']");
            public static By buttonPay = By.xpath("//button[@class='ng-tns-c10-39']");
            public static By buttonBankName = By.xpath("//label[@for='payment562']");
            public static By buttonMoketi = By.xpath("//button[@class='ng-tns-c10-52']");
            public static By buttonAgree = By.xpath("//button[@class='ng-tns-c10-55']");
            public static By buttonWaitTicket = By.xpath("//button[@class='ng-tns-c10-29']");
            public static By buttonWaitTinka = By.xpath("//button[@class='ng-tns-c10-31']");
            public static By buttonWaitPay = By.xpath("//button[@class='ng-tns-c10-39']");
            public static By buttonWaitMoketi = By.xpath("//button[@class='ng-tns-c10-52']");
            public static By buttonWaitAgree = By.xpath("//button[@class='ng-tns-c10-55']");
            public static By buttonSelectBank = By.xpath("//div[@class='lst-item-value' and text()='Swedbank']");
            public static By buttonContinue = By.xpath("//button[@id='submit_button' and @name='submit_button' and @class='btn btn-primary btn-block btn-lg']");
            public static By paragraphOfLoginTitle = By.xpath("//h1[@class='login-title']");
        }

    }



}
