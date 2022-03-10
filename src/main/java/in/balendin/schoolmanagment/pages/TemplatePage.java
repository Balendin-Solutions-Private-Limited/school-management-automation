package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.models.RoleData;
import in.balendin.schoolmanagment.util.DataGenerator;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class TemplatePage extends PageObject {

    UserPage userPage;
    RolePage rolePage;
    private RoleData data;

    @FindBy(xpath = "//p[normalize-space()='Marketing']")
    private WebElement TabMarketing;

    @FindBy(xpath = "//p[normalize-space()='Templates']")
    private WebElement tabTemplate;

    @FindBy(xpath = "//i[@class='fas fa-plus']")
    private WebElement btnAdd;

    @FindBy(xpath = "//div[@id='valError']//div[2]//input[1]")
    private WebElement radioBtnSchool;

    @FindBy(xpath = "//input[@id='TemplateName']")
    private WebElement txtTemplateName;

    @FindBy(xpath = "//input[@id='File']")
    private WebElement selectTemplateFile;

    @FindBy(xpath = "//input[@id='MarketTemp']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//input[@id='FormSubmit']")
    private WebElement submitBtn;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    private WebElement btnOk;

    @FindBy(xpath = "//div[@id='swal2-content']")
    private WebElement successPopup;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement txtSearchBox;

    @FindBy(xpath = "//span[@class='dtr-data']//i[@class='fas fa-pencil-alt']")
    private WebElement editButton;
    //span[@class='dtr-data']//i[@class='fas fa-pencil-alt']

    @FindBy(xpath = "//input[@class='btnOrganization' and @value='1']")
    private WebElement radioBtnOrganization;

    @FindBy(xpath = "//div[@id='organizationDropdown']/select")
    private WebElement ddlOrganization;

    @FindBy(xpath = "//div[@id='organizationDropdown']/select/option")
    private List<WebElement> ddlOrganizationCount;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[1]")
            private WebElement headerSerialNumber;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[2]")
    private WebElement headerTemplateName;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[3]")
    private WebElement headerTemplateFile;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/thead/tr/th[4]")
    private WebElement headerSchoolOrOrganization;

    @FindBy(xpath = "//table[@id='OrganizationList']/tbody/tr/td[2]")
    private List<WebElement> templateList;

    @FindBy(xpath = "//table[@id='OrganizationList']/tbody/tr/td[3]")
    private List<WebElement> templateFileList;

    @FindBy(xpath = "//table[@id='OrganizationList']/tbody/tr/td[4]")
    private List<WebElement> schoolOrOrganizationList;

    @FindBy(xpath = "//table[@id='OrganizationList']/tbody/tr[1]/td[4]")
    private WebElement filterSchoolOrOrganizationList;

    @FindBy(xpath = "//li[@id='OrganizationList_next']")
    private WebElement nxtPageBtn;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr[1]/td[2]")
    private WebElement filterTemplateNameList;

    @FindBy(xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr[1]/td[3]")
    private WebElement filterTemplateFileList;

    @FindBy(xpath = "//select[@name='OrganizationList_length']")
     private WebElement ddlShowEntries;

    @FindBy(xpath = "//div[@class='dataTables_info']")
    private WebElement paginationEntries;

    @FindBy(id = "OrganizationList_previous")
     private WebElement previousBtn;

    @FindBy(xpath = "//select[@name='OrganizationList_length']//option")
    private WebElementFacade showEntriesListOption;

    @FindBy(xpath = "//div[@id='TemplateName-error']")
    private WebElement templateNameValidationMsg;

    @FindBy(xpath = "//div[@id='File-error']")
    private WebElement templateFileValidationMsg;

    @FindBy(xpath = "//td[@class='sorting_1']")
    private WebElement plusBtn;

GeneralClass generalClass;
StudentPage studentPage;

    public void navigateToTemplateList(){
        clickOn(TabMarketing);
        clickOn(tabTemplate);
    }

    public void navigateToAddTemplateListForm(){
        navigateToTemplateList();
        clickOn(btnAdd);
    }
    public void selectRandomOrganizationInForm(){
        Select school = new Select(ddlOrganization);
        int dropDownValueCount = ddlOrganizationCount.size();

        Random random = new Random();
        int index = random.nextInt(dropDownValueCount);
        school.selectByIndex(index);
    }

    DataGenerator dataGenerator = new DataGenerator();
    public void templatesForSchoolOrOrganization(boolean IsSchool){
        navigateToAddTemplateListForm();
        data = new RoleData().generateRoleDetails();
        if (IsSchool){
            radioBtnSchool.click();
            userPage.selectRandomSchoolInForm();
        }
        else {
                radioBtnOrganization.click();
              selectRandomOrganizationInForm();
        }

        String RoleName = dataGenerator.generateRoleName() + generateString(); ;
        typeInto(txtTemplateName,RoleName);
        selectTemplateFile.sendKeys("C:\\Users\\Mangesh\\OneDrive\\Documents\\Jiratxt1.txt");
        clickOn(btnSubmit);
        Assert.assertEquals(successPopup.getText(),"The marketing template was saved successfully!");
        System.out.println(successPopup.getText());
        clickOn(btnOk);

        //edit

        typeInto(txtSearchBox,RoleName);
        plusBtn.click();
       editButton.click();
//        userPage.selectRandomSchoolInForm();
        data = new RoleData().generateRoleDetails();
        String editRoleName = dataGenerator.generateRoleName() + generateString();
        typeInto(txtTemplateName,editRoleName);
        selectTemplateFile.sendKeys("C:\\Users\\Mangesh\\OneDrive\\Documents\\Jiratxt1.txt");
        clickOn(submitBtn);
        Assert.assertEquals(successPopup.getText(),"The marketing template has been updated successfully!");
        System.out.println(successPopup.getText());
        clickOn(btnOk);
    }

    public void sortTemplateBySerialNumber(){
        String xpath  = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[1]";
        generalClass.sortSrNoAscending(headerSerialNumber,xpath);
        generalClass.sortSrNoDescending(headerSerialNumber,xpath);

    }
    public void sortTemplateByName(){
        String xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[2]";
        generalClass.sortNameAscending(headerTemplateName,xpath);
        generalClass.sortNameDescending(headerTemplateName,xpath);

    }
    public void sortTemplateByFile(){
        String xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[3]";
        generalClass.sortNameAscending(headerTemplateFile,xpath);
        generalClass.sortNameDescending(headerTemplateFile,xpath);
    }

    public void sortTemplateBySchoolOrOrganization(){
        String xpath = "//table[@class='table table-bordered table-hover mtable dataTable no-footer dtr-inline']/tbody/tr/td[4]";
        generalClass.sortNameAscending(headerSchoolOrOrganization,xpath);
        generalClass.sortNameDescending(headerSchoolOrOrganization,xpath);
    }
    public void select100Entries(){
        waitFor(50000);
        Select entries = new Select(ddlShowEntries);
        entries.selectByValue("100");
    }
    public void searchTemplateByName(){
        navigateToTemplateList();
        select100Entries();
        generalClass.searchSchool(templateList, nxtPageBtn, txtSearchBox, filterTemplateNameList);

    }

    public void searchTemplateByFile(){
        navigateToTemplateList();
        select100Entries();
        generalClass.searchSchool(templateFileList,nxtPageBtn,txtSearchBox,filterTemplateFileList);
    }

    public void searchTemplateBySchoolOrOrganization(){
        navigateToTemplateList();
        select100Entries();
        generalClass.searchSchool(schoolOrOrganizationList,nxtPageBtn,txtSearchBox,filterSchoolOrOrganizationList);
    }

    public void doPagination(){
        navigateToTemplateList();
        select100Entries();
        generalClass.doPagination(templateList,nxtPageBtn,paginationEntries,previousBtn);
    }

    public void verifyShowEntries(int value) {
        navigateToTemplateList();
        waitFor(5000);
        if (!(value < 10)) {
            System.out.println("show entry value called " + value);
            String valueInString = String.valueOf(value);
            showEntriesListOption.selectByVisibleText(valueInString);
            String selectedValue = showEntriesListOption.getSelectedValue();
            GeneralClass generalClass = new GeneralClass();
            String numRows = "//table[@id='OrganizationList']/tbody/tr";
            generalClass.selectEntry(selectedValue, numRows);
        } else {
            System.out.println("show entry value not called " + value);
            waitFor(5000);
            GeneralClass generalClass = new GeneralClass();
            String numRowXpath = "//table[@id='OrganizationList']/tbody/tr";
            String listOfShowEntries = "//select[@name='OrganizationList_length']//option";
            generalClass.seeList(showEntriesListOption, listOfShowEntries, numRowXpath);
        }

    }

    public void verifyValidationMessageOnTemplateForm(){
        navigateToAddTemplateListForm();
        clickOn(btnSubmit);
        Assert.assertEquals(templateNameValidationMsg.getText(),"The Template Name field is required.");
        Assert.assertEquals(templateFileValidationMsg.getText(),"Please upload the template file");
    }
    public String generateString()  {

        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString);
        return  randomString;
    }
}