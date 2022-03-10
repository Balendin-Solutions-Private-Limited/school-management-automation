package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.RolePage;
import in.balendin.schoolmanagment.pages.StudentPage;
import net.thucydides.core.annotations.Step;

public class RoleSteps {

    RolePage rolePage;

    @Step("Admin is able to see navigate to role list")
    public void adminIsAbleToNavigateToRoleList(){
        rolePage.navigateToRoleList();
    }
    @Step("Admin is able to see navigate to role form")
    public void adminIsAbleToNavigateToAddRoleForm(){
        rolePage.navigateToAddRoleList();
    }
    @Step("Verify Admin is able to create search update delete role")
    public void adminIsAbleToCreateSearchUpdateDeleteRole(){
        rolePage.createSearchUpdateDeleteRole();
    }
    @Step("Verify admin is able to sort serial number")
    public void adminIsAbleToSortSerialNumber(){
        rolePage.sortRoleBySerialNumber();
    }

    @Step("Verify admin is able to sort role name")
    public void adminIsAbleToSortRoleName(){
        rolePage.sortRoleByRoleName();
    }
    @Step("Verify admin is able to sort role type")
    public void adminIsAbleToSortRoleType(){
        rolePage.sortRoleByRoleType();
    }
    @Step("Verify admin is able to sort school or organization")
    public void adminIsAbleToSortSchoolOrOrganization(){
        rolePage.sortRoleBySchoolOrOrganization();
    }
    @Step("Verify admin is able to sort assign to")
    public void adminIsAbleToSortAssignTo(){
        rolePage.sortRoleByAssignTo();
    }

    @Step("Verify admin is able to search role name list")
    public void adminIsAbleToSearchRoleName(){
        rolePage.searchRoleName();
    }
    @Step("Verify admin is able to search role type list")
    public void adminIsAbleToSearchRoleType(){
        rolePage.searchRoleType();
    }
    @Step("Verify admin is able to search school or organization list")
    public void adminIsAbleToSearchSchoolOrOrganization(){
       rolePage.searchSchoolOrOrganization();
    }
    @Step("Verify admin is able to search assign user list")
    public void adminIsAbleToSearchAssignUser(){
        rolePage.searchAssignToList();
    }
    @Step("Admin is able to do pagination in user list")
    public void adminIsAbleToDoPagination(){
        rolePage.doPaginationOnRolePage();
    }
    @Step("Verify admin is able to select  list Show Entries ")
    public void verifyRoleListShowEntryFunctionality() {
        rolePage.navigateToRoleList();
        rolePage.verifyShowEntries(1);
    }

    @Step("Verify admin is able to see validation message for mandatory field")
    public void verifyAdminIsAbleToSeeValidationMsgForMandatoryField(){
        rolePage.verifyValidationMessageForMandatoryFields();
    }
}
