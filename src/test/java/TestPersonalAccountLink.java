import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pageobjects.LogInPage;
import pageobjects.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class TestPersonalAccountLink {

    @Before
    public void maxWindowSize() {
        Configuration.startMaximized = true;
    }

    @Test
    public void testPersonalAccountLinkFromMainPage() {
        MainPage mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickLogIn();
        LogInPage logInPage = page(LogInPage.class);
        logInPage.getButtonLogIn().shouldBe(visible);
    }
}
