package in.balendin.schoolmanagment.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentPage extends PageObject {
    @FindBy(xpath = "(//a[@class='nav-link'])[12]")
    private WebElement studentTab;

    @FindBy(xpath = "//a[@href='/Student']")
    private WebElement importStudent;

//    @FindBy(xpath = "SchoolId")
//    private WebElementFacade schoolDropdown;
//
//    @FindBy(css = "#SchoolId >option")
//    private WebElement schoolNames;


    public void navigateToStudentList(){
        clickOn(studentTab);
        clickOn(importStudent);
        String Title = getTitle();
        System.out.println("Page Title : " + Title);
        Assert.assertTrue(Title.contains("Student List"));
    }
    public void selectSchool(){
        WebElement schoolDropdown = getDriver().findElement(By.id("SchoolId"));
        Select school = new Select(schoolDropdown);

        int ddlCount = getDriver().findElements(By.cssSelector("#SchoolId >option")).size();
        System.out.println("Count" + ddlCount);

        Random random = new Random();
        int index = random.nextInt(ddlCount);
        school.selectByIndex(index);
    }

    public void select100Entries(){

    }

    public void searchStudentsByAdmissionNumber(){
      int paginationSize = getDriver().findElements(By.cssSelector("#studentList_paginate>ul>li>a")).size();
        System.out.println(paginationSize);

      List<String> names= new ArrayList<String>();

      for(int i =1;i<= paginationSize;i++){

          String paginationSelector = "#studentList_paginate>ul>li>a:nth-child("+i+")";
          getDriver().findElements(By.cssSelector("paginationSelector"));
          List<WebElement> namesElement = getDriver().findElements(By.cssSelector("#studentList_paginate>ul>li>a:nth-child(1)"));

          for (WebElement ignored : namesElement){
                names.add(ignored.getText());
          }

        }
        for (String name: names) {
            System.out.println(names);
        }
        int totalNames = names.size();
        System.out.println("Total Number of Names:  " + totalNames);

        String displayedCount = getDriver().findElement(By.id("studentList_info")).getText().split(" ")[5];
        System.out.println("Total Number of Names displayedCount:  " + displayedCount);
    }
}

