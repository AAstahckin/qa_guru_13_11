package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import page.components.CalenderComponent;
import page.components.CheckResultTableComponent;
import page.components.PictureUpload;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class PracticeFormTestPage {

    public CalenderComponent calenderComponent = new CalenderComponent();
    public CheckResultTableComponent checkResultTableComponent = new CheckResultTableComponent();
    public PictureUpload pictureUpload = new PictureUpload();

    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            dateOfBirthInput = $(".react-datepicker-wrapper .form-control"),
            userNumberInput = $("#userNumber"),
            subjectsInputInput = $("#subjectsInput"),
            currentAddressInput = $("#currentAddress"),
            userCityInput = $("#city"),
            submit = $("#submit"),
            closeSubmit = $("#closeLargeModal"),
            userStateInput = $("#state");

    @Step("Открываем главную страницу automation-practice-form")
    public PracticeFormTestPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    @Step("Вводим FirsName")
    public PracticeFormTestPage setFirsName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    @Step("Вводим LastName")
    public PracticeFormTestPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    @Step("Вводим UserEmail")
    public PracticeFormTestPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }
    @Step("Выбираем элемент по тексту")
    public PracticeFormTestPage clickByText(String value) {
        step("Находим элемент " + value + " и выбираем его", () -> {
            $(byText(value)).click();
        });
        return this;
    }
    @Step("Вводим UserNumber")
    public PracticeFormTestPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }
    @Step("Вводим Subjects")
    public PracticeFormTestPage setSubjectsInput(String value) {
        subjectsInputInput.sendKeys(value);
        subjectsInputInput.pressEnter();
        return this;
    }
    @Step("Добавляем вложение")
    public PracticeFormTestPage setPicture(String value) {
        pictureUpload.setPicture(value);
        return this;
    }
    @Step("Вводим CurrentAddress")
    public PracticeFormTestPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }
    @Step("Вводим DateOfBirth")
    public PracticeFormTestPage setDateOfBirth(String month, String year, String day) {
        dateOfBirthInput.click();
        calenderComponent.setDate(month, year, day);
        return this;
    }
    @Step("Вводим UserState")
    public PracticeFormTestPage setUserState(String value) {
        userStateInput.click();
        $(byText(value)).click();
        return this;
    }
    @Step("Вводим City")
    public PracticeFormTestPage setCity(String value) {
        userCityInput.click();
        $(byText(value)).click();
        return this;
    }
    @Step("Нажимаем Submit")
    public PracticeFormTestPage pressSubmit() {
        submit.click();
        return this;
    }
    @Step("Нажимаем Close")
    public PracticeFormTestPage closeSubmit() {
        closeSubmit.click();
        return this;
    }

    public PracticeFormTestPage checkResult(String key, String value) {
        step("Находим поле " + key + " проверяем, что заполнено сзначением: " + value, () -> {
            checkResultTableComponent.checkResult(key, value);
        });
        return this;
    }
}
