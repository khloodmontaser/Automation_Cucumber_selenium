package Pages;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage {
    BrowserActions browserActions;
    Assertion assertion;

    public AddUserPage(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }
    // Locators
    By AddButton = By.xpath("//button[text()=' Add ']");
    By UserRoleDropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div");
    By StatusDropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div");
    By EmployeeName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div");
    By UserName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
    By Password = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    By ConfirmPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
    By SaveButton = By.xpath("//button[text()=' Save ']");


    public void clickAddButton(){browserActions.click(AddButton);}
    public void selectUserRole(String role){
        browserActions.click(UserRoleDropdown);
        By option = By.xpath("//div[@role='listbox']//span[text()='" + role + "']");
        browserActions.click(option);
    }
    public void selectStatus(String status) {
        browserActions.click(StatusDropdown);
        By option = By.xpath("//div[@role='listbox']//span[text()='" + status + "']");
        browserActions.click(option);
    }
    public void enterEmployeeName(String name) {
        browserActions.type(EmployeeName, name);
    }

    public void enterUserName(String username) {
        browserActions.type(UserName, username);
    }

    public void enterPassword(String password) {
        browserActions.type(Password, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        browserActions.type(ConfirmPassword, confirmPassword);
    }

    public void clickSaveButton() {
        browserActions.click(SaveButton);
    }



}
