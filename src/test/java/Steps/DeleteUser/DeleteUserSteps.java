package Steps.DeleteUser;

import Pages.AdminPage;
import Pages.DeleteUserPage;
import Steps.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class DeleteUserSteps {
    WebDriver driver;
    AdminPage adminPage;
    DeleteUserPage deleteUserPage;
    int initialRecordCount;

    public DeleteUserSteps() {
        this.driver = Steps.Hooks.getDriver();
        adminPage = new AdminPage(driver);
        deleteUserPage = new DeleteUserPage(driver);
    }

    @Given("I am on the Admin page")
    public void i_am_on_the_admin_page() {
        adminPage.clickAdminTab();
    }

    @When("I search for the newly added user")
    public void i_search_for_the_newly_added_user() {
        initialRecordCount = Integer.parseInt(adminPage.getRecordCount());
        deleteUserPage.searchUser("TestUser123");
    }

    @When("I delete the user")
    public void i_delete_the_user() {
        deleteUserPage.clickDeleteButton();
        deleteUserPage.confirmDelete();
    }

    @Then("the number of records should decrease by 1")
    public void the_number_of_records_should_decrease_by_1() {
        int newRecordCount = Integer.parseInt(adminPage.getRecordCount());
        Assert.assertEquals("User record count did not decrease by 1", initialRecordCount - 1, newRecordCount);
    }
}
