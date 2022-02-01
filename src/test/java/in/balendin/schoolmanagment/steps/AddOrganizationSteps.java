package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.AddOrganizationPage;
import net.thucydides.core.annotations.Step;


public class AddOrganizationSteps {

    AddOrganizationPage organizationPage;

    @Step("This step will navigate to the organization create form page")
    public void navigateToOrganizationForm()  {
        organizationPage.navigateToAddOrganizationForm();
    }

    Boolean isSchool = true;
    @Step("Redirect to org list")
    public void redirectToOrgList(){ organizationPage.navigateToOrgList();}

    @Step("This step will fill data in Organization form")
    public void createOrganization() {
        organizationPage.createOrganization(isSchool = false);
    }

    @Step("This step will fill data in Organization form")
    public void createOrganizationAlongWithSchool() {
        organizationPage.createOrganization(isSchool);
    }

    @Step("This step will verify organization Create")
    public void verifyOrganizationAndSchoolCreated() {
        organizationPage.verifyOrganizationAndSchoolCreated();
    }

    @Step("This step will verify organization Create")
    public void verifyOrganizationCreate() {
        organizationPage.verifyOrganizationCreated();
    }

    @Step("This step will verify organization Create WithoutMandatoryFields and Validations")
    public void verifyOrganizationCreateWithoutMandatoryFields() {
        organizationPage.createOrganizationNonMandatoryFields();
    }

    @Step("This step will verify postal code and Contact number fields validation")
    public void verifyPostalCode_PhoneNumberFields() {
        organizationPage.verifyPostalCode_PhoneNumberFields();
    }

    @Step("This step will verify Organization Name sort Ascending ")
    public void verifyOrgNameSortAscending() {
        organizationPage.navigateToOrgList();
        organizationPage.verifySortOrganizationNameAscending();
    }

    @Step("This step will verify Organization Name sort Descending ")
    public void verifyOrgNameSortDescending() {
        organizationPage.verifySortOrganizationNameDescending();

    }

    @Step("This step will verify organization Edit")
    public void EditOrganization() {
        organizationPage.navigateToOrgList();
        organizationPage.editCreatedOrg();
    }

    @Step("This step will verify organization Edit")
    public void verifyOrganizationEdited() {
        organizationPage.verifyOrganizationUpdated();
    }


    @Step("This step will verify organization Address Popup")
    public void verifyOrganizationAddressPageAndClosePage() {
        organizationPage.navigateToOrgList();
        organizationPage.verifyOrganizationAddressPageAndClosePage();
    }
    @Step("This step will verify Organization Address")
    public void verifyShowEntries() {
        organizationPage.verifyShowEntries(9);

    }

    @Step("This step will verify Organization Address")
    public void verifyOrganizationPagePagination() {
        organizationPage.navigateToOrgList();
        organizationPage.verifyPagination();
    }

    @Step("This step will verify Admin Logout")
    public void verifyAdminAbleToLogout() {
        organizationPage.logoutAdmin();
    }

    @Step("This step will verify Add Organization ContactName and Number Fields")
    public void VerifyContactNameAndNumberFields() {
        organizationPage.navigateToAddOrganizationForm();
        organizationPage.VerifyContactNameAndNumberFields();
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

}
