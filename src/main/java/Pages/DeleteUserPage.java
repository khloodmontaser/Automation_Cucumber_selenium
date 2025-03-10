package Pages;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteUserPage {
    BrowserActions browserActions;
    Assertion assertion;

    public DeleteUserPage(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    // Locators
    By SearchUserField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
    By SearchButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
    By UserCheckbox = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div/div[1]/div/label/span/i");
    By DeleteButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div/button[1]");
    By ConfirmDeleteButton = By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"); // Adjust based on actual button text

    // Actions
    public void searchUser(String username) {
        browserActions.type(SearchUserField, username);
        browserActions.click(SearchButton);
    }

    public void selectUser() {
        browserActions.click(UserCheckbox);
    }

    public void clickDeleteButton() {
        browserActions.click(DeleteButton);
    }

    public void confirmDelete() {
        browserActions.click(ConfirmDeleteButton);
    }


}
