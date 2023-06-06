package SpiceJetTestCases;

import org.testng.annotations.Test;

import SpiceJetBaseClass.BaseClass;
import SpiceJetPages.SignupPage;

public class SignupTestCase extends BaseClass{
	
	@Test
	public void tc001Signup() throws Exception {
		SignupPage sp=new SignupPage();
		sp.Signup("Mrs","Neha","Kumari","8743945696","royneha257@gmail.com","Nehakumari@123", "Nehakumari@123");
		Thread.sleep(3000);
	}
	


}
