package utls;

import java.util.Random;

import static variableInterface.FormTest.*;

public class RandomGenerator {
    static Random random = new Random();

    public static String randomString(int length, String value) {
        StringBuilder result = new StringBuilder();
        while (length > 0) {
            Random rand = new Random();
            result.append(value.charAt(rand.nextInt(value.length())));
            length--;
        }
        return result.toString();
    }

    public static String getRandomArr(String[] value) {
        return value[random.nextInt(value.length)];
    }

    public static int getRandomInt(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static String getRandomString(int length, String key) {
        switch (key) {
            case EMAIL:
                return randomString(length, CHARACTERS) + DOMAIN_TEST;
            case PHONE:
                return randomString(length, NUMBER);
            case ANY:
                return randomString(length, ANY_STRING);
        }
        return key;
    }
}
