package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistation extends BasePage {
	WebDriver driver;
	//constructor
	
	public AccountRegistation(WebDriver driver)
	{
		super(driver);
		
	}

@FindBy(xpath="//input[@id='input-firstname']") 
WebElement txtFirstname;

@FindBy(xpath="//input[@id='input-lastname']") 
WebElement txtLasttname;

@FindBy(xpath="//input[@id='input-email']") 
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-telephone']") 
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']") 
WebElement txtPassword;

@FindBy(xpath="//input[@id='input-confirm']") 
WebElement txtCnfPassword;

@FindBy(xpath="//div[@id='content']//form") 
WebElement Subscribe;

@FindBy(xpath="//input[@type='checkbox']") 
WebElement Checkbox;

@FindBy(xpath="//input[@value='Continue']") 
WebElement btnContinue;

public void setFirstName(String fname) {
	txtFirstname.sendKeys(fname);

}

public void setLastName(String lname) {
	txtLasttname.sendKeys(lname);

}


public void setEmail(String email) {
	txtEmail.sendKeys(email);

}

public void setTelephone(String phone) {
	txtTelephone.sendKeys(phone);
	
}
public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}
public void setCnfPassword(String cnfpwd) {
	txtCnfPassword.sendKeys(cnfpwd);
}

public void subscribe1() {
	
	Subscribe.click();	
}
public void Checkbox1() {
	
	Checkbox.click();	
}

public void clickContinue() {
	
	btnContinue.click();	
}


}
