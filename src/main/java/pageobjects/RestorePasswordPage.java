package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RestorePasswordPage {

    public static final String mainPageUrl="https://stellarburgers.nomoreparties.site/forgot-password";

    //Locator for LogIn Link
    @FindBy(how= How.XPATH, using=".//a[@class='Auth_link__1fOlj']")
    private SelenideElement logInLinkFromRestorePasswordPAge;

    //Method Click LogIn Link
    public void clickLogInLink(){
        logInLinkFromRestorePasswordPAge.click();
    }
}
