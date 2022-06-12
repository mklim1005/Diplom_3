package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class RegistrationPage {
    public static final String mainPageUrl="https://stellarburgers.nomoreparties.site/register";

    //Locator for name field
    @FindBy(how= How.XPATH, using=".//input")
    private List<SelenideElement> inputs;

    //Locator for Registration Button
    @FindBy(how= How.XPATH, using=".//button[text()='Зарегистрироваться']")
    private SelenideElement registrationButton;

    //Locator for message Некорректный пароль
    @FindBy(how= How.XPATH, using=".//p[text()='Некорректный пароль']")
    private SelenideElement messageNotCorrectPassword;

    //Locator for LogIn Link in Registration Page
    @FindBy(how= How.XPATH, using=".//a[@class='Auth_link__1fOlj']")
    private SelenideElement logInLinkFromRegistrationPAge;



    //Method for insertName
    public void insertName(String name){
        inputs.get(0).sendKeys(name);

    }

    //Method for insertEmail
    public void insertEmail(String email){
        inputs.get(1).sendKeys(email);
    }

    //Method for insertPassword
    public void insertPassword(String password){
        inputs.get(2).sendKeys(password);
    }

    //Method for click Registration Button
    public void clickRegistrationButton(){
        registrationButton.click();
    }

    //Method for click LogIn Link in Registration Page
    public void clickLogInLinkFromRegistrationPage(){
        logInLinkFromRegistrationPAge.click();
    }

    public List<SelenideElement> getInputs() {
        return inputs;
    }

    public SelenideElement getRegistrationButton() {
        return registrationButton;
    }

    public SelenideElement getMessageNotCorrectPassword() {
        return messageNotCorrectPassword;
    }
}

