package tests.selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import page.MyRepository;

public class AnnotationStepTest {

    @Test
    public void annotationTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
        MyRepository steps = new MyRepository();

        steps.openMainPage();
        steps.openInsights();
        steps.clickContributors();
        steps.checkTitle();
        Selenide.sleep(3000);
        steps.takeScreenshot();
    }
}
