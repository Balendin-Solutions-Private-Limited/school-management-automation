package in.balendin.schoolmanagment.testcases.notifications;

import in.balendin.schoolmanagment.steps.LoginSteps;
import in.balendin.schoolmanagment.steps.NotificationsSteps;
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

@Narrative(text = {"As a super admin I want to be able to be able Manage Notifications"})
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WithTagValuesOf({"Notification","regression"})

public class NotificationsTestCase extends BaseTestCase {

    @Steps
    LoginSteps loginSteps;
    @Steps
    NotificationsSteps notificationsSteps;

    @Before()
    public void loginAsSuperAdmin(){
        loginSteps.navigateToApplication();
        loginSteps.loginAsSuperAdmin();
    }
    @Test
    @Title("Verify admin can create Notification")
    public void createNotification(){
        notificationsSteps.createNotification();
    }
    @Test
    @Title("Verify admin can update Notification")
    public void updateNotification(){
        notificationsSteps.updateNotification();
    }
    @Test
    @Title("Verify admin can delete Notification")
    public void removeNotification(){
        notificationsSteps.removeNotification();
    }
    @Test
    @Title("Verify admin can search Notification by school name")
    public void searchNotificationBySchoolName(){
        notificationsSteps.searchNotificationBySchoolName();
    }
    @Test
    @Title("Verify admin can search Notification by Daily Date")
    public void searchNotificationByDailyDate(){
        notificationsSteps.searchNotificationByDailyDate();
    }
    @Test
    @Title("Verify admin can search Notification by Week Name")
    public void searchNotificationByWeekName(){
        notificationsSteps.searchNotificationByWeekName();
    }
    @Test
    @Title("Verify admin can search Notification by Month Name")
    public void searchNotificationByMonthName(){
        notificationsSteps.searchNotificationByMonthName();
    }
    @Test
    @Title("Verify admin can search Notification by Month Date")
    public void searchNotificationByMonthDate(){
        notificationsSteps.searchNotificationByMonthDate();
    }
    @Test
    @Title("Verify admin can sort Notification by School Name column")
    public void sortNotificationBySchNameColumn(){
        notificationsSteps.sortNotificationBySchoolName();
    }
    @Test
    @Title("Verify admin can sort Notification by SMS Enabled column")
    public void sortNotificationBySMSEnabledColumn(){
        notificationsSteps.sortNotificationBySMSEnabled();
    }
    @Test
    @Title("Verify admin can sort Notification by Email Enabled column")
    public void sortNotificationByEmailEnabledColumn(){
        notificationsSteps.sortNotificationByEmailEnabled();
    }
    @Test
    @Title("Verify admin can sort Notification by Daily Date column")
    public void sortNotificationByDailyDateColumn(){
        notificationsSteps.sortNotificationByDailyDateColumn();
    }
    @Test
    @Title("Verify admin can sort Notification by Daily Time column")
    public void sortNotificationByDailyTimeColumn(){
        notificationsSteps.sortNotificationByDailyTimeColumn();
    }
    @Test
    @Title("Verify admin can sort Notification by Weekly column")
    public void sortNotificationByWeeklyColumn(){
        notificationsSteps.sortNotificationByWeeklyColumn();
    }
    @Test
    @Title("Verify admin can sort Notification by Weekly Time column")
    public void sortNotificationByWeeklyTimeColumn(){
        notificationsSteps.sortNotificationByWeeklyTimeColumn();
    }
    @Test
    @Title("Verify admin can sort Notification by Monthly column")
    public void sortNotificationByMonthlyColumn(){
        notificationsSteps.sortNotificationByMonthlyColumn();
    }
    @Test
    @Title("Verify admin can sort Notification by Month Date column")
    public void sortNotificationByMonthDateColumn(){
        notificationsSteps.sortNotificationByMonthDateColumn();
    }
    @Test
    @Title("Verify admin can sort Notification by Month Time column")
    public void sortNotificationByMonthTimeColumn(){
        notificationsSteps.sortNotificationByMonthTimeColumn();
    }
    @Test
    @Title("Verify admin Notification list show entries functionality")
    public void verifyNotificationListShowEntriesFunctionality(){
        notificationsSteps.verifyNotificationListShowEntriesFunctionality();
    }
    @Test
    @Title("Verify admin Notification Pagination functionality")
    public void verifyNotificationListPaginationFunctionality(){
        notificationsSteps.verifyNotificationListPaginationFunctionality();
    }
    @Test
    @Title("Verify admin Add Notification Page validations")
    public void verifyNotificationAddPageValidations(){
        notificationsSteps.verifyNotificationAddPageValidations();
    }





}
