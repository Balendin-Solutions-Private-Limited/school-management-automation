package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.AddOrganizationPage;
import net.thucydides.core.annotations.Step;

public class AddOrganizationSteps {

    AddOrganizationPage organizationPage;

    @Step("This step will navigate to the organization create form page")
    public void navigateToOrganizationForm()  {
        organizationPage.navigateToAddOrganizationForm();
    }

    @Step("This step will navigate to the organization create form page")
    public void navigateORGList()  {
        organizationPage.navigateToOrgList();
    }

    @Step("This step will fill data in Organization form")
    public void createOrganization() {
        organizationPage.CreateOrganization();
    }

    @Step("This step will verify organization Create")
    public void verifyOrganizationCreate() {
        organizationPage.verifyOrganizationCreated();
    }

    @Step("This step will verify organization Create WithoutMandatoryFields and Validations")
    public void verifyOrganizationCreateWithoutMandatoryFields() {
       // organizationPage.navigateToAddOrganizationForm();
        organizationPage.CreateOrganizationNonMandatoryFields();
    }

    @Step("This step will verify postal code and Contact number fields validation")
    public void verifyFields() {
        organizationPage.verifyFields();

    }
}
