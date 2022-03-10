package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.StudentPage;
import in.balendin.schoolmanagment.pages.TemplatePage;
import net.thucydides.core.annotations.Step;

public class TemplateSteps {
    TemplatePage templatePage;
    StudentPage studentPage;
    boolean IsSchool;

    @Step("Admin is able to see navigate to template list")
    public void adminIsAbleToNavigateToTemplateList(){
        templatePage.navigateToTemplateList();
    }

    @Step("Admin is able to see navigate to Add template form")
    public void adminIsAbleToNavigateToAddTemplateForm(){
        templatePage.navigateToAddTemplateListForm();
    }
    @Step("Admin is able to create template for school")
    public void adminIsAbleToCreateTemplateForSchool(){
        templatePage.templatesForSchoolOrOrganization(IsSchool = true);
    }

    @Step("Admin is able to create template for organization")
    public void adminIsAbleToCreateTemplateForOrganization(){
        templatePage.templatesForSchoolOrOrganization(IsSchool = false);
    }

    @Step("Admin is able to sort serial number")
    public void sortSerialNumber(){
        templatePage.navigateToTemplateList();
        templatePage.sortTemplateBySerialNumber();
    }

    @Step("Admin is able to sort template name")
    public void sortTemplateName(){
        templatePage.navigateToTemplateList();
        templatePage.sortTemplateByName();
    }

    @Step("Admin is able to sort template file")
    public void sortTemplateFile(){
        templatePage.navigateToTemplateList();
        templatePage.sortTemplateByFile();
    }
    @Step("Admin is able to sort school or organization")
    public void sortTemplateSchoolOrOrganization(){
        templatePage.navigateToTemplateList();
        templatePage.sortTemplateBySchoolOrOrganization();
    }
    @Step("Admin is able to search template by template name")
    public void searchTemplatesName(){
        templatePage.searchTemplateByName();
    }

    @Step("Admin is able to search template by template file")
    public void searchTemplateFile(){
        templatePage.searchTemplateByFile();
    }
    @Step("Admin is able to search template by school or organization ")
    public void searchTemplateBySchoolOrOrganization(){
        templatePage.searchTemplateBySchoolOrOrganization();
    }

    @Step("Admin is able to do pagination on the template page")
    public void adminIsAbleDoPagination(){
        templatePage.doPagination();
    }
    @Step("Verify admin is able to select  list Show Entries ")
    public void verifyTemplateListListShowEntryFunctionality() {
        templatePage.verifyShowEntries(1);
    }
    @Step("Verify admin is able to see validation message on the template form")
    public void verifyAdminIsAbleToSeeValidationMsg(){
        templatePage.verifyValidationMessageOnTemplateForm();
    }
}
