package in.balendin.schoolmanagment.pages;

import in.balendin.schoolmanagment.models.OrganizationData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static in.balendin.schoolmanagment.constants.Constants.DELETE_SUCCESS;
import static in.balendin.schoolmanagment.constants.Constants.ORG_LOGO;


public class GeneralClass extends PageObject {

    private OrganizationData data;

    public void CreateOrganization(WebElement name, String orgName, WebElement des, WebElement logo, WebElement line1, WebElement line2,
                                   WebElement location, WebElement city, WebElement code, WebElement nameUser, WebElement number, WebElement btnSubmit) {
        data = new OrganizationData().generateOrgDetails();
        typeInto(name, orgName);
        typeInto(des, data.getOrg_Description());
        // typeInto(logo, ORG_LOGO);
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
        logo.sendKeys(ORG_LOGO);
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
    public void seeList(WebElement showEntriesList, String listXpath) {
        clickOn(showEntriesList);
        List<WebElement> listDropdown = new ArrayList<>(getDriver().findElements(By.xpath("//select/option")));
        String value = null;
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

    public void sortSrNoAscending(WebElement OrgNameHeader, String Xpath) {

  /*      Actions actions = new Actions(getDriver());
        actions.moveToElement(OrgNameHeader).doubleClick().build().perform();*/

        List<WebElement> elements = getDriver().findElements(By.xpath(Xpath));
        List<String> actual = elements.stream().map(WebElement::getText).collect(Collectors.toList());
        List<Integer> numData = actual.stream().map(Integer::parseInt).collect(Collectors.toList());

  /*      Iterator<WebElement> itr = elements.iterator();
        while(itr.hasNext()) {

            List<String> numData = new ArrayList<>();
            numData.add(itr.next().getText());

            System.out.println(itr.next().getText());
        }*/
       /* List<Integer> numData = new ArrayList<>();
        for(int i = 0; i<elements.size(); i++){
            String text=elements.get(i).getText();
            numData.set(i, Integer.parseInt(text));
        }*/

        // Print the list of Integer
        System.out.println("List of Integer: " + numData);

        List<Integer> expected = numData.stream().sorted().collect(Collectors.toList());
        System.out.println("Result    " + actual + "\n" + "expected    " + expected);
        Assert.assertEquals(actual, expected);


    }

    public void sortSrNoDescending(WebElement OrgNameHeader, String Xpath) {
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


    public void deleteItem(String xpath, WebElement btnYesDelete, WebElement successMsg, WebElement btnOk) {
        getDriver().findElement(By.xpath("//td[text()='" + xpath + "']/parent::*/child::td[4]/button")).click();
        clickOn(btnYesDelete);
        String actual = successMsg.getText();
        Assert.assertEquals(actual, DELETE_SUCCESS);
        clickOn(btnOk);
    }


    public void doPagination(@NotNull List<WebElement> orgNamesList, WebElement nextBtn, WebElement showEntriesCount) {

        List<String> listData = new ArrayList<>();
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

        Assert.assertEquals(maxEntries, String.valueOf(totalNames));

    }

}