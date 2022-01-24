package in.balendin.schoolmanagment.pages;

import com.google.common.collect.Ordering;
import in.balendin.schoolmanagment.utility.GenerateData;
import in.balendin.schoolmanagment.model.OrganizationData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.apache.bcel.generic.Select;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import java.util.*;
import java.util.stream.Collectors;

import static in.balendin.schoolmanagment.constants.Constants.SchoolLogo;
import static in.balendin.schoolmanagment.constants.Constants.SchoolLogo1;

public class OrganizationPage extends PageObject {

    @FindBy(xpath = "//body/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
    private WebElement adminTab;

    @FindBy(xpath = "//p[contains(text(),'Organization')]")
    private WebElement organizationTab;

    @FindBy(xpath = "//body/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement addBtn;

    @FindBy(id = "goBackHref")
    private WebElement goBackBtn;

    @FindBy(xpath = "//th[contains(text(),'Sr. No.')]")
    private WebElement serialColumn ;

    @FindBy(xpath = "//td[@class=\"sorting_1\"]")
    private List<WebElement> serialList;


    @FindBy(xpath = "//label//input")
    private WebElement txtSearchBox;

    @FindBy(xpath = "//table[@id='OrganizationList']/tbody/tr/td[2]")
    private List<WebElementFacade>organizationList;

    @FindBy(id = "Name")
    private WebElement txtOrganizationName;

    @FindBy(id = "Address_line1")
    private WebElement txtAddressLine1;

    @FindBy(id = "Location")
    private WebElement txtLocation;

    @FindBy(id = "City")
    private WebElement txtCity;

    @FindBy(id = "ContactName")
    private WebElement txtContactName;

    @FindBy(id = "ContactNumber")
    private WebElement txtContactNumber;

    @FindBy( id = "orgCreate")
    private WebElementFacade btnSubmit;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement btnOk;

    @FindBy(name = "OrganizationList_length")
    private WebElement showEntriesDropdown;

    @FindBy(xpath = "//*[@id=\"OrganizationList_length\"]/label/select/option")
    WebElement entriesOption;

    @FindBy(xpath = "//*[@id=\"OrganizationList_length\"]/label/select/option[1]")
    private WebElementFacade showEntries10;

    @FindBy(xpath = "//label[@for='IsForSchool']")
    private WebElement schoolCheckBox;

    @FindBy(xpath = "//*[@id=\"OrganizationList_length\"]/label/select/option[2]")
    private WebElementFacade showEntries25;

    @FindBy(xpath = "//*[@id=\"OrganizationList_length\"]/label/select/option[3]")
    private WebElementFacade showEntries50;


    @FindBy(xpath = "//*[@id=\"OrganizationList_length\"]/label/select/option[4]")
    private WebElementFacade showEntries100;

    @FindBy(className = "btnDelete")
    private WebElement btnDelete;

    @FindBy(xpath = "//button[contains(text(),'Yes, delete it!')]")
    private WebElement btnYesDeleteIt;

    //Confirmation popup
    @FindBy(xpath = "//div[@id='swal2-content']")
    private WebElement actualMsg;

    @FindBy(xpath = "//input[@id='File']")
    private WebElement schoolLogo;


    public void navigateToOrganizationForm(){
        clickOn(adminTab);
        clickOn(organizationTab);
        clickOn(addBtn);
    }
    OrganizationData organizationData;
    GenerateData generateData = new GenerateData();
    public void createOrganization(){
        organizationData = new OrganizationData().getData();
        typeInto(txtOrganizationName,organizationData.getOrganizationName() + "auto" + generateData.getRandomString() );
        typeInto(txtAddressLine1, organizationData.getAddress());
        typeInto(txtLocation, organizationData.getLocation());
        typeInto(txtCity,organizationData.getCity());
        typeInto(txtContactName,organizationData.getContactName());
        typeInto(txtContactNumber,organizationData.getContactNumber());
        btnSubmit.sendKeys(Keys.ENTER);
        String expectedMsg = "The organization was saved successfully!";
        waitFor(actualMsg);
        actualMsg.getText();
        System.out.println("CreateOrgName" +organizationData.getOrganizationName());
        Assert.assertEquals(expectedMsg,actualMsg.getText());
        System.out.println("Actual msg == " + actualMsg.getText());
        clickOn(btnOk);
    }
    public void searchOrganization(){
        typeInto(txtSearchBox, organizationData.getOrganizationName());
        System.out.println("DeleteOrgName" +organizationData.getOrganizationName());
        List<WebElement> filterOrganizationList = organizationList.stream().filter(orgName -> orgName.getText().contains(organizationData.getOrganizationName())).collect(Collectors.toList());
        System.out.println("OrgListSize " + organizationList.size());
        System.out.println("FilterOrgList " + filterOrganizationList.size());
        Assert.assertEquals(organizationList.size(),filterOrganizationList.size());
    }
    public void deleteOrganization(){
        btnDelete.click();
        btnYesDeleteIt.click();
        String expMsg = "The organization has been deleted successfully.!";
        waitFor(actualMsg);
        Assert.assertEquals(expMsg,actualMsg.getText());
        System.out.println(" Delete Actual msg ==" + actualMsg.getText());
        clickOn(btnOk);
    }

    public void navigateToOrganizationList(){
        clickOn(adminTab);
        clickOn(organizationTab);
    }
    public void redirectToOrganizationList(){
        navigateToOrganizationForm();
        clickOn(goBackBtn);
    }

    public void doSerialNumberDescending(){
        getDriver().navigate().refresh();
        serialColumn.click();
        List<String> stringDescendingList = serialList.stream().map(WebElement::getText).collect(Collectors.toList());
        List<Integer> integerDescendingList = stringDescendingList.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(" integerDescendingList " + integerDescendingList);
//        waitFor(10);
        List<Integer> sortedSerialList = integerDescendingList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println( " reverseOrder " + sortedSerialList);
        Assert.assertTrue(integerDescendingList.equals(sortedSerialList));
    }

    public void doSerialNumberSortingAscending(){

        navigateToOrganizationList();
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
    navigateToOrganizationList();
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

    public void createOrganizationWithSchool(){
        organizationData = new OrganizationData().getData();
        typeInto(txtOrganizationName,organizationData.getOrganizationName() + "auto" + generateData.getRandomString());
        waitFor(schoolCheckBox).click();
        System.out.println(" logo :" + SchoolLogo);
        System.out.println(" logo1 :" + SchoolLogo1);
        schoolLogo.sendKeys(SchoolLogo);
        typeInto(txtAddressLine1, organizationData.getAddress());
        typeInto(txtLocation, organizationData.getLocation());
        typeInto(txtCity,organizationData.getCity());
        typeInto(txtContactName,organizationData.getContactName());
        typeInto(txtContactNumber,organizationData.getContactNumber());
        btnSubmit.sendKeys(Keys.ENTER);
        String expectedMsg = "The organization was saved successfully!";
        actualMsg.getText();
        System.out.println("CreateOrgName" +organizationData.getOrganizationName());
        Assert.assertEquals(expectedMsg,actualMsg.getText());
        System.out.println("Actual msg == " + actualMsg.getText());
        clickOn(btnOk);
    }

}
