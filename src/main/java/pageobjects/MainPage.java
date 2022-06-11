package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    public static final String mainPageUrl="https://stellarburgers.nomoreparties.site";

    //Locator for Личный Кабинет
    @FindBy(how= How.XPATH, using=".//p[text()='Личный Кабинет']")
    private SelenideElement logInLink;

    //Locator for Войти в аккаунт Button
    @FindBy(how= How.XPATH, using=".//button[text()='Войти в аккаунт']")
    private SelenideElement logInIntoAccountButton;

    //Locator for button "оформить заказ"
    @FindBy(how= How.XPATH, using=".//button[text()='Оформить заказ']")
    private SelenideElement setAnOrderButton;

    //Method for click LogIn link
    public void clickLogIn(){
        logInLink.click();
    }
    //Method for click  Войти в аккаунт Button
    public void clickLogInIntoAccountButton(){
        logInIntoAccountButton.click();
    }

    public SelenideElement getSetAnOrderButton() {
        return setAnOrderButton;
    }
}
