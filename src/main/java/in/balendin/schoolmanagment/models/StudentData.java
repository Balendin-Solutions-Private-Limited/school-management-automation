package in.balendin.schoolmanagment.models;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class StudentData {

    Faker faker = new Faker();

    private String stu_Add_Num;
    private String stu_Name;
    private String stu_Gender;
    private String stu_Dob;
    private String stu_Mobile_Num;
    private String stu_Email;
    private String stu_Aadhar;
    private String stu_Father_Name;
    private String stu_Father_Email;
    private String stu_Father_Mobile;
    private String stu_Mother_Name;
    private String stu_Mother_Email;
    private String stu_Mother_Mobile;
    private String stu_Guardian_Mobile;
    private String stu_Batch;
    private String stu_RollNumber;
    private String stu_Course;
    private String stu_Course_Code;
    private String stu_Total_Semesters;
    private String stu_Year;
    private String stu_Semester;
    private String stu_Previous_Semester;
    private String stu_Academic_Year;
    private String stu_Class;
    private String stu_Section;
    private String stu_Subject_Code;
    private String stu_Subject_Name;
    private String stu_Exam_Semester;
    private String stu_ExamType;
    private int stu_Term1Fee;
    private String stu_Term2Fee;
    private String stu_Term3Fee;
    private String stu_TutionFee;
    private String stu_RegularFee;
    private String stu_ExamFee;
    private String stu_Library;
    private String stu_Bus;
    private String stu_Hostel;
    private String stu_Mess;
    private String stu_Lab;
    private String stu_ExtraCurricular_Activity;
    private String stu_Stationary;
    private String stu_LateFee;
    private String stu_DueDate;
    private String stu_UniformAndShoe;
    private String stu_Uniform;
    private String stu_Shoe;
    private String stu_BooksAndStationary;
    private String stu_BooksStationary_Uniform;
/*
    public StudentData(String stu_Add_Num, String stu_Name) {
            this.stu_Add_Num = stu_Add_Num;
            this.stu_Name = stu_Name;

        }*/

    public StudentData() {

    }

    public String generatePhoneNumber() {
        String randomNumbers = RandomStringUtils.randomNumeric(5);
        return 79393 + randomNumbers;
    }

    public int getOrg_PostalCode() {
        return generatePostalCode();
    }

    public int generatePostalCode() {
        int min = 100000;
        int max = 999999;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public String getStu_Add_Num() {
        return faker.number().toString();
    }

    public String getStu_Name() {
        return faker.name().firstName();
    }

    public String getStu_Gender() {
        return stu_Gender;
    }

    public String getStu_Dob() {
        return faker.date().birthday().toString();
    }

    public String getStu_Mobile_Num() {
        return generatePhoneNumber();
    }

    public String getStu_Email() {
        return faker.internet().emailAddress();
    }

    public String getStu_Aadhar() {
        return stu_Aadhar;
    }

    public String getStu_Father_Name() {
        return faker.name().name();
    }

    public String getStu_Father_Email() {
        return faker.internet().emailAddress();
    }

    public String getStu_Father_Mobile() {
        return generatePhoneNumber();
    }

    public String getStu_Mother_Name() {
        return faker.name().name();
    }

    public String getStu_Mother_Email() {
        return faker.internet().emailAddress();
    }

    public String getStu_Mother_Mobile() {
        return generatePhoneNumber();
    }

    public String getStu_Guardian_Mobile() {
        return faker.phoneNumber().toString();
    }

    public String getStu_Batch() {
        return stu_Batch;
    }

    public String getStu_RollNumber() {
        return stu_RollNumber;
    }

    public String getStu_Course() {
        return faker.educator().course();
    }

    public String getStu_Course_Code() {
        return faker.educator().course() + "001";
    }

    public String getStu_Total_Semesters() {
        return "1";
    }

    public String getStu_Year() {
        return stu_Year;
    }

    public String getStu_Semester() {
        return faker.number().digit();
    }

    public String getStu_Previous_Semester() {
        return stu_Previous_Semester;
    }

    public String getStu_Academic_Year() {
        return stu_Academic_Year;
    }

    public String getStu_Class() {
        return stu_Class;
    }

    public String getStu_Section() {
        return stu_Section;
    }

    public String getStu_Subject_Code() {
        return stu_Subject_Code;
    }

    public String getStu_Subject_Name() {
        return stu_Subject_Name;
    }

    public String getStu_Exam_Semester() {
        return stu_Exam_Semester;
    }

    public String getStu_ExamType() {
        return stu_ExamType;
    }

    public int getStu_Term1Fee() {
        return faker.number().numberBetween(100, 500);
    }

    public String getStu_Term2Fee() {
        return stu_Term2Fee;
    }

    public String getStu_Term3Fee() {
        return stu_Term3Fee;
    }

    public String getStu_TutionFee() {
        return stu_TutionFee;
    }

    public String getStu_RegularFee() {
        return stu_RegularFee;
    }

    public String getStu_ExamFee() {
        return stu_ExamFee;
    }

    public String getStu_Library() {
        return stu_Library;
    }

    public String getStu_Bus() {
        return stu_Bus;
    }

    public String getStu_Hostel() {
        return stu_Hostel;
    }

    public String getStu_Mess() {
        return stu_Mess;
    }

    public String getStu_Lab() {
        return stu_Lab;
    }

    public String getStu_ExtraCurricular_Activity() {
        return stu_ExtraCurricular_Activity;
    }

    public String getStu_Stationary() {
        return stu_Stationary;
    }

    public String getStu_LateFee() {
        return stu_LateFee;
    }

    public String getStu_DueDate() {
        return stu_DueDate;
    }

    public String getStu_UniformAndShoe() {
        return stu_UniformAndShoe;
    }

    public String getStu_Uniform() {
        return stu_Uniform;
    }

    public String getStu_Shoe() {
        return stu_Shoe;
    }

    public String getStu_BooksAndStationary() {
        return stu_BooksAndStationary;
    }

    public String getStu_BooksStationary_Uniform() {
        return stu_BooksStationary_Uniform;
    }
}
