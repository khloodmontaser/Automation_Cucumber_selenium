package Pages;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    BrowserActions browserActions;
    Assertion assertion;

    public AdminPage(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }
    // Locators
    private By adminTab = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
    private By recordCount = By.xpath("//span[contains(text(),'Records Found')]"); //mash mazboot

    // Actions
    public void clickAdminTab() {
        browserActions.click(adminTab);
    }

    public String getRecordCount() {
        return browserActions.getText(recordCount);
    }

}
