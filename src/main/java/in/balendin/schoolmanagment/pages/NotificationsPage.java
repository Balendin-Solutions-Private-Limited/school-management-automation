package in.balendin.schoolmanagment.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class NotificationsPage extends PageObject {

    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[4]/a")
    private WebElementFacade tab_Marketing;
    @FindBy(xpath = "//a[@href='/JobSchedulerConfig']")
    private WebElementFacade subTab_Notifications;

    // Notification List Page Elements
    @FindBy(xpath = "//a[normalize-space()='Add']")
    private WebElementFacade btnAddNotification;
    @FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
    private WebElementFacade shoeEntries;
    @FindBy(xpath = "//select[@name='DataTables_Table_0_length']//option")
    private WebElementFacade showEntriesOptions;


    // Notification Add Page Elements
    @FindBy(xpath = "//select[@id='SchoolId']")
    private WebElementFacade ddlSelectSchool;
    @FindBy(xpath = "//select[@id='SchoolId']//option")
    private WebElementFacade ddlSelectSchoolOptions;
    @FindBy(xpath = "//label[normalize-space()='Email']")
    private WebElementFacade checkType_Email;
    @FindBy(xpath = "//label[normalize-space()='SMS']")
    private WebElementFacade checkType_SMS;
    @FindBy(xpath = "//label[@for='AllDaily']")
    private WebElementFacade checkType_AllDaily;
    @FindBy(xpath = "//input[@id='DailyHrs']")
    private WebElementFacade input_DailyHrs;
    @FindBy(xpath = "//input[@id='DailyMins']")
    private WebElementFacade input_DailyMins;
    @FindBy(xpath = "//label[@for='Allweekly']")
    private WebElementFacade checkType_AllWeekly;
    @FindBy(xpath = "//input[@id='WeeklyHrs']")
    private WebElementFacade input_WeeklyHrs;
    @FindBy(xpath = "//input[@id='WeeklyMins']")
    private WebElementFacade input_WeeklyMins;
    @FindBy(xpath = "//label[@for='AllMonthly']")
    private WebElementFacade checkType_AllMonthly;
    @FindBy(xpath = "//input[@id='MonthHrs']")
    private WebElementFacade input_MonthHrs;
    @FindBy(xpath = "//input[@id='MonthMins']")
    private WebElementFacade input_MonthMinutes;
    @FindBy(xpath = "//input[@name='MonthlyCalender']")
    private WebElementFacade input_Calender;
    @FindBy(xpath = "//div[@class='input-group-text']")
    private WebElementFacade widget_Calender;
    @FindBy(xpath = "//div//input[@id='1']/parent::*/child::label")
    private WebElementFacade check_Date;
    @FindBy(xpath = "//div//input[@id='Sunday']/parent::*/child::label")
    private WebElementFacade check_Week;
    @FindBy(xpath = "//div//input[@id='January']/parent::*/child::label")
    private WebElementFacade check_Month;
    @FindBy(xpath = "//a[@id='goBackHref']")
    private WebElementFacade label_GoBack;
    @FindBy(xpath = "//input[@id='SaveButton']")
    private WebElementFacade btnSubmit;
    @FindBy(xpath = "//button[normalize-space()='OK']")
    private WebElementFacade btnOK;
    @FindBy(xpath = "//div[@id='swal2-content']")
    private WebElementFacade txtValidation;
    @FindBy(xpath = "//p[@id='errorMessagemonthTime']")
    private WebElementFacade txtValidationDateField;

    // Notification List Page Elements
    @FindBy(xpath = "//table//tr[1]/td[2]")
    private WebElementFacade schoolName;
    @FindBy(xpath = "//table//tr[1]/td[2]")
    private WebElementFacade btnMoreView;
    @FindBy(xpath = "//button[normalize-space()='Yes, delete it!']")
    private WebElementFacade btnYesDeleteIt;
    @FindBy(id = "DataTables_Table_0_next")
    private WebElementFacade btnNext;
    @FindBy(id = "DataTables_Table_0_previous")
    private WebElementFacade btnPrevious;
    @FindBy(xpath = "//input[@type='search']")
    private WebElementFacade txtSearchBox;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[2]")
    private List<WebElement> listSchNameColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[5]")
    private List<WebElement> listDailyDateColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[7]")
    private List<WebElement> listWeekNameColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[9]")
    private List<WebElement> listMonthNameColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[10]")
    private List<WebElement> listMonthDateColumn;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")
    private WebElementFacade filteredSchName;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[5]")
    private WebElementFacade filteredDailyDate;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[7]")
    private WebElementFacade filteredWeekName;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[9]")
    private WebElementFacade filteredMonthName;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[10]")
    private WebElementFacade filteredMonthDate;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[2]")
    private WebElementFacade headerSchName;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[3]")
    private WebElementFacade headerSMSEnabled;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[4]")
    private WebElementFacade headerEmailEnabled;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[5]")
    private WebElementFacade headerDailyDate;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[6]")
    private WebElementFacade headerDailyTime;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[7]")
    private WebElementFacade headerWeekly;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[8]")
    private WebElementFacade headerWeeklyTime;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[9]")
    private WebElementFacade headerMonthly;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[10]")
    private WebElementFacade headerMonthDate;
    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th[11]")
    private WebElementFacade headerMonthTime;
    @FindBy(id = "DataTables_Table_0_info")
    private WebElementFacade notificationListInfo;


    GeneralClass generalClass;

    public void navigateToNotificationListPage() {
        clickOn(tab_Marketing);
        clickOn(subTab_Notifications);
    }

    public void navigateToNotificationFormPage() {
        clickOn(tab_Marketing);
        clickOn(subTab_Notifications);
        clickOn(btnAddNotification);
    }

    public void createNotification(Boolean isEmail, Boolean isSMS, Boolean isDaily, String[] date, Boolean isWeekly, String[] week, Boolean isMonthly, String[] Month) {
        selectSchool();
        if (isEmail && isSMS) {
            clickOn(checkType_Email);
            clickOn(checkType_SMS);
        } else if (isEmail) {
            clickOn(checkType_Email);
        } else {
            clickOn(checkType_SMS);
        }

        if (isDaily && date.length < 1) {
            clickOn(checkType_AllDaily);
        } else {
            for (String value : date) {
                clickElement(value);
            }
            typeInto(input_DailyHrs, String.valueOf(getHour()));
            typeInto(input_DailyMins, String.valueOf(getMinute()));
        }

        if (isWeekly && week.length < 1) {
            clickOn(checkType_AllWeekly);
        } else {
            for (String value : week) {
                clickElement(value);
            }
            typeInto(input_WeeklyHrs, String.valueOf(getHour()));
            typeInto(input_WeeklyMins, String.valueOf(getMinute()));
        }
        if (isMonthly && Month.length < 1) {
            clickOn(checkType_AllMonthly);
        } else {
            for (String value : Month) {
                clickElement(value);
            }
            typeInto(input_Calender, getCurrentDate());
            typeInto(input_MonthHrs, String.valueOf(getHour()));
            typeInto(input_MonthMinutes, String.valueOf(getMinute()));
        }
        clickOn(btnSubmit);
        Assert.assertEquals(txtValidation.getText(), "The Notification was saved successfully!");
        clickOn(btnOK);
    }

    public void updateNotification() {
        String nameOfSch = schoolName.getText();
        getDriver().manage().window().setSize(new Dimension(1920, 1200));
        clickOn(getDriver().findElement(By.xpath("//td[text()='" + nameOfSch + "']/parent::*/child::td[12]//a")));
        getDriver().manage().window().setSize(new Dimension(1440, 900));
        clickOn(checkType_Email);
        clickOn(checkType_SMS);

        if (!checkType_AllDaily.isSelected()) {
            clickOn(checkType_AllDaily);
        } else {
            clickElement("1");
        }
        typeInto(input_DailyHrs, String.valueOf(getHour()));
        typeInto(input_DailyMins, String.valueOf(getMinute()));

        if (!checkType_AllWeekly.isSelected()) {
            clickOn(checkType_AllWeekly);

        } else {
            clickElement("Sunday");
        }
        typeInto(input_WeeklyHrs, String.valueOf(getHour()));
        typeInto(input_WeeklyMins, String.valueOf(getMinute()));
        if (checkType_AllMonthly.isSelected()) {
            clickOn(checkType_AllMonthly);
        } else {
            clickElement("January");
        }
        typeInto(input_Calender, getCurrentDate());
        typeInto(input_MonthHrs, String.valueOf(getHour()));
        typeInto(input_MonthMinutes, String.valueOf(getMinute()));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOn(btnSubmit);
        clickOn(btnOK);
    }

    public void deleteNotification() {
        String nameOfSch = schoolName.getText();
        getDriver().manage().window().setSize(new Dimension(1920, 1200));
        clickOn(getDriver().findElement(By.xpath("//td[text()='" + nameOfSch + "']/parent::*/child::td[12]//button")));
        clickOn(btnYesDeleteIt);
        clickOn(btnOK);
        System.out.println("Notification deleted successfully School Name is :: > " + nameOfSch);
    }

    public int getHour() {
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        return hour;
    }

    public String getCurrentDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }

    public int getMinute() {
        Calendar rightNow = Calendar.getInstance();
        int min = rightNow.get(Calendar.MINUTE);
        return min;
    }

    public void clickElement(String value) {
        getDriver().findElement(By.xpath("//div//input[@id='" + value + "']/parent::*/child::label")).click();
    }

    public void selectSchool() {
        Select school = new Select(ddlSelectSchool);
        school.selectByIndex(generateRandomNumber());
        System.out.println(" Selected School : " + school.getFirstSelectedOption().getText());
    }

    public int generateRandomNumber() {
        int ddlCount = getDriver().findElements(By.xpath("//select[@id='SchoolId']//option")).size();
        Random random = new Random();
        int ind = random.nextInt(ddlCount);
        System.out.println(ddlCount);
        return ind;
    }

    public void searchNotificationBySchoolName() {
        generalClass.searchSchool(listSchNameColumn, btnNext, txtSearchBox, filteredSchName);
    }

    public void searchNotificationByDailyDate() {
        generalClass.searchSchool(listDailyDateColumn, btnNext, txtSearchBox, filteredDailyDate);
    }

    public void searchNotificationByWeekName() {
        generalClass.searchSchool(listWeekNameColumn, btnNext, txtSearchBox, filteredWeekName);
    }

    public void searchNotificationByMonthName() {
        generalClass.searchSchool(listMonthNameColumn, btnNext, txtSearchBox, filteredMonthName);
    }

    public void searchNotificationByMonthDate() {
        generalClass.searchSchool(listMonthDateColumn, btnNext, txtSearchBox, filteredMonthDate);
    }

    public void sortSchNameColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[2]";
        generalClass.sortNameAscending(headerSchName, xpath);
        generalClass.sortNameDescending(headerSchName, xpath);
    }

    public void sortSMSEnabledColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[3]";
        generalClass.sortNameAscending(headerSMSEnabled, xpath);
        generalClass.sortNameDescending(headerSMSEnabled, xpath);
    }

    public void sortEmailEnabledColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[4]";
        generalClass.sortNameAscending(headerEmailEnabled, xpath);
        generalClass.sortNameDescending(headerEmailEnabled, xpath);
    }

    public void sortDailyDateColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[5]";
        generalClass.sortNameAscending(headerDailyDate, xpath);
        generalClass.sortNameDescending(headerDailyDate, xpath);
    }

    public void sortDailyTimeColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[6]";
        generalClass.sortNameAscending(headerDailyTime, xpath);
        generalClass.sortNameDescending(headerDailyTime, xpath);
    }

    public void sortWeeklyColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[7]";
        generalClass.sortNameAscending(headerWeekly, xpath);
        generalClass.sortNameDescending(headerWeekly, xpath);
    }

    public void sortWeeklyTimeColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[8]";
        generalClass.sortNameAscending(headerWeeklyTime, xpath);
        generalClass.sortNameDescending(headerWeeklyTime, xpath);
    }

    public void sortMonthlyColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[9]";
        generalClass.sortNameAscending(headerMonthly, xpath);
        generalClass.sortNameDescending(headerMonthly, xpath);
    }

    public void sortMonthDateColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[10]";
        generalClass.sortNameAscending(headerMonthDate, xpath);
        generalClass.sortNameDescending(headerMonthDate, xpath);
    }

    public void sortMonthTimeColumn() {
        String xpath = "//table[@id='DataTables_Table_0']/tbody/tr/td[11]";
        generalClass.sortNameAscending(headerMonthTime, xpath);
        generalClass.sortNameDescending(headerMonthTime, xpath);
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
        generalClass.doPagination(listSchNameColumn, btnNext, notificationListInfo, btnPrevious);
    }

    public void verifyPageValidations() {
        clickOn(btnSubmit);
        Assert.assertEquals(txtValidation.getText(), "Please select school");
        clickOn(btnOK);
        selectSchool();
        clickOn(btnSubmit);
        Assert.assertEquals(txtValidation.getText(), "Please select at least one checkbox for Email or Sms");
        clickOn(btnOK);
        clickOn(checkType_Email);
        clickOn(btnSubmit);
        Assert.assertEquals(txtValidation.getText(), "Please select at least one job schedular for this Email like daily, weekly and monthly!");
        clickOn(btnOK);
        clickElement("January");
        clickOn(btnSubmit);
        Assert.assertEquals(txtValidationDateField.getText(),"Calender field is required");
    }

}
