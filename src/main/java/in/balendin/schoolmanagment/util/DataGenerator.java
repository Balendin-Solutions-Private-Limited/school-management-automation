package in.balendin.schoolmanagment.util;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import static in.balendin.schoolmanagment.constants.Constants.FILE_LOGO;

public class DataGenerator {

    Faker faker;

    public DataGenerator() {
        faker = new Faker();
    }

    public String getOrg_Title() {
        return faker.name().lastName();
    }
    public String getSchoolCode() {
        return faker.numerify("GSY##");
    }

    public String getOrg_Description() {
        return faker.company().profession();
    }

    public String getOrg_Logo() {
        return FILE_LOGO;
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

    // Course Data

    public String getCourseName() {
        return faker.educator().course();
    }
    public String generateUsername(){
        return  getOrg_Title()+getOrg_ContactName();
    }
    public String generatePassword(){
        return faker.internet().password();
    }
    public String generateEmail(){
        return faker.internet().safeEmailAddress();
    }
    public String generateRoleName(){
        return faker.company().profession();
    }
}
