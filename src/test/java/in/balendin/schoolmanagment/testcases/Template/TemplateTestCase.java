package in.balendin.schoolmanagment.testcases.Template;

import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.steps.TemplateSteps;
import in.balendin.schoolmanagment.testcases.basetest.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTagValuesOf("Template")

public class TemplateTestCase extends BaseTestCase {
    @Steps
    LoginSteps loginSteps;

    @Steps
    TemplateSteps templateSteps;

    @Before
    public void loginAsSuperAdmin() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }
    @Test
    @Title("Admin is able to navigate template list")
    public void adminIsAbleToNavigateTemplateList(){
        templateSteps.adminIsAbleToNavigateToTemplateList();
    }
    @Test
    @Title("Admin is able to navigate add template form")
    public void adminIsAbleToNavigateAddTemplateForm(){
        templateSteps.adminIsAbleToNavigateToAddTemplateForm();
    }

    @Test
    @Title("Admin is able to create search update delete template for school")
    public void adminIsAbleToCreateTemplateForSchool(){
        templateSteps.adminIsAbleToCreateTemplateForSchool();
    }
    @Test
    @Title("Admin is able to create search update delete template for organization")
    public void adminIsAbleToCreateTemplateForOrganization(){
        templateSteps.adminIsAbleToCreateTemplateForOrganization();
    }

    @Test
    @Title("Admin is able to sort serial number")
    public void adminIsAbleToSortSerialNumber(){
        templateSteps.sortSerialNumber();
    }
    @Test
    @Title("Admin is able to sort template name")
    public void adminIsAbleToSortTemplateName(){
        templateSteps.sortTemplateName();
    }
    @Test
    @Title("Admin is able to sort template file")
    public void adminIsAbleToSortTemplateFile(){
        templateSteps.sortTemplateFile();
    }
    @Test
    @Title("Admin is able to sort school or organization")
    public void adminIsAbleToSortSchoolOrOrganization(){
        templateSteps.sortTemplateSchoolOrOrganization();
    }

    @Test
    @Title("Admin is able to search template name")
    public void adminIsAbleToSearchTemplateName(){
        templateSteps.searchTemplatesName();
    }

    @Test
    @Title("Admin is able to search template file")
    public void adminIsAbleToSearchTemplateFile(){
        templateSteps.searchTemplateFile();
    }

    @Test
    @Title("Admin is able to search template by school  or organization")
    public void adminIsAbleToSearchTemplateBySchoolOrOrganization(){
        templateSteps.searchTemplateBySchoolOrOrganization();
    }

    @Test
    @Title("Admin is able to do the pagination on the template page")
    public void adminIsAbleToDoPaginationOnTemplatePage(){
        templateSteps.adminIsAbleDoPagination();
    }
    @Test
    @Title("Verify Admin functionality template Show Entry count")
    public void verifyTemplateListShowEntryFunctionality() {
        templateSteps.verifyTemplateListListShowEntryFunctionality();
    }

    @Test
    @Title("Verify admin is able to see validation message for mandatory fields")
    public void adminIsAbleToSeeValidationMsgForMandatoryFields(){
        templateSteps.verifyAdminIsAbleToSeeValidationMsg();
    }
}
