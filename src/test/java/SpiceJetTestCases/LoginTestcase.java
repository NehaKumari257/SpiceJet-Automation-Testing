package SpiceJetTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import SpiceJetBaseClass.BaseClass;
import SpiceJetPages.LoginPage;

public class LoginTestcase extends BaseClass {
	
	@Test
	public void tc002Login() throws Exception {
		
		LoginPage lp=new LoginPage();
		lp.clickOnLogin();
		lp.Login("8340171009", "Nehakumari@123");
		Thread.sleep(5000);
		Assert.assertEquals("SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets",driver.getTitle());	
	}
	@Test
	public void tc003invalidMobno() throws Exception {
		LoginPage lp=new LoginPage();
		lp.Login("1111117188", "Nehakumari@123");
		Assert.assertEquals("Please enter a valid mobile number",lp.invalidMobno());
		
	}
	
   
}
