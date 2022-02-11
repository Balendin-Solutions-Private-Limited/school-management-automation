package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.models.SchoolData;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SchoolPage extends PageObject {


    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[2]/a")
    private WebElementFacade tab_Admin;

    @FindBy(xpath = "//a[@href='/School']")
    private WebElementFacade subTab_School;

    @FindBy(xpath = "//a[@href='/Organization']")
    private WebElementFacade subTab_Organization;

    @FindBy(xpath = "//table[@id='OrganizationList']//tbody//tr//td[2]")
    private  List<WebElementFacade> elementsAllOrgList;

    @FindBy(xpath = "//a[@type='button']")
    private WebElementFacade btn_Add;


    // Create/Edit School form Elements
    @FindBy(xpath = "//select[@id='OrganizationId']")
    private WebElementFacade select_Organization;

    @FindBy(xpath = "//select[@id='OrganizationId']//option")
    private List<WebElement> select_Organization_Options;


    @FindBy(xpath = "//input[@id='Name']")
    private WebElementFacade txt_SchName;

    @FindBy(xpath = "//input[@id='Code']")
    private WebElementFacade txt_SchCode;

    @FindBy(xpath = "//textarea[@id='Description']")
    private WebElementFacade txt_SchDescription;

    @FindBy(xpath = "//input[@id='File']")
    private WebElementFacade file_SchLogo;

    @FindBy(xpath = "//input[@id='Address_line1']")
    private WebElementFacade txtSch_AddOne;

    @FindBy(xpath = "//input[@id='Address_line2']")
    private WebElementFacade txtSch_AddTwo;

    @FindBy(xpath = "//input[@id='Location']")
    private WebElementFacade txtSch_Location;

    @FindBy(xpath = "//input[@id='City']")
    private WebElementFacade txtSch_City;

    @FindBy(xpath = "//input[@id='PostalCode']")
    private WebElementFacade txtSch_Postal;

    @FindBy(xpath = "//input[@id='ContactName']")
    private WebElementFacade txtSch_ContactName;

    @FindBy(xpath = "//input[@id='ContactNumber']")
    private WebElementFacade txtSch_ContactNumber;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElementFacade btnPopupOk;

    // checkboxes elements
    @FindBy(xpath = "//label[@for='IsPartPaymentAccepted']")
    private WebElementFacade checkPartPayment;

    @FindBy(xpath = "//label[@for='IsChequeBoxesAccepted']")
    private WebElementFacade checkCheckBoxAccept;

    @FindBy(xpath = "//label[@for='IsHeadwisePartPaymentAccepted']")
    private WebElementFacade checkHeadWisePatPayment;

    @FindBy(xpath = "//label[@for='ExamFeeMandatory']")
    private WebElementFacade checkExamFeeMandatory;

    @FindBy(xpath = "//label[@for='IsSupplimentaryFeeCheckBoxAccepted']")
    private WebElementFacade checkSupplyFeeMandatory;

    @FindBy(xpath = "//label[@for='PreviousYearMandatory']")
    private WebElementFacade checkPreviousSemMandatory;

    @FindBy(xpath = "//label[@for='MaintainStudentData']")
    private WebElementFacade checkMaintainStudentData;

    @FindBy(xpath = "//label[@for='AllowPayDirect']")
    private WebElementFacade checkAllowPAyDirect;

    @FindBy(xpath = "//input[@id='submitSchool']")
    private WebElementFacade btn_Submit;

    // School List Page elements
    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr/td[3]")
    private List<WebElement> schoolNameList;

    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr/td[1]")
    private List<WebElement> schoolSrNumberList;

    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr/td[4]")
    private List<WebElement> schoolContactPersonList;

    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr/td[5]")
    private List<WebElement> schoolContactPersonNumberList;

    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr/td[6]")
    private List<WebElement> schoolCityList;

    @FindBy(id = "SchoolList_next")
    private WebElement btnNext;

    @FindBy(id = "OrganizationList_next")
    private WebElementFacade btnNextOrg;

    @FindBy(xpath = "//input[@type='search']")
    private WebElementFacade txtSearchBox;

    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr[1]/td[3]")
    private WebElementFacade filteredSchoolName;

    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr[1]/td[1]")
    private WebElementFacade filteredSchoolSrNum;

    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr[1]/td[4]")
    private WebElementFacade filteredSchoolContactPersonName;

    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr[1]/td[5]")
    private WebElementFacade filteredSchoolContactPersonNameNumber;

    @FindBy(xpath = "//table[@id='SchoolList']/tbody/tr[1]/td[6]")
    private WebElementFacade filteredSchoolCity;

    @FindBy(xpath = "//select[@name='SchoolList_length']//option")
    private WebElementFacade showEntriesList;

    @FindBy(xpath = "//div[@id='SchoolList_info']")
    private WebElementFacade schoolListInfo;

    @FindBy(id = "SchoolList_previous")
    private WebElementFacade btnPrevious;

    @FindBy(xpath = "//table[@id='SchoolList']/thead/tr/th[3]")
    private WebElementFacade headerSchoolName;

    @FindBy(xpath = "//table[@id='SchoolList']/thead/tr/th[4]")
    private WebElementFacade headerSchoolContactName;

    @FindBy(xpath = "//table[@id='SchoolList']/thead/tr/th[5]")
    private WebElementFacade headerSchoolContactNumber;

    @FindBy(xpath = "//table[@id='SchoolList']/thead/tr/th[6]")
    private WebElementFacade headerSchoolCity;

    @FindBy(xpath = "//table[@id='SchoolList']/thead/tr/th[1]")
    private WebElementFacade headerSchoolSrNumber;

    @FindBy(xpath = "//table[@id='SchoolList']/thead/tr/th[1]")
    private WebElementFacade btnYesDeleteIt;

    //Address Popup elements
    @FindBy(xpath = "//h5[@class='card-title']")
    private WebElementFacade txtAddressCardTitle;

    @FindBy(xpath = "//div[@class='modal-footer justify-content-between']//button")
    private WebElementFacade btnCloseAddressCard;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]")
    private WebElementFacade info_Add_One;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]")
    private WebElementFacade info_Add_Two;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]")
    private WebElementFacade info_Add_Location;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]")
    private WebElementFacade info_Add_PostalCode;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[1]")
    private WebElementFacade info_Add_Description;

    @FindBy(xpath = "//a[@id='goBackHref']")
    private WebElementFacade lblGoBack;

    // Page validations and error messages elements
    @FindBy(xpath = "//div[@id='Organization-error']")
    private WebElementFacade requiredSelectOrgField;

    @FindBy(xpath = "//div[@id='Name-error']")
    private WebElementFacade requiredSchoolName;

    @FindBy(xpath = "//div[@id='File-error']")
    private WebElementFacade requiredSchoolLogo;

    @FindBy(xpath = "//div[@id='Address_line1-error']")
    private WebElementFacade requiredSchoolAddOne;

    @FindBy(xpath = "//div[@id='Location-error']")
    private WebElementFacade requiredSchoolLocation;

    @FindBy(xpath = "//div[@id='City-error']")
    private WebElementFacade requiredSchoolCity;

    @FindBy(xpath = "//div[@id='ContactName-error']")
    private WebElementFacade requiredContactName;

    @FindBy(xpath = "//div[@id='ContactNumber-error']")
    private WebElementFacade requiredContactNumber;

    @FindBy(xpath = "//div[@id='PostalCode-error']")
    private WebElementFacade error_PostalCode;


    SchoolData data;
    GeneralClass generalClass;

    public void navigateToSchoolListPage() {
        clickOn(tab_Admin);
        clickOn(subTab_School);
        String title = getTitle();
        Assert.assertEquals("School List", title);
    }

    public void navigateToCreateEditSchoolPage() {
        clickOn(tab_Admin);
        clickOn(subTab_School);
        clickOn(btn_Add);
        String title = getTitle();
        Assert.assertEquals("Create/Edit School", title);
    }

    public void createSchoolAndEditSchool(boolean createNewSchool) {

        if (createNewSchool) {
            navigateToCreateEditSchoolPage();
            select_Organization.selectByIndex(1);
        } else {
            navigateToSchoolListPage();
            WebElement btnEdit = getDriver().findElement(By.xpath(" //td[text()='" + filteredSchoolName.getText() + "']/parent::*/child::td[7]//a[@title='Edit']"));
            clickOn(btnEdit);
        }
        createSchool();
    }

    public void createSchool() {
        data = new SchoolData().generateSchoolData();
        typeInto(txt_SchName, data.getTxt_Sch_Name());
        typeInto(txt_SchCode, data.getTxtSch_Code());
        typeInto(txt_SchDescription, data.getTxtSch_Description());
        file_SchLogo.sendKeys(data.getTxtSch_Logo());
        typeInto(txtSch_AddOne, data.getTxtSch_AddOne());
        typeInto(txtSch_AddTwo, data.getTxtSch_City());
        typeInto(txtSch_Location, data.getTxtSch_Location());
        typeInto(txtSch_City, data.getTxtSch_City());
        typeInto(txtSch_Postal, String.valueOf(data.getTxtSch_Postal()));
        typeInto(txtSch_ContactName, data.getTxtSch_ContactName());
        typeInto(txtSch_ContactNumber, data.getTxtSch_ContactNumber());
        clickOn(btn_Submit);
        clickOn(btnPopupOk);
        //Verify School Created
        String schoolName = data.getTxt_Sch_Name();
        String createdSchool = filteredSchoolName.getText();
        Assert.assertEquals(schoolName, createdSchool);
    }

    public void createSchoolAndDeleteSchool() {
        navigateToCreateEditSchoolPage();
        select_Organization.selectByIndex(1);
        createSchool();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement btnDelete = getDriver().findElement(By.xpath("//td[text()='" + filteredSchoolName.getText() + "']/parent::*/child::td[7]//button"));
        clickOn(btnDelete);
        clickOn(btnPopupOk);
        clickOn(btnPopupOk);
    }

    public void searchSchoolByName() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(schoolNameList, btnNext, txtSearchBox, filteredSchoolName);
    }

    public void searchSchoolBySrNumber() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(schoolSrNumberList, btnNext, txtSearchBox, filteredSchoolSrNum);
    }

    public void searchSchoolByContactPersonName() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(schoolContactPersonList, btnNext, txtSearchBox, filteredSchoolContactPersonName);
    }

    public void searchSchoolByContactPersonNumber() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(schoolContactPersonNumberList, btnNext, txtSearchBox, filteredSchoolContactPersonNameNumber);
    }

    public void searchSchoolBySchoolCity() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(schoolCityList, btnNext, txtSearchBox, filteredSchoolCity);
    }

    public void verifyShowEntries(int value) {
        waitFor(5000);
        if (!(value < 10)) {
            System.out.println("show entry value called " + value);
            String valueInString = String.valueOf(value);
            showEntriesList.selectByVisibleText(valueInString);
            String selectedValue = showEntriesList.getSelectedValue();
            GeneralClass generalClass = new GeneralClass();
            String numRows = "//table[@id='SchoolList']/tbody/tr";
            generalClass.selectEntry(selectedValue, numRows);
        } else {
            System.out.println("show entry value not called " + value);
            waitFor(5000);
            GeneralClass generalClass = new GeneralClass();
            String numRowXpath = "//table[@id='SchoolList']/tbody/tr";
            String listOfShowEntries = "//select[@name='SchoolList_length']//option";
            generalClass.seeList(showEntriesList, listOfShowEntries, numRowXpath);
        }

    }

    public void verifyPagination() {
        generalClass.doPagination(schoolNameList, btnNext, schoolListInfo, btnPrevious);

    }

    public void sortSchoolNameColumn() {
        String xpath = "//table[@id='SchoolList']/tbody/tr/td[3]";
        generalClass.sortNameAscending(headerSchoolName, xpath);
        generalClass.sortNameDescending(headerSchoolName, xpath);
    }

    public void sortSchoolContactPersonNameColumn() {
        String xpath = "//table[@id='SchoolList']/tbody/tr/td[4]";
        generalClass.sortNameAscending(headerSchoolContactName, xpath);
        generalClass.sortNameDescending(headerSchoolContactName, xpath);
    }

    public void sortSchoolContactPersonNumberColumn() {
        String xpath = "//table[@id='SchoolList']/tbody/tr/td[5]";
        generalClass.sortNameAscending(headerSchoolContactNumber, xpath);
        generalClass.sortNameDescending(headerSchoolContactNumber, xpath);
    }

    public void sortSchoolCityNameColumn() {
        String xpath = "//table[@id='SchoolList']/tbody/tr/td[6]";
        generalClass.sortNameAscending(headerSchoolCity, xpath);
        generalClass.sortNameDescending(headerSchoolCity, xpath);
    }

    public void sortSchoolSrNumberColumn() {
        String xpath = "//table[@id='SchoolList']/tbody/tr/td[1]";
        generalClass.sortSrNoAscending(headerSchoolSrNumber, xpath);
        generalClass.sortSrNoDescending(headerSchoolSrNumber, xpath);
    }

    public void schoolAddressPopupOpenClose() {
        WebElement btnEdit = getDriver().findElement(By.xpath(" //td[text()='" + filteredSchoolName.getText() + "']/parent::*/child::td[7]//a[@title='Edit']"));
        clickOn(btnEdit);
        String schoolAddressOne = txtSch_AddOne.getAttribute("value");
        String schoolAddressTwo = txtSch_AddTwo.getAttribute("value");
        String schoolLocation = txtSch_Location.getAttribute("value");
        String schoolPostalCode = txtSch_Postal.getAttribute("value");
        String schoolDescription = txt_SchDescription.getAttribute("value");
        clickOn(lblGoBack);
        WebElement btnAddress = getDriver().findElement(By.xpath(" //td[text()='" + filteredSchoolName.getText() + "']/parent::*/child::td[7]//a[@title='Address']"));
        clickOn(btnAddress);
        //verify Address Popup info
        String cardTitle = txtAddressCardTitle.getText();
        String actualTitle = "School Address Information";
        Assert.assertEquals(cardTitle, actualTitle);
        Assert.assertEquals(schoolAddressOne, info_Add_One.getText());
        Assert.assertEquals(schoolAddressTwo, info_Add_Two.getText());
        Assert.assertEquals(schoolLocation, info_Add_Location.getText());
        Assert.assertEquals(schoolPostalCode, info_Add_PostalCode.getText());
        Assert.assertEquals(schoolDescription, info_Add_Description.getText());
        // Close popup
        clickOn(btnCloseAddressCard);

    }

    public void verifyAddSchoolPageMandatoryFieldsValidations() {
        clickOn(btn_Submit);
        Assert.assertEquals(requiredSelectOrgField.getText(), "The Organization Name field is required.");
        Assert.assertEquals(requiredSchoolName.getText(), "The School Name field is required.");
        Assert.assertEquals(requiredSchoolLogo.getText(), "Please Select School Logo.");
        Assert.assertEquals(requiredSchoolAddOne.getText(), "The Address Line One field is required.");
        Assert.assertEquals(requiredSchoolLocation.getText(), "The Location field is required.");
        Assert.assertEquals(requiredSchoolCity.getText(), "The City field is required.");
        Assert.assertEquals(requiredContactName.getText(), "The Contact Name field is required.");
        Assert.assertEquals(requiredContactNumber.getText(), "The Contact Number field is required.");
    }

    public void verifySchoolPageFields() {
        clickOn(btn_Submit);
        txtSch_Postal.sendKeys("1234567",Keys.ENTER);
        Assert.assertEquals(error_PostalCode.getText(), "Maximum 6 digits required!");
        typeInto(txtSch_Postal, "522330");
        error_PostalCode.shouldNotBeVisible();

        txtSch_ContactNumber.sendKeys("TxtNumber@1#",Keys.ENTER);
        Assert.assertEquals(requiredContactNumber.getText(), "Please enter only digits.");
        txtSch_ContactNumber.clear();
        txtSch_ContactNumber.sendKeys("12345678901",Keys.ENTER);
        Assert.assertEquals(requiredContactNumber.getText(), "Maximum 10 digits required!");
        typeInto(txtSch_ContactNumber, "1234567890");
        requiredContactNumber.shouldNotBeVisible();

        txtSch_City.sendKeys("Heloo@123",Keys.ENTER);
        Assert.assertEquals(requiredSchoolCity.getText(), "Allow only alphabets and spaces.");
        typeInto(txtSch_City, "Navi Mumbai");
        requiredSchoolCity.shouldNotBeVisible();

        txtSch_ContactName.sendKeys("Heloo@123",Keys.ENTER);
        Assert.assertEquals(requiredContactName.getText(), "Allow only alphabets and spaces.");
        typeInto(txtSch_ContactName, "YENDLURI");
        requiredContactName.shouldNotBeVisible();

        txt_SchName.sendKeys("Heloo@123",Keys.ENTER);
        Assert.assertEquals(requiredSchoolName.getText(), "Allow only alphabets and spaces.");
        typeInto(txt_SchName, "RJ RJ");
        requiredSchoolName.shouldNotBeVisible();
    }

    public void verifyOrganizationListForSelectOrganizationField() {
        clickOn(tab_Admin);
        subTab_Organization.click();
        List<String> allOrgList = new ArrayList<>();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (WebElement element : elementsAllOrgList) {
            allOrgList.add(element.getText());
        }

        String nxtBtnClassName = btnNextOrg.getAttribute("class");
        while (!nxtBtnClassName.contains("disabled")) {
            btnNextOrg.click();
            for (WebElement element : elementsAllOrgList) {
                allOrgList.add(element.getText());
            }
            nxtBtnClassName = btnNextOrg.getAttribute("class");
        }

        clickOn(subTab_School);
        clickOn(btn_Add);

        List<String> ddlOrgList = select_Organization_Options.stream().map(WebElement::getText).collect(Collectors.toList());
        ddlOrgList.remove(0);
        Assert.assertTrue(allOrgList.size() == ddlOrgList.size() && allOrgList.containsAll(ddlOrgList) && ddlOrgList.containsAll(allOrgList));
    }
}
