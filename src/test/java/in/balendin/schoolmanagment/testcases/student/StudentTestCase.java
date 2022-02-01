package in.balendin.schoolmanagment.testcases.student;

import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.steps.StudentSteps;
import in.balendin.schoolmanagment.testcases.basetest.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTagValuesOf("Student")

public class StudentTestCase extends BaseTestCase {
    @Steps
    LoginSteps loginSteps;

    @Steps
    StudentSteps studentSteps;

    @Before
    public void loginAsSuperAdmin() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }
    @Test
    @Title("Admin is able to see student list")
    public void redirectToStudentList(){
        studentSteps.verifyAdminIsAbleToSeeStudentList();
    }

    @Test
    @Title("Admin is able to search student by Admission Number")
    public void searchStudentByAdmissionNumber(){
        studentSteps.verifyAdminIsAbleToSearchStudentByAdmissionNumber();
    }

    @Test
    @Title("Verify Admin functionality student Show Entry count")
    public void verifyStudentListShowEntryFunctionality(){
        studentSteps.verifyStudentListShowEntryFunctionality();
    }
    @Test
    @Title("Verify Admin pagination functionality student list page")
    public void verifyPaginationStudentList(){
        studentSteps.verifyPaginationStudentList();
    }

    @Test
    @Title("Verify Admin Student Template download and Import Student Data")
    public void verifyTemplateDownloadAndImportStudentData(){
        studentSteps.verifyTemplateDownloadAndImportStudentData();
    }




}




















