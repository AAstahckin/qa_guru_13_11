package testData;

import utls.RandomGenerator;

import static variableInterface.FormTest.*;

public class TestDataPractice {
    public static String checkingStateFillingLogic(String value) {

        switch (value) {
            case NCR:
                return RandomGenerator.getRandomArr(CITY_NCR);
            case UTTAR_PRADESH:
                return RandomGenerator.getRandomArr(CITY_UTTAR_PRADESH);
            case HARYANA:
                return RandomGenerator.getRandomArr(CITY_HARYANA);
            case RAJASTHAN:
                return RandomGenerator.getRandomArr(CITY_RAJASTHAN);
        }
        return value;
    }

    public static String practiceFirstName = RandomGenerator.getRandomString(7, ANY);
    public static String practiceLastName = RandomGenerator.getRandomString(7, ANY);
    public static String practiceEmail = RandomGenerator.getRandomString(10, EMAIL);
    public static String practiceMobileNumber = RandomGenerator.getRandomString(10, PHONE);
    public static String practiceSubjects = RandomGenerator.getRandomArr(SUBJECT);
    public static String practiceAddress = RandomGenerator.getRandomString(50, ANY);
    public static String practiceMonth = RandomGenerator.getRandomArr(MONTHS);
    public static String practiceYear = String.valueOf(RandomGenerator.getRandomInt(1900, 2100));
    public static String practiceDay = String.valueOf(RandomGenerator.getRandomInt(10, 28));
    public static String practiceMale = RandomGenerator.getRandomArr(GENDERS);
    public static String practiceHobbies = RandomGenerator.getRandomArr(HOBBY);
    public static String practiceState = RandomGenerator.getRandomArr(STATE);
    public static String practiceCity = checkingStateFillingLogic(practiceState);
    public static String picture = "img.png";
}
