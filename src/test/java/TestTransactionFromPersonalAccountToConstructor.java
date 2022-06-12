import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pageobjects.LogInPage;
import pageobjects.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class TestTransactionFromPersonalAccountToConstructor {
    @Before
    public void maxWindowSize() {
        Configuration.startMaximized = true;
    }

    @Test
    public void testTransactionFromPersonalAccountToConstructor() throws InterruptedException {
        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogIn();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.clickConstructorLink();
        MainPage mainPage1 = page(MainPage.class);

        mainPage1.constructBurgerTitle().shouldBe(visible);
    }
}
