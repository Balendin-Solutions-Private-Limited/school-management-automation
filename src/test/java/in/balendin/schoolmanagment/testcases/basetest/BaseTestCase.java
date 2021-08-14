package in.balendin.schoolmanagment.testcases.basetest;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BaseTestCase {

    @Managed(uniqueSession = true)
    WebDriver driver;
}
