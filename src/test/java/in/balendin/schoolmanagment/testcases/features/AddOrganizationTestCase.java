package in.balendin.schoolmanagment.testcases.features;
import in.balendin.schoolmanagment.steps.AddOrganizationSteps;
import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.testcases.basetest.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@Narrative(text = {"As a super admin,", "I want to be able to Create Organization"})
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTagValuesOf({"addOrganization", "regression"})

public class AddOrganizationTestCase extends BaseTestCase {

    @Steps
    LoginSteps loginSteps;
    @Steps
    AddOrganizationSteps organizationSteps;


    @Before
    public void setUp() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }

    @Test()
    @Title("verify super admin can create Organization Successfully")
    public void T1_addOrganization() {

        organizationSteps.navigateToOrganizationForm();
        organizationSteps.createOrganization();
        organizationSteps.verifyOrganizationCreate();

    }

    @Test
    @Title("verify super admin can create Organization Without Mandatory Fields")
    public void T2_addOrganizationWithoutMandatoryFields() {
        organizationSteps.navigateToOrganizationForm();
        organizationSteps.verifyOrganizationCreateWithoutMandatoryFields();

    }

    @Test
    @Title("verify Organization page Postal and contact number validations")
    public void T3_addOrganizationValidations() {
        organizationSteps.navigateToOrganizationForm();
        organizationSteps.verifyFields();

    }
}
