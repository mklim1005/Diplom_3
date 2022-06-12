import com.codeborne.selenide.Configuration;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import pageobjects.LogInPage;
import pageobjects.MainPage;
import pageobjects.RegistrationPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class TestRegistration {
    public String name;
    public String email;
    public String password;


    @Before
    public void maxWindowSize(){
        Configuration.startMaximized=true;

         name = RandomStringUtils.randomAlphabetic(10);
         email = RandomStringUtils.randomAlphabetic(10) + "@mailinator.com";
         password = RandomStringUtils.randomAlphabetic(10);
    }

    @Test
    public void testSuccessfullyRegistration() throws InterruptedException {
        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogIn();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.clickRegister();
        RegistrationPage registrationPage = page(RegistrationPage.class);

        registrationPage.insertName(name);
        registrationPage.insertEmail(email);
        registrationPage.insertPassword(password);

        registrationPage.clickRegistrationButton();
        LogInPage logInPage2 = page(LogInPage.class);

        logInPage2.getButtonLogIn().shouldBe(visible);
    }

    @Test
    public void testRegistrationWithNotCorrectPassword(){
        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogIn();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.clickRegister();

        RegistrationPage registrationPage = page(RegistrationPage.class);
        registrationPage.insertName(name);
        registrationPage.insertEmail(email);
        password = RandomStringUtils.randomAlphabetic(4);
        registrationPage.insertPassword(password);
        registrationPage.clickRegistrationButton();

        registrationPage.getMessageNotCorrectPassword().shouldBe(visible);
    }
}
