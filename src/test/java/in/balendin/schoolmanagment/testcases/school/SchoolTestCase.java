package in.balendin.schoolmanagment.testcases.school;


import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.steps.SchoolSteps;
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
@WithTagValuesOf("School")

public class SchoolTestCase extends BaseTestCase {

    @Steps
    LoginSteps loginSteps;

    @Steps
    SchoolSteps schoolSteps;

    @Before
    public void loginAsSuperAdmin() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }

    @Test
    @Title("Admin is able to create School")
    public void verifyCreateSchool() {
        schoolSteps.verifyAdminIsAbleToCreateSchool();
    }

    @Test
    @Title("Admin is able to create School")
    public void verifyUpdateSchool() {
        schoolSteps.verifyAdminIsAbleToUpdateSchool();
    }

    @Test
    @Title("Admin is able to create School")
    public void verifyDeleteSchool() {
        schoolSteps.verifyAdminIsAbleToDeleteSchool();
    }

    @Test
    @Title("Admin is able to search School by School name")
    public void searchSchoolBySchoolName() {
        schoolSteps.verifySearchSchoolBySchoolName();
    }
    @Test
    @Title("Admin is able to search School By All Columns data")
    public void searchSchoolByAllColumnData() {
        schoolSteps.verifySearchSchoolByAllColumnData();
    }

    @Test
    @Title("Admin is able to search School Sr Number")
    public void searchSchoolBySchoolSrNumber() {
        schoolSteps.verifySearchSchoolBySrNumber();
    }

    @Test
    @Title("Admin is able to search School by School contact Person name")
    public void searchSchoolByContactPersonName() {
        schoolSteps.verifySearchSchoolByContactPersonName();
    }

    @Test
    @Title("Admin is able to search School by School Contact Person number")
    public void searchSchoolByContactPersonNumber() {
        schoolSteps.verifySearchSchoolByContactPersonNumber();
    }

    @Test
    @Title("Admin is able to search School by School City")
    public void searchSchoolBySchoolCity() {
        schoolSteps.verifySearchSchoolBySchoolCity();
    }

    @Test
    @Title("Verify Admin functionality School list Show Entry count")
    public void verifySchoolListShowEntryFunctionality() {
        schoolSteps.verifySchoolListShowEntryFunctionality();
    }

    @Test
    @Title("Verify Admin School list page pagination functionality")
    public void verifySchoolListPaginationFunctionality() {
        schoolSteps.verifySchoolListPagePagination();
    }

    @Test
    @Title("Verify super admin can able to sort serial number in ascending and descending order")
    public void verifySuperAdminIsAbleToSortSerialNumberAscendingDescending() {
        schoolSteps.SortSerialNumberSchoolList();
    }

    @Test
    @Title("Verify Admin Sort School list by School Name")
    public void verifySchoolListSortBySchoolName() {
        schoolSteps.verifySchoolListNameColumnAscendingDescending();
    }

    @Test
    @Title("Verify Admin Sort School list by Contact Person Name")
    public void verifySchoolListSortByContactPersonName() {
        schoolSteps.verifySchoolListContactNameColumnAscendingDescending();
    }

    @Test
    @Title("Verify Admin Sort School list by Contact Person Number")
    public void verifySchoolListSortByContactPersonNumber() {
        schoolSteps.verifySchoolListContactNumberColumnAscendingDescending();
    }

    @Test
    @Title("Verify Admin Sort School list by City Name")
    public void verifySchoolListSortByCityName() {
        schoolSteps.verifySchoolCityNameColumnAscendingDescending();
    }

    @Test
    @Title("Verify Admin Sort School list by City Name")
    public void verifySchoolAddressPopupFunctionality() {
        schoolSteps.verifySchoolAddressPopupFunctionality();
    }

    @Test
    @Title("Verify Admin Add School Page validation messages")
    public void verifySchoolAddPageMandatoryFieldsValidationMessages() {
        schoolSteps.verifyAddSchoolPageValidation();
    }

    @Test
    @Title("Verify Admin Add School Page fields")
    public void verifySchoolAddPageFields() {
        schoolSteps.verifyAddSchoolPageFields();
    }

    @Test
    @Title("Verify Admin Add School Page Select Organization values ")
    public void verifySchoolAddPageSelectOrgList() {
        schoolSteps.verifyAddSchoolSelectOrganizationFieldOptions();
    }
}
