package in.balendin.schoolmanagment.testcases.processingfee;

import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.steps.ProcessingFeeSteps;
import in.balendin.schoolmanagment.testcases.basetest.BaseTestCase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTagValuesOf;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@Narrative(text = {"As a super admin,", "I want to be able to Create ProcessingFee"})
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTagValuesOf({"Create ProcessingFee", "regression"})

public class ProcessingFeeTestCase extends BaseTestCase {

    @Steps
    LoginSteps loginSteps;
    @Steps
    ProcessingFeeSteps feeSteps;

    @Before
    public void setUp() {
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }

    @Test()
    @Title("verify admin can create processing fee Successfully")
    public void createProcessingFeeAndVerifyColumnsData() {
        feeSteps.CreateProcessingFee();
    }

    @Test()
    @Title("verify admin Update Processing Fee")
    public void verifyProcessingUpdate() {
        feeSteps.verifyProcessingFeeEdit();
    }

    @Test()
    @Title("verify admin Delete Processing Fee")
    public void verifyDeleteProcessingFee() {
        feeSteps.verifyDeleteProcessingFee();
    }
    @Test()
    @Title("verify existing Processing Fee School Name displayed in the Select school dropdown in Add Processing Fee Page")
    public void verifyExistingSchoolNameDisplayedInSelectSchoolDropdown() {
        feeSteps.verifyExistingSchoolNameDisplayedInSelectSchoolDropdown();
    }
}
