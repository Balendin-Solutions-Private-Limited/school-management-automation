package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.CoursePage;
import in.balendin.schoolmanagment.pages.GeneralClass;
import net.thucydides.core.annotations.Step;

public class CourseSteps {

    CoursePage coursePage;
    GeneralClass generalClass;

    @Step("This step will Create Course")
    public void createCourse() {
        coursePage.navigateToAddCoursePage();
        coursePage.createCourse();
        coursePage.verifyCourseCreated();
    }
    @Step("This step will Update Course")
    public void editCourse() {
        coursePage.navigateToAddCourseListPage();
        coursePage.updateCourseSubConfigFeeConfig();
    }
    @Step("This step will Verify Course Validations")
    public void verifyValidationsCourse() {
        coursePage.navigateToAddCoursePage();
        coursePage.verifyCreateCoursePageValidations();
    }
    @Step("This step will Verify Course Subject Config Validations")
    public void verifyValidationsCourseSubConfig() {
        coursePage.navigateToAddCoursePage();
        coursePage.verifyCreateCoursePageSubConfigValidations();
    }
    @Step("This step will Verify Course Fee Config Validations")
    public void verifyValidationsCourseFeeConfig() {
        coursePage.navigateToAddCoursePage();
        coursePage.verifyCreateCoursePageFeeConfigValidations();
    }
    @Step("This step will Verify Search Course list By serial number")
    public void verifySearchCourseBySrNumber() {
        coursePage.navigateToAddCourseListPage();
        coursePage.searchCourseBySrNumber();

    }
    @Step("This step will Verify Search Course list By Course Name")
    public void verifySearchCourseByCourseName() {
        coursePage.navigateToAddCourseListPage();
        coursePage.searchCourseByCourseName();
    }
    @Step("This step will Verify Search Course list By Course Code")
    public void verifySearchCourseByCourseCode() {
        coursePage.navigateToAddCourseListPage();
        coursePage.searchCourseByCourseCode();
    }
    @Step("This step will Verify Search Course list By School Name")
    public void verifySearchCourseByCourseBySchool() {
        coursePage.navigateToAddCourseListPage();
        coursePage.searchCourseByCourseSchool();
    }
    @Step("This step will Verify Search Course list By Semester")
    public void verifySearchCourseByCourseBySemester() {
        coursePage.navigateToAddCourseListPage();
        coursePage.searchCourseByCourseSemester();
    }
    @Step("This step will Verify Search Course list By Class")
    public void verifySearchCourseByCourseByClass() {
        coursePage.navigateToAddCourseListPage();
        coursePage.searchCourseByCourseClass();
    }
    @Step("This step will Verify Search Course list By Section")
    public void verifySearchCourseByCourseBySection() {
        coursePage.navigateToAddCourseListPage();
        coursePage.searchCourseByCourseSection();
    }
    @Step("This step will Verify Sort serial number column Ascending & Descending")
    public void sortSerialNumberAscendingDescending() {
        coursePage.navigateToAddCourseListPage();
        coursePage.sortCourseSrNumberColumn();
    }
    @Step("This step will Verify Course Name column Ascending & Descending")
    public void sortCourseNameAscendingDescending() {
        coursePage.navigateToAddCourseListPage();
        coursePage.sortCourseNameColumn();
    }
    @Step("This step will Verify Sort Course Code column Ascending & Descending")
    public void sortCourseCodeAscendingDescending() {
        coursePage.navigateToAddCourseListPage();
        coursePage.sortCourseCodeColumn();
    }
    @Step("This step will Verify Sort School Name column Ascending & Descending")
    public void sortCourseSchoolNameAscendingDescending() {
        coursePage.navigateToAddCourseListPage();
        coursePage.sortCourseSchoolNameColumn();
    }
    @Step("This step will Verify Sort Semester column Ascending & Descending")
    public void sortCourseSemesterAscendingDescending() {
        coursePage.navigateToAddCourseListPage();
        coursePage.sortCourseSemesterColumn();

    }
    @Step("This step will Verify Sort Class column Ascending & Descending")
    public void sortCourseClassAscendingDescending() {
        coursePage.navigateToAddCourseListPage();
        coursePage.sortCourseClassColumn();
    }
    @Step("This step will Verify Sort Section column Ascending & Descending")
    public void sortCourseSectionAscendingDescending() {
        coursePage.sortCourseSectionColumn();
    }
    @Step("This step will Verify Course list Show entries functionality")
    public void verifyCourseListShowEntryFunctionality() {
        coursePage.navigateToAddCourseListPage();
        coursePage.verifyShowEntries(5);
    }
    @Step("This step will Verify Course list Pagination functionality")
    public void verifyCourseListPagePagination() {
        coursePage.navigateToAddCourseListPage();
        coursePage.verifyPagination();
    }
}
