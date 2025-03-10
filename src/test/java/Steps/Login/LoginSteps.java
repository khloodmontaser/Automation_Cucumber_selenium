package Steps.Login;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import Config.Config;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps() {
        this.driver = Steps.Hooks.getDriver();

        loginPage = new LoginPage(driver);
    }

    @Given("navigate to login")
    public void user_is_on_the_login_page() {
        driver.get(Config.getProperty("URL"));
    }

    @When("I enter {string} as username")
    public void user_enters_username(String username) {
        loginPage.enterUserName(username);
    }

    @When("I enter {string} as password")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void user_clicks_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the dashboard")
    public void user_should_be_logged_in_successfully() {
      loginPage.verifyLoginSuccess();
    }
}
