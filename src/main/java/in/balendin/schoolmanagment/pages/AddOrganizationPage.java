package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.models.OrganizationData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class AddOrganizationPage extends PageObject {

    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[2]/a    ")
    private WebElementFacade tab_Admin;

    @FindBy(xpath = "//a[@href='/Organization']")
    private WebElementFacade subTab_Organization;

    @FindBy(xpath = "//a[normalize-space()='Add']")
    private WebElementFacade btn_AddOrganization;

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

    private OrganizationData data;


    public void navigateToAddOrganizationForm() {
       tab_Admin.sendKeys(Keys.ENTER);
        clickOn(subTab_Organization);
        clickOn(btn_AddOrganization);
    }

    public void navigateToOrgList() {
        tab_Admin.click();
        subTab_Organization.click();
    }

    public void organizationPage(String Org_Name, String org_Description, String logo, String address1, String address2,
                                 String location, String city, int postalCode, String contactName, String contactNumber) {
        typeInto(organization_Name, Org_Name);
        typeInto(organization_Description, org_Description);
       organization_Logo.sendKeys(logo);
        typeInto(Address_line1, address1);
        typeInto(Address_line2, address2);
        typeInto(Location, location);
        typeInto(City, city);
        typeInto(postal_Code, String.valueOf(postalCode));
        typeInto(contact_Name, contactName);
        typeInto(contact_Number, contactNumber);
        btn_Submit.sendKeys(Keys.ENTER);

    }

    public void createOrganization() {
        data = new OrganizationData().generateOrgDetails();
        organizationPage(data.getOrg_Title(), data.getOrg_Description(), data.getOrg_Logo(), data.getOrg_Address1(), data.getOrg_Address2(),
                data.getOrg_Location(), data.getOrg_City(), data.getOrg_PostalCode(), data.getOrg_ContactName(), data.getOrg_ContactNumber());
    }

    public void verifyOrganizationCreated() {
        btn_OK.waitUntilClickable();
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
        String expectedLengthMsg = "At least 10 characters required!";
        Assert.assertEquals(actualLengthMsg, expectedLengthMsg);

        postal_Code.typeAndTab("1234");
        String actualMsgMaxLength = postalCode_Validation.getText();
        String expectedMsgMaxLength = "Only 6 digits required!";
        Assert.assertEquals(actualMsgMaxLength, expectedMsgMaxLength);

        contact_Number.typeAndTab("alphabets");
        String actualErrorMsg = contactNumber_Validation.getText();
        String expectErrorMsg = "Please enter only digits.";
        Assert.assertEquals(actualErrorMsg, expectErrorMsg);


    }



}
