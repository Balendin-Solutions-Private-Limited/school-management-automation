package in.balendin.schoolmanagment.utility;

import com.github.javafaker.Faker;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateData  {
    Faker faker;
    public GenerateData(){
        faker = new Faker();
    }
    public String getOrganizationName() {
        return faker.name().firstName();
    }
    public String getAddress() {
        return faker.address().streetAddress();
    }

    public String getLocation() {
        return faker.address().buildingNumber();
    }

    public String getCity() {
        return faker.address().cityName();
    }

    public String getContactName() {
        String name = faker.name().firstName();
        System.out.println("Contact Name " + name);
//        return faker.name().firstName();
        return name;
    }

    public String getContactNumber() {
        return getNumbers();
    }
    public String getNumbers(){
        String numbers = RandomStringUtils.randomNumeric(5);
        return 52525 + numbers;
    }
    public String getRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
        return generatedString;
    }
}
