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
        studentPage.selectSchool();
        studentPage.searchStudentsByAdmissionNumber();
    }
}
