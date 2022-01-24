package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.OrganizationPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class OrganizationSteps {

    OrganizationPage organizationPage;

    @Step("Verify super admin are able to create organization with mandatory fields")
    public void verifySuperAdminIsAbleToCreateOrganization() {
        organizationPage.navigateToOrganizationForm();
        organizationPage.createOrganization();
    }
    @Step("Verify super admin are able to search created organization")
    public void searchOrganization(){
        organizationPage.searchOrganization();
    }

    @Step("Verify super admin are able to delete organization")
    public void verifySuperAdminIsAbleToDeleteOrganization(){
        organizationPage.deleteOrganization();
    }
    @Step("Redirect to organization list when clicks on GoBack button")
    public void redirectToOrganizationList() {
        organizationPage.redirectToOrganizationList();
    }

    @Step("Verify super admin are able to redirect organization list when click on goBack button")
    public void superAdminIsRedirectSuccessfulOnOrganizationList() {
        organizationPage.navigateToOrganizationList();
        Assert.assertTrue(organizationPage.getTitle().equals("Organization List"));
    }

    @Step("Verify super admin are able to sort serial number in ascending ")
    public void SortSerialNumberAscending() {
        organizationPage.doSerialNumberSortingAscending();
    }
    @Step("Verify super admin are able to sort serial number in descending")
    public void SortSerialNumberDescending() {
        organizationPage.doSerialNumberDescending();
    }

    @Step("Verify super admin are able to see selected number of entries like 10,25,50,100")
    public void superAdminIsAbleToSeeSelectedEntryCount() {
        organizationPage.seeSelectedEntriesCount();
    }

    @Step("Verify super admin are able to create organization with school")
        public void superAdminIsAbleToCreateOrganizationWithSchool(){
        organizationPage.navigateToOrganizationForm();
        organizationPage.createOrganizationWithSchool();
    }

}

