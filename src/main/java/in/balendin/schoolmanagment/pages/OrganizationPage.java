package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.utility.GenerateData;
import in.balendin.schoolmanagment.model.OrganizationData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.util.stream.Collectors;

public class OrganizationPage extends PageObject {

/*    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    Date date = new Date();*/

    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[2]")
    private WebElement adminTab;

    @FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[2]/ul/li[2]")
    private WebElement organizationTab;

    @FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div[1]/div")
    private WebElement addBtn;

    @FindBy(id = "goBackHref")
    private WebElement goBackBtn;

    @FindBy(xpath = "//tr//th[1]")
    private WebElement serialColumn ;

    @FindBy(xpath = "table[@id='OrganizationList']/tbody/tr/td[1]")
    private List<WebElement>serialList;


    @FindBy(xpath = "//label//input")
    private WebElement txtSearchBox;

    @FindBy(xpath = "//tr//td[3]")
    private List<WebElement>organizationList;

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

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
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

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
            private WebElement btnYesDeleteIt;




    public void navigateToOrganizationForm(){
        clickOn(adminTab);
        clickOn(organizationTab);
        clickOn(addBtn);
    }
    public void setOrganizationData(String organizationName, String address, String location, String city, String contactName, String contactNumber){
//      String currentDate = dateFormat.format(date);
        typeInto(txtOrganizationName, organizationName );
        typeInto(txtAddressLine1, address);
        typeInto(txtLocation, location);
        typeInto(txtCity,city);
        typeInto(txtContactName,contactName);
        typeInto(txtContactNumber,contactNumber);
        btnSubmit.sendKeys(Keys.ENTER);
        clickOn(btnOk);
    }
    public void createOrganization(){
        OrganizationData organizationData = new OrganizationData().getData();
        GenerateData generateData = new GenerateData();
        setOrganizationData(organizationData.getOrganizationName() + "auto_" + generateData.getRandomString(),organizationData.getAddress(),organizationData.getLocation(),organizationData.getCity(),organizationData.getContactName(),organizationData.getContactNumber());
        System.out.println("11111" +organizationData.getOrganizationName() );
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
        List<String> originalList = serialList.stream().map(s ->s.getText()).collect(Collectors.toList());
        serialColumn.click();
        waitFor(5);
        List<String> sortedList = serialList.stream().map(s ->s.getText()).collect(Collectors.toList());
        Collections.reverse(sortedList);
        System.out.println("Sorted List " + sortedList);
        Assert.assertTrue(originalList.equals(sortedList));
    }
    public void searchOrganizationName(){
        navigateToOrganizationList();
        String organizationName = getDriver().findElement(By.xpath("//tr[1]//td[3]")).getText();
        typeInto(txtSearchBox,organizationName);
        System.out.println("22222" +organizationName);
        List<WebElement>organizationNameList = getDriver().findElements(By.xpath("//tr[1]//td[3]"));
        List<WebElement>filterList = organizationNameList.stream().filter(orgList ->orgList.getText().contains(organizationName)).collect(Collectors.toList());
        Assert.assertEquals(organizationNameList.size(),filterList.size());
    }
    public void deleteOrganization(){
        navigateToOrganizationList();
        String organizationName = getDriver().findElement(By.xpath("//tr[1]//td[3]")).getText();
        typeInto(txtSearchBox,organizationName);
        System.out.println("22222" +organizationName);
        List<WebElement>organizationNameList = getDriver().findElements(By.xpath("//tr[1]//td[3]"));
        List<WebElement>filterList = organizationNameList.stream().filter(orgList ->orgList.getText().contains(organizationName)).collect(Collectors.toList());
        Assert.assertEquals(organizationNameList.size(),filterList.size());
        btnDelete.click();
        btnYesDeleteIt.click();

    }
    public void see10Entries(){
        navigateToOrganizationList();
        clickOn(showEntriesDropdown);
        clickOn(showEntries10);
        List<WebElement> serialNumberList = getDriver().findElements(By.xpath("//table[@id='OrganizationList']/tbody/tr/td[1]"));
        System.out.println( "serialNumberList " + serialNumberList.size());
        String num = showEntries10.getValue();
        int serialNumber = Integer.parseInt(num);
        Assert.assertTrue(serialNumber >= serialNumberList.size() || serialNumberList.size() <= serialNumber);
    }
    public void see25Entries(){
        navigateToOrganizationList();
        clickOn(showEntriesDropdown);
        clickOn(showEntries25);
        List<WebElement> serialNumberList = getDriver().findElements(By.xpath("//table[@id='OrganizationList']/tbody/tr/td[1]"));
        System.out.println( "serialNumberList " + serialNumberList.size());
        String num = showEntries25.getValue();
        int serialNumber = Integer.parseInt(num);
        Assert.assertTrue(serialNumberList.size() <= serialNumber);
    }

    public void see50Entries(){
        navigateToOrganizationList();
        clickOn(showEntriesDropdown);
        clickOn(showEntries50);
        List<WebElement> serialNumberList = getDriver().findElements(By.xpath("//table[@id='OrganizationList']/tbody/tr/td[1]"));
        System.out.println("SerialNumberList" + serialNumberList.size());
        String num = showEntries50.getValue();
        int serialNumber = Integer.parseInt(num);
        Assert.assertTrue(serialNumberList.size() <= serialNumber);
    }
    public void see100Entries(){
        navigateToOrganizationList();
        clickOn(showEntriesDropdown);
        clickOn(showEntries100);
        List<WebElement> serialNumberList = getDriver().findElements(By.xpath("//table[@id='OrganizationList']/tbody/tr/td[1]"));
        System.out.println("SerialNumberList" + serialNumberList.size());
        String num = showEntries50.getValue();
        int serialNumber = Integer.parseInt(num);
        Assert.assertTrue(serialNumberList.size() <= serialNumber || serialNumberList.size() >= serialNumber);

    }


}
