package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.StudentPage;
import in.balendin.schoolmanagment.pages.UserPage;
import net.thucydides.core.annotations.Step;

public class UserSteps {
    UserPage userPage;
    StudentPage studentPage;

    boolean IsSchoolUser;

    @Step("Admin are able to navigate user list")
    public void adminIsAbleToNavigateToUserList(){
        userPage.navigateToUserList();
    }

    @Step("Admin is able to select random school in add user form")
    public void adminIsAbleToSelectRandomSchoolOnAddUserForm(){
    userPage.selectRandomSchoolInForm();
    }

    @Step("Admin is able to select random organization in add user form")
    public void adminIsAbleToSelectRandomOrganizationOnAddUserForm(){
        userPage.selectRandomOrganizationInForm();
    }

    @Step("Admin is able to create school user with mandatory fields")
    public void adminIsAbleToCreateSchoolUserWithMandatoryFiled(){
        userPage.createUserWithMandatoryFields(IsSchoolUser = true);
    }

    @Step("Admin is able to create organization user with mandatory fields")
    public void adminIsAbleToCreateOrganizationUserWithMandatoryFiled(){
        userPage.createUserWithMandatoryFields(IsSchoolUser = false);
    }

    @Step("Admin is able to create school user with non mandatory fields")
    public void adminIsAbleToCreateSchoolUserWithNonMandatoryFiled(){
        userPage.createUserWithNonMandatoryFields(IsSchoolUser = true);
    }

    @Step("Admin is able to create organization user with non mandatory fields")
    public void adminIsAbleToCreateOrganizationUserWithNonMandatoryFiled(){
        userPage.createUserWithNonMandatoryFields(IsSchoolUser = false);
    }

    @Step("Admin is able to create update search and delete school user")
    public void adminIsAbleToCreateUpdateDeleteSchoolUser(){
        userPage.createUpdateSearchDeleteUser(IsSchoolUser = true);
    }

    @Step("Admin is able to create update search and delete Organization user")
    public void adminIsAbleToCreateUpdateDeleteOrganizationUser(){
        userPage.createUpdateSearchDeleteUser(IsSchoolUser = false);
    }

    @Step("Admin is able to sort serial number in ascending and descending order")
    public void adminIsAbleToSortSerialNumber(){
        userPage.navigateToUserList();
        userPage.sortUserBySerialNumber();
    }
    @Step("Admin is able to sort name in ascending and descending order")
    public void adminIsAbleToSortName(){
        userPage.navigateToUserList();
       userPage.sortUserByName();
    }

    @Step("Admin is ale to sort username in ascending and descending order")
    public void adminIsAbleToSortUsername(){
        userPage.navigateToUserList();
        userPage.sortUserByUsername();
    }

    @Step("Admin is ale to sort email in ascending and descending order")
    public void adminIsAbleToSortEmail(){
        userPage.navigateToUserList();
        userPage.sortUserByEmail();
    }

    @Step("Admin is ale to sort school/organization in ascending and descending order")
    public void adminIsAbleToSortSchoolOrOrganization(){
        userPage.navigateToUserList();
        userPage.sortUserBySchoolOrOrganization();
    }

    @Step("Admin is ale to sort contact number in ascending and descending order")
    public void adminIsAbleToSortContactNumber(){
        userPage.navigateToUserList();
       userPage.sortUserByContactNumber();
    }

    @Step("Admin is ale to sort role profile in ascending and descending order")
    public void adminIsAbleToSortRoleProfile(){
        userPage.navigateToUserList();

       userPage.sortUserByRoleProfile();
    }

    @Step("Admin is able to search user by name in user list")
    public void adminIsAbleToSearchUserByName(){
        studentPage.select100Entries();
        userPage.searchUserByName();
    }

    @Step("Admin is able to search user by username in user list")
    public void adminIsAbleToSearchUserByUsername(){
        studentPage.select100Entries();
        userPage.searchUserByUserName();
    }

    @Step("Admin is able to search user by email in user list")
    public void adminIsAbleToSearchUserByEmail(){
        studentPage.select100Entries();
        userPage.searchUserByEmail();
    }

    @Step("Admin is able to search user by school or organization  in user list")
    public void adminIsAbleToSearchUserBySchoolOrOrganization(){
        studentPage.select100Entries();
        userPage.searchUserBySchoolOrOrganization();
    }

    @Step("Admin is able to search user by contact number in user list")
    public void adminIsAbleToSearchUserByContactNumber(){
        studentPage.select100Entries();
        userPage.searchUserByContactNumber();
    }
    @Step("Admin is able to search user by role profile in user list")
    public void adminIsAbleToSearchUserByRoleProfile(){
        studentPage.select100Entries();
        userPage.searchUserByRoleProfile();
    }
    @Step("Admin is able to do pagination in user list")
    public void adminIsAbleToDoPagination(){
        studentPage.select100Entries();
        userPage.doPaginationOnUserPage();
    }
    @Step("Verify admin is able to select  list Show Entries ")
    public void verifyUserListShowEntryFunctionality() {
        userPage.navigateToUserList();
        userPage.verifyShowEntries(1);
    }


    @Step("Verify validation messages for mandatory fields for school and organization user")
    public void validationMessageForMandatoryFieldsForOrganizationOrSchoolUser(){
        userPage.verifyValidationMessageForMandatoryFields();
    }

    @Step("Verify admin is able to see validation message all form fields")
    public void adminIsAbleToSeeAllFieldFormValidation(){
        userPage.verifyValidationMessageForForm();
    }
}
