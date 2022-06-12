import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageobjects.LogInPage;
import pageobjects.MainPage;
import pageobjects.RegistrationPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class TestLogOutFromAccount {
    public String name;
    public String email;
    public String password;

    @Before
    public void maxWindowSizeAndRegister() {
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
    public void closeWebDriver() {
        Selenide.closeWebDriver();
    }

    @Test
    public void testLogOutFromPersonalAccount() {
        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogIn();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.insertEmail(email);
        logInPage.insertPassword(password);
        logInPage.clickButtonLogIn();

        MainPage mainPageLogedIn = page(MainPage.class);
        mainPageLogedIn.clickLogIn();

        LogInPage logInPageLogedIn = page(LogInPage.class);
        logInPageLogedIn.clickLogOut();
        LogInPage logInPageLogedOut = page(LogInPage.class);

        logInPageLogedOut.getButtonLogIn().shouldBe(visible);
    }
}
