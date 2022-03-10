package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.models.UserData;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class UserPage extends PageObject {
    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[2]/a")
    private WebElementFacade tab_Admin;

    @FindBy(xpath = "//p[normalize-space()='User']")
    private WebElement tab_user;

    @FindBy(xpath = "//p[normalize-space()='School']")
    private WebElement tab_school;

    @FindBy(xpath = "//a[normalize-space()='Add']")
    private WebElement addBtn;

    @FindBy(id = "FirstName")
    private WebElement txtFirstName;

    @FindBy(id = "LastName")
    private WebElement txtLastName;

    @FindBy(id = "UserName")
    private WebElement txtUserName;

    @FindBy(id = "Password")
    private WebElement txtPassword;

    @FindBy(id = "ConfirmPassword")
    private WebElement txtConfirmPassword;

    @FindBy(id = "Email")
    private WebElement txtEmail;

    @FindBy(id = "Mobile")
    private WebElement txtMobile;

    @FindBy(id = "userFormSubmit")
    private WebElement btnUserFormSubmit;

    @FindBy(xpath = "//div[@id='schoolDropdown']/select")
    private WebElementFacade ddlSchool;

    @FindBy(xpath = "//div[@id='schoolDropdown']/select/option")
    private List<WebElement> ddlSchoolCount;

    @FindBy(xpath = "//div[@id='organizationDropdown']/select")
    private WebElement ddlOrganization;

    @FindBy(xpath = "//div[@id='organizationDropdown']/select/option")
    private List<WebElement> ddlOrganizationCount;

    @FindBy(xpath = "//input[@name='UserType' and @value='3']")
    private WebElementFacade userTypeSchool;

    @FindBy(xpath = "//input[@name='UserType' and @value='2']")
    private WebElement userTypeOrganization;


    @FindBy(xpath = "//input[@placeholder='Select Role']")
    private WebElement ddlRole;

    @FindBy(xpath = "//ul[@class='select2-results__options']/li")
    private WebElement ddlRoleCount;

    @FindBy(xpath = "//ul[@class='select2-results__options']/li")
    private List<WebElement> ddlRoleCountList;

    @FindBy(xpath = "//span[@class='select2-selection__choice__remove']")
    private WebElement removeSelectedRole;

    @FindBy(id = "swal2-content")
    private WebElement successPopup;

    @FindBy(xpath = "//div/button[@class='swal2-confirm swal2-styled']")
    private WebElement btnConfirmOk;

    @FindBy(id ="Gender")
    private WebElement ddlGender;

    @FindBy(xpath = "//select[@id='Gender']/option")
    private List<WebElement> ddlGenderList;

    @FindBy(id = "FirstName-error")
    private WebElementFacade validationMsgFirstName;

    @FindBy(id = "LastName-error")
    private WebElementFacade validationMsgLastName;

    @FindBy(id = "UserName-error")
    private WebElementFacade validationMsgUsername;

    @FindBy(id = "Password-error")
    private WebElementFacade validationMsgPassword;

    @FindBy(id = "ConfirmPassword-error")
    private WebElementFacade validationMsgConfirmPassword;

    @FindBy(id = "Email-error")
    private WebElementFacade validationMsgEmail;

    @FindBy(id = "Mobile-error")
    private WebElementFacade validationMsgMobile;

    @FindBy(id = "RoleProfileId-error")
    private WebElementFacade validationMsgRoleProfile;

    @FindBy(name = "Username")
    private WebElement txtUsername;

    @FindBy(name = "Password")
    private WebElement txtUserPassword;

    @FindBy(xpath = "//input[@value='Sign In']")
    private WebElement btnSignIn;

    @FindBy(xpath = "//*[@id=\"studentList\"]/tbody/tr/td")
    private WebElementFacade lblNoData;

    @FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div[1]/div[2]/div/div[2]/select")
    private WebElement ddlSchoolNames;

    @FindBy(xpath = "//div[@class='dataTables_filter']/label/input")
    private WebElement txtSearchBox;

    @FindBy(xpath = "//a/i[@class='fas fa-pencil-alt']")
    private WebElement btnEdit;

    @FindBy(xpath = "//button[@title='Delete']")
    private WebElement btnDelete;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElement btnYesDeleteIt;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[1]")
    private WebElement headerSerialNumber;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[2]")
    private WebElement headerName;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[3]")
    private WebElement headerUsername;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[4]")
    private WebElement headerEmail;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[5]")
    private WebElement headerSchoolOrOrganization;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[6]")
    private WebElement headerContactNumber;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[7]")
    private WebElement headerRoleProfile;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[2]")
    private List <WebElement> nameList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[3]")
    private List <WebElement> usernameList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[4]")
    private List <WebElement> emailList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[5]")
    private List <WebElement> schoolOrOrganizationList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[6]")
    private List <WebElement> contactList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[7]")
    private List <WebElement> roleList;


    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")
    private WebElement filterNameList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[3]")
    private WebElement filterUsernameList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[4]")
    private WebElement filterEmailList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[5]")
    private WebElement filterSchoolOrOrganizationList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[6]")
    private WebElement filterContactList;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[7]")
    private WebElement filterRoleList;

    @FindBy(id = "DataTables_Table_0_next")
    private WebElement nxtPageBtn;

    @FindBy(xpath = "//div[@id='DataTables_Table_0_info']")
    private WebElement paginationEntries;

    @FindBy(id = "DataTables_Table_0_previous")
    private WebElement previousBtn;

    @FindBy(xpath = "//select[@name='DataTables_Table_0_length']//option")
    private WebElementFacade showEntriesList;

    @FindBy(id = "SchoolData")
    private WebElement validationMessageSchool;

    @FindBy(id = "OrganizationData")
    private WebElement validationMessageOrganization;



      private UserData userData;
      StudentPage studentPage;
      LogoutPage logoutPage;
      GeneralClass generalClass;


    public void navigateToUserList(){
        tab_Admin.click();
        tab_user.click();
        Assert.assertTrue(getTitle().contains("User List"));

    }

    public void navigateToAddUserForm(){
        navigateToUserList();
        addBtn.click();
        Assert.assertTrue(getTitle().contains("Create/Edit User"));
    }
    String selectedSchool ;
    public void selectRandomSchoolInForm(){

        Select school = new Select(ddlSchool);
        int dropDownValueCount = ddlSchoolCount.size();

        Random random = new Random();
        int index = random.nextInt(dropDownValueCount);
        school.selectByIndex(index);
        selectedSchool = school.getFirstSelectedOption().getText();
        System.out.println("School: " + selectedSchool);


    }
    public void selectRandomOrganizationInForm(){
        userTypeOrganization.click();
        Select school = new Select(ddlOrganization);
        int dropDownValueCount = ddlOrganizationCount.size();

        Random random = new Random();
        int index = random.nextInt(dropDownValueCount);
        school.selectByIndex(index);
    }

    public void selectRandomGender(){
        Select select = new Select(ddlGender);
        int ddlGenderValue = ddlGenderList.size();
        Random random = new Random();
        int index = random.nextInt(ddlGenderValue);
        select.selectByIndex(index);
    }
    public void selectRandomUserProfile(){
        ddlRole.click();
        List<String> RoleProfileList  =  ddlRoleCountList.stream().map(WebElement::getText).collect(Collectors.toList());
        System.out.println("RoleProfileList" +RoleProfileList);
        Random random = new Random();
        String randomString = RoleProfileList.get(random.nextInt(RoleProfileList.size()));
        System.out.println("Text:" +randomString);
        ddlRole.sendKeys(randomString,Keys.ENTER);
    }

    public void createUpdateSearchDeleteUser(boolean IsSchoolUser){
        navigateToAddUserForm();
        userData = new UserData().generateUserData();
        typeInto(txtFirstName, userData.getFirstName());
        if(IsSchoolUser){
            userTypeSchool.click();
            selectRandomSchoolInForm();
            System.out.println("School: " + selectedSchool);
        }
        else{
            userTypeOrganization.click();
            selectRandomOrganizationInForm();
        }
        typeInto(txtUserName, userData.getUserName());
        typeInto(txtPassword, userData.getPassword());
        typeInto(txtConfirmPassword,userData.getPassword());
        typeInto(txtEmail,userData.getEmail());
        typeInto(txtMobile, userData.getMobileNumber());
        selectRandomUserProfile();
        btnUserFormSubmit.click();
        btnConfirmOk.click();

        typeInto(txtSearchBox,userData.getUserName());
        btnEdit.click();

        userData = new UserData().generateUserData();
        typeInto(txtFirstName, userData.getFirstName());
        typeInto(txtLastName,userData.getLastName());
        typeInto(txtEmail,userData.getEmail());
        typeInto(txtMobile,userData.getMobileNumber());
        selectRandomGender();
        removeSelectedRole.click();
//        selectRandomUserProfile();
        ddlRole.click();
        ddlRole.sendKeys("school",Keys.ENTER);
        btnUserFormSubmit.click();
        btnConfirmOk.click();

        System.out.println(userData.getUserName());

        typeInto(txtSearchBox,userData.getEmail());
        btnDelete.click();
        clickOn(btnYesDeleteIt);
        clickOn(btnYesDeleteIt);

    }

    public void createUserWithMandatoryFields(boolean IsSchoolUser){
           navigateToAddUserForm();
            userData = new UserData().generateUserData();
            typeInto(txtFirstName, userData.getFirstName());
            if(IsSchoolUser){
                userTypeSchool.click();
                selectRandomSchoolInForm();
                System.out.println("School: " + selectedSchool);
            }
            else{
                userTypeOrganization.click();
                selectRandomOrganizationInForm();
            }
            typeInto(txtUserName, userData.getUserName());
        typeInto(txtPassword, userData.getPassword());
        typeInto(txtConfirmPassword,userData.getPassword());
        typeInto(txtEmail,userData.getEmail());
        typeInto(txtMobile, userData.getMobileNumber());
        selectRandomUserProfile();
        btnUserFormSubmit.click();
        Assert.assertTrue(successPopup.getText().contains("The user was created successfully!"));
        btnConfirmOk.click();

        if (IsSchoolUser){
            studentPage.navigateToStudentList();
            Select school = new Select(ddlSchoolNames);
            school.selectByVisibleText(selectedSchool);
            List<WebElement> studentList = getDriver().findElements(By.xpath("//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[2]"));
            List<String> ActualStudentList = null;
            if (studentList.size() == 0){
                lblNoData.containsText("No data available in table");
            }
            else if (studentList.size() > 0){
                ActualStudentList = studentList.stream().map(WebElement::getText).collect(Collectors.toList());
                System.out.println("studentList" + ActualStudentList.size());
                System.out.println("studentList" + ActualStudentList);
            }

            logoutPage.logoutAsSuperAdmin();
            typeInto(txtUsername,userData.getUserName());
            typeInto(txtUserPassword,userData.getPassword());
            clickOn(btnSignIn);
            studentPage.navigateToStudentList();

            List<WebElement> createdUserStudentList = getDriver().findElements(By.xpath("//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[2]"));
            List<String> actualCreatedUserStudentList = createdUserStudentList.stream().map(WebElement::getText).collect(Collectors.toList());
            System.out.println("actualCreatedUserStudentList: " + actualCreatedUserStudentList);
            System.out.println("ActualStudentList" + ActualStudentList);
            if (ActualStudentList == null){

                Assert.assertTrue(lblNoData.containsText("No data available in table"));
            }else
            {
                Assert.assertTrue(ActualStudentList.size() == actualCreatedUserStudentList.size() && ActualStudentList.containsAll(actualCreatedUserStudentList) && actualCreatedUserStudentList.containsAll(ActualStudentList));

            }
            System.out.println("Username:" +userData.getUserName());
            System.out.println("Password:" +userData.getPassword());

        }
        else {
            logoutPage.logoutAsSuperAdmin();
            typeInto(txtUsername,userData.getUserName());
            typeInto(txtUserPassword,userData.getPassword());
            clickOn(btnSignIn);
            navigateToSchoolList();
            List<WebElement> schoolList = getDriver().findElements(By.xpath("//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody"));


            if (schoolList == null){
                lblNoData.containsText("No data available in table");
            }
            else {
                List<String> ActualSchoolList = schoolList.stream().map(WebElement::getText).collect(Collectors.toList());
                System.out.println("ActualSchoolList:" + ActualSchoolList);
            }
        }

    }

    public void navigateToSchoolList(){
        clickOn(tab_Admin);
        clickOn(tab_school);
    }

    public void createUserWithNonMandatoryFields( boolean IsSchoolUser){
        navigateToAddUserForm();
        userData = new UserData().generateUserData();
        typeInto(txtLastName,userData.getLastName());
        if(IsSchoolUser){
            userTypeSchool.click();
            selectRandomSchoolInForm();
        }
        else{
            userTypeOrganization.click();
            selectRandomOrganizationInForm();
        }
        selectRandomGender();
        btnUserFormSubmit.click();

        Assert.assertTrue(validationMsgFirstName.getText().contains("The First Name field is required."));
        Assert.assertTrue(validationMsgUsername.getText().contains("The Username field is required"));
        Assert.assertTrue(validationMsgPassword.getText().contains("The Password field is required"));
        Assert.assertTrue(validationMsgConfirmPassword.getText().contains("The Confirm Password field is required"));
        Assert.assertTrue(validationMsgEmail.getText().contains("The Email field is required"));
        Assert.assertTrue(validationMsgMobile.getText().contains("The Mobile field is required"));
        Assert.assertTrue(validationMsgRoleProfile.getText().contains("Please Select Role Profile field"));

    }

    public void sortUserBySerialNumber(){
        String xpath  = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[1]";
        generalClass.sortSrNoAscending(headerSerialNumber,xpath);
        generalClass.sortSrNoDescending(headerSerialNumber,xpath);

    }

    public void sortUserByName(){
        String xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[2]";
        generalClass.sortNameAscending(headerName,xpath);
        generalClass.sortNameDescending(headerName,xpath);

    }

    public void sortUserByUsername(){
        String xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[3]";
        generalClass.sortNameAscending(headerUsername,xpath);
        generalClass.sortNameDescending(headerUsername,xpath);
    }

    public void sortUserByEmail(){
        String xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[4]";
        generalClass.sortNameAscending(headerEmail,xpath);
        generalClass.sortNameDescending(headerEmail,xpath);
    }

    public void sortUserBySchoolOrOrganization(){
        String xpath ="//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[5]";
        generalClass.sortNameAscending(headerSchoolOrOrganization,xpath);
        generalClass.sortNameDescending(headerSchoolOrOrganization,xpath);
    }
    public void sortUserByContactNumber(){
        String xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[6]";
        generalClass.sortNameAscending(headerContactNumber,xpath);
        generalClass.sortNameDescending(headerContactNumber,xpath);
    }

    public void sortUserByRoleProfile(){
        String xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[7]";
        generalClass.sortNameAscending(headerRoleProfile,xpath);
        generalClass.sortNameDescending(headerRoleProfile,xpath);
    }

    public void searchUserByName(){
        navigateToUserList();
        generalClass.searchSchool(nameList, nxtPageBtn, txtSearchBox, filterNameList);

    }
    public void searchUserByUserName(){
        navigateToUserList();
        generalClass.searchSchool(usernameList, nxtPageBtn, txtSearchBox, filterUsernameList);

    }
    public void searchUserByEmail(){
        navigateToUserList();
        generalClass.searchSchool(emailList, nxtPageBtn, txtSearchBox, filterEmailList);

    }
    public void searchUserBySchoolOrOrganization(){
        navigateToUserList();
        generalClass.searchSchool(schoolOrOrganizationList, nxtPageBtn, txtSearchBox, filterSchoolOrOrganizationList);
    }
    public void searchUserByContactNumber(){
        navigateToUserList();
        generalClass.searchSchool(contactList, nxtPageBtn, txtSearchBox, filterContactList);
    }
    public void searchUserByRoleProfile(){
        navigateToUserList();
        generalClass.searchSchool(roleList, nxtPageBtn, txtSearchBox, filterRoleList);
    }

    public void doPaginationOnUserPage(){
        navigateToUserList();
    generalClass.doPagination(nameList,nxtPageBtn,paginationEntries,previousBtn);
    }
    public void verifyShowEntries(int value) {
        waitFor(5000);
        if (!(value < 10)) {
            System.out.println("show entry value called " + value);
            String valueInString = String.valueOf(value);
            showEntriesList.selectByVisibleText(valueInString);
            String selectedValue = showEntriesList.getSelectedValue();
            GeneralClass generalClass = new GeneralClass();
            String numRows = "//table[@id='DataTables_Table_0']/tbody/tr";
            generalClass.selectEntry(selectedValue, numRows);
        } else {
            System.out.println("show entry value not called " + value);
            waitFor(5000);
            GeneralClass generalClass = new GeneralClass();
            String numRowXpath = "//table[@id='DataTables_Table_0']/tbody/tr";
            String listOfShowEntries = "//select[@name='DataTables_Table_0_length']//option";
            generalClass.seeList(showEntriesList, listOfShowEntries, numRowXpath);
        }

    }

    public void verifyValidationMessageForMandatoryFields(){
        navigateToAddUserForm();
        clickOn(userTypeSchool);
        clickOn(btnUserFormSubmit);
        Assert.assertTrue(validationMessageSchool.getText().contains("Please Select School field"));

        clickOn(userTypeOrganization);
        clickOn(btnUserFormSubmit);
        Assert.assertEquals(validationMessageOrganization.getText(),"Please Select Organization field");
        Assert.assertEquals(validationMsgFirstName.getText(),"The First Name field is required.");
        Assert.assertEquals(validationMsgUsername.getText(),"The Username field is required");
        Assert.assertTrue(validationMsgEmail.getText().contains("The Email field is required"));
        Assert.assertEquals(validationMsgPassword.getText(),"The Password field is required");
        Assert.assertEquals(validationMsgConfirmPassword.getText(),"The Confirm Password field is required");
        Assert.assertEquals(validationMsgMobile.getText(),"The Mobile field is required");
        Assert.assertEquals(validationMsgRoleProfile.getText(),"Please Select Role Profile field");
    }

    public void verifyValidationMessageForForm(){
        navigateToAddUserForm();
        clickOn(userTypeSchool);
        clickOn(btnUserFormSubmit);

        clickOn(userTypeOrganization);
        clickOn(btnUserFormSubmit);

        txtFirstName.sendKeys("p",Keys.ENTER);
        Assert.assertEquals(validationMsgFirstName.getText(),"Minimum 2 characters required!");
        txtFirstName.sendKeys("123",Keys.ENTER);
        Assert.assertEquals(validationMsgFirstName.getText(),"Allow only alphabets and spaces.");
        txtFirstName.sendKeys("123",Keys.ENTER);
        Assert.assertEquals(validationMsgFirstName.getText(),"Allow only alphabets and spaces.");
        txtFirstName.sendKeys("p1245",Keys.ENTER);
        Assert.assertEquals(validationMsgFirstName.getText(),"Allow only alphabets and spaces.");
        typeInto(txtFirstName,"Pratik");
        validationMsgFirstName.shouldNotBeVisible();

        txtLastName.sendKeys("p",Keys.ENTER);
        Assert.assertEquals(validationMsgLastName.getText(),"Minimum 2 characters required!");
        txtLastName.sendKeys("123",Keys.ENTER);
        Assert.assertEquals(validationMsgLastName.getText(),"Allow only alphabets and spaces.");
        txtLastName.sendKeys("@#.&*()_++!$%^",Keys.ENTER);
        Assert.assertEquals(validationMsgLastName.getText(),"Allow only alphabets and spaces.");
        txtLastName.sendKeys("P123",Keys.ENTER);
        Assert.assertEquals(validationMsgLastName.getText(),"Allow only alphabets and spaces.");
        typeInto(txtLastName,"Bhaskar");
        validationMsgLastName.shouldNotBeVisible();

        txtUserName.sendKeys("p",Keys.ENTER);
        Assert.assertEquals(validationMsgUsername.getText(),"Allow only alphanumeric characters, can not contain a space and special character");
        txtUserName.clear();
        txtUserName.sendKeys("123",Keys.ENTER);
        Assert.assertEquals(validationMsgUsername.getText(),"Allow only alphanumeric characters, can not contain a space and special character");
        txtUserName.sendKeys("@#.&*()_++!$%^",Keys.ENTER);
        Assert.assertEquals(validationMsgUsername.getText(),"Allow only alphanumeric characters, can not contain a space and special character");
        txtUserName.sendKeys("Pratik Bhaskar",Keys.ENTER);
        Assert.assertEquals(validationMsgUsername.getText(),"Allow only alphanumeric characters, can not contain a space and special character");
        typeInto(txtUserName,"Bhaskar");
        validationMsgUsername.shouldNotBeVisible();

        txtPassword.sendKeys("pratik",Keys.ENTER);
        Assert.assertEquals(validationMsgPassword.getText(),"The Password must be at least 8 characters");
        typeInto(txtPassword,"BhaskarPratik");
        validationMsgPassword.shouldNotBeVisible();


        txtConfirmPassword.sendKeys("pratikbhaskar",Keys.ENTER);
        Assert.assertEquals(validationMsgConfirmPassword.getText(),"Please enter Confirm Password same as password");
        typeInto(txtConfirmPassword,"BhaskarPratik");
        validationMsgConfirmPassword.shouldNotBeVisible();

        txtEmail.sendKeys("@pratikbhaskar",Keys.ENTER);
        Assert.assertEquals(validationMsgEmail.getText(),"Please enter a vaild Email Address");
        typeInto(txtEmail,"pratikbhakar@gmail.com");
        validationMsgEmail.shouldNotBeVisible();

        txtMobile.sendKeys("ghghgh",Keys.ENTER);
        Assert.assertEquals(validationMsgMobile.getText(),"Please enter only digits.");
        txtMobile.clear();
        txtMobile.sendKeys("123456789",Keys.ENTER);
        Assert.assertEquals(validationMsgMobile.getText(),"Minimum 10 digits required!");
        txtMobile.clear();
        txtMobile.sendKeys("12345645711",Keys.ENTER);
        Assert.assertEquals(validationMsgMobile.getText(),"Maximum 10 digits required!");

        typeInto(txtMobile,"1234564571");
        validationMsgMobile.shouldNotBeVisible();


    }
}
