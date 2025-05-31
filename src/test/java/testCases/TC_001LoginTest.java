package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC_001LoginTest extends BaseClass{


	@Test(groups={"Sanity","Regression"})
	public void actualtest()  {
		

		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		

		LoginPage al=new LoginPage(driver);
		al.setEmail(p.getProperty("email"));
		al.setPassword(p.getProperty("password"));
		al.Login1();
		
	}

}
