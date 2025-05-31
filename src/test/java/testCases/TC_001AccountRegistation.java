package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistation;
import pageObjects.HomePage;

public class TC_001AccountRegistation extends BaseClass {
	
	@Test(groups={"Regression","Master"}) //step8 groups added
	public void actualtest() throws InterruptedException {
		
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistation ar=new AccountRegistation(driver);
	
		        ar.setFirstName(randomeString().toUpperCase());
		        ar.setLastName(randomeString().toUpperCase());
		        ar.setEmail(randomeString() + "@gmail.com");
		        ar.setTelephone(randomeNumber());
		        
		        String password=randomAlphaNumeric();
		        ar.setPassword(password);
		        ar.setCnfPassword(password);
		        ar.subscribe1();
		        ar.Checkbox1();

		        Thread.sleep(10000); // Avoid this in real automation, use explicit wait instead
		    }


}		
