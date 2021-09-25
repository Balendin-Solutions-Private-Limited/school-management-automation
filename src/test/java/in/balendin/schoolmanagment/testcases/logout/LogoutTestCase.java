package in.balendin.schoolmanagment.testcases.logout;

import com.ibm.icu.text.BidiTransform;
import in.balendin.schoolmanagment.pages.LoginPage;
import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.steps.LogoutSteps;
import in.balendin.schoolmanagment.testcases.basetest.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


@Narrative(text = {"As a super admin",
"I want to be able to be able to logout successfully to the application"})
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTagValuesOf({"logout","regression"})
public class LogoutTestCase extends BaseTestCase {



    @Steps
    LoginSteps loginSteps;

    @Steps
    LogoutSteps logoutSteps;


    @Before()
    public void loginAsSuperAdmin(){
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }

    @Test
    @Title("Verify super admin can logout successfully")
    public void logoutAsSuperAdmin(){
        logoutSteps.logoutAsSuperAdmin();
       logoutSteps.superAdminLogoutIsSuccessful();
    }
}
