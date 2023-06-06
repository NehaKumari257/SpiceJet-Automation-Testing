package SpiceJetTestCases;

import org.testng.annotations.Test;

import SpiceJetBaseClass.BaseClass;
import SpiceJetPages.FlightBookingPage;
import SpiceJetPages.LoginPage;
import SpiceJetPages.SearchForFlightPage;

public class FlightBookingTestcases extends BaseClass{
	@Test
	public void tc006FlightBooking() throws Exception {
		
		SearchForFlightPage ff=new SearchForFlightPage();
		ff.SelectOneway();
		FlightBookingPage fb=new FlightBookingPage();
		fb.contactDetails("Neha","Kumari","8743945696","nhkumari163@gmail.com","Delhi","Neha","Kumari","8743945696","1234567890123456","NehaKumari","09","2025","123");
		
		
	}

}
