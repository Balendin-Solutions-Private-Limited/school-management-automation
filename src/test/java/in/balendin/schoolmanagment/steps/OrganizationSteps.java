package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.OrganizationPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class OrganizationSteps {

    OrganizationPage organizationPage;

    @Step("Verify super admin are able to create organization with mandatory fields")
    public void createOrganization(){
        organizationPage.navigateToOrganizationForm();
        organizationPage.createOrganization();
    }

    @Step("Redirect to organization list when clicks on GoBack button")
    public void redirectToOrganizationList(){
        organizationPage.redirectToOrganizationList();
    }

    @Step("Verify super admin are able to redirect organization list when click on goBack button")
    public void superAdminIsRedirectSuccessfulOnOrganizationList(){
        organizationPage.navigateToOrganizationList();
        Assert.assertTrue(organizationPage.getTitle().equals("Organization List"));
    }
    @Step("Verify super admin are able to sort serial number")
    public void superAdminIsAbleToSortSerialNumber(){
      organizationPage.doSerialNumberSorting();
    }

    @Step("Verify super admin are able to search organization name")
    public void superAdminIsAbleToSearchOrganizationName(){
        organizationPage.searchOrganizationName();
    }
    @Step("Verify super admin are able to see 10 serial entries")
    public void superAdminIsAbleToSee10Entries(){
        organizationPage.see10Entries();
    }
    @Step("Verify super admin are able to see 25 serial entries")
    public void superAdminIsAbleToSee25Entries(){
        organizationPage.see25Entries();
    }
    @Step("Verify super admin are able to see 50 serial entries")
    public void superAdminIsAbleToSee50Entries(){
        organizationPage.see50Entries();
    }
    @Step("Verify super admin are able to see 100 and greater than 100 serial entries")
    public void superAdminIsAbleToSee100Entries(){
        organizationPage.see100Entries();
    }
    @Step("Verify super admin are able to delete organization ")
    public void superAdminIsAbleToDeleteOrganization(){
        organizationPage.deleteOrganization();
    }

}

