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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentPage extends PageObject {
    @FindBy(xpath = "(//a[@class='nav-link'])[12]")
    private WebElement studentTab;

    @FindBy(xpath = "//a[@href='/Student']")
    private WebElement importStudent;

    @FindBy(name = "studentList_length")
    private WebElement ddlShowEntries;

//    @FindBy(id = "SchoolId")
//    private WebElement schoolDropdown;
//
//    @FindBy(xpath = "//select[@id='SchoolId']/option")
//    private WebElement schoolNames;

    @FindBy(css = "paginate_button page-item next disabled")
    private WebElement pageButton;

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

    @FindBy(xpath = "//*[@id=\"studentList\"]/tbody/tr/td")
    private WebElementFacade lblNoData;

    @FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div[1]/div[2]/div/div[2]/select")
    private WebElement ddlSchool;

    @FindBy(xpath = "//div[@id='studentList_filter']/label/input")
    private WebElement searchStudent;

    @FindBy(xpath = "//table[@id='studentList']/tbody/tr/td[1]")
            private  WebElement filterResultAdmissionNumber;

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



    GeneralClass generalClass;

    public void navigateToStudentList(){
        clickOn(studentTab);
        clickOn(importStudent);
        String Title = getTitle();
        System.out.println("Page Title : " + Title);
        Assert.assertTrue(Title.contains("Student List"));
    }
    public void selectSchool(){
         Select school = new Select(ddlSchool);
        school.selectByIndex(generateRandomNumber());
        System.out.println( " 1st " + school.getFirstSelectedOption().getText());
        while (lblNoData.containsText("No data available in table")){
            school.selectByIndex(generateRandomNumber());
        }

    }

    public int generateRandomNumber(){
        int ddlCount = getDriver().findElements(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div[2]/div/div[2]/select/option")).size();
        Random random = new Random();
        int ind = random.nextInt(ddlCount);
        System.out.println(ddlCount);
        return ind;

    }


    public void select100Entries(){
        waitFor(5000);
        Select entries = new Select(ddlShowEntries);
        entries.selectByValue("100");
    }

    public void searchStudentAdmissionNumber(){
        generalClass.searchStudent(admissionNumberList,nxtPageBtn,lblNoData,searchStudent,filterResultAdmissionNumber);

    }
    public void searchStudentByStudentName(){
        generalClass.searchStudent(studentNameList,nxtPageBtn,lblNoData,searchStudent,filterResultStudentName);

    }
    public void searchStudentByDOB(){
        generalClass.searchStudent(studentDOBList,nxtPageBtn,lblNoData,searchStudent,filterResultStudentDOB);

    }
    public void searchStudentsAccordingToSchool(){
        generalClass.searchStudent(studentSchoolNameList,nxtPageBtn,lblNoData,searchStudent,filterResultStudentSchoolList);

    }

    public void sortAdmissionNumber(){
        String xpath  ="//table[@id='studentList']/tbody/tr/td[1]";
        generalClass.sortStudentPageAscending(headerAdmissionNumber,xpath);
        generalClass.sortStudentPageDescending(headerAdmissionNumber,xpath);

    }
    public void sortStudentName(){
        String xpath  ="//table[@id='studentList']/tbody/tr/td[2]";
        generalClass.sortStudentPageAscending(headerStudentName,xpath);
        generalClass.sortStudentPageDescending(headerStudentName,xpath);

    }
    public void sortStudentDOB(){
        String xpath  ="//table[@id='studentList']/tbody/tr/td[3]";
        generalClass.sortStudentPageAscending(headerStudentDOB,xpath);
        generalClass.sortStudentPageDescending(headerStudentDOB,xpath);

    }



}

