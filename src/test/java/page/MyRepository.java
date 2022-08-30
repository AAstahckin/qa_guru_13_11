package page;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MyRepository {

    @Step("Открываем главную страницу моего проекта")
    public void openMainPage() {
        open("https://github.com/AAstahckin/qa_guru_13_11");
    }

    @Step("Нажимаем на Insights")
    public void openInsights() {
        $("#insights-tab").click();
    }

    @Step("Нажимаем на Contributors")
    public void clickContributors() {
        $(byText("Contributors")).click();
    }

    @Step("Проверяем название репозитория")
    public void checkTitle() {
        $(byText("AAstahckin")).shouldHave(text("AAstahckin"));

    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
