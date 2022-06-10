package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {
    public static final String mainPageUrl="https://stellarburgers.nomoreparties.site/login";

    //Locator for registration link
    @FindBy(how= How.XPATH, using=".//a[text()='Зарегистрироваться']")
    private SelenideElement register;

    //Button LogIn
    @FindBy(how= How.XPATH, using=".//button[text()='Войти']")
    private SelenideElement buttonLogIn;

    //Method for click register link
    public void clickRegister(){
        register.click();
    }

    //Method for click button LogIn
    public void clickButtonLogIn(){
        register.click();
    }

    public SelenideElement getButtonLogIn() {
        return buttonLogIn;
    }
}
