package in.balendin.schoolmanagment.models;

import com.github.javafaker.Faker;
import in.balendin.schoolmanagment.util.DataGenerator;

public class UserData {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String newPassword;
    private String email;
    private String mobileNumber;

    public UserData() {
    }

    private  UserData(String firstName, String lastName, String userName, String password, String newPassword, String email, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.newPassword = newPassword;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public UserData generateUserData(){
        DataGenerator data = new DataGenerator();
        return new UserData(data.getOrg_Title(),data.getOrg_ContactName(),data.generateUsername(),data.generatePassword(),data.generatePassword(),
                data.generateEmail(),data.generatePhoneNumber());
    }
}
