package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.UserPage;
import net.thucydides.core.annotations.Step;

public class UserSteps {
    UserPage userPage;

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
        userPage.searchUserByName();
    }
}
