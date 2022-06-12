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

    //Locator for h1 "Соберите бургер"
    @FindBy(how= How.XPATH, using=".//h1[text()='Соберите бургер']")
    private SelenideElement constructBurgerTitle;

    //Locator for Buns Tab
    @FindBy(how= How.XPATH, using=".//span[text()='Булки']")
    private SelenideElement bunsTab;

    //Locator for Sauce Tab
    @FindBy(how= How.XPATH, using=".//span[text()='Соусы']")
    private SelenideElement saucesTab;

    //Locator for Fillings Tab
    @FindBy(how= How.XPATH, using=".//span[text()='Начинки']")
    private SelenideElement fillingsTab;

    //Locator for Constructor Link
    @FindBy(how= How.XPATH, using=".//p[text()='Конструктор']")
    private SelenideElement constructorLink;

    //Locator for Header Buns
    @FindBy(how= How.XPATH, using=".//h2[text()='Булки']")
    private SelenideElement headerBuns;

    //Locator for Header Sauces
    @FindBy(how= How.XPATH, using=".//h2[text()='Соусы']")
    private SelenideElement headerSauces;

    //Locator for Header Fillings
    @FindBy(how= How.XPATH, using=".//h2[text()='Начинки']")
    private SelenideElement headerFillings;

    //Method for click LogIn link
    public void clickLogIn(){
        logInLink.click();
    }

    //Method for click Buns Tab link
    public void clickBunsTab(){
        bunsTab.click();
    }

    //Method for click Fillings Tab link
    public void clickFillingsTab(){
        fillingsTab.click();
    }

    //Method for click Sauces Tab link
    public void clickSaucesTab(){
        saucesTab.click();
    }

    //Method for click Constructor link
    public void clickConstructorLink(){
        constructorLink.click();
    }


    //Method for click  Войти в аккаунт Button
    public void clickLogInIntoAccountButton(){
        logInIntoAccountButton.click();
    }

    public SelenideElement getSetAnOrderButton() {
        return setAnOrderButton;
    }

    public SelenideElement constructBurgerTitle() {
        return constructBurgerTitle;
    }

    public SelenideElement getHeaderBuns() {
        return headerBuns;
    }

    public SelenideElement getHeaderSauces() {
        return headerSauces;
    }

    public SelenideElement getHeaderFillings() {
        return headerFillings;
    }
}
