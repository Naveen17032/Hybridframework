package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//a[@title='My Account']//i") 
WebElement clcMyaccount;

@FindBy(xpath="//body//nav[@id='top']//li//li[1]//a[1]") 
WebElement clcRegister;

@FindBy(linkText="Login")
WebElement clcLogin;

//@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
//WebElement clcSearch;




public void clickMyAccount()
{
	clcMyaccount.click();
}

public void clickRegister()
{
	clcRegister.click();
}
public void clickLogin()
{
	clcLogin.click();
}

//public void clickSearch()
//{
//	clcSearch.click();
//}

}
