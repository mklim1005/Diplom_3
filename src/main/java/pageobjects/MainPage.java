package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    public static final String mainPageUrl="https://stellarburgers.nomoreparties.site";

    //Locator for Личный Кабинет
    @FindBy(how= How.XPATH, using=".//p[text()='Личный Кабинет']")
    private SelenideElement logInLink;

    //Method for click LogIn link
    public void clickLogIn(){
        logInLink.click();
    }
}
