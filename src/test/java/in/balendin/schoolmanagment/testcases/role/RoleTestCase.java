package in.balendin.schoolmanagment.testcases.role;

import in.balendin.schoolmanagment.pages.RolePage;
import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.steps.RoleSteps;
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
@WithTagValuesOf("User")

public class RoleTestCase extends BaseTestCase {
    @Steps
    LoginSteps loginSteps;

    @Steps
    RoleSteps roleSteps;

    @Steps
    RolePage rolePage;

    @Before
    public void loginAsSuperAdmin() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }
    @Test
    @Title("Admin is able to navigate role list")
    public void adminIsAbleToNavigateRoleList(){
        roleSteps.adminIsAbleToNavigateToRoleList();

    }

    @Test
    @Title("Admin is able to navigate add role form ")
    public void adminIsAbleToNavigateAddRoleForm(){
        roleSteps.adminIsAbleToNavigateToAddRoleForm();
    }

    @Test
    @Title("Admin is able to create Role")
    public void adminIsAbleToCreateRole(){
        roleSteps.adminIsAbleToCreateSearchUpdateDeleteRole();
    }

    @Test
    @Title("Admin is able to sort serial number ")
    public void adminIsAbleToSortSerialNumber(){
        roleSteps.adminIsAbleToSortSerialNumber();
    }

    @Test
    @Title("Admin is able to sort role name ")
    public void adminIsAbleToSortRoleName(){
        roleSteps.adminIsAbleToSortRoleName();
    }
    @Test
    @Title("Admin is able to sort role type")
    public void adminIsAbleToSortRoleType(){
        roleSteps.adminIsAbleToSortRoleType();
    }
    @Test
    @Title("Admin is able to sort school or organization")
    public void adminIsAbleToSortSchoolOrOrganization(){
        roleSteps.adminIsAbleToSortSchoolOrOrganization();
    }
    @Test
    @Title("Admin is able to sort assign to")
    public void adminIsAbleToSortAssignTo(){
        roleSteps.adminIsAbleToSortAssignTo();
    }

    @Test
    @Title("Admin is able to search role name")
    public void adminIsAbleToSearchRoleName(){
     roleSteps.adminIsAbleToSearchRoleName();
    }

    @Test
    @Title("Admin is able to search role type")
    public void adminIsAbleToSearchRoleType(){
        roleSteps.adminIsAbleToSearchRoleType();
    }
    @Test
    @Title("Admin is able to search school or organization")
    public void adminIsAbleToSearchSchoolOrOrganization(){
        roleSteps.adminIsAbleToSearchSchoolOrOrganization();
    }

    @Test
    @Title("Admin is able to search assign user list")
    public void adminIsAbleToSearchAssignUserList(){
        roleSteps.adminIsAbleToSearchAssignUser();
    }
    @Test
    @Title("Verify admin is able to do pagination")
    public void verifyAdminIsAbleToDoPagination(){
        roleSteps.adminIsAbleToDoPagination();
    }

    @Test
    @Title("Verify Admin functionality role Show Entry count")
    public void verifyRoleListShowEntryFunctionality() {
        roleSteps.verifyRoleListShowEntryFunctionality();
    }
    @Test
    @Title("Verify Admin is able to see validation message for mandatory fields")
    public void verifyValidationMessageForMandatoryFiled() {
        roleSteps.verifyAdminIsAbleToSeeValidationMsgForMandatoryField();
    }
}
