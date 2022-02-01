package in.balendin.schoolmanagment.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static in.balendin.schoolmanagment.constants.Constants.FEE_SUCCESS;

public class ProcessingFeePage extends PageObject {

    private WebDriverWait wait;

    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[2]/a")
    private WebElementFacade tab_Admin;

    @FindBy(xpath = "//a[@class='nav-link' and @href='/SchoolPay']")
    private WebElementFacade subTab_ProcessingFee;

    @FindBy(xpath = "//a[@type='button']")
    private WebElementFacade btn_Add_ProcessingFee;

    @FindBy(xpath = "//select[@id='SchoolId']")
    private WebElementFacade select_School;

    @FindBy(xpath = "//input[@type='radio' and @value='Organization']")
    private WebElementFacade btnRadio_Organization;

    @FindBy(xpath = "//input[@type='radio' and @value='Parent']")
    private WebElementFacade btnRadio_Parent;

    @FindBy(xpath = "//input[@type='radio' and @value='ThirdParty']")
    private WebElementFacade btnRadio_ThirdParty;

    @FindBy(xpath = "//input[@id='ProcessingFee']")
    private WebElementFacade txt_ProcessingFee;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElementFacade btn_Submit;

    @FindBy(xpath = "//input[@type='search']")
    private WebElementFacade txtSearchBox;

    @FindBy(xpath = "//tr[1]//td[2]")
    private WebElementFacade SchoolName;

    @FindBy(xpath = "//tr[1]//td[3]")
    private WebElementFacade PaymentType;

    @FindBy(xpath = "//tr[1]//td[4]")
    private WebElementFacade ProcessingFee;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElementFacade btnOk;

    @FindBy(xpath = "//div[@id='SchoolId-error']")
    private WebElementFacade error_School;

    @FindBy(xpath = "//button[@id='13230']")
    private WebElementFacade btnDelete;

    @FindBy(xpath = "//tr//td")
    private WebElementFacade txtNoData;

    @FindBy(xpath = "//div[@id='ProcessingFee-error']")
    private WebElementFacade error_ProcessingFee;

    @FindBy(xpath = "//div[@id='ProcessingFee-error']")
    private WebElementFacade invalidData_error_ProcessingFee;

    @FindBy(xpath = "//div[@id='swal2-content']")
    private WebElementFacade ProcessingFee_SuccessMsg;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElementFacade btn_ProcessingFee_OK;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    private WebElementFacade btn_Next;

    @FindBy(xpath = "//tr[1]/td[2]")
    private WebElementFacade schoolName;

    @FindBy(xpath = "//button[normalize-space()='Yes, delete it!']")
    private WebElementFacade btnYesDeleteIt;



    @FindBy(xpath = "//input[@type='search']")
    private WebElementFacade search_Field;

    @FindBy(xpath = "//select[@name='SchoolProcessingList_length']")
    private WebElementFacade showEntriesList;

    @FindBy(xpath = "//option[@value='10']")
    private WebElementFacade ShowEntriesValue10;

    @FindBy(xpath = "//option[@value='25']")
    private WebElementFacade ShowEntriesValue25;

    @FindBy(xpath = "//option[@value='50']")
    private WebElementFacade ShowEntriesValue50;

    @FindBy(xpath = "//option[@value='100']")
    private WebElementFacade ShowEntriesValue100;

    @FindBy(xpath = "//th[@aria-label='Organization Name: activate to sort column ascending']")
    private WebElementFacade Org_Name_Header;

    GeneralClass generalClass = new GeneralClass();

    public void navigateToProcessingFeeList() {
        tab_Admin.click();
        subTab_ProcessingFee.click();
    }

    public void navigateToProcessingFeeForm() {
        tab_Admin.click();
        subTab_ProcessingFee.click();
        btn_Add_ProcessingFee.click();
    }

    public void createProcessingFee(String ProcessingFeeType) {
        Select s = new Select(select_School);
        s.selectByIndex(1);
        String selectedSchool = s.getFirstSelectedOption().getText();
        switch (ProcessingFeeType) {
            case "Organization":
                clickOn(btnRadio_Organization);
                break;
            case "Parent":
                clickOn(btnRadio_Parent);
                break;
            case "Third Party":
                clickOn(btnRadio_ThirdParty);
                break;
            default:
                System.out.println(" Default executed ");
                clickOn(btnRadio_Parent);
                break;
        }
        typeInto(txt_ProcessingFee, "50");
        clickOn(btn_Submit);
        verifyProcessingFeeCreated();
        typeInto(txtSearchBox,selectedSchool);
        Assert.assertEquals(SchoolName.getText(),selectedSchool);
        Assert.assertEquals(PaymentType.getText(), ProcessingFeeType);
        Assert.assertEquals(ProcessingFee.getText(), "50");
    }

    public void verifyProcessingFeeCreated() {
        Assert.assertEquals(ProcessingFee_SuccessMsg.getText(), FEE_SUCCESS);
        btn_ProcessingFee_OK.click();
    }

    public void editProcessingFee() {
        WebElement createdOrg = getDriver().findElement(By.xpath("//td[text()='" + schoolName.getText() + "']/parent::*/child::td[5]/a"));
        createdOrg.click();
        btnRadio_Organization.click();
        typeInto(txt_ProcessingFee, "20");
        clickOn(btn_Submit);
        clickOn(btn_ProcessingFee_OK);
    }

    public void deleteProcessingFee() {
        if (txtNoData.isDisplayed()){
            System.out.println("No data available in table");
        }else {
            WebElement btnDeleteItem = getDriver().findElement(By.xpath("//td[text()='" + schoolName.getText() + "']/parent::*/child::td[5]/button"));
            clickOn(btnDeleteItem);
            clickOn(btnYesDeleteIt);
            clickOn(btnOk);
        }
    }

    public void deleteProcessingFeeAllItems() {
        //    showEntriesList.selectByIndex(3);
        if (txtNoData.isDisplayed()) {
            System.out.println("No data available in table");
        } else {
            List<WebElement> listOfItems = getDriver().findElements(By.xpath("//tr//td[2]"));
            generalClass.deleteAllItems(showEntriesList, listOfItems);
        }
    }

    public void verifyExistingSchoolNameDisplayedInSelectSchoolDropdown(String feeType) {
        Select s = new Select(select_School);
        int totalEntries = getDriver().findElements(By.xpath("//select//option")).size();
        Random random = new Random();
        int ran_Num = random.nextInt(totalEntries);
        s.selectByIndex(ran_Num);
        String selectedSchool = s.getFirstSelectedOption().getText();

        switch (feeType) {
            case "Organization":
                clickOn(btnRadio_Organization);
                break;
            case "Parent":
                clickOn(btnRadio_Parent);
                break;
            case "Third Party":
                clickOn(btnRadio_ThirdParty);
                break;
            default:
                System.out.println(" Default executed ");
                clickOn(btnRadio_Parent);
                break;
        }
        typeInto(txt_ProcessingFee, "50");
        clickOn(btn_Submit);

        verifyProcessingFeeCreated();
        clickOn(btn_Add_ProcessingFee);
        clickOn(select_School);
        List<WebElement> listOfDropdown = getDriver().findElements(By.xpath("//select//option"));
        for (WebElement schoolNames : listOfDropdown){
            Assert.assertNotEquals(selectedSchool, schoolNames.getText());
        }
    }
}
