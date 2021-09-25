package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.utility.GenerateData;
import in.balendin.schoolmanagment.model.OrganizationData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class OrganizationPage extends PageObject {

    @FindBy(xpath = "//body/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]")
    private WebElement adminTab;

    @FindBy(xpath = "//body/div[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[2]")
    private WebElement organizationTab;

    @FindBy(xpath = "//body/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]")
    private WebElement addBtn;

    @FindBy(id = "goBackHref")
    private WebElement goBackBtn;

    @FindBy(xpath = "//tr//th[1]")
    private WebElement serialColumn ;

    @FindBy(xpath = "//table[@id='OrganizationList']/tbody/tr/td[1]")
    private List<WebElement> serialList;


    @FindBy(xpath = "//label//input")
    private WebElement txtSearchBox;

    @FindBy(xpath = "//table[@id='OrganizationList']/tbody/tr/td[3]")
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

    @FindBy(xpath = "//body/div[1]/div[1]/section[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    private WebElementFacade btnSubmit;

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement btnOk;

    @FindBy(name = "OrganizationList_length")
    private WebElement showEntriesDropdown;

    @FindBy(xpath = "//*[@id=\"OrganizationList_length\"]/label/select/option[1]")
    private WebElementFacade showEntries10;


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


    public void navigateToOrganizationForm(){
        clickOn(adminTab);
        clickOn(organizationTab);
        clickOn(addBtn);
    }
    OrganizationData organizationData;
    GenerateData generateData = new GenerateData();
    public void createOrganization(){
        organizationData = new OrganizationData().getData();
        typeInto(txtOrganizationName,organizationData.getOrganizationName() + "auto_" + generateData.getRandomString() );
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
        String expMsg = "The organization has been deleted successfully.";
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

    public void doSerialNumberSorting(){
        navigateToOrganizationList();
        List<String> originalSerialList = serialList.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println(originalSerialList);
        Actions actions = new Actions(getDriver());
       actions.doubleClick(serialColumn).perform();
        waitFor(5);
        List<String> sortedSerialList = serialList.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println(sortedSerialList);
        Assert.assertTrue(originalSerialList.equals(sortedSerialList));
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
}
