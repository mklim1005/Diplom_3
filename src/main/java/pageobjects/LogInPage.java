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

    //Locator for email input field
    @FindBy(how= How.XPATH, using=".//input[@name='name']")
    private SelenideElement emailField;

    //Locator for password input field
    @FindBy(how= How.XPATH, using=".//input[@name='Пароль']")
    private SelenideElement passwordField;

    //Locator for restore password link
    @FindBy(how= How.XPATH, using=".//a[text()='Восстановить пароль']")
    private SelenideElement restorePasswordLink;

    //Locator for LogOUT
    @FindBy(how= How.XPATH, using=".//button[text()='Выход']")
    private SelenideElement logOut;


    //Method for click register link
    public void clickRegister(){
        register.click();
    }

    //Method for click button LogIn
    public void clickButtonLogIn(){
        buttonLogIn.click();
    }

    //Method for insert email LogIn
    public void insertEmail(String email){
        emailField.sendKeys(email);
    }

    //Method for insert password LogIn
    public void insertPassword(String password){
        passwordField.sendKeys(password);
    }

    //Click Restore Password Link
    public void clickRestorePasswordLink(){
        restorePasswordLink.click();
    }

    //Click LogOut
    public void clickLogOut(){
        logOut.click();
    }

    public SelenideElement getButtonLogIn() {
        return buttonLogIn;
    }
}
