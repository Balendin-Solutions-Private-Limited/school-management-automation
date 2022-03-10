package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.util.DataGenerator;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

import static in.balendin.schoolmanagment.constants.Constants.*;


public class CoursePage extends PageObject {

    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[2]/a")
    private WebElementFacade tab_Admin;
    @FindBy(xpath = "//a[@href='/Course']")
    private WebElementFacade subTab_Course;

    // CourseList Elements
    @FindBy(xpath = "//a[@type='button']")
    private WebElementFacade btnAdd;
    @FindBy(xpath = "//select[@id='OrganizationId']")
    private WebElement selectOrganization;
    @FindBy(xpath = "//select[@id='SchoolId']")
    private WebElementFacade selectSchool;
    @FindBy(xpath = "//select[@id='SchoolId']")
    private WebElementFacade selectSchoolHere;
    @FindBy(xpath = "//button[@id='showDetails']")
    private WebElementFacade btnShowDetails;
    @FindBy(xpath = "//input[@type='search']")
    private WebElementFacade txtSearchBox;
    @FindBy(xpath = "//tr[1]/td[2]")
    private WebElementFacade courseName;
    @FindBy(xpath = "//tr[1]/td[3]")
    private WebElementFacade courseCode;
    @FindBy(xpath = "//table//tr[1]/td[2]")
    private WebElementFacade CourseNameTOEdit;
    @FindBy(xpath = "//li[@id='DataTables_Table_0_next']")
    private WebElement btnNext;
    @FindBy(id = "DataTables_Table_0_previous")
    private WebElement btnPrevious;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[1]")
    private List<WebElement> courseSrNumColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[1]")
    private WebElementFacade courseFilteredSrNumColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[2]")
    private List<WebElement> courseNameColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")
    private WebElementFacade courseFilteredCourseName;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[3]")
    private List<WebElement> courseCodeColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[3]")
    private WebElementFacade courseFilteredCourseCode;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[4]")
    private List<WebElement> courseSchoolColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[4]")
    private WebElementFacade courseFilteredCourseSchool;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[5]")
    private List<WebElement> courseSemesterColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[5]")
    private WebElementFacade courseFilteredCourseSem;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[6]")
    private List<WebElement> courseClassColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[6]")
    private WebElementFacade courseFilteredCourseClass;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[7]")
    private List<WebElement> courseClassSectionColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[7]")
    private WebElementFacade courseFilteredCourseClassSection;
    @FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
    private WebElementFacade showEntriesOptions;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[1]")
    private WebElementFacade headerSrNum;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[2]")
    private WebElementFacade headerCourseName;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[3]")
    private WebElementFacade headerCourseCode;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[4]")
    private WebElementFacade headerCourseSchoolName;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[5]")
    private WebElementFacade headerCourseSemester;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[6]")
    private WebElementFacade headerCourseClass;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[7]")
    private WebElementFacade headerCourseSection;
    @FindBy(xpath = "//div[@id='DataTables_Table_0_info']")
    private WebElementFacade courseListInfo;


// Create/Edit Course elements
    @FindBy(xpath = "//input[@id='courseName']")
    private WebElementFacade txtCourseName;
    @FindBy(xpath = "//input[@id='courseCode']")
    private WebElementFacade txtCourseCode;
    @FindBy(xpath = "//input[@id='payDirectCode']")
    private WebElementFacade txtCoursePayDirectCode;
    @FindBy(xpath = "//input[@id='semesterCount']")
    private WebElementFacade txtCourseSemCount;
    @FindBy(xpath = "//input[@id='semester']")
    private WebElementFacade txtCourseSem;
    @FindBy(xpath = "//input[@id='academicYear']")
    private WebElementFacade txtCourseAcademicYear;
    @FindBy(xpath = "//input[@id='courseClass']")
    private WebElementFacade txtCourseClass;
    @FindBy(xpath = "//input[@id='section']")
    private WebElementFacade txtCourseSection;
    @FindBy(xpath = "//input[@id='description']")
    private WebElementFacade txtCourseDescription;
    @FindBy(xpath = "//input[@id='btnSave']")
    private WebElementFacade btnSubmitForm;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    private WebElementFacade btnPopupOk;
    @FindBy(xpath = "//div[@id='swal2-content']")
    private WebElementFacade updatedPopupMsg;
    @FindBy(xpath = "//select[@id='SchoolId']//option")
    private WebElementFacade ddlAllSchools;
    @FindBy(xpath = "//select[@id='OrganizationId']//option")
    private WebElementFacade ddlAllOrg;

// Subject Configuration Elements
    @FindBy(xpath = "//a[@href='#SubjectConfig']//strong")
    private WebElementFacade itemSubConfigOpen;
    @FindBy(xpath = " //select[@id='subjectId']")
    private WebElementFacade selectSubject;
    @FindBy(xpath = "//input[@id='supplementaryFee']")
    private WebElementFacade txtSuppleFee;
    @FindBy(xpath = "//input[@id='btnAdd']")
    private WebElementFacade btnAddSubConfig;

// Fee Configuration Elements
    @FindBy(xpath = "//a[@href='#feeConfig']//strong")
    private WebElementFacade itemFeeConfig;
    @FindBy(xpath = "//select[@id='PaymentHeadName']")
    private WebElementFacade selectPayHead;
    @FindBy(xpath = "//input[@id='amount']")
    private WebElementFacade txtEnterAmount;
    @FindBy(xpath = "//label[@for='chkIsPartial']")
    private WebElementFacade btnIsPartial;
    @FindBy(xpath = "//input[@id='minAmount']")
    private WebElementFacade txtMinAmount;
    @FindBy(xpath = "//label[@for='chkIsDiscount']")
    private WebElementFacade btnIsDiscount;
    @FindBy(xpath = "//input[@id='discount']")
    private WebElementFacade txtEnterDiscount;
    @FindBy(xpath = "//input[@id='btnFeeConfigurationAdd']")
    private WebElementFacade btnAddFeeConfig;

    // Validations elements
    @FindBy(xpath = "//div[@id='shoolError']")
    private WebElementFacade schoolError;
    @FindBy(xpath = "//div[@id='courseName-error']")
    private WebElementFacade courseNameError;
    @FindBy(xpath = "//div[@id='semesterCount-error']")
    private WebElementFacade semesterCountError;
    @FindBy(xpath = "//div[@id='semester-error']")
    private WebElementFacade semesterError;

    // Generate fake Data
    DataGenerator data = new DataGenerator();
    public String sCourseName = data.getCourseName();
    public String sCourseCode = String.valueOf(data.randomNumber());
    public String sCoursePayCode = "Sample_Pay_Code";

    GeneralClass generalClass;

    public void navigateToAddCoursePage() {
        tab_Admin.click();
        subTab_Course.click();
        btnAdd.click();
    }

    public void navigateToAddCourseListPage() {
        tab_Admin.click();
        subTab_Course.click();
    }

    public void createCourse() {
        // Fill Course Form
        selectSchoolHere.selectByIndex(1);
        String selectedSchool = selectSchoolHere.getFirstSelectedOptionValue();
        typeInto(txtCourseName, sCourseName);
        typeInto(txtCourseCode, sCourseCode);
        typeInto(txtCoursePayDirectCode, sCoursePayCode);
        typeInto(txtCourseSemCount, "4");
        typeInto(txtCourseSem, "1");
        typeInto(txtCourseAcademicYear, "2020");
        typeInto(txtCourseClass, "0001");
        typeInto(txtCourseSection, "A");
        typeInto(txtCourseDescription, "Sample Description");

        // Subject Config
        itemSubConfigOpen.click();
        if (getDriver().findElements(By.xpath("//select[@id='subjectId']//option")).size() > 1) {
            selectSubject.selectByIndex(1);
            typeInto(txtSuppleFee, "1000");
            clickOn(btnAddSubConfig);
            itemSubConfigOpen.click();
        } else {
            System.out.println("No Subjects Added in this Course");
        }

        // Fee Configuration
        clickOn(itemFeeConfig);
        clickOn(selectPayHead);
        List<WebElement> listDropdown = new ArrayList<>(getDriver().findElements(By.xpath("//select[@id=\"PaymentHeadName\"]//child::option")));
        listDropdown.remove(0);
        for (WebElement element : listDropdown) {
            System.out.println("Selected Payment head is ::  " + element.getText());
            clickOn(element);
            typeInto(txtEnterAmount, "100");
            if (!txtMinAmount.isEnabled()) {
                clickOn(btnIsPartial);
            }
            typeInto(txtMinAmount, "50");
            if (!txtEnterDiscount.isEnabled()) {
                clickOn(btnIsDiscount);
            }
            typeInto(txtEnterDiscount, "2");
            clickOn(btnAddFeeConfig);
        }
        clickOn(btnSubmitForm);
        clickOn(btnPopupOk);
    }

    public void verifyCourseCreated() {
        Assert.assertEquals(sCourseName, courseName.getText());
        Assert.assertEquals(sCourseCode, courseCode.getText());
    }

    public void updateCourseSubConfigFeeConfig() {
        String nameOfCourse = CourseNameTOEdit.getText();
        WebElement btnEditCourse = getDriver().findElement(By.xpath("//td[text()='" + nameOfCourse + "']/parent::*/child::td[8]//a"));
        clickOn(btnEditCourse);
        String schName = selectSchool.getSelectedVisibleTextValue();
        typeInto(txtCourseCode, sCourseCode + "RJ");
        typeInto(txtCoursePayDirectCode, sCoursePayCode + "RJ");
        typeInto(txtCourseSemCount, String.valueOf(Integer.parseInt(txtCourseSemCount.getAttribute("value")) + 1));
        typeInto(txtCourseSem, String.valueOf(Integer.parseInt(txtCourseSem.getAttribute("value")) + 1));
        typeInto(txtCourseAcademicYear, String.valueOf(Integer.parseInt(txtCourseAcademicYear.getAttribute("value")) + 1));
        typeInto(txtCourseClass, String.valueOf(Integer.parseInt(txtCourseClass.getAttribute("value")) + 1));
        typeInto(txtCourseSection, txtCourseSection.getAttribute("value") + 1);
        typeInto(txtCourseDescription, txtCourseDescription.getAttribute("value") + "   RJ");
        System.out.println("Name of School :: " + schName);
        // Edit Sub Config
        itemSubConfigOpen.click();

        List<WebElement> listDropdown = new ArrayList<>(getDriver().findElements(By.xpath("//select[@id='subjectId']//option")));
        listDropdown.remove(0);
        String selectedHead = null;
        if (listDropdown.size() > 0) {
            for (WebElement element : listDropdown) {
                element.click();
                selectedHead = element.getText();
                typeInto(txtSuppleFee,"100");
                clickOn(btnAddSubConfig);
                WebDriverWait wait = new WebDriverWait(getDriver(), 2);
                boolean AlertExists;
                try {
                    wait.until(ExpectedConditions.alertIsPresent());
                    AlertExists = true;
                } catch (TimeoutException e) {
                    e.printStackTrace();
                    AlertExists = false;
                }
                if (AlertExists) {
                    System.out.println("Error Alert Subject exists Subject Name Is :: > " + selectedHead);
                    String alertMessage = getDriver().switchTo().alert().getText();
                    System.out.println("alert message  ::" + alertMessage);
                    getDriver().switchTo().alert().accept();
                    WebElement btnEdit = getDriver().findElement(By.xpath("//td//span[text()='" + selectedHead + "']/parent::td/parent::tr//td[6]/a[@class='Edit']"));
                    clickOn(btnEdit);
                    WebElement inputAmount = getDriver().findElement(By.xpath("//td//span[text()='" + selectedHead + "']/parent::td/parent::tr//td[5]//input"));
                    typeInto(inputAmount, String.valueOf(Integer.parseInt(inputAmount.getAttribute("value")) + 50));
                    WebElement btnUpdate = getDriver().findElement(By.xpath("//td//span[text()='" + selectedHead + "']/parent::td/parent::tr//td[6]/a[@class='Update']"));
                    clickOn(btnUpdate);
                } else {
                    System.out.println("New Subject Added Subject Name is :: >>" + selectedHead);
                }
            }
        } else {
            System.out.println("No Subjects Added in this Course");
        }

        editFeeConfig();
        clickOn(btnSubmitForm);
        Assert.assertTrue(updatedPopupMsg.getText().equalsIgnoreCase("The course has been created / modified!"));
        clickOn(btnPopupOk);

    }

    private void editFeeConfig() {
        // Fee Configuration
        clickOn(itemFeeConfig);
        clickOn(selectPayHead);
        List<WebElement> listDropdown = new ArrayList<>(getDriver().findElements(By.xpath("//select[@id=\"PaymentHeadName\"]//child::option")));
        listDropdown.remove(0);
        String selectedHead = null;
        for (WebElement element : listDropdown) {
            System.out.println("Selected Payment head is ::  " + element.getText());
            clickOn(element);
            typeInto(txtEnterAmount, "100");
            if (!txtMinAmount.isEnabled()) {
                clickOn(btnIsPartial);
            }
            typeInto(txtMinAmount, "50");
            if (!txtEnterDiscount.isEnabled()) {
                clickOn(btnIsDiscount);
            }
            typeInto(txtEnterDiscount, "2");
            clickOn(btnAddFeeConfig);
            WebDriverWait wait = new WebDriverWait(getDriver(), 2);
            boolean AlertExists;
            try {
                wait.until(ExpectedConditions.alertIsPresent());
                AlertExists = true;
            } catch (TimeoutException e) {
                e.printStackTrace();
                AlertExists = false;
            }
            if (AlertExists) {
                System.out.println("Fee Head exists Head Name is :: > " +selectedHead);
                String alertMessage = getDriver().switchTo().alert().getText();
                System.out.println("alert message  ::" + alertMessage);
                getDriver().switchTo().alert().accept();
                selectedHead = element.getText();
                clickElement(selectedHead, "Edit");
                typeInto((getInputElement(selectedHead, 2)), String.valueOf(Integer.parseInt((getInputElement(selectedHead, 2)).getAttribute("value")) + 50));
                clickElement(selectedHead, "Update");
            } else {
                System.out.println("New Fee Head Added Name is :: > " + selectedHead);
            }
        }
    }

    public void verifyCreateCoursePageValidations() {
        clickOn(btnSubmitForm);
        Assert.assertEquals(schoolError.getText(), COURSE_ERROR_SCHOOL);
        Assert.assertEquals(courseNameError.getText(), COURSE_ERROR_COURSE_NAME);
        Assert.assertEquals(semesterCountError.getText(), COURSE_ERROR_SEM_COUNT);
        Assert.assertEquals(semesterError.getText(), COURSE_ERROR_SEM);

        txtCourseName.sendKeys("RJ", Keys.ENTER);
        Assert.assertEquals(courseNameError.getText(), "Minimum 3 characters required!");
        typeInto(txtCourseName, "RJJ");
        courseNameError.shouldNotBeVisible();

        txtCourseSemCount.sendKeys("2", Keys.ENTER);
        semesterCountError.shouldNotBeVisible();

        txtCourseSem.sendKeys("1", Keys.ENTER);
        semesterError.shouldNotBeVisible();
    }

    public void verifyCreateCoursePageSubConfigValidations() {
        selectSchoolHere.selectByIndex(1);
        typeInto(txtCourseName, sCourseName);
        typeInto(txtCourseSemCount, "4");
        typeInto(txtCourseSem, "1");

        // Alert for Both Fields
        itemSubConfigOpen.click();
        clickOn(btnAddSubConfig);
        String actualMsg = "Please select subject and enter supplementary fee field";
        checkAlert(actualMsg);
        if (getDriver().findElements(By.xpath("//select[@id='subjectId']//option")).size() > 1) {
            // Alert By selecting only Subject
            selectSubject.selectByIndex(1);
            String SupplyFee = "50";
            clickOn(btnAddSubConfig);
            checkAlert(actualMsg);

            // Alert By entering only Supply fee
            selectSubject.selectByIndex(0);
            txtSuppleFee.sendKeys(SupplyFee);
            clickOn(btnAddSubConfig);
            String alertSelectSub = "Please select subject field";
            checkAlert(alertSelectSub);

            // Alert when Edit Sub by clearing Supply Fee
            selectSubject.selectByIndex(1);
            String selectedSub = selectSubject.getFirstSelectedOptionValue();
            txtSuppleFee.sendKeys(SupplyFee);
            clickOn(btnAddSubConfig);
            WebElement btnEditSubConfig = getDriver().findElement(By.xpath("//td//span[text()='" + selectedSub + "']/parent::td/parent::tr[1]//td//a[@class='Edit']"));
            btnEditSubConfig.click();
            // Break here
            WebElement elementEditSupplyFee = getDriver().findElement(By.xpath("//td//span[text()='" + selectedSub + "']/parent::td/parent::tr[1]//td[5]//input"));
            elementEditSupplyFee.clear();
            WebElement btnUpdate = getDriver().findElement(By.xpath("//td//span[text()='" + selectedSub + "']/parent::td/parent::tr[1]//td//a[@class='Update']"));
            btnUpdate.click();
            String alertEnterSupply = "Please enter supplementary fee field";
            checkAlert(alertEnterSupply);
            WebElement btnCancel = getDriver().findElement(By.xpath("//td//span[text()='" + selectedSub + "']/parent::td/parent::tr[1]//td//a[@class='Cancel']"));
            clickOn(btnCancel);

            // Alert By Creating Existing Subject
            selectSubject.selectByIndex(1);
            txtSuppleFee.sendKeys(SupplyFee);
            clickOn(btnAddSubConfig);
            String alertSubExists = "subject configuration already exists";
            checkAlert(alertSubExists);
        } else {
            System.out.println("No Subjects Added in this Course");
        }
    }

    public void verifyCreateCoursePageFeeConfigValidations() {
        selectSchoolHere.selectByIndex(1);
        typeInto(txtCourseName, sCourseName);
        typeInto(txtCourseSemCount, "4");
        typeInto(txtCourseSem, "1");
        String selectedHeadName;

        //Alert messages
        String alertSelectPayHead = "Please select payment head";
        String alertAmountField = "Please enter valid amount";
        String alertMinAmountField = "Please enter valid minimum amount";
        String alertDiscountField = "Please enter valid discount";
        String alertForHigherMinValue = "Please enter the minimum amount is less than the amount";
        String alertDeleteFeeConfig = "Do you want to delete this row?";
        // alert for select payment head field
        clickOn(itemFeeConfig);
        clickOn(btnAddFeeConfig);
        checkAlert(alertSelectPayHead);

        // alert for Amount field
        selectPayHead.selectByIndex(1);
        clickOn(btnAddFeeConfig);
        checkAlert(alertAmountField);

        // alert for Min Amount field
        selectPayHead.selectByIndex(1);
        txtEnterAmount.sendKeys("1000");
        clickOn(btnIsPartial);
        clickOn(btnAddFeeConfig);
        checkAlert(alertMinAmountField);

        // alert for Discount field
        selectPayHead.selectByIndex(1);
        typeInto(txtEnterAmount, "100");
        if (!txtMinAmount.isEnabled()) {
            clickOn(btnIsPartial);
        }
        typeInto(txtMinAmount, "50");
        if (!txtEnterDiscount.isEnabled()) {
            clickOn(btnIsDiscount);
        }
        clickOn(btnAddFeeConfig);
        checkAlert(alertDiscountField);

        // alert If Min amount greater than Amount
        selectPayHead.selectByIndex(1);
        typeInto(txtEnterAmount, "50");
        if (!txtMinAmount.isEnabled()) {
            clickOn(btnIsPartial);
        }
        typeInto(txtMinAmount, "100");
        if (!txtEnterDiscount.isEnabled()) {
            clickOn(btnIsDiscount);
        }
        typeInto(txtEnterDiscount, "2");
        clickOn(btnAddFeeConfig);
        checkAlert(alertForHigherMinValue);


        // alert If remove Payment field only
        selectPayHead.selectByIndex(0);
        typeInto(txtEnterAmount, "100");
        if (!txtMinAmount.isEnabled()) {
            clickOn(btnIsPartial);
        }
        typeInto(txtMinAmount, "50");
        if (!txtEnterDiscount.isEnabled()) {
            clickOn(btnIsDiscount);
        }
        typeInto(txtEnterDiscount, "2");
        clickOn(btnAddFeeConfig);
        checkAlert(alertSelectPayHead);


        // alert If remove Amount field only
        selectPayHead.selectByIndex(1);
        typeInto(txtEnterAmount, "");
        if (!txtMinAmount.isEnabled()) {
            clickOn(btnIsPartial);
        }
        typeInto(txtMinAmount, "50");
        if (!txtEnterDiscount.isEnabled()) {
            clickOn(btnIsDiscount);
        }
        typeInto(txtEnterDiscount, "2");
        clickOn(btnAddFeeConfig);
        checkAlert(alertForHigherMinValue);

        // alert If remove Min Amount field only
        selectPayHead.selectByIndex(1);
        typeInto(txtEnterAmount, "100");
        if (!txtMinAmount.isEnabled()) {
            clickOn(btnIsPartial);
        }
        typeInto(txtMinAmount, "");
        if (!txtEnterDiscount.isEnabled()) {
            clickOn(btnIsDiscount);
        }
        typeInto(txtEnterDiscount, "2");
        clickOn(btnAddFeeConfig);
        checkAlert(alertMinAmountField);

        // alert If remove discount field only
        selectPayHead.selectByIndex(1);
        typeInto(txtEnterAmount, "100");
        if (!txtMinAmount.isEnabled()) {
            clickOn(btnIsPartial);
        }
        typeInto(txtMinAmount, "50");
        if (!txtEnterDiscount.isEnabled()) {
            clickOn(btnIsDiscount);
        }
        typeInto(txtEnterDiscount, "");
        clickOn(btnAddFeeConfig);
        checkAlert(alertDiscountField);

        // When Editing Fee Config alert message by clearing all values
        clickOn(selectPayHead);
        List<WebElement> listDropdown = new ArrayList<>(getDriver().findElements(By.xpath("//select[@id=\"PaymentHeadName\"]//child::option")));
        clickOn(listDropdown.get(1));
        typeInto(txtEnterAmount, "100");
        if (!txtMinAmount.isEnabled()) {
            clickOn(btnIsPartial);
        }
        typeInto(txtMinAmount, "50");
        if (!txtEnterDiscount.isEnabled()) {
            clickOn(btnIsDiscount);
        }
        typeInto(txtEnterDiscount, "10");
        clickOn(btnAddFeeConfig);
        selectedHeadName = listDropdown.get(1).getText();
        System.out.println("name of the head  " + selectedHeadName);
        clickElement(selectedHeadName, "Edit");
        typeInto(getInputElement(selectedHeadName, 2), "");
        typeInto(getInputElement(selectedHeadName, 4), "");
        typeInto(getInputElement(selectedHeadName, 6), "");
        clickElement(selectedHeadName, "Update");
        checkAlert(alertAmountField);
        // When Editing Fee Config alert message by clearing Min amount and discount
        typeInto(getInputElement(selectedHeadName, 2), "100");
        clickElement(selectedHeadName, "Update");
        checkAlert(alertMinAmountField);
        // When Editing Fee Config alert message by clearing discount only
        typeInto(getInputElement(selectedHeadName, 4), "50");
        clickElement(selectedHeadName, "Update");
        checkAlert(alertDiscountField);
        // When Editing Fee Config alert message by entering higher min amount  than Amount
        typeInto(getInputElement(selectedHeadName, 4), "101");
        clickElement(selectedHeadName, "Update");
        checkAlert(alertForHigherMinValue);
        // When Editing Fee Config alert message by entering discount more than 100
        typeInto(getInputElement(selectedHeadName, 4), "50");
        typeInto(getInputElement(selectedHeadName, 6), "101");
        clickElement(selectedHeadName, "Update");
        checkAlert(alertDiscountField);
        // When Deleting Fee Config alert message
        clickElement(selectedHeadName, "Cancel");
        clickElement(selectedHeadName, "Delete");
        checkAlert(alertDeleteFeeConfig);
    }

    public void checkAlert(String ActualMsg) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 2);
        boolean AlertExists;
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            AlertExists = true;
        } catch (TimeoutException e) {
            e.printStackTrace();
            AlertExists = false;
        }
        if (AlertExists) {
            String expAlert = getDriver().switchTo().alert().getText();
            System.out.println("Actual Alert   :: >> " + expAlert + "\n" + "Expected alert :: >> " + ActualMsg);
            Assert.assertEquals(expAlert, ActualMsg);
            getDriver().switchTo().alert().accept();
        } else {
            System.out.println("Error >> No Alert Displayed");
        }
    }

    public void searchCourseBySrNumber() {
        showEntriesOptions.selectByVisibleText("100");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(courseSrNumColumn, btnNext, txtSearchBox, courseFilteredSrNumColumn);
    }
    public void searchCourseByCourseName() {
        showEntriesOptions.selectByVisibleText("100");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(courseNameColumn, btnNext, txtSearchBox, courseFilteredCourseName);
    }
    public void searchCourseByCourseCode() {
        showEntriesOptions.selectByVisibleText("100");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(courseCodeColumn, btnNext, txtSearchBox, courseFilteredCourseCode);
    }
    public void searchCourseByCourseSchool() {
        showEntriesOptions.selectByVisibleText("100");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(courseSchoolColumn, btnNext, txtSearchBox, courseFilteredCourseSchool);
    }
    public void searchCourseByCourseSemester() {
        showEntriesOptions.selectByVisibleText("100");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(courseSemesterColumn, btnNext, txtSearchBox, courseFilteredCourseSem);
    }
    public void searchCourseByCourseClass() {
        showEntriesOptions.selectByVisibleText("100");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(courseClassColumn, btnNext, txtSearchBox, courseFilteredCourseClass);
    }
    public void searchCourseByCourseSection() {
        showEntriesOptions.selectByVisibleText("100");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        generalClass.searchSchool(courseClassSectionColumn, btnNext, txtSearchBox, courseFilteredCourseClassSection);
    }
    public void sortCourseSrNumberColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[1]";
        generalClass.sortSrNoAscending(headerSrNum, xpath);
        generalClass.sortSrNoDescending(headerSrNum, xpath);
    }
    public void sortCourseNameColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[2]";
        generalClass.sortNameAscending(headerCourseName, xpath);
        generalClass.sortNameDescending(headerCourseName, xpath);
    }
    public void sortCourseCodeColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[3]";
        generalClass.sortNameAscending(headerCourseCode, xpath);
        generalClass.sortNameDescending(headerCourseCode, xpath);
    }
    public void sortCourseSchoolNameColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[4]";
        generalClass.sortNameAscending(headerCourseSchoolName, xpath);
        generalClass.sortNameDescending(headerCourseSchoolName, xpath);
    }
    public void sortCourseSemesterColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[5]";
        generalClass.sortNameAscending(headerCourseSemester, xpath);
        generalClass.sortNameDescending(headerCourseSemester, xpath);
    }
    public void sortCourseClassColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[6]";
        generalClass.sortNameAscending(headerCourseClass, xpath);
        generalClass.sortNameDescending(headerCourseClass, xpath);
    }
    public void sortCourseSectionColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[7]";
        generalClass.sortNameAscending(headerCourseSection, xpath);
        generalClass.sortNameDescending(headerCourseSection, xpath);
    }
    public void verifyShowEntries(int value) {
        waitFor(5000);
        if (!(value < 10)) {
            System.out.println("show entry value called " + value);
            String valueInString = String.valueOf(value);
            showEntriesOptions.selectByVisibleText(valueInString);
            String selectedValue = showEntriesOptions.getSelectedValue();
            GeneralClass generalClass = new GeneralClass();
            String numRows = "//table[@id='DataTables_Table_0']/tbody/tr";
            generalClass.selectEntry(selectedValue, numRows);
        } else {
            System.out.println("show entry value not called " + value);
            waitFor(5000);
            GeneralClass generalClass = new GeneralClass();
            String numRowXpath = "//table[@id='DataTables_Table_0']/tbody/tr";
            String listOfShowEntries = "//select[@name='DataTables_Table_0']//option";
            generalClass.seeList(showEntriesOptions, listOfShowEntries, numRowXpath);
        }
    }
    public void verifyPagination() {
        showEntriesOptions.selectByVisibleText("100");
        generalClass.doPagination(courseClassColumn, btnNext, courseListInfo, btnPrevious);
    }

    public void clickElement(String headName, String typeOfBtn) {
        getDriver().findElement(By.xpath("//td//span[text()='" + headName + "']/parent::td/parent::tr//td[7]/a[@class='" + typeOfBtn + "']")).click();
    }

    public WebElement getInputElement(String headName, int value) {
        return getDriver().findElement(By.xpath("//td//span[text()='" + headName + "']/parent::td/parent::tr//td[" + value + "]//input"));
    }


}
