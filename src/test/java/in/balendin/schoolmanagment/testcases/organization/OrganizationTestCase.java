package in.balendin.schoolmanagment.testcases.organization;

import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.steps.OrganizationSteps;
import in.balendin.schoolmanagment.testcases.basetest.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@Narrative(text = {"As a super admin",
        "I want to be able to redirect organizationList when super admin clicks on GoBack button"})
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTagValuesOf({"organization"})
public class OrganizationTestCase extends BaseTestCase {

    @Steps
    LoginSteps loginSteps;

    @Steps
    OrganizationSteps organizationSteps;

    @Before
    public void loginAsSuperAdmin() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }
    @Test
    @Title("Verify super admin can able to see organization list ")
    public void superAdminIsSeeOrganizationList() {
        organizationSteps.superAdminIsRedirectSuccessfulOnOrganizationList();
    }
    @Test
    @WithTagValuesOf("regression")
    @Title( "Verify super admin are able to deleted organization")
    public void verifySuperAdminIsAbleToSearchOrganizationName() {
        organizationSteps.verifySuperAdminIsAbleToCreateOrganization();
        organizationSteps.searchOrganization();
        organizationSteps.verifySuperAdminIsAbleToDeleteOrganization();
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
    @Test
    @Title("Verify super admin is able to create organization with school")
    public void verifySuperAdminIsAbleToCreateOrganizationWithSchool(){
        organizationSteps.superAdminIsAbleToCreateOrganizationWithSchool();
    }
}
