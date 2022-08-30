package page;

import com.codeborne.selenide.SelenideElement;
import page.components.CalenderComponent;
import page.components.CheckResultTableComponent;
import page.components.PictureUpload;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

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


    public PracticeFormTestPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public PracticeFormTestPage setFirsName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public PracticeFormTestPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public PracticeFormTestPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public PracticeFormTestPage clickByText(String value) {
        $(byText(value)).click();
        return this;
    }

    public PracticeFormTestPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public PracticeFormTestPage setSubjectsInput(String value) {
        subjectsInputInput.sendKeys(value);
        subjectsInputInput.pressEnter();
        return this;
    }

    public PracticeFormTestPage setPicture(String value) {
        pictureUpload.setPicture(value);
        return this;
    }

    public PracticeFormTestPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public PracticeFormTestPage setDateOfBirth(String month, String year, String day) {
        dateOfBirthInput.click();
        calenderComponent.setDate(month, year, day);
        return this;
    }

    public PracticeFormTestPage setUserState(String value) {
        userStateInput.click();
        $(byText(value)).click();
        return this;
    }

    public PracticeFormTestPage setCity(String value) {
        userCityInput.click();
        $(byText(value)).click();
        return this;
    }

    public PracticeFormTestPage pressSubmit() {
        submit.click();
        return this;
    }

    public PracticeFormTestPage closeSubmit() {
        closeSubmit.click();
        return this;
    }

    public PracticeFormTestPage checkResult(String key, String value) {
        checkResultTableComponent.checkResult(key, value);
        return this;
    }
}
