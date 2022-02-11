package in.balendin.schoolmanagment.testcases.user;


import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.steps.UserSteps;
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

public class UserTestCase extends BaseTestCase {
    @Steps
    LoginSteps loginSteps;

    @Steps
    UserSteps userSteps;

    @Before
    public void loginAsSuperAdmin() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }

    @Test
    @Title("Verify admin is able to navigate user list")
    public void verifyAdminIsAbleToNavigateUserList(){
        userSteps.adminIsAbleToNavigateToUserList();
    }

    @Test
    @Title("Verify admin is able to create school user with mandatory fields ")
    public void verifyAdminIsAbleToCreateSchoolUserWithMandatoryField(){
        userSteps.adminIsAbleToCreateSchoolUserWithMandatoryFiled();
    }

    @Test
    @Title("Verify admin is able to create organization user with mandatory fields ")
    public void verifyAdminIsAbleToCreateOrganizationUserWithMandatoryField(){
        userSteps.adminIsAbleToCreateOrganizationUserWithMandatoryFiled();
    }

    @Test
    @Title("Verify admin is able to create school user with non mandatory fields ")
    public void verifyAdminIsAbleToCreateSchoolUserWithNonMandatoryField(){
        userSteps.adminIsAbleToCreateSchoolUserWithNonMandatoryFiled();
    }

    @Test
    @Title("Verify admin is able to create  organization user with non mandatory fields ")
    public void verifyAdminIsAbleToCreateOrganizationUserWithNonMandatoryField(){
        userSteps.adminIsAbleToCreateOrganizationUserWithNonMandatoryFiled();
    }

    @Test
    @Title("Verify admin is able to create update search and delete school user")
    public void verifyAdminIsAbleToCreateUpdateSearchDeleteSchoolUser(){
        userSteps.adminIsAbleToCreateUpdateDeleteSchoolUser();
    }

    @Test
    @Title("Verify admin is able to create update search and delete Organization user")
    public void verifyAdminIsAbleToCreateUpdateSearchDeleteOrganizationUser(){
        userSteps.adminIsAbleToCreateUpdateDeleteOrganizationUser();
    }

    @Test
    @Title("Verify admin is able to sort serial number in ascending and descending order")
    public void VerifyAdminIsAbleToSortSerialNumber(){
        userSteps.adminIsAbleToSortSerialNumber();
    }

    @Test
    @Title("Verify admin is able to sort name in ascending and descending order")
    public void VerifyAdminIsAbleToSortName(){
        userSteps.adminIsAbleToSortName();
    }

    @Test
    @Title("Verify admin is able to sort username in ascending and descending order")
    public void VerifyAdminIsAbleToSortUsername(){
        userSteps.adminIsAbleToSortName();
    }

    @Test
    @Title("Verify admin is able to sort email in ascending and descending order")
    public void VerifyAdminIsAbleToSortEmail(){
        userSteps.adminIsAbleToSortEmail();
    }

    @Test
    @Title("Verify admin is able to sort school or organization in ascending and descending order")
    public void VerifyAdminIsAbleToSortSchoolOrOrganization(){
        userSteps.adminIsAbleToSortSchoolOrOrganization();
    }
    @Test
    @Title("Verify admin is able to sort contact number in ascending and descending order")
    public void VerifyAdminIsAbleToSortContactNumber(){
       userSteps.adminIsAbleToSortContactNumber();}
    @Test
    @Title("Verify admin is able to sort role profile in ascending and descending order")
    public void VerifyAdminIsAbleToSortRoleProfile(){
        userSteps.adminIsAbleToSortContactNumber();
    }

    @Test
    @Title("Verify admin is able to search user by name")
    public void verifyAdminIsAbleToSearchUserByName(){
        userSteps.adminIsAbleToSearchUserByName();
    }
    @Test
    @Title("Verify admin is able to search user by username")
    public void verifyAdminIsAbleToSearchUserByUsername(){
        userSteps.adminIsAbleToSearchUserByUsername();
    }
    @Test
    @Title("Verify admin is able to search user by email")
    public void verifyAdminIsAbleToSearchUserByEmail(){
        userSteps.adminIsAbleToSearchUserByEmail();
    }
    @Test
    @Title("Verify admin is able to search user by school or organization")
    public void verifyAdminIsAbleToSearchUserBySchoolOrOrganization(){
        userSteps.adminIsAbleToSearchUserBySchoolOrOrganization();
    }
    @Test
    @Title("Verify admin is able to search user by contact number")
    public void verifyAdminIsAbleToSearchUserByContactNumber(){
        userSteps.adminIsAbleToSearchUserByContactNumber();
    }

    @Test
    @Title("Verify admin is able to search user by role profile")
    public void verifyAdminIsAbleToSearchUserByRoleProfile(){
        userSteps.adminIsAbleToSearchUserByRoleProfile();
    }

    @Test
    @Title("Verify admin is able to do pagination")
    public void verifyAdminIsAbleToDoPagination(){
        userSteps.adminIsAbleToDoPagination();
    }

    @Test
    @Title("Verify Admin functionality student Show Entry count")
    public void verifyUserListShowEntryFunctionality() {
        userSteps.verifyUserListShowEntryFunctionality();
    }

    @Test
    @Title("Verify Admin is able to see validation message for mandatory filed while creating school and organization user")
    public void verifyValidationMessageForSchoolAndOrganizationUser(){
        userSteps.validationMessageForMandatoryFieldsForOrganizationOrSchoolUser();
    }

    @Test
    @Title("Verify Admin is able to see validation message for all fields in the user form")
    public void verifyValidationMessageForAllFieldsInTheUserForm(){
        userSteps.adminIsAbleToSeeAllFieldFormValidation();
    }

}
