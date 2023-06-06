package SpiceJetBaseClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.utils;

public class BaseClass extends utils{
	
	@BeforeMethod
	public void start() throws Exception {
		
		browserLaunch(getpropvalue("browser"));
		launchUrl(getpropvalue("url"));
		driver.manage().window().maximize();
	    
	}
	
/*		
	@AfterMethod
	public void closeUp() {
		
		//Thread.sleep(7);
		driver.quit();

}

*/


		}
		
	


