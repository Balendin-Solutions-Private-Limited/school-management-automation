package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.models.RoleData;
import in.balendin.schoolmanagment.util.DataGenerator;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.List;

public class RolePage extends PageObject {

    GeneralClass generalClass;

    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[2]/a")
    private WebElementFacade tab_Admin;

    @FindBy(xpath = "//a[@href='/RoleAccess']")
    private WebElementFacade tab_RolesAndPermission;

    @FindBy(xpath = "//a[@href='/RoleAccess/Edit']/i")
    private WebElementFacade addBtn;

    @FindBy(xpath = "//input[@id='ProfileType' and @name='ProfileType' and @value='Generic']")
    private WebElement radioButtonGeneric;

    @FindBy(xpath = "//input[@id='Name' and @name='Name']")
    private WebElementFacade txtRoleName;

    @FindBy(id = "submitBtn")
    private WebElementFacade btnSubmit;

    @FindBy(id = "swal2-content")
    private WebElementFacade successPopup;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled' ]")
    private WebElementFacade btnOK;

    @FindBy(xpath = "//div[@class='dataTables_filter' ]/label/input")
    private WebElementFacade txtSearchBox;

    @FindBy(xpath = "//a[@href='/Course' ]")
    private WebElementFacade tab_Course;

    @FindBy(xpath = "//select[@name='DataTables_Table_0_length']/option")
    private WebElementFacade selectEntries;

    @FindBy(xpath = "//a[@Title='Edit' ]/i[@class='fas fa-pencil-alt']")
    private WebElementFacade editBtn;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr/td[@class='sorting_1']")
    private WebElement tabBtn;

    @FindBy(xpath = "//span[@class='dtr-data']//a[@title='Edit']")
    private WebElement editRoleBtn;

    @FindBy(xpath = "//span[@class='dtr-data']//i[@class='fas fa-trash']")
    private WebElement deleteRoleBtn;

    @FindBy(xpath = "//button[normalize-space()='Yes, delete it!']")
    private WebElement yesDeleteItBtn;

    @FindBy(xpath = "//th[@aria-label='Sr. No.: activate to sort column descending']")
    private WebElement headerSerialNumber;

    @FindBy(xpath = "//th[@aria-label='Role Name: activate to sort column ascending']")
    private WebElement headerRoleName;

    @FindBy(xpath = "//th[@aria-label='Role Type: activate to sort column ascending']")
    private WebElement headerRoleType;

    @FindBy(xpath = "//th[@aria-label='School/Organization: activate to sort column ascending']")
    private WebElement headerSchoolOrOrganization;

    @FindBy(xpath = "//th[@aria-label='Assigned To: activate to sort column ascending']")
    private WebElement headerAssignTo;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr/td[1]")
    private List <WebElement> serialNumberList;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr/td[2]")
    private List <WebElement> RoleNameList;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr/td[3]")
    private List <WebElement>RoleTypeList;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr/td[4]")
    private List <WebElement> schoolOrOrganizationList;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr/td[5]")
    private List <WebElement> assignToList;

    @FindBy(id = "RoleAccessList_next")
    private WebElement nxtPageBtn;

    @FindBy(id = "RoleAccessList_previous")
    private WebElement previousPageBtn;

    @FindBy(xpath = "//select[@name='RoleAccessList_length']//option")
    private WebElementFacade showEntriesList;

    @FindBy(xpath = "//div[@id='RoleAccessList_info']")
    private WebElement paginationEntries;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr[1]/td[2]")
    private WebElement filterRoleNameList;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr[1]/td[3]")
    private WebElement filterRoleTypeList;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr[1]/td[5]")
    private WebElement filterAssignToList;

    @FindBy(xpath = "//table[@id='RoleAccessList']/tbody/tr[1]/td[4]")
    private WebElement filterSchoolOrOrganizationList;

    @FindBy(xpath = "//div[@id='swal2-content']")
    private WebElement permissionValidationMessage;


    private RoleData data;
    StudentPage studentPage;


    public void navigateToRoleList(){
        tab_Admin.click();
        tab_RolesAndPermission.click();
        Assert.assertTrue(getTitle().contains("Role Access List"));
    }

    public void navigateToAddRoleList(){
        tab_Admin.click();
        tab_RolesAndPermission.click();
        addBtn.click();
        Assert.assertTrue(getTitle().contains("Add Role Access"));
    }
    DataGenerator dataGenerator = new DataGenerator();
    public void createSearchUpdateDeleteRole(){
        data = new RoleData().generateRoleDetails();
        String RoleName = dataGenerator.generateRoleName();
        navigateToAddRoleList();
        clickOn(radioButtonGeneric);
        typeInto(txtRoleName,RoleName);
        List<WebElement> allCheck = getDriver().findElements(By.xpath("//tr/td/div/label"));
        for (WebElement element : allCheck) {
            element.click();
        }
        clickOn(btnSubmit);
        System.out.println("Role Name:" + RoleName);
        Assert.assertTrue(successPopup.containsText("The role access has been updated successfully..!"));
        btnOK.click();

        // edit role
        typeInto(txtSearchBox,RoleName);
        tabBtn.click();
//        System.out.println( "Role Name1: " + RoleName);
        clickOn(editRoleBtn);
        typeInto(txtRoleName,dataGenerator.generateRoleName());
        clickOn(btnSubmit);
        btnOK.click();

        //delete role
        typeInto(txtSearchBox,RoleName);
        tabBtn.click();
        clickOn(deleteRoleBtn);
        clickOn(yesDeleteItBtn);
        clickOn(btnOK);

    }
    public void sortRoleBySerialNumber(){
        navigateToRoleList();
        String xpath  = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[1]";
        generalClass.sortSrNoAscending(headerSerialNumber,xpath);
        generalClass.sortSrNoDescending(headerSerialNumber,xpath);

    }
    public void sortRoleByRoleName(){
        navigateToRoleList();
        String xpath  = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[2]";
        generalClass.sortNameAscending(headerRoleName,xpath);
        generalClass.sortNameDescending(headerRoleName,xpath);

    }
    public void sortRoleByRoleType(){
        navigateToRoleList();
        String xpath  = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[3]";
        generalClass.sortNameAscending(headerRoleType,xpath);
        generalClass.sortNameDescending(headerRoleType,xpath);

    }
    public void sortRoleBySchoolOrOrganization(){
        navigateToRoleList();
        String xpath  = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[4]";
        generalClass.sortNameAscending(headerSchoolOrOrganization,xpath);
        generalClass.sortNameDescending(headerSchoolOrOrganization,xpath);

    }
    public void sortRoleByAssignTo(){
        navigateToRoleList();
        String xpath  = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[5]";
        generalClass.sortNameAscending(headerAssignTo,xpath);
        generalClass.sortNameDescending(headerAssignTo,xpath);

    }
    public void searchRoleName(){
        navigateToRoleList();
        generalClass.searchSchool(RoleNameList, nxtPageBtn, txtSearchBox, filterRoleNameList);
    }
    public void searchRoleType(){
        navigateToRoleList();
        generalClass.searchSchool(RoleTypeList, nxtPageBtn, txtSearchBox, filterRoleTypeList);
    }
    public void searchSchoolOrOrganization(){
        navigateToRoleList();
        generalClass.searchSchool(schoolOrOrganizationList, nxtPageBtn, txtSearchBox, filterSchoolOrOrganizationList);
    }

    public void searchAssignToList(){
        navigateToRoleList();
        generalClass.searchSchool(assignToList,nxtPageBtn,txtSearchBox,filterAssignToList);
    }
    public void doPaginationOnRolePage(){
        navigateToRoleList();
        studentPage.select100Entries();
        generalClass.doPagination(RoleNameList,nxtPageBtn,paginationEntries,previousPageBtn);
    }
    public void verifyShowEntries(int value) {
        waitFor(5000);
        if (!(value < 10)) {
            System.out.println("show entry value called " + value);
            String valueInString = String.valueOf(value);
            showEntriesList.selectByVisibleText(valueInString);
            String selectedValue = showEntriesList.getSelectedValue();
            GeneralClass generalClass = new GeneralClass();
            String numRows = "//table[@id='RoleAccessList']/tbody/tr";
            generalClass.selectEntry(selectedValue, numRows);
        } else {
            System.out.println("show entry value not called " + value);
            waitFor(5000);
            GeneralClass generalClass = new GeneralClass();
            String numRowXpath = "//table[@id='RoleAccessList']/tbody/tr";
            String listOfShowEntries = "//select[@name='RoleAccessList_length']//option";
            generalClass.seeList(showEntriesList, listOfShowEntries, numRowXpath);
        }

    }
    public void verifyValidationMessageForMandatoryFields(){
        navigateToAddRoleList();
        clickOn(btnSubmit);
        Assert.assertEquals(permissionValidationMessage,"Please select at least one permission for this role!");
        clickOn(btnOK);
        List<WebElement> allCheck = getDriver().findElements(By.xpath("//tr/td/div/label"));
        for (WebElement element : allCheck) {
            element.click();
        }
        clickOn(btnSubmit);

    }
}
