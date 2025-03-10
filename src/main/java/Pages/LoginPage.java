package Pages;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    BrowserActions browserActions;
    Assertion assertion;

    public LoginPage(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    //Locators
    By Name = By.name("username");
    By Password = By.name("password");
    By LoginButton = By.xpath("//button[@type = 'submit']");
    By DashboardHeader = By.xpath("//h6[text()='Dashboard']");

    //Actions
    public void navigateToUrl(String url){browserActions.navigateToURl(url);}
    public void enterUserName(String username){browserActions.type(Name, username);}
    public void enterPassword(String password) {
        browserActions.type(Password, password);
    }

    public void clickLogin() {
        browserActions.click(LoginButton);
    }

    public void verifyLoginSuccess() {
        assertion.assertElementIsDisplayed(DashboardHeader);
    }



}
