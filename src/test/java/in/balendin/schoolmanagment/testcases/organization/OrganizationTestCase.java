package in.balendin.schoolmanagment.testcases.organization;
import in.balendin.schoolmanagment.steps.AddOrganizationSteps;
import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.testcases.basetest.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@Narrative(text = {"As a super admin,", "I want to be able to Create Organization"})
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTagValuesOf({"addOrganization", "regression"})

public class OrganizationTestCase extends BaseTestCase {

    @Steps
    LoginSteps loginSteps;
    @Steps
    AddOrganizationSteps organizationSteps;
    
    @Before
    public void setUp() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }

    @Test()
    @Title("verify super admin is able to create Organization")
    public void createOrganization() {
        organizationSteps.navigateToOrganizationForm();
        organizationSteps.createOrganization();
        organizationSteps.verifyOrganizationCreate();
    }

    @Test()
    @Title("verify super admin can create Organization along with School")
    public void createOrganizationWithSchool() {
        organizationSteps.navigateToOrganizationForm();
        organizationSteps.createOrganizationAlongWithSchool();
        organizationSteps.verifyOrganizationAndSchoolCreated();
    }


    @Test
    @Title("verify super admin can create Organization Without Mandatory Fields")
    public void addOrganizationWithoutMandatoryFields() {
        organizationSteps.navigateToOrganizationForm();
        organizationSteps.verifyOrganizationCreateWithoutMandatoryFields();
    }

    @Test
    @Title("verify Organization page Postal and contact number validations")
    public void addOrganizationValidations() {
        organizationSteps.navigateToOrganizationForm();
        organizationSteps.verifyPostalCode_PhoneNumberFields();

    }
    @Test
    @Title("verify super admin can edit Organization")
    public void editOrganization() {
        organizationSteps.EditOrganization();
        organizationSteps.verifyOrganizationEdited();
    }

    @Test
    @Title("verify Organization column sort Ascending and descending")
    public void OrganizationNameSortAscendingAndDescending() {
        organizationSteps.verifyOrgNameSortAscending();
        organizationSteps.verifyOrgNameSortDescending();
    }
    @Test
    @Title("verify super admin can Delete Organization")
    public void deleteOrganization() {
        organizationSteps.navigateToOrganizationForm();
        organizationSteps.createOrganization();
        organizationSteps.searchOrganization();
        organizationSteps.verifySuperAdminIsAbleToDeleteOrganization();
    }

    @Test
    @Title("verify super admin is able to see  Organization Address popup and close popup")
    public void verifyAbleToSeeOrganizationAddressPageAndClosePopup() {
        organizationSteps.verifyOrganizationAddressPageAndClosePage();
    }

    @Test
    @Title("verify Organization Page Pagination")
    public void organizationPagePagination() {
        organizationSteps.verifyOrganizationPagePagination();
    }

    @Test
    @Title("verify admin is able to logout")
    public void verifyAdminLogOut() {
        organizationSteps.verifyAdminAbleToLogout();
    }

    @Test
    @Title("verify required fields contact number and contact name")
    public void verifyContactNameAndContactNumberRequiredFields() {
        organizationSteps.VerifyContactNameAndNumberFields();
    }


    @Test
    @Title("Verify super admin can able to see organization list ")
    public void superAdminIsSeeOrganizationList() {
        organizationSteps.redirectToOrgList();

    }

    @Test
    @Title("Verify super admin can redirect to organization list when click on GoBack button")
    public void redirectToOrganizationList() {
        organizationSteps.redirectToOrganizationList();
    }
    @Test
    @Title("Verify super admin can able to sort serial number in ascending and descending order")
    public void verifySuperAdminIsAbleToSortSerialNumberAscendingDescending() {
        organizationSteps.SortSerialNumberAscending();
        organizationSteps.SortSerialNumberDescending();
    }

    @Test
    @WithTagValuesOf("pageDropdown")
    @Title("Verify super admin can able to see selected entry option in page show entries dropdown")
    public void verifySuperAdminIsAbleToSeeSelectedEntryCount() {
        organizationSteps.superAdminIsAbleToSeeSelectedEntryCount();
    }
}
