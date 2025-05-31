package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement txtSearch;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    WebElement clcSearch;

    public void setSearch(String search) {
        txtSearch.sendKeys(search);
    }

    public void clickSearch() {
        clcSearch.click();
    }
}
