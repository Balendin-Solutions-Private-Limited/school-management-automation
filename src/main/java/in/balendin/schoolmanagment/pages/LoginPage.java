package in.balendin.schoolmanagment.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(name = "Username")
    private WebElement txtUsername;

    @FindBy(name = "Password")
    private WebElement txtPassword;

    @FindBy(xpath = "//input[@value='Sign In']")
    private WebElement btnSignIn;

    public void login(String username, String password){
        typeInto(txtUsername, username);
        typeInto(txtPassword, password);
        clickOn(btnSignIn);
    }

    public void loginAsSuperAdmin(){
        login("sadmin", "pwd@1234");
    }
}
