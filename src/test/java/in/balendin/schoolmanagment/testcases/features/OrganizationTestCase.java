package in.balendin.schoolmanagment.testcases.features;
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
    @Title("verify super admin can create Organization")
    public void T1_OrganizationCreate() {
        organizationSteps.navigateToOrganizationForm();
        organizationSteps.createOrganization();
        organizationSteps.verifyOrganizationCreate();
    }

    @Test()
    @Title("verify super admin can create Organization along with School")
    public void T2_OrganizationCreateAlongWithSchool() {
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
    @Title("verify super admin can Update Organization")
    public void T3_editOrganization() {
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
    public void T4_deleteOrganization() {
        organizationSteps.verifyOrganizationDelete();
    }

    @Test
    @Title("verify super admin Organization Address popup")
    public void T4_verifyOrganizationAddressPageAndClosePage() {
        organizationSteps.verifyOrganizationAddressPageAndClosePage();
    }
    @Test()
    @Title("verify show entries in Organization List page")
    public void T6_VerifyShowEntries() {
        organizationSteps.verifyShowEntries();
    }

    @Test
    @Title("verify Organization Page Pagination")
    public void T10_OrganizationPagePagination() {
        organizationSteps.verifyOrganizationPagePagination();
    }
    @Test
    @Title("verify admin logout")
    public void T10_VerifyAdminLogOut() {
        organizationSteps.verifyAdminAbleToLogout();
    }

    @Test
    @Title("verify Organization Page Pagination")
    public void T10_VerifyContactNameAndNumberFields() {
        organizationSteps.VerifyContactNameAndNumberFields();
    }

}
