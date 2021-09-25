package in.balendin.schoolmanagment.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends PageObject {
    @FindBy(xpath = "//body/div[1]/nav[1]/ul[2]")
    private WebElement btnProfile;

    @FindBy(xpath = "//a[contains(text(),'LogOut')]")
    private WebElement btnLogout;


    public void logoutAsSuperAdmin() {
        clickOn(btnProfile);
        clickOn(btnLogout);
    }
}
