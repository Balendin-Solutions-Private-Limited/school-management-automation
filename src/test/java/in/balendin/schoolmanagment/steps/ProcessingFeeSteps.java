package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.ProcessingFeePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;

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
    @Step(" This step will verify Search Processing Fee by its serial number")
    public void verifySearchProcessingFeeBySrNumber() {
        feePage.navigateToProcessingFeeList();
        feePage.searchProcessingFeeBySrNumber();
    }
    @Step(" This step will verify Search Processing Fee by its School Name")
    public void verifySearchProcessingFeeBySchoolName() {
        feePage.navigateToProcessingFeeList();
        feePage.searchProcessingFeeBySchoolName();

    }
    @Step(" This step will verify Search Processing Fee by its Payment type")
    public void verifySearchProcessingFeeByPaymentType() {
        feePage.navigateToProcessingFeeList();
        feePage.searchProcessingFeeByPaymentType();
    }
    @Step(" This step will verify Search Processing Fee by its Processing Fee")
    public void verifySearchProcessingFeeByProcessingFee() {
        feePage.navigateToProcessingFeeList();
        feePage.searchProcessingFeeByProcessingFeeValue();
    }

    @Step(" This step will verify Sort Processing Fee by its Sr Number column")
    public void verifySortProcessingFeeBySrNumberColumn() {
        feePage.navigateToProcessingFeeList();
        feePage.sortProcessingFeeSrNumberColumn();
    }
    @Step(" This step will verify Sort Processing Fee by its School Name column")
    public void verifySortProcessingFeeSchoolNameColumn() {
        feePage.navigateToProcessingFeeList();
        feePage.sortProcessingFeeSchoolNameColumn();
    }
    @Step(" This step will verify Sort Processing Fee by its Payment Type column")
    public void verifySortProcessingFeePaymentTypeColumn() {
        feePage.navigateToProcessingFeeList();
        feePage.sortProcessingFeePaymentTypeColumn();
    }
    @Step(" This step will verify Sort Processing Fee by its Processing Fee column")
    public void verifySortProcessingFeeProcessingFeeColumn() {
        feePage.navigateToProcessingFeeList();
        feePage.sortProcessingFeeColumn();
    }
    @Step(" This step will verify  Processing Fee List Show entries functionality")
    public void verifyProcessingFeeListShowEntriesFunctionality() {
        feePage.navigateToProcessingFeeList();
        feePage.verifyShowEntries(5);
    }
    @Step(" This step will verify  Processing Fee List Pagination functionality")
    public void verifyProcessingFeeListPaginationFunctionality() {
        feePage.navigateToProcessingFeeList();
        feePage.verifyPagination();
    }
}
