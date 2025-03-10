package Steps.AddUser;

import Pages.AddUserPage;
import Pages.AdminPage;
import Steps.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class AddUserSteps {
    WebDriver driver;
    AdminPage adminPage;
    AddUserPage addUserPage;
    int initialRecordCount = 0;

    public AddUserSteps() {
        this.driver = Steps.Hooks.getDriver();
        adminPage = new AdminPage(driver);
        addUserPage = new AddUserPage(driver);
    }

    @Given("I am on the Admin page")
    public void i_am_on_the_admin_page() {
        adminPage.clickAdminTab();
    }

    @When("I get the current number of records")
    public void i_get_the_current_number_of_records() {
        initialRecordCount = Integer.parseInt(adminPage.getRecordCount());
    }

    @When("I click on the add button")
    public void i_click_on_the_add_button() {
        addUserPage.clickAddButton();
    }

    @When("I fill in the required user details")
    public void i_fill_in_the_required_user_details() {
        addUserPage.selectUserRole("Admin");
        addUserPage.enterEmployeeName("Joy  Smith");
        addUserPage.enterUserName("TestUser123");
        addUserPage.enterPassword("Test@1234");
        addUserPage.enterConfirmPassword("Test@1234");
    }

    @When("I click on the save button")
    public void i_click_on_the_save_button() {
        addUserPage.clickSaveButton();
    }

    @Then("the number of records should increase by 1")
    public void the_number_of_records_should_increase_by_1() {
        int newRecordCount = Integer.parseInt(adminPage.getRecordCount());
        Assert.assertEquals("User record count did not increase by 1", initialRecordCount + 1, newRecordCount);
    }
}
