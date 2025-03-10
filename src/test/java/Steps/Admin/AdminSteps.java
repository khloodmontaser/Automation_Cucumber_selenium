package Steps.Admin;

import Pages.AdminPage;
import Pages.LoginPage;
import io.cucumber.java.en.*;
import Config.Config;
import org.openqa.selenium.WebDriver;

public class AdminSteps {
    private WebDriver driver;

    LoginPage loginPage;
    AdminPage adminPage;

    public AdminSteps() {
        this.driver = Steps.Hooks.getDriver();

        loginPage = new LoginPage(driver);
        adminPage = new AdminPage(driver);
    }

    @Given("I am logged into the OrangeHRM system")
    public void i_am_logged_into_orangehrm() {
        driver.get(Config.getProperty("URL"));
        loginPage.enterUserName(Config.getProperty("USERNAME"));
        loginPage.enterPassword(Config.getProperty("PASSWORD"));
        loginPage.clickLogin();
    }

    @When("I click on the Admin tab")
    public void i_click_on_admin_tab() {
        adminPage.clickAdminTab();
    }

    @Then("I should see the number of records displayed")
    public void i_should_see_the_number_of_records() {
        String recordText = adminPage.getRecordCount();
        String recordNumber = recordText.replaceAll("[^0-9]", ""); // Extract only digits
        System.out.println("Number of records displayed: " + recordNumber);
    }
}
