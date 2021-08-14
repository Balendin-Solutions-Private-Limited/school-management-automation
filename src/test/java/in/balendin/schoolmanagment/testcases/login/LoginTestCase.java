package in.balendin.schoolmanagment.testcases.login;

import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.testcases.basetest.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@Narrative(text = {"As a super admin,",
        "I want to be able to be able to login successfully to the application"})
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTagValuesOf({"login","regression"})
public class LoginTestCase extends BaseTestCase {

    @Steps
    LoginSteps loginSteps;

    @Before
    public void setUp(){
        loginSteps.navigateToApplication();
    }

    @Test
    @Title("Verify super admin can login successfully")
    public void loginAsSuperAdmin(){
        loginSteps.loginAsSuperAdmin();
    }
}
