package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.models.OrganizationData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static in.balendin.schoolmanagment.constants.Constants.ORG_LOGO;

public class AddOrganizationPage extends PageObject {


    @FindBy(xpath = "//a[@href='/School']")
    private WebElementFacade subTab_School;

    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[2]/a")
    private WebElementFacade tab_Admin;

    @FindBy(xpath = "//a[@href='/Organization']")
    private WebElementFacade subTab_Organization;

    @FindBy(xpath = "//a[normalize-space()='Add']")
    private WebElementFacade btn_AddOrganization;

    @FindBy(xpath = "//select[@name='OrganizationList_length']")
    private WebElementFacade showEntriesList;

    @FindBy(id = "OrganizationList_next")
    private WebElement btnNext;

    @FindBy(id = "OrganizationList_info")
    private WebElement showingEntries;

    @FindBy(xpath = "//td[@class=\"sorting_1\"]")
    private List<WebElement> orgNamesList;

    @FindBy(xpath = "//li[@class='nav-item dropdown']")
    private WebElementFacade menuSettings;

    @FindBy(xpath = "//a[normalize-space()='LogOut']")
    private WebElementFacade labelLogout;

    @FindBy(id = "swal2-content")
    private WebElement actualMsg;


    // Form Elements
    @FindBy(id = "Name")
    private WebElementFacade organization_Name;

    @FindBy(id = "Description")
    private WebElementFacade organization_Description;

    @FindBy(id = "File")
    private WebElementFacade organization_Logo;

    @FindBy(id = "Address_line1")
    private WebElementFacade Address_line1;

    @FindBy(id = "Address_line2")
    private WebElementFacade Address_line2;

    @FindBy(id = "Location")
    private WebElementFacade Location;

    @FindBy(id = "City")
    private WebElementFacade City;

    @FindBy(id = "PostalCode")
    private WebElementFacade postal_Code;

    @FindBy(id = "ContactName")
    private WebElementFacade contact_Name;

    @FindBy(id = "ContactNumber")
    private WebElementFacade contact_Number;

    @FindBy(xpath = "//*[@id=\"organizationForm\"]/div[2]/input")
    private WebElementFacade btn_Submit;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElementFacade btn_Submit_Update;

    @FindBy(xpath = "//td[@class=\"sorting_1\"]")
    private List<WebElement> serialList;

    // Popup elements
    @FindBy(xpath = "//button[normalize-space()='OK']")
    private WebElementFacade btn_OK;

    // Validation messages elements
    @FindBy(id = "Name-error")
    private WebElementFacade name_Validation;

    @FindBy(id = "Address_line1-error")
    private WebElementFacade address1_Validation;

    @FindBy(id = "Location-error")
    private WebElementFacade location_Validation;

    @FindBy(id = "City-error")
    private WebElementFacade city_Validation;

    @FindBy(id = "ContactName-error")
    private WebElementFacade contactName_Validation;

    @FindBy(id = "ContactNumber-error")
    private WebElementFacade contactNumber_Validation;

    @FindBy(id = "PostalCode-error")
    private WebElementFacade postalCode_Validation;

    // Sort and Search elements
    @FindBy(xpath = "//*[@id=\"OrganizationList_filter\"]/label/input")
    private WebElementFacade search_Field;

    @FindBy(xpath = "//tr/th[3]")
    private WebElementFacade organization_header;

    @FindBy(xpath = "//tr/th[1]")
    private WebElementFacade srNo_header;

    @FindBy(xpath = "//*[@id=\"OrganizationList_length\"]/label/select")
    private WebElementFacade showEntries;

    @FindBy(xpath = "//*[@id=\"OrganizationList_paginate\"]/ul/li[3]/a")
    private WebElementFacade Pagination_2;

    @FindBy(xpath = "//*[@id=\"OrganizationList\"]/thead/tr/th[3]")
    private WebElementFacade OrgNameHeader;
    @FindBy(xpath = "//th[@aria-label='Sr. No.: activate to sort column descending']")
    private WebElementFacade SrNOHeader;

    @FindBy(xpath = "//tr[1]/td[2]")
    private WebElementFacade OrgName;

    @FindBy(xpath = "//div[@id='modal-10118']//h5[@class='card-title']")
    private WebElementFacade addressCardTitle;

    @FindBy(xpath = "//button[@type='button' and @class='swal2-confirm swal2-styled']")
    private WebElementFacade btn_YesDelete_Me;

    @FindBy(xpath = "//label[@for='IsForSchool']")
    private WebElementFacade isSchoolCheckBox;

    @FindBy(id = "File")
    private WebElementFacade school_Logo;

    @FindBy(xpath = "//*[@id=\"modal-10117\"]/div/div/div[1]/button")
    private WebElementFacade closeAddressPopup_1;

    @FindBy(xpath = "//*[@id=\"modal-10118\"]/div/div/div[3]/button")
    private WebElementFacade closeAddressPopup_2;

    @FindBy(xpath = "//th[contains(text(),'Sr. No.')]")
    private WebElement serialColumn ;

    @FindBy(css = "button[class='swal2-confirm swal2-styled']")
    private WebElementFacade btnConfirmDelete;

    @FindBy(id = "goBackHref")
    private WebElement goBackBtn;

    @FindBy(xpath = "//table[@id='OrganizationList']/tbody/tr/td[6]/button[@class='btn btn-danger btn-sm btnDelete ']")
    private WebElement btnDelete;

    @FindBy(xpath = "//table[@id='OrganizationList']/tbody/tr/td[2]")
    private List<WebElementFacade>organizationList;

    @FindBy(name = "OrganizationList_length")
    private WebElement showEntriesDropdown;

    private OrganizationData data;
    private WebDriverWait wait;

    public void navigateToAddOrganizationForm() {
        clickOn(tab_Admin);
        clickOn(subTab_Organization);
        clickOn(btn_AddOrganization);
    }

    public void navigateToOrgList() {
        tab_Admin.click();
        subTab_Organization.click();
        String Title = getTitle();
        System.out.println(" Text : " + Title);
        Assert.assertTrue(Title.contains("Organization List"));
    }


    public void createOrganization(Boolean IsSchool) {
        if (IsSchool) {
            data = new OrganizationData().generateOrgDetails();
            organizationPage(true, data.getOrg_Title(), data.getOrg_Description(), data.getOrg_Logo(), data.getOrg_Address1(), data.getOrg_Address2(),
                    data.getOrg_Location(), data.getOrg_City(), data.getOrg_PostalCode(), data.getOrg_ContactName(), data.getOrg_ContactNumber());
            waitForElement(btn_Submit);
            clickOn(btn_Submit);
            clickOn(btn_OK);
        } else {
            data = new OrganizationData().generateOrgDetails();
            organizationPage(data.getOrg_Title(), data.getOrg_Description(), data.getOrg_Logo(), data.getOrg_Address1(), data.getOrg_Address2(),
                    data.getOrg_Location(), data.getOrg_City(), data.getOrg_PostalCode(), data.getOrg_ContactName(), data.getOrg_ContactNumber());
            waitForElement(btn_Submit);
            clickOn(btn_Submit);
            clickOn(btn_OK);
        }



    }
    public void organizationPage(Boolean schoolTrue, String Org_Name, String org_Description, String logo, String address1, String address2,
                                 String location, String city, int postalCode, String contactName, String contactNumber) {
        typeInto(organization_Name, Org_Name);
        typeInto(organization_Description, org_Description);
        if (schoolTrue) {
            isSchoolCheckBox.click();
        }
        school_Logo.sendKeys(ORG_LOGO);
        typeInto(Address_line1, address1);
        //  typeInto(Address_line2, address2);
        typeInto(Location, location);
        typeInto(City, city);
        typeInto(postal_Code, String.valueOf(postalCode));
        typeInto(contact_Name, contactName);
        typeInto(contact_Number, contactNumber);
    }

    public void verifyOrganizationAndSchoolCreated() {

        getDriver().findElement(By.xpath("//tr[1]/td[2]")).getText().equals(data.getOrg_Title());
        navigateSchoolList();
    }

    public void navigateSchoolList() {
        subTab_School.click();
        getDriver().findElement(By.xpath("//tr[1]/td[3]")).getText().equals(data.getOrg_Title());
    }
    public void verifyOrganizationCreated() {
        waitForElement(btn_OK);
        btn_OK.click();
    }

    public void createOrganizationNonMandatoryFields() {
        btn_Submit.sendKeys(Keys.ENTER);
        Assert.assertTrue(name_Validation.isDisplayed());
        Assert.assertTrue(address1_Validation.isDisplayed());
        Assert.assertTrue(location_Validation.isDisplayed());
        Assert.assertTrue(city_Validation.isDisplayed());
        Assert.assertTrue(contactName_Validation.isDisplayed());
        Assert.assertTrue(contactNumber_Validation.isDisplayed());

    }

    public void verifyPostalCode_PhoneNumberFields() {

        postal_Code.typeAndTab(".><dsg?./");
        String actualMsgOnlyDigits = postalCode_Validation.getText();
        String expectedMsgOnlyDigits = "Please enter only digits.";
        Assert.assertEquals(actualMsgOnlyDigits, expectedMsgOnlyDigits);

        contact_Number.typeAndTab("12345");
        String actualLengthMsg = contactNumber_Validation.getText();
        String expectedLengthMsg = "Minimum 10 digits required!";
        Assert.assertEquals(actualLengthMsg, expectedLengthMsg);

        postal_Code.typeAndTab("1234");
        String actualMsgMaxLength = postalCode_Validation.getText();
        String expectedMsgMaxLength = "Minimum 6 digits required!";
        Assert.assertEquals(actualMsgMaxLength, expectedMsgMaxLength);

        contact_Number.typeAndTab("alphabets");
        String actualErrorMsg = contactNumber_Validation.getText();
        String expectErrorMsg = "Please enter only digits.";
        Assert.assertEquals(actualErrorMsg, expectErrorMsg);

    }

    public void editCreatedOrg() {
        WebElement createdOrg = getDriver().findElement(By.xpath("//td[text()='" + OrgName.getText() + "']/parent::*/child::td[6]/span"));
        createdOrg.click();
        data = new OrganizationData().generateOrgDetails();
        organizationPage(data.getOrg_Title(), data.getOrg_Description(), "", data.getOrg_Address1(), data.getOrg_Address2(),
                data.getOrg_Location(), data.getOrg_City(), data.getOrg_PostalCode(), data.getOrg_ContactName(), data.getOrg_ContactNumber());
        waitForElement(btn_Submit_Update);
        clickOn(btn_Submit_Update);
    }

    public void waitForElement(WebElement element) {
        wait = new WebDriverWait(this.getDriver(), 100);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void verifyOrganizationUpdated() {
        waitForElement(btn_OK);
        btn_OK.click();
        WebElement createdOrg = getDriver().findElement(By.xpath("//td[text()='" + data.getOrg_Title() + "']"));
        waitForElement(createdOrg);
        Assert.assertTrue(createdOrg.isDisplayed());

    }

    public void organizationPage(String Org_Name, String org_Description, String logo, String address1, String address2,
                                 String location, String city, int postalCode, String contactName, String contactNumber) {
        typeInto(organization_Name, Org_Name);
        typeInto(organization_Description, org_Description);
        //   organization_Logo.sendKeys(ORG_LOGO);
        typeInto(Address_line1, address1);
        //  typeInto(Address_line2, address2);
        typeInto(Location, location);
        typeInto(City, city);
        typeInto(postal_Code, String.valueOf(postalCode));
        typeInto(contact_Name, contactName);
        typeInto(contact_Number, contactNumber);
    }

    public void verifySortOrganizationNameAscending() {
        GeneralClass generalClass = new GeneralClass();
        String orgListXpath = "//tr/td[3]";
        generalClass.sortNameAscending(OrgNameHeader, orgListXpath);
    }

    public void verifySortOrganizationNameDescending() {
        GeneralClass generalClass = new GeneralClass();
        String orgListXpath = "//tr/td[3]";
        generalClass.sortNameDescending(OrgNameHeader, orgListXpath);

    }

    public void verifyOrganizationAddressPageAndClosePage() {
        // Open Address Popup
        WebElement viewAddress = getDriver().findElement(By.xpath("//td[text()='" + OrgName.getText() + "']/parent::*/child::td[6]/a"));
        waitForElement(viewAddress);
        clickOn(viewAddress);
        String Name = addressCardTitle.getText();

        // Close Address popup
        waitForElement(closeAddressPopup_2);
        clickOn(closeAddressPopup_2);
/*        getDriver().navigate().refresh();
        //    waitForElement(viewAddress);
        clickOn(viewAddress);
        waitForElement(closeAddressPopup_1);
        clickOn(closeAddressPopup_1);*/

        Assert.assertEquals("Organization Address Information", addressCardTitle.getText());
    }

    public void verifyShowEntries(int value) {
        navigateToOrgList();
        waitFor(5000);
        if (!(value < 10)) {
            System.out.println("Value Called =" + value);
            String valueInString = String.valueOf(value);
            showEntriesList.selectByVisibleText(valueInString);
            String selectedValue = showEntriesList.getSelectedValue();
            GeneralClass generalClass = new GeneralClass();
            String numRows = "//table[@id='OrganizationList']/tbody/tr";
            generalClass.selectEntry(selectedValue, numRows);
        } else {
            waitFor(5000);
            GeneralClass generalClass = new GeneralClass();
            String OrgListXpath = "//table[@id='OrganizationList']/tbody/tr/td[1]";
            generalClass.seeList(showEntriesList, OrgListXpath);
        }
    }

    public void verifyPagination() {
        GeneralClass generalClass = new GeneralClass();
        generalClass.doPagination(orgNamesList, btnNext, showingEntries);
    }

    public void logoutAdmin() {
        clickOn(menuSettings);
        clickOn(labelLogout);
    }

    public void VerifyContactNameAndNumberFields() {
        contact_Name.isDisplayed();
        contact_Number.isDisplayed();
        waitForElement(btn_Submit);
        clickOn(btn_Submit);
        Assert.assertTrue(contactName_Validation.isDisplayed());
        Assert.assertTrue(contactNumber_Validation.isDisplayed());

    }

    public void searchOrganization(){
        typeInto(search_Field, data.getOrg_Title());
        System.out.println("DeleteOrgName" +data.getOrg_Title());
        List<WebElement> filterOrganizationList = organizationList.stream().filter(orgName -> orgName.getText().contains(data.getOrg_Title())).collect(Collectors.toList());
        System.out.println("OrgListSize " + organizationList.size());
        System.out.println("FilterOrgList " + filterOrganizationList.size());
        Assert.assertEquals(organizationList.size(),filterOrganizationList.size());
    }
    public void deleteOrganization(){
        btnDelete.click();
        btn_YesDelete_Me.click();
        String expMsg = "The organization has been deleted successfully.!";
        waitFor(actualMsg);
        Assert.assertEquals(expMsg,actualMsg.getText());
        System.out.println(" Delete Actual msg ==" + actualMsg.getText());
        clickOn(btn_OK);
    }
    public void redirectToOrganizationList(){
        navigateToAddOrganizationForm();
        clickOn(goBackBtn);
    }

    public void doSerialNumberDescending(){
        getDriver().navigate().refresh();
        serialColumn.click();
        List<String> stringDescendingList = serialList.stream().map(WebElement::getText).collect(Collectors.toList());
        List<Integer> integerDescendingList = stringDescendingList.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(" integerDescendingList " + integerDescendingList);

        List<Integer> sortedSerialList = integerDescendingList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println( " reverseOrder " + sortedSerialList);
        Assert.assertTrue(integerDescendingList.equals(sortedSerialList));
    }

    public void doSerialNumberSortingAscending(){

        navigateToOrgList();
        Actions act = new Actions(getDriver());
        List<String> actualSerialNumberList = serialList.stream().map(WebElement::getText).collect(Collectors.toList());
        List<Integer> integersActualSerialNumberList = actualSerialNumberList.stream().map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(integersActualSerialNumberList);
        System.out.println("integersActualSerialNumberList:" + integersActualSerialNumberList);
        act.doubleClick(serialColumn);
        List<String> afterSortSerialNumber = serialList.stream().map(WebElement::getText).collect(Collectors.toList());
        List<Integer> integersAfterSortSerialNumber = afterSortSerialNumber.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(" afterSortSerialNumber " + integersAfterSortSerialNumber);
        Assert.assertTrue(integersAfterSortSerialNumber.equals(integersActualSerialNumberList));
    }

    public void seeSelectedEntriesCount() {
        navigateToOrgList();
        clickOn(showEntriesDropdown);
        List<WebElement> showEntriesDropdownOptions = getDriver().findElements(By.xpath("//select/option")).stream().collect(Collectors.toList());
        String entryCountOptions;
        for (WebElement element : showEntriesDropdownOptions) {
            entryCountOptions = element.getText();
            element.click();
            List<WebElement> serialNumberListSize = getDriver().findElements(net.serenitybdd.core.annotations.findby.By.xpath("//table[@id='OrganizationList']/tbody/tr/td[1]"));
            int entryCountOptionsSize = Integer.parseInt(entryCountOptions);
            Assert.assertTrue(serialNumberListSize.size() <= entryCountOptionsSize);
            System.out.println("  OrgListValue : "   + serialNumberListSize.size());
            System.out.println("  Serial Number count     : "   + entryCountOptionsSize);
            clickOn(showEntriesDropdown);
        }
    }

}
