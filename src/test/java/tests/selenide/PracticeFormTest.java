package tests.selenide;

import org.junit.jupiter.api.Test;

import static testData.TestDataPractice.*;

public class PracticeFormTest extends TestBase {

    @Test
    void successfulTest() {

        practiceFormTestPage
                .openPage()
                .setFirsName(practiceFirstName)
                .setLastName(practiceLastName)
                .setUserEmail(practiceEmail)
                .clickByText(practiceMale)
                .setDateOfBirth(practiceMonth, practiceYear, practiceDay)
                .setUserNumber(practiceMobileNumber)
                .setSubjectsInput(practiceSubjects)
                .clickByText(practiceHobbies)
                .setPicture(picture)
                .setCurrentAddress(practiceAddress)
                .setUserState(practiceState)
                .setCity(practiceCity)
                .pressSubmit()
                .checkResult("Student Name", practiceFirstName + " " + practiceLastName)
                .checkResult("Student Email", practiceEmail)
                .checkResult("Gender", practiceMale)
                .checkResult("Mobile", practiceMobileNumber)
                .checkResult("Date of Birth", practiceDay + " " + practiceMonth + "," + practiceYear)
                .checkResult("Subjects", practiceSubjects)
                .checkResult("Hobbies", practiceHobbies)
                .checkResult("Picture", picture)
                .checkResult("Address", practiceAddress)
                .checkResult("State and City", practiceState + " " + practiceCity)
                .closeSubmit();
    }
}
