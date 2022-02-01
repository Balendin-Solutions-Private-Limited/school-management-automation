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
    @Step("Verify admin Student Show Entries ")
    public void verifyStudentListShowEntryFunctionality() {
        studentPage.navigateToStudentList();
        studentPage.verifyShowEntries(1);
    }
    @Step("Verify Admin pagination functionality student list page")
    public void verifyPaginationStudentList() {
        studentPage.navigateToStudentList();
        studentPage.verifyPagination();
    }
    @Step("Verify Admin Student Template download and Import Student Data")
    public void verifyTemplateDownloadAndImportStudentData() {
        studentPage.navigateToStudentList();
        studentPage.verifyTemplateDownloadAndImportStudentData();
    }
}
