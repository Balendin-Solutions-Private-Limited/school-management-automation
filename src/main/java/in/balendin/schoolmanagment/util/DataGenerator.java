package in.balendin.schoolmanagment.util;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import static in.balendin.schoolmanagment.constants.Constants.ORG_LOGO;

public class DataGenerator {

    Faker faker;

    public DataGenerator() {
        faker = new Faker();
    }

    public String getOrg_Title() {
        return faker.name().lastName();
    }

    public String getOrg_Description() {
        return faker.company().profession();
    }

    public String getOrg_Logo() {
        return ORG_LOGO;
    }

    public String getOrg_Address1() {
        return faker.address().streetAddress();
    }

    public String getOrg_Address2() {
        return faker.address().streetAddress();
    }

    public String getOrg_Location() {
        return faker.address().buildingNumber();
    }

    public String getOrg_City() {
        return faker.address().cityName();
    }

    public int getOrg_PostalCode() {
        return generatePostalCode();
    }

    public String getOrg_ContactName() {
        return faker.name().firstName();
    }

    public String getOrg_ContactNumber() {
        return generatePhoneNumber();
    }

    public int generatePostalCode() {
        int min = 100000;
        int max = 999999;
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public int randomNumber() {
        int min = 100000;
        int max = 999999;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public String generatePhoneNumber() {
        String randomNumbers = RandomStringUtils.randomNumeric(5);
        return 79393 + randomNumbers;
    }

    public String generatePassword(){
        return faker.internet().password();
    }
    public String generateEmail(){
        return faker.internet().safeEmailAddress();
    }
    public String generateUsername(){
        return  getOrg_Title()+getOrg_ContactName();
    }

}
