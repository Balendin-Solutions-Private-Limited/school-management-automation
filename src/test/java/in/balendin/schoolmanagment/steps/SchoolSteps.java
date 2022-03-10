package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.SchoolPage;
import net.thucydides.core.annotations.Step;

public class SchoolSteps {

    SchoolPage schoolPage;
    boolean createNewSchool;
    boolean checkPartPay, checkBoxAccept, headPartPay, examFeeMand, supplyMand, prevSemMand, maintainStuData, allowPayDir;

    @Step("Verify admin are able to create School")
    public void verifyAdminIsAbleToCreateSchool() {
        schoolPage.createSchoolAndEditSchool(createNewSchool = true);
        schoolPage.manageSchoolProperties(checkPartPay=true, checkBoxAccept=true, headPartPay=true, examFeeMand=true,
                                         supplyMand=true, prevSemMand=true, maintainStuData=true, allowPayDir=true);
    }

    @Step("Verify admin are able to Update School")
    public void verifyAdminIsAbleToUpdateSchool() {
        schoolPage.createSchoolAndEditSchool(createNewSchool = false);
        schoolPage.manageSchoolProperties(checkPartPay=true, checkBoxAccept=true, headPartPay=true, examFeeMand=true,
                supplyMand=true, prevSemMand=true, maintainStuData=true, allowPayDir=true);
    }

    @Step("Verify admin are able to Delete School")
    public void verifyAdminIsAbleToDeleteSchool() {
        schoolPage.createSchoolAndDeleteSchool();
    }

    @Step("Verify admin is able to search School by School Name")
    public void verifySearchSchoolBySchoolName() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.searchSchoolByName();
    }

    @Step("Verify admin is able to search School by Sr Number")
    public void verifySearchSchoolBySrNumber() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.searchSchoolBySrNumber();
    }

    @Step("Verify admin is able to search School by Contact Person Name")
    public void verifySearchSchoolByContactPersonName() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.searchSchoolByContactPersonName();
    }

    @Step("Verify admin is able to search School by Contact Person Number")
    public void verifySearchSchoolByContactPersonNumber() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.searchSchoolByContactPersonNumber();
    }

    @Step("Verify admin is able to search School by City")
    public void verifySearchSchoolBySchoolCity() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.searchSchoolBySchoolCity();
    }

    @Step("Verify admin School list Show Entries ")
    public void verifySchoolListShowEntryFunctionality() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.verifyShowEntries(1);
    }

    @Step("Verify admin School list pagination ")
    public void verifySchoolListPagePagination() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.verifyPagination();
    }

    @Step("Verify admin School Name column Ascending and Descending")
    public void verifySchoolListNameColumnAscendingDescending() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.sortSchoolNameColumn();
    }

    @Step("Verify admin School Contact Person name column Ascending and Descending")
    public void verifySchoolListContactNameColumnAscendingDescending() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.sortSchoolContactPersonNameColumn();
    }

    @Step("Verify admin School Contact Person number name column Ascending and Descending")
    public void verifySchoolListContactNumberColumnAscendingDescending() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.sortSchoolContactPersonNumberColumn();
    }

    @Step("Verify admin School City name column Ascending and Descending")
    public void verifySchoolCityNameColumnAscendingDescending() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.sortSchoolCityNameColumn();
    }

    @Step("Verify admin School Sr Number column Ascending and Descending")
    public void SortSerialNumberSchoolList() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.sortSchoolSrNumberColumn();
    }

    @Step("Verify admin School Address Popup")
    public void verifySchoolAddressPopupFunctionality() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.schoolAddressPopupOpenClose();
    }

    @Step("Verify admin Add School Page Mandatory fields validation messages")
    public void verifyAddSchoolPageValidation() {
        schoolPage.navigateToCreateEditSchoolPage();
        schoolPage.verifyAddSchoolPageMandatoryFieldsValidations();
    }

    @Step("Verify admin Add School Page Fields")
    public void verifyAddSchoolPageFields() {
        schoolPage.navigateToCreateEditSchoolPage();
        schoolPage.verifySchoolPageFields();
    }

    @Step("Verify admin Add School select Organization Field options")
    public void verifyAddSchoolSelectOrganizationFieldOptions() {
        schoolPage.verifyOrganizationListForSelectOrganizationField();
    }

    public void verifySearchSchoolByAllColumnData() {
        schoolPage.navigateToSchoolListPage();
        schoolPage.searchSchoolByAllData();
    }
}
