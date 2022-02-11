package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.models.OrganizationData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;
import java.util.stream.Collectors;

import static in.balendin.schoolmanagment.constants.Constants.DELETE_SUCCESS;
import static in.balendin.schoolmanagment.constants.Constants.FILE_LOGO;


public class GeneralClass extends PageObject {

    private OrganizationData data;

    public void CreateOrganization(WebElement name, String orgName, WebElement des, WebElement logo, WebElement line1, WebElement line2,
                                   WebElement location, WebElement city, WebElement code, WebElement nameUser, WebElement number, WebElement btnSubmit) {
        data = new OrganizationData().generateOrgDetails();
        typeInto(name, orgName);
        typeInto(des, data.getOrg_Description());
        // typeInto(logo, FILE_LOGO);
        typeInto(line1, data.getOrg_Address1());
        typeInto(line2, data.getOrg_Address2());
        typeInto(location, data.getOrg_Location());
        typeInto(city, data.getOrg_City());
        typeInto(code, "123456");
        typeInto(nameUser, data.getOrg_ContactName());
        typeInto(number, data.getOrg_ContactNumber());
        clickOn(btnSubmit);
    }

    public void createSchoolHere(Boolean isEdit,
                                 WebElementFacade selectOrg, WebElementFacade schName,
                                 WebElementFacade schCode, WebElementFacade schDes,
                                 WebElementFacade schLogo, WebElementFacade add1,
                                 WebElementFacade add2, WebElementFacade location,
                                 WebElementFacade city, WebElementFacade postalCode,
                                 WebElementFacade conName, WebElementFacade conNumber,
                                 WebElementFacade partPayment, WebElementFacade checkAccept,
                                 WebElementFacade HeadPartPay, WebElementFacade examFeeManda,
                                 WebElementFacade Supply, WebElementFacade PreviousYear,
                                 WebElementFacade maintainStudent, WebElementFacade allowPayDirect,
                                 WebElementFacade partPayPercentage, WebElementFacade btnSubmit) {
        data = new OrganizationData().generateOrgDetails();
        if (isEdit) {
            System.out.println("1is Edit :::    " + isEdit);
            typeInto(schName, data.getOrg_Title());
            typeInto(schCode, data.getOrg_ContactNumber());
            //   schDes.clear();
            //    schCode.sendKeys(data.getOrg_Address1());
            schLogo.sendKeys(data.getOrg_Logo());
            typeInto(add1, data.getOrg_Address1());
            //typeInto(add2, data.getOrg_Address2());
            typeInto(location, data.getOrg_Location());
            typeInto(city, data.getOrg_City());
            typeInto(conName, data.getOrg_ContactName());
            typeInto(conNumber, data.getOrg_ContactNumber());
            getDriver().findElement(By.xpath("//input[@id='submitSchool']")).click();
            //  clickOn(btnSubmit);
        } else {
            System.out.println("11is Edit :::    " + isEdit);
            selectOrg.click();
            selectOrg.selectByIndex(1);
            typeInto(schName, data.getOrg_Title());
            typeInto(schCode, data.getOrg_ContactNumber());
            typeInto(schDes, data.getOrg_Address1());
            schLogo.sendKeys(data.getOrg_Logo());
            typeInto(add1, data.getOrg_Address1());
            //typeInto(add2, data.getOrg_Address2());
            typeInto(location, data.getOrg_Location());
            typeInto(city, data.getOrg_City());
            typeInto(conName, data.getOrg_ContactName());
            typeInto(conNumber, data.getOrg_ContactNumber());
            clickOn(btnSubmit);
        }


    }

    public void CreateOrganizationLogo(WebElement name, WebElement des, WebElement logo, WebElement line1, WebElement line2,
                                       WebElement location, WebElement city, WebElement code, WebElement nameUser, WebElement number, WebElement btnSubmit) {
        data = new OrganizationData().generateOrgDetails();
        typeInto(name, data.getOrg_Title());
        typeInto(des, data.getOrg_Description());
        logo.sendKeys(FILE_LOGO);
        typeInto(line1, data.getOrg_Address1());
        typeInto(line2, data.getOrg_Address2());
        typeInto(location, data.getOrg_Location());
        typeInto(city, data.getOrg_City());
        typeInto(code, "123456");
        typeInto(nameUser, data.getOrg_ContactName());
        typeInto(number, data.getOrg_ContactNumber());
        clickOn(btnSubmit);
    }

    public void VerifySearchOrganization(List<WebElement> webElements, String orgName) {
        List<WebElement> filteredResults = webElements.stream().filter(allOrg -> allOrg.getText().contains(orgName)).collect(Collectors.toList());
        Assert.assertEquals(webElements.size(), filteredResults.size());

    }

    public void deleteAllItems(WebElementFacade showEntry, List<WebElement> listOfItems) {
        showEntry.selectByIndex(3);
        for (int i = 0; i <= listOfItems.size(); i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            getDriver().findElement(By.xpath("//tr[1]//td[5]/button")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            getDriver().findElement(By.xpath("//button[normalize-space()='Yes, delete it!']")).click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement ok = getDriver().findElement(By.xpath("//button[normalize-space()='OK']"));
            // ok.waitUntilVisible();
            ok.click();
        }
    }

    public void selectEntry(String valueToSelect, String numRows) {

        List<WebElement> numRowElements = getDriver().findElements(By.xpath(numRows));

        switch (valueToSelect) {
            case "10":
                System.out.println(" valueToSelect 10");
                Assert.assertEquals(Integer.parseInt(valueToSelect), numRowElements.size());
                break;
            case "25":
                System.out.println(" valueToSelect 25");
                Assert.assertEquals(Integer.parseInt(valueToSelect), numRowElements.size());
                break;
            case "50":
                System.out.println("KKK   1  " + Integer.parseInt(valueToSelect));
                System.out.println("KKK   2 " + numRowElements.size());
                Assert.assertEquals(Integer.parseInt(valueToSelect), numRowElements.size());
                break;
            default:
                System.out.println("valueToSelect 100");
                Assert.assertEquals(Integer.parseInt(valueToSelect), numRowElements.size());
                break;
        }

    }

    public void seeList(WebElement showEntriesList, String listOfShowEntries, String listXpath) {

        clickOn(showEntriesList);
        System.out.println("show entry value not called " + listXpath);
        List<WebElement> listDropdown = new ArrayList<>(getDriver().findElements(By.xpath(listOfShowEntries)));

        String value = null;
        System.out.println("show entry value not called " + listXpath);
        for (WebElement element : listDropdown) {
            value = element.getText();
            element.click();
            List<WebElement> OrgListSize = getDriver().findElements(By.xpath(listXpath));
            int valueInt = Integer.parseInt(value);
            Assert.assertTrue(OrgListSize.size() <= valueInt);
            System.out.println("KKKKKKKK  OrgListValue : " + OrgListSize.size());
            System.out.println("KKKKKKKK  ValueInt     : " + valueInt);
            clickOn(showEntriesList);
        }
    }

    public void sortNameAscending(WebElement OrgNameHeader, String Xpath) {
        OrgNameHeader.click();
        List<WebElement> elements = getDriver().findElements(By.xpath(Xpath));
        List<String> actual = elements.stream().map(WebElement::getText).collect(Collectors.toList());
        List<String> result = actual.stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> expected = result.stream().sorted().collect(Collectors.toList());
        System.out.println("Result    " + result + "\n" + "expected    " + expected);
        Assert.assertEquals(result, expected);

    }

    public void sortNameDescending(WebElement OrgNameHeader, String Xpath) {
        getDriver().navigate().refresh();
        Actions a = new Actions(getDriver());
        a.moveToElement(OrgNameHeader).doubleClick().build().perform();
        List<WebElement> elements = getDriver().findElements(By.xpath(Xpath));
        List<String> originalList = elements.stream().map(WebElement::getText).collect(Collectors.toList());
        List<String> actual = originalList.stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> sortedList = actual.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("actual    " + actual + "\n" + "sortedList    " + sortedList);
        Assert.assertEquals(actual, sortedList);
    }

    public void sortStudentPageAscending(WebElement columnHeader, String Xpath) {
        columnHeader.click();
        List<WebElement> elements = getDriver().findElements(By.xpath(Xpath));
        List<String> actual = elements.stream().map(WebElement::getText).collect(Collectors.toList());
        List<String> result = actual.stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> expected = result.stream().sorted().collect(Collectors.toList());
        System.out.println("Result    " + result + "\n" + "expected    " + expected);
        Assert.assertEquals(result, expected);

    }

    public void sortStudentPageDescending(WebElement columnHeader, String Xpath) {
        columnHeader.click();
        List<WebElement> elements = getDriver().findElements(By.xpath(Xpath));
        List<String> originalList = elements.stream().map(WebElement::getText).collect(Collectors.toList());
        List<String> actual = originalList.stream().map(String::toLowerCase).collect(Collectors.toList());
        List<String> sortedList = actual.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("actual    " + actual + "\n" + "sortedList    " + sortedList);
        Assert.assertEquals(actual, sortedList);
    }

    public void sortSrNoDescending(WebElement serialColumn, String xpath) {
        getDriver().navigate().refresh();
        serialColumn.click();
        List<String> stringDescendingList = getDriver().findElements(By.xpath(xpath)).stream().map(WebElement::getText).collect(Collectors.toList());
        List<Integer> integerDescendingList = stringDescendingList.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(" integerDescendingList " + integerDescendingList);

        List<Integer> sortedSerialList = integerDescendingList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(" reverseOrder " + sortedSerialList);
        Assert.assertTrue(integerDescendingList.equals(sortedSerialList));
    }

    public void sortSrNoAscending(WebElement serialColumn, String xpath) {
        Actions act = new Actions(getDriver());
        List<String> actualSerialNumberList = getDriver().findElements(By.xpath(xpath)).stream().map(WebElement::getText).collect(Collectors.toList());
        List<Integer> integersActualSerialNumberList = actualSerialNumberList.stream().map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(integersActualSerialNumberList);
        System.out.println("integersActualSerialNumberList:" + integersActualSerialNumberList);
        act.doubleClick(serialColumn);
        List<String> afterSortSerialNumber = getDriver().findElements(By.xpath(xpath)).stream().map(WebElement::getText).collect(Collectors.toList());
        List<Integer> integersAfterSortSerialNumber = afterSortSerialNumber.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(" afterSortSerialNumber " + integersAfterSortSerialNumber);
        Assert.assertTrue(integersAfterSortSerialNumber.equals(integersActualSerialNumberList));
    }


    public void deleteItem(String xpath, WebElement btnYesDelete, WebElement successMsg, WebElement btnOk) {
        getDriver().findElement(By.xpath("//td[text()='" + xpath + "']/parent::*/child::td[4]/button")).click();
        clickOn(btnYesDelete);
        String actual = successMsg.getText();
        Assert.assertEquals(actual, DELETE_SUCCESS);
        clickOn(btnOk);
    }


    public void doPagination(@NotNull List<WebElement> orgNamesList, WebElement nextBtn, WebElement showEntriesCount, WebElement btnPrevious) {

        List<String> listData = new ArrayList<>();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (WebElement list1 : orgNamesList) {
            listData.add(list1.getText());
        }
        String nextBtnClassName = nextBtn.getAttribute("class");
        while (!nextBtnClassName.contains("disabled")) {
            nextBtn.click();
            for (WebElement list1 : orgNamesList) {
                listData.add(list1.getText());
            }
            nextBtnClassName = nextBtn.getAttribute("class");
        }
        for (String string : listData) {
            System.out.println(string);
        }
        int totalNames = listData.size();
        System.out.println("Total size of Names  " + totalNames);

        String maxEntries = showEntriesCount.getText().split(" ")[5];
        System.out.println("Total size of Entries   " + maxEntries);


        String previousBtnClassName = btnPrevious.getAttribute("class");
        while (!previousBtnClassName.contains("disabled")) {
            for (WebElement list1 : orgNamesList) {
                listData.remove(list1.getText());
            }
            btnPrevious.click();
            previousBtnClassName = btnPrevious.getAttribute("class");
        }
        for (String string : listData) {
            System.out.println(string);
        }
        int firstPageCount = listData.size();
        System.out.println("First Page Data Size  :  " + firstPageCount);

        String minEntries = showEntriesCount.getText().split(" ")[3];

        System.out.println("First Page of Entries   " + minEntries);

        Assert.assertEquals(minEntries, String.valueOf(firstPageCount));
    }

    public void searchStudent(List<WebElement> studentData, WebElement nxtBtn, WebElementFacade lblNoData, WebElement searchStudent, WebElement filterResult) {
        List<String> studentList = new ArrayList<>();
        for (WebElement studentDataList : studentData) {
            studentList.add(studentDataList.getText());
        }
        String nxtBtnClassName = nxtBtn.getAttribute("class");
        while (!nxtBtnClassName.contains("disabled")) {
            nxtBtn.click();
            for (WebElement studentDataList : studentData) {
                studentList.add(studentDataList.getText());
            }
            System.out.println(" Test: " + studentList);
            nxtBtnClassName = nxtBtn.getAttribute("class");
        }
        for (String studentDataList : studentList) {
            System.out.println(" Admission Numbers:  " + studentDataList);

        }
        int totalStudentListSize = studentList.size();
        System.out.println(" Admission Number Total Size:" + totalStudentListSize);

        //select random admission number

        Random rand = new Random();
        String randomStudentData = studentList.get(rand.nextInt(studentList.size()));
        System.out.println(" Select : " + randomStudentData);
        if (lblNoData.containsText("No data available in table")) {
            searchStudent.sendKeys("");
        } else {
            searchStudent.sendKeys(randomStudentData);
        }
//        WebElement filterResult = getDriver().findElement(By.xpath("//table[@id='studentList']/tbody/tr/td[1]"));
        System.out.println("Filter Text : " + filterResult.getText());
        Assert.assertEquals(filterResult.getText(), randomStudentData);
    }


    public void searchSchool(List<WebElement> schoolList, WebElement nxtBtn, WebElement searchSchool, WebElement filterResult) {

        List<String> schoolListData = new ArrayList<>();

        for (WebElement listOfSchool : schoolList) {
            schoolListData.add(listOfSchool.getText());
        }
        String nxtBtnClassName = nxtBtn.getAttribute("class");
        while (!nxtBtnClassName.contains("disabled")) {
            nxtBtn.click();
            for (WebElement listOfSchool : schoolList) {
                schoolListData.add(listOfSchool.getText());
            }
            System.out.println(" Test: " + schoolListData);
            nxtBtnClassName = nxtBtn.getAttribute("class");
        }
        for (String studentDataList : schoolListData) {
            System.out.println(" schoolListData 1 " + studentDataList);

        }
        int totalStudentListSize = schoolListData.size();
        System.out.println(" schoolListData 2:" + totalStudentListSize);

        Random rand = new Random();
        String randomSchoolProperty = schoolListData.get(rand.nextInt(schoolListData.size()));
        System.out.println(" Select : " + randomSchoolProperty);

        searchSchool.sendKeys(randomSchoolProperty);

        System.out.println("Filter Text : " + filterResult.getText());
        Assert.assertTrue(filterResult.getText().contains(randomSchoolProperty));
    }


}