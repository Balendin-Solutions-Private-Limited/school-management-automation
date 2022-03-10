package in.balendin.schoolmanagment.steps;

import in.balendin.schoolmanagment.pages.NotificationsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Title;

public class NotificationsSteps {

    NotificationsPage notificationsPage;
    Boolean isEmail;
    Boolean isSMS;
    Boolean Daily, Weekly, Monthly;
    String[] Date  = {"1","4","3","1","6","11","22","8","6","9"};
    String[] Week  = {"Sunday","Tuesday","Thursday","Saturday","Monday","Wednesday","Friday"};
    String[] Month = {"December","February","June"};

    @Step("This step will Create Notification")
    public void createNotification() {
        notificationsPage.navigateToNotificationFormPage();
        notificationsPage.createNotification(isEmail = false, isSMS = true,Daily = true,Date, Weekly =true,Week, Monthly =true, Month);
    }

    @Step("This step will Update Notification")
    public void updateNotification() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.updateNotification();
    }
    @Step("This step will delete Notification")
    public void removeNotification() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.deleteNotification();
    }
    @Step("This step will search Notification by school name")
    public void searchNotificationBySchoolName() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.searchNotificationBySchoolName();
    }
    @Step("This step will search Notification by Daily Date")
    public void searchNotificationByDailyDate() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.searchNotificationByDailyDate();
    }
    @Step("This step will search Notification by Week Name")
    public void searchNotificationByWeekName() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.searchNotificationByWeekName();
    }
    @Step("This step will search Notification by Month Name")
    public void searchNotificationByMonthName() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.searchNotificationByMonthName();
    }
    @Step("This step will search Notification by Month Date")
    public void searchNotificationByMonthDate() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.searchNotificationByMonthDate();
    }
    @Step("This step will sort Notification by School Name column")
    public void sortNotificationBySchoolName() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortSchNameColumn();
    }
    @Step("This step will sort Notification by SMS Enabled column")
    public void sortNotificationBySMSEnabled() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortSMSEnabledColumn();
    }
    @Step("This step will sort Notification by Email Enabled column")
    public void sortNotificationByEmailEnabled() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortEmailEnabledColumn();
    }
    @Step("This step will sort Notification by Daily Date column")
    public void sortNotificationByDailyDateColumn() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortDailyDateColumn();
    }
    @Step("This step will sort Notification by Daily Time column")
    public void sortNotificationByDailyTimeColumn() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortDailyTimeColumn();
    }
    @Step("This step will sort Notification by Weekly  column")
    public void sortNotificationByWeeklyColumn() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortWeeklyColumn();
    }
    @Step("This step will sort Notification by Weekly Time column")
    public void sortNotificationByWeeklyTimeColumn() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortWeeklyTimeColumn();
    }
    @Step("This step will sort Notification by Monthly column")
    public void sortNotificationByMonthlyColumn() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortMonthlyColumn();
    }
    @Step("This step will sort Notification by Month Date column")
    public void sortNotificationByMonthDateColumn() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortMonthDateColumn();
    }
    @Step("This step will sort Notification by Month Time column")
    public void sortNotificationByMonthTimeColumn() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.sortMonthTimeColumn();
    }
    @Step("This step will verify Notification List Show entries functionality")
    public void verifyNotificationListShowEntriesFunctionality() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.verifyShowEntries(25);
    }
    @Step("This step will verify Notification List Show entries functionality")
    public void verifyNotificationListPaginationFunctionality() {
        notificationsPage.navigateToNotificationListPage();
        notificationsPage.verifyPagination();
    }
    @Step("This step will verify  Add Notification Page validations")
    public void verifyNotificationAddPageValidations() {
        notificationsPage.navigateToNotificationFormPage();
        notificationsPage.verifyPageValidations();
    }
}
