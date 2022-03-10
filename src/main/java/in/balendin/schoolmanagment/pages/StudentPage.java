package in.balendin.schoolmanagment.pages;

import com.github.javafaker.Faker;
import in.balendin.schoolmanagment.models.StudentData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.server.handler.GoBack;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static in.balendin.schoolmanagment.constants.Constants.MYDOWNLOADS;

public class StudentPage extends PageObject {

    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[3]/a")
    private WebElementFacade studentTab;

    @FindBy(xpath = "//a[@href='/Student']")
    private WebElementFacade importStudent;

    @FindBy(xpath = "//button[@id='addImport']")
    private WebElementFacade btnBulkImport;

    @FindBy(xpath = "//div[@id='information-part']//button[@class='btn btn-primary']")
    private WebElementFacade btnStepNext;
    @FindBy(css = "paginate_button page-item next disabled")
    private WebElement pageButton;

    @FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/form/div[1]/select")
    private WebElementFacade selectSchoolDropdown;


    @FindBy(xpath = "//button[@id='importStudSubmit']")
    private WebElementFacade importStu_Submit;

    @FindBy(xpath = "//*[@id=\"error_list\"]/p")
    private WebElementFacade StudentImportMessage;

    @FindBy(xpath = "//div/a[@href='/Student/DownloadExcelTemplate']")
    private WebElementFacade downloadFile;

    @FindBy(xpath = "//select[@name='studentList_length']//option")
    private WebElementFacade showEntriesList;

    @FindBy(xpath = "//table[@id ='studentList']/tbody/tr/td[1]")
    private List<WebElement> studentNamesList;

    @FindBy(id = "studentList_next")
    private WebElement btnNext;

    @FindBy(id = "studentList_previous")
    private WebElement btnPrevious;

    @FindBy(xpath = "//div[@id='studentList_info']")
    private WebElement showingEntries;

    @FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div[1]/div[2]/div/div[2]/select")
    private WebElement ddlSchool;

    @FindBy(xpath = "//*[@id=\"studentList\"]/tbody/tr/td")
    private WebElementFacade lblNoData;


    private WebDriverWait wait;

    @FindBy(id = "studentList_next")
    private WebElement nxtPageBtn;

    @FindBy(xpath = "//table[@id='studentList']/tbody/tr/td[1]")
    private List<WebElement> admissionNumberList;

    @FindBy(css = "#studentList>tbody>tr>td:nth-child(2)")
    private List<WebElement> studentNameList;

    @FindBy(css = "#studentList>tbody>tr>td:nth-child(3)")
    private List<WebElement> studentDOBList;

    @FindBy(css = "#studentList>tbody>tr>td:nth-child(5)")
    private List<WebElement> studentSchoolNameList;

    @FindBy(xpath = "//div[@id='studentList_filter']/label/input")
    private WebElement searchStudent;

    @FindBy(xpath = "//table[@id='studentList']/tbody/tr/td[1]")
    private WebElement filterResultAdmissionNumber;

    @FindBy(xpath = "//table[@id='studentList']/tbody/tr/td[2]")
    private WebElement filterResultStudentName;

    @FindBy(xpath = "//table[@id='studentList']/tbody/tr/td[3]")
    private WebElement filterResultStudentDOB;

    @FindBy(xpath = "//table[@id='studentList']/tbody/tr/td[4]")
    private WebElement filterResultMobileNumber;

    @FindBy(xpath = "//table[@id='studentList']/tbody/tr/td[5]")
    private WebElement filterResultStudentSchoolList;

    @FindBy(xpath = "//table[@id='studentList']/thead/tr/th[1]")
    private WebElement headerAdmissionNumber;

    @FindBy(xpath = "//table[@id='studentList']/thead/tr/th[2]")
    private WebElement headerStudentName;

    @FindBy(xpath = "//table[@id='studentList']/thead/tr/th[3]")
    private WebElement headerStudentDOB;

    @FindBy(xpath = "//table[@id='studentList']/thead/tr/th[4]")
    private WebElement headerMobile;

    @FindBy(xpath = "//table[@id='studentList']/thead/tr/th[5]")
    private WebElement headerSchool;

    @FindBy(xpath = "//select[@name='studentList_length']")
    private WebElement ddlShowEntries;

    @FindBy(xpath = "//a[@id='goBackHref']")
    private WebElement labelGoBack;


    GeneralClass generalClass;
    String selectedSchoolName;
    public void navigateToStudentList() {
        clickOn(studentTab);
        clickOn(importStudent);
        String Title = getTitle();
        Assert.assertTrue(Title.contains("Student List"));
    }

    public void select100Entries() {
        waitFor(5000);
        Select entries = new Select(ddlShowEntries);
        entries.selectByValue("100");
    }

    public void searchStudentAdmissionNumber() {
        generalClass.searchStudent(admissionNumberList, nxtPageBtn, lblNoData, searchStudent, filterResultAdmissionNumber);

    }

    public void searchStudentByStudentName() {
        generalClass.searchStudent(studentNameList, nxtPageBtn, lblNoData, searchStudent, filterResultStudentName);
    }

    public void searchStudentByDOB() {
        generalClass.searchStudent(studentDOBList, nxtPageBtn, lblNoData, searchStudent, filterResultStudentDOB);

    }

    public void searchStudentsAccordingToSchool() {
        generalClass.searchStudent(studentSchoolNameList, nxtPageBtn, lblNoData, searchStudent, filterResultStudentSchoolList);

    }

    public void sortAdmissionNumber() {
        String xpath = "//table[@id='studentList']/tbody/tr/td[1]";
        generalClass.sortStudentPageAscending(headerAdmissionNumber, xpath);
        generalClass.sortStudentPageDescending(headerAdmissionNumber, xpath);
    }

    public void sortStudentName() {

        String xpath = "//table[@id='studentList']/tbody/tr/td[2]";
        generalClass.sortStudentPageAscending(headerStudentName, xpath);
        generalClass.sortStudentPageDescending(headerStudentName, xpath);

    }

    public void sortStudentDOB() {
        String xpath = "//table[@id='studentList']/tbody/tr/td[3]";
        generalClass.sortStudentPageAscending(headerStudentDOB, xpath);
        generalClass.sortStudentPageDescending(headerStudentDOB, xpath);

    }


    public void verifyShowEntries(int value) {
        selectSchool();
        waitFor(5000);
        if (!(value < 10)) {
            String valueInString = String.valueOf(value);
            showEntriesList.selectByVisibleText(valueInString);
            String selectedValue = showEntriesList.getSelectedValue();
            GeneralClass generalClass = new GeneralClass();
            String numRows = "//table[@id='studentList']/tbody/tr";
            generalClass.selectEntry(selectedValue, numRows);
        } else {
            waitFor(5000);
            GeneralClass generalClass = new GeneralClass();
            String OrgListXpath = "//table[@id='studentList']/tbody/tr/td[1]";
            String listOfShowEntries = "//select[@name='studentList_length']//option";
            generalClass.seeList(showEntriesList, listOfShowEntries, OrgListXpath);
        }
    }

    public void verifyPagination() {
        Select school = new Select(ddlSchool);
        school.selectByVisibleText("BALENDIN VIJ");
        //  selectSchool();
        GeneralClass generalClass = new GeneralClass();
        generalClass.doPagination(studentNamesList, btnNext, showingEntries, btnPrevious);
    }

    public void verifyTemplateDownloadAndImportStudentData() {

        downloadTemplate();
        XSSFWorkbook workbook = null;
        XSSFSheet sheet;
        String downloadedFile = Objects.requireNonNull(getLatestFile(MYDOWNLOADS)).getAbsolutePath();
        try {

            FileInputStream file = new FileInputStream(downloadedFile);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheetAt(workbook.getActiveSheetIndex());
            StudentData data = new StudentData();
            String feeAmount = "500";

            for (int i = 1; i < 25; i++) {

                //Get the count in sheet
                int rowCount = sheet.getLastRowNum() + 1;
                Row empRow = sheet.createRow(rowCount);

                Cell Admission_Num = empRow.createCell(0);
                Admission_Num.setCellValue(data.getOrg_PostalCode());

                Cell Stu_Name = empRow.createCell(1);
                Stu_Name.setCellValue(data.getStu_Name());


                Cell Stu_Mobile = empRow.createCell(4);
                Stu_Mobile.setCellValue(data.getStu_Mobile_Num());

                Cell Stu_Mail = empRow.createCell(5);
                Stu_Mail.setCellValue(data.getStu_Email());


                Cell Stu_Faa = empRow.createCell(7);
                Stu_Faa.setCellValue(data.getStu_Father_Name());
                Cell Stu_Faa_Mail = empRow.createCell(8);
                Stu_Faa_Mail.setCellValue(data.getStu_Father_Email());
                Cell Stu_Faa_Mobile = empRow.createCell(9);
                Stu_Faa_Mobile.setCellValue(data.getStu_Father_Mobile());


                Cell Stu_Course = empRow.createCell(16);
                Stu_Course.setCellValue(data.getStu_Course());

                Cell Stu_CourseCode = empRow.createCell(17);
                Stu_CourseCode.setCellValue(data.getStu_Course_Code());


                Cell semester = empRow.createCell(20);
                semester.setCellValue(1);

                Cell term1Fee = empRow.createCell(29);
                term1Fee.setCellValue(feeAmount);
                Cell term2Fee = empRow.createCell(30);
                term2Fee.setCellValue(feeAmount);
                Cell term3Fee = empRow.createCell(31);
                term3Fee.setCellValue(feeAmount);
                Cell TutionFee = empRow.createCell(32);
                TutionFee.setCellValue(feeAmount);
                Cell RegularFee = empRow.createCell(33);
                RegularFee.setCellValue(feeAmount);
                Cell ExamFee = empRow.createCell(34);
                ExamFee.setCellValue(feeAmount);
                Cell Library = empRow.createCell(35);
                Library.setCellValue(feeAmount);
                Cell Bus = empRow.createCell(36);
                Bus.setCellValue(feeAmount);
                Cell Hostel = empRow.createCell(37);
                Hostel.setCellValue(feeAmount);
                Cell Mess = empRow.createCell(38);
                Mess.setCellValue(feeAmount);
                Cell Lab = empRow.createCell(39);
                Lab.setCellValue(feeAmount);
                Cell ExtraCurricularActivity = empRow.createCell(40);
                ExtraCurricularActivity.setCellValue(feeAmount);
                Cell Stationary = empRow.createCell(41);
                Stationary.setCellValue(feeAmount);
                Cell LateFee = empRow.createCell(42);
                LateFee.setCellValue(feeAmount);
                Cell DueDate = empRow.createCell(43);
                DueDate.setCellValue("01-10-2022");
                Cell UniformAndShoe = empRow.createCell(44);
                UniformAndShoe.setCellValue(feeAmount);
                Cell Uniform = empRow.createCell(45);
                Uniform.setCellValue(feeAmount);
                Cell Shoe = empRow.createCell(46);
                Shoe.setCellValue(feeAmount);
                Cell BooksAndStationary = empRow.createCell(47);
                BooksAndStationary.setCellValue(feeAmount);
                Cell BooksStationaryUniform = empRow.createCell(48);
                BooksStationaryUniform.setCellValue(feeAmount);
                System.out.println(i);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new
                    File(downloadedFile));
            workbook.write(out);
            out.close();
            System.out.println("Update Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        btnBulkImport.waitUntilEnabled();
        clickOn(btnBulkImport);
        clickOn(btnStepNext);
        selectSchoolDropdown.selectByIndex(1);
        String latestFile = getLatestFile(MYDOWNLOADS).getAbsolutePath();
        WebElement fileExcel = getDriver().findElement(By.xpath("//div/input[@name='excelFile' and @id = 'excelFile']"));
        fileExcel.sendKeys(latestFile);
        importStu_Submit.click();
        Assert.assertTrue(StudentImportMessage.getText().contains("Students has been imported."));

    }

    public void importSupplyForStudent() {
        Select school = new Select(ddlSchool);
        school.selectByIndex(generateRandomNumber());
        while (lblNoData.containsText("No data available in table")) {
            school.selectByIndex(generateRandomNumber());
            selectedSchoolName = school.getFirstSelectedOption().getText();
            System.out.println(" Selected School FFF : " + selectedSchoolName);
        }
        System.out.println("selectedSchoolName MMM : " + selectedSchoolName);
        //  List<String> supply_Students = new ArrayList<>();

        String student = filterResultStudentName.getText();
        String addNum = filterResultAdmissionNumber.getText();

        System.out.println("student name " + student);
        clickOn(getDriver().findElement(By.xpath("//td[text()='" + student + "']/parent::*/child::td[6]//a[@title='Edit']")));
        String courseName = getDriver().findElement(By.xpath("//input[@id='StudentCourseView_Id']//parent::div//h6")).getText();
        String semester = getDriver().findElement(By.xpath("//label[@for='Semester']//parent::div//h6")).getText();
        int updatedSem;
        switch (semester) {
            case "":
                int addsOn = 1;
                updatedSem = addsOn;
                break;
            case "1":
                updatedSem = 1;
                break;
            default:
                int negative = -1;
                updatedSem = Integer.parseInt(semester) + negative;
        }

        String regex = "^([^()]*)\\(([^()]*)\\)(.*)$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(courseName);
        if (matcher.matches()) {

            String txtCourse = matcher.group(1).trim();
            String txtCourseCode = matcher.group(2).trim();
            String txtCourseSem = matcher.group(2).trim();
            System.out.println("111111111111111  " + txtCourse);
            System.out.println("222222222222222  " + txtCourseCode);
            System.out.println("333333333333333  " + txtCourseSem);
            System.out.println("444444444444444  " + courseName);


            clickOn(labelGoBack);
            downloadTemplate();
            XSSFWorkbook workbook = null;
            XSSFSheet sheet;
            String downloadedFile = Objects.requireNonNull(getLatestFile(MYDOWNLOADS)).getAbsolutePath();
            try {

                FileInputStream file = new FileInputStream(downloadedFile);
                workbook = new XSSFWorkbook(file);
                sheet = workbook.getSheetAt(workbook.getActiveSheetIndex());
                StudentData data = new StudentData();
                String feeAmount = "500";

                for (int i = 1; i < 5; i++) {
                    Faker feker;
                    //Get the count in sheet
                    int rowCount = sheet.getLastRowNum() + 1;
                    Row empRow = sheet.createRow(rowCount);

                    Cell Admission_Num = empRow.createCell(0);
                    Admission_Num.setCellValue(addNum);

                    Cell Stu_Name = empRow.createCell(1);
                    Stu_Name.setCellValue(student);


          /*          Cell Stu_Mobile = empRow.createCell(4);
                    Stu_Mobile.setCellValue(data.getStu_Mobile_Num());*/

                    Cell Stu_Mail = empRow.createCell(5);
                    Stu_Mail.setCellValue(data.getStu_Email());

                    Cell Stu_Course = empRow.createCell(16);
                    Stu_Course.setCellValue(txtCourse);

                    Cell Stu_CourseCode = empRow.createCell(17);
                    Stu_CourseCode.setCellValue(txtCourseCode + 1);


                    Cell semesterCell = empRow.createCell(20);
                    semesterCell.setCellValue(updatedSem);

                    Cell ExamType = empRow.createCell(28);
                    ExamType.setCellValue("Supplementary");

                    Cell subCode = empRow.createCell(25);
                    subCode.setCellValue(data.getSubject() + 001);

                    Cell subject = empRow.createCell(26);
                    subject.setCellValue(data.getSubject());

                    Cell ExamFee = empRow.createCell(34);
                    ExamFee.setCellValue(feeAmount);
                    System.out.println(i);

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                //Write the workbook in file system
                FileOutputStream out = new FileOutputStream(new
                        File(downloadedFile));
                workbook.write(out);
                out.close();
                System.out.println("Update Successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        btnBulkImport.waitUntilEnabled();
        clickOn(btnBulkImport);
        clickOn(btnStepNext);
        System.out.println("selectedSchoolName LLL   " + selectedSchoolName);
        selectSchoolDropdown.selectByVisibleText(selectedSchoolName);
        String latestFile = getLatestFile(MYDOWNLOADS).getAbsolutePath();
        WebElement fileExcel = getDriver().findElement(By.xpath("//div/input[@name='excelFile' and @id = 'excelFile']"));
        fileExcel.sendKeys(latestFile);
        importStu_Submit.click();
        Assert.assertTrue(StudentImportMessage.getText().contains("Students has been imported."));


    }

    public void selectSchool() {
        Select school = new Select(ddlSchool);
        school.selectByIndex(generateRandomNumber());
        while (lblNoData.containsText("No data available in table")) {
            school.selectByIndex(generateRandomNumber());
            System.out.println(" Selected School : " + school.getFirstSelectedOption().getText());
        }

    }

    public int generateRandomNumber() {
        int ddlCount = getDriver().findElements(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div[2]/div/div[2]/select/option")).size();
        Random random = new Random();
        int ind = random.nextInt(ddlCount);
        System.out.println(ddlCount);
        return ind;

    }

    private File getLatestFile(String dirPath) {
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return null;
        }

        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {
            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
            }
        }
        return lastModifiedFile;
    }

    public void downloadTemplate() {
        clickOn(downloadFile);
        Robot robot = null;

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.getAutoDelay();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(2000);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForElement(WebElement element) {
        wait = new WebDriverWait(this.getDriver(), 100);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}

