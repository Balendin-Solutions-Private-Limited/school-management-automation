package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.StudentPage;
import net.thucydides.core.annotations.Step;

public class StudentSteps {
    StudentPage studentPage;

    @Step("Verify admin are able to see student list")
    public void verifyAdminIsAbleToSeeStudentList(){
        studentPage.navigateToStudentList();

    }
    @Step("Verify admin is able to search student by admission number")
    public void verifyAdminIsAbleToSearchStudentByAdmissionNumber(){
        studentPage.navigateToStudentList();
        studentPage.selectSchool();
        studentPage.select100Entries();
//        studentPage.searchStudentsByAdmissionNumber();
        studentPage.searchStudentAdmissionNumber();
    }
    @Step("Verify admin is able to search student by student name")
    public void verifyAdminIsAbleToSearchStudentByStudentName(){
        studentPage.navigateToStudentList();
        studentPage.selectSchool();
        studentPage.select100Entries();
        studentPage.searchStudentByStudentName();
    }

    @Step("Verify admin is able to search student by student DOB")
    public void verifyAdminIsAbleToSearchStudentByStudentDOB(){
        studentPage.navigateToStudentList();
        studentPage.selectSchool();
        studentPage.select100Entries();
        studentPage.searchStudentByDOB();
    }
    @Step("Verify admin is able to search student according to school name")
    public void verifyAdminIsAbleToSearchStudentBySchoolNames(){
        studentPage.navigateToStudentList();
        studentPage.selectSchool();
        studentPage.select100Entries();
        studentPage.searchStudentsAccordingToSchool();
    }
    @Step("Verify admin is able to sort admission number")
    public void verifyAdminIsAbleToSortAdmissionNumber(){
        studentPage.navigateToStudentList();
        studentPage.selectSchool();
        studentPage.select100Entries();
        studentPage.sortAdmissionNumber();
    }
    @Step("Verify admin is able to sort student name")
    public void verifyAdminIsAbleToSortStudentName(){
        studentPage.navigateToStudentList();
        studentPage.selectSchool();
        studentPage.select100Entries();
        studentPage.sortStudentName();
    }
    @Step("Verify admin is able to sort student DOB")
    public void verifyAdminIsAbleToSortStudentDOB(){
        studentPage.navigateToStudentList();
        studentPage.selectSchool();
        studentPage.select100Entries();
        studentPage.sortStudentDOB();
    }
}
