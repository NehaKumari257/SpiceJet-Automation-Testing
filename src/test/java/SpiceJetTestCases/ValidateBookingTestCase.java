package SpiceJetTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import SpiceJetBaseClass.BaseClass;
import SpiceJetPages.LoginPage;
import SpiceJetPages.ValidateBookingPage;

public class ValidateBookingTestCase extends BaseClass {
	
@Test
	
	public void validatecheckinButton() throws Exception {
	
	LoginPage lp=new LoginPage();
	lp.clickOnLogin();
	lp.Login("8340171009", "Nehakumari@123");
	Thread.sleep(5000);
	ValidateBookingPage vp = new ValidateBookingPage();

	 Assert.assertTrue(validateElement(vp.getcheckinButton()));
	}


	@Test
	
	public void validateFlightStatus() throws Exception {
	
	LoginPage lp=new LoginPage();
	lp.clickOnLogin();
	lp.Login("8340171009", "Nehakumari@123");
	Thread.sleep(5000);
	ValidateBookingPage vp = new ValidateBookingPage();
	
	 Assert.assertTrue(validateElement(vp.getFlightStatus()));
	}

    @Test
	
	public void validateManageBooking() throws Exception {
	
	LoginPage lp=new LoginPage();
	lp.clickOnLogin();
	lp.Login("8340171009", "Nehakumari@123");
	Thread.sleep(5000);
	ValidateBookingPage vp = new ValidateBookingPage();
	
	 Assert.assertTrue(validateElement(vp.getManageBooking()));
	}


}
