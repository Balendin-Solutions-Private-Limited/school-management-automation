package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.LoginPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getDriver;

public class LoginSteps  {

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

    @Step("Verify superadmin has logged in successfully")
    public void superadminLoginIsSuccessful(){
        Assert.assertTrue(loginPage.getTitle().equals("Super Admin Dashboard"));
    }
}
