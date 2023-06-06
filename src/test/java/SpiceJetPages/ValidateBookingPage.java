package SpiceJetPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SpiceJetBaseClass.BaseClass;

public class ValidateBookingPage extends BaseClass{
	
	@FindBy(xpath="//*[text()='check-in']")
	WebElement checkin;
	
	@FindBy(xpath="//*[text()='flight status']")
	WebElement flightStatus;
	
	@FindBy(xpath="//*[text()='manage booking']")
	WebElement manageBooking;
	
	public ValidateBookingPage() {
		PageFactory.initElements(driver,this );
		
	}
	
	public WebElement getcheckinButton() {
		return checkin;
	}
	
	public WebElement getFlightStatus() {
		return flightStatus;
	}
	
	
	public WebElement getManageBooking() {
		return manageBooking;
	}
	
	
	
	

}
