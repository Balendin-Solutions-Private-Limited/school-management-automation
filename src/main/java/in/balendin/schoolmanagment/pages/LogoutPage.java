package in.balendin.schoolmanagment.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends PageObject {
//    @FindBy(className = "nav-link")
    @FindBy(xpath = "/html/body/div/nav/ul[2]/li")
    private WebElement btnProfile;

//   @FindBy(className = "dropdown-item")
   @FindBy(xpath = "/html/body/div/nav/ul[2]/li/div/a[2]")
    private WebElement btnLogout;


    public void logoutAsSuperAdmin(){
        clickOn(btnProfile);
        clickOn(btnLogout);

    }
}
