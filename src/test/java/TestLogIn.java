import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageobjects.LogInPage;
import pageobjects.MainPage;
import pageobjects.RegistrationPage;
import pageobjects.RestorePasswordPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class TestLogIn {
    public String name;
    public String email;
    public String password;

    @Before
    public void maxWindowSize() {
        Configuration.startMaximized = true;

        name = RandomStringUtils.randomAlphabetic(10);
        email = RandomStringUtils.randomAlphabetic(10) + "@mailinator.com";
        password = RandomStringUtils.randomAlphabetic(10);

        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogIn();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.clickRegister();
        RegistrationPage registrationPage = page(RegistrationPage.class);

        registrationPage.insertName(name);
        registrationPage.insertEmail(email);
        registrationPage.insertPassword(password);

        registrationPage.clickRegistrationButton();
    }

    @After
    public void logOut() {
        Selenide.closeWebDriver();
    }

    @Test
    public void testLogInFromLogInIntoAccountButtonMainPage() {
        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogInIntoAccountButton();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.insertEmail(email);
        logInPage.insertPassword(password);
        logInPage.clickButtonLogIn();
        MainPage mainPageLogedIn = page(MainPage.class);

        mainPageLogedIn.getSetAnOrderButton().shouldBe(visible);
    }

    @Test
    public void testLogInFromLogPersonalAccountMainPage() {
        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogIn();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.insertEmail(email);
        logInPage.insertPassword(password);
        logInPage.clickButtonLogIn();
        MainPage mainPageLogedIn = page(MainPage.class);

        mainPageLogedIn.getSetAnOrderButton().shouldBe(visible);
    }

    @Test
    public void testLogInFromRegistrationForm() {
        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogIn();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.clickRegister();
        RegistrationPage registrationPage = page(RegistrationPage.class);
        registrationPage.clickLogInLinkFromRegistrationPage();
        LogInPage logInPage2 = page(LogInPage.class);
        logInPage2.insertEmail(email);
        logInPage2.insertPassword(password);
        logInPage.clickButtonLogIn();
        MainPage mainPageLogedIn = page(MainPage.class);

        mainPageLogedIn.getSetAnOrderButton().shouldBe(visible);
    }

    @Test
    public void testLogInFromForgetPasswordForm() throws InterruptedException {
        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogIn();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.clickRestorePasswordLink();
        RestorePasswordPage restorePasswordPage = page(RestorePasswordPage.class);
        restorePasswordPage.clickLogInLink();
        LogInPage logInPage2 = page(LogInPage.class);
        logInPage2.insertEmail(email);
        logInPage2.insertPassword(password);
        logInPage.clickButtonLogIn();
        MainPage mainPageLogedIn = page(MainPage.class);

        mainPageLogedIn.getSetAnOrderButton().shouldBe(visible);
    }
}
