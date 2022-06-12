import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import pageobjects.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class TestConstructor {
    MainPage mainPage;

    @Before
    public void maxWindowSizeAndRegister() {
        Configuration.startMaximized = true;
        mainPage = open(MainPage.mainPageUrl, MainPage.class);
        mainPage.clickConstructorLink();
    }

    @Test
    public void testBunsTab() {
        mainPage.clickSaucesTab();
        mainPage.clickBunsTab();
        mainPage.getHeaderBuns().shouldBe(visible);
    }

    @Test
    public void testSaucesTab() {
        mainPage.clickSaucesTab();
        mainPage.getHeaderSauces().shouldBe(visible);

    }

    @Test
    public void testFillingsTab() {
        mainPage.clickFillingsTab();
        mainPage.getHeaderFillings().shouldBe(visible);
    }
}
