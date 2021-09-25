package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.serenitybdd.core.Serenity.getDriver;

public class LoginSteps {

    LoginPage loginPage;

    @Step("Login to application as super admin")
    public void loginAsSuperAdmin(){
        loginPage.loginAsSuperAdmin();
    }

    @Step("Navigate to application")
    public void navigateToApplication(){
      getDriver().manage().window().maximize();
        loginPage.open();
    }

    @Step("Verify super admin has logged in successfully")
    public void superAdminLoginIsSuccessful(){
        Assert.assertTrue(loginPage.getTitle().equals("Super Admin Dashboard"));
    }
}
