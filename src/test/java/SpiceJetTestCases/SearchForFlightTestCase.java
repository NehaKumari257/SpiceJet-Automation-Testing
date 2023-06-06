package SpiceJetTestCases;

import org.testng.annotations.Test;

import SpiceJetBaseClass.BaseClass;
import SpiceJetPages.LoginPage;
import SpiceJetPages.SearchForFlightPage;

public class SearchForFlightTestCase extends BaseClass{
	
	@Test
	public void tc004SearchFlightOneway() throws Exception {
		
		LoginPage lp=new LoginPage();
		lp.clickOnLogin();
		lp.Login("8340171009", "Nehakumari@123");
		Thread.sleep(5000);
		SearchForFlightPage fp=new SearchForFlightPage();
		fp.SelectOneway();
		
		
		
	}
	@Test
	public void tc005SearchFlightTwoway() throws Exception {
		LoginPage lp=new LoginPage();
		lp.clickOnLogin();
		lp.Login("8340171009", "Nehakumari@123");
		Thread.sleep(5000);
		SearchForFlightPage fp=new SearchForFlightPage();
		fp.selectTwoway();
		
	}


}
