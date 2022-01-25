package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.LoginPage;
import in.balendin.schoolmanagment.pages.LogoutPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LogoutSteps {

    LogoutPage logoutPage;

    @Step("Logout to application as super admin")
    public void logoutAsSuperAdmin(){
        logoutPage.logoutAsSuperAdmin();
    }
    @Step("Verify super admin has logout successful")
            public void superAdminLogoutIsSuccessful(){
            Assert.assertTrue(logoutPage.getTitle().equals("MPower Payment Admin | Log in"));
        }

}
