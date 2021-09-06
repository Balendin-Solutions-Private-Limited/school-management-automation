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
@WithTagValuesOf({"organization","regression"})
public class OrganizationTestCase extends BaseTestCase {

    @Steps
    LoginSteps loginSteps;

    @Steps
    OrganizationSteps organizationSteps;

    @Before
    public void loginAsSuperAdmin(){
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }
    @Test
    @Title("Verify super admin can create organization with mandatory fields")
    public void superAdminIsCreateOrganization(){
        organizationSteps.createOrganization();
    }
    @Test
    @Title("Verify super admin can able to see organization list ")
    public void superAdminIsSeeOrganizationList(){
        organizationSteps.superAdminIsRedirectSuccessfulOnOrganizationList();
    }
    @Test
    @Title("Verify super admin can able to search organization name")
    public void verifySuperAdminIsAbleToSearchOrganizationName(){
        organizationSteps.superAdminIsAbleToSearchOrganizationName();
    }
    @Test
    @Title("Verify super admin can able to delete organization")
    public void verifySuperAdminIsAbleToDeleteOrganization(){
        organizationSteps.superAdminIsAbleToDeleteOrganization();
    }
    @Test
    @Title("Verify super admin can redirect to organization list when click on GoBack button")
    public void redirectToOrganizationList(){
        organizationSteps.redirectToOrganizationList();

    }

    @Test
    @Title("Verify super admin can able to sort serial number")
    public void verifySuperAdminIsAbleToSortSerialNumber(){
        organizationSteps.superAdminIsAbleToSortSerialNumber();
    }

    @Test
    @Title("Verify super admin can able to see 10 serial entries in serial list")
    public void verifySuperAdminIsAbleToSee10SerialList(){
        organizationSteps.superAdminIsAbleToSee10Entries();
    }

    @Test
    @Title("Verify super admin can able to see 25 serial entries in serial list")
    public void verifySuperAdminIsAbleToSee25SerialList(){
        organizationSteps.superAdminIsAbleToSee25Entries();
    }
        @Test
        @Title("Verify super admin can able to see 50 serial entries in serial list")
        public void verifySuperAdminIsAbleToSee50SerialList(){
            organizationSteps.superAdminIsAbleToSee50Entries();
        }
    @Test
    @Title("Verify super admin can able to see 100 and greater than 100 serial entries in serial list")
    public void verifySuperAdminIsAbleToSee100SerialList(){
        organizationSteps.superAdminIsAbleToSee100Entries();
    }

}
