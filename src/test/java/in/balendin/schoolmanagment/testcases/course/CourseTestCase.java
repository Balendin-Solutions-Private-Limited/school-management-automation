package in.balendin.schoolmanagment.testcases.course;
import in.balendin.schoolmanagment.steps.CourseSteps;
import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.testcases.basetest.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@Narrative(text = {"As a super admin,", "I want to be able to Automate Course Module"})
@RunWith(SerenityRunner.class)
@WithTagValuesOf({"Course", "regression"})

public class CourseTestCase extends BaseTestCase {

    @Steps
    LoginSteps loginSteps;

    @Steps
    CourseSteps courseSteps;

    @Before
    public void setUp() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }
    @Test()
    @Title("verify super admin can create Course Successfully")
    public void createCourse() {
        courseSteps.createCourse();
    }
    @Test()
    @Title("verify super admin can create Course Successfully")
    public void updateCourseSubConfigAndFee() {
        courseSteps.editCourse();
    }
    @Test()
    @Title("verify admin can see validations of course")
    public void verifyCourseValidations() {
        courseSteps.verifyValidationsCourse();
    }
    @Test()
    @Title("verify admin can see validations of course Subject Config")
    public void verifyCourseSubConfigValidations() {
        courseSteps.verifyValidationsCourseSubConfig();
    }
    @Test()
    @Title("verify admin can see validations of course Fee Config")
    public void verifyCourseFeeConfigValidations() {
        courseSteps.verifyValidationsCourseFeeConfig();
    }

    @Test
    @Title("Admin is able to search Course by Sr Number")
    public void searchCourseBySrNumber() {
        courseSteps.verifySearchCourseBySrNumber();
    }
    @Test
    @Title("Admin is able to search Course by Course Name")
    public void searchCourseByCourseName() {
        courseSteps.verifySearchCourseByCourseName();
    }
    @Test
    @Title("Admin is able to search Course Course Code")
    public void searchCourseByCourseCode() {
        courseSteps.verifySearchCourseByCourseCode();
    }
    @Test
    @Title("Admin is able to search Course by School Name")
    public void searchCourseByCourseBySchool() {
        courseSteps.verifySearchCourseByCourseBySchool();
    }
    @Test
    @Title("Admin is able to search Course by School Name")
    public void searchCourseByCourseBySemester() {
        courseSteps.verifySearchCourseByCourseBySemester();
    }
    @Test
    @Title("Admin is able to search Course by School Name")
    public void searchCourseByCourseByClass() {
        courseSteps.verifySearchCourseByCourseByClass();
    }
    @Test
    @Title("Admin is able to search Course by School Name")
    public void searchCourseByCourseBySection() {
        courseSteps.verifySearchCourseByCourseBySection();
    }
    @Test
    @Title("Verify admin can able to sort serial number in ascending and descending order")
    public void verifySortSerialNumberAscendingDescending() {
        courseSteps.sortSerialNumberAscendingDescending();
    }
    @Test
    @Title("Verify admin can able to sort Course Name in ascending and descending order")
    public void verifySortCourseNameAscendingDescending() {
        courseSteps.sortCourseNameAscendingDescending();
    }
    @Test
    @Title("Verify admin can able to sort Course Code in ascending and descending order")
    public void verifySortCourseCodeAscendingDescending() {
        courseSteps.sortCourseCodeAscendingDescending();
    }
    @Test
    @Title("Verify admin can able to sort Course School Name in ascending and descending order")
    public void verifySortCourseSchoolNameAscendingDescending() {
        courseSteps.sortCourseSchoolNameAscendingDescending();
    }
    @Test
    @Title("Verify admin can able to sort Course Semester Name in ascending and descending order")
    public void verifySortCourseSemesterAscendingDescending() {
        courseSteps.sortCourseSemesterAscendingDescending();
    }
    @Test
    @Title("Verify admin can able to sort Course Class Name in ascending and descending order")
    public void verifySortCourseClassAscendingDescending() {
        courseSteps.sortCourseClassAscendingDescending();
    }
    @Test
    @Title("Verify admin can able to sort Course Section in ascending and descending order")
    public void verifySortCourseSectionAscendingDescending() {
        courseSteps.sortCourseSectionAscendingDescending();
    }
    @Test
    @Title("Verify Admin functionality Course List Show Entry count")
    public void verifyCourseListShowEntryFunctionality() {
        courseSteps.verifyCourseListShowEntryFunctionality();
    }

    @Test
    @Title("Verify Admin Course list page pagination functionality")
    public void verifyCourseListPaginationFunctionality() {
        courseSteps.verifyCourseListPagePagination();
    }
}
