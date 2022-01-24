package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.ProcessingFeePage;
import net.thucydides.core.annotations.Step;

public class ProcessingFeeSteps {

    ProcessingFeePage feePage;
    String organization = "Organization";
    String parent = "Parent";
    String thirdParty = "Third Party";


    @Step("This step will create ProcessingFee")
    public void CreateProcessingFee() {
        feePage.navigateToProcessingFeeForm();
        feePage.createProcessingFee(organization);
    }
    @Step("This step will verify Update ProcessingFee")
    public void verifyProcessingFeeEdit() {
        feePage.navigateToProcessingFeeList();
        feePage.editProcessingFee();
    }

    @Step("This step will verify Delete ProcessingFee")
    public void verifyDeleteProcessingFee() {
        feePage.navigateToProcessingFeeList();
        feePage.deleteProcessingFee();
      //  feePage.deleteProcessingFeeAllItems();

    }
    @Step("This step will verify existing Processing Fee School Name displayed in the Select school dropdown in Add Processing Fee Page")
    public void verifyExistingSchoolNameDisplayedInSelectSchoolDropdown() {
        feePage.navigateToProcessingFeeForm();
        feePage.verifyExistingSchoolNameDisplayedInSelectSchoolDropdown(organization);

    }
}
