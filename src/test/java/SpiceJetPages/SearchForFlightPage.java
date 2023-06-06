package SpiceJetPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SpiceJetBaseClass.BaseClass;

public class SearchForFlightPage extends BaseClass{
	@FindBy(xpath="//*[text()='From']")
	WebElement from_click;
	
	@FindBy(xpath="//*[text()='Delhi']")
	WebElement From;
	
	//@FindBy(xpath="//*[text()='To']")
	//WebElement To_click;
	
	@FindBy(xpath="//*[text()='Bengaluru']")
	WebElement To;
	
	@FindBy(xpath="(//*[text()='21'])[1]")
	WebElement select_date;
	
	@FindBy(xpath="(//*[text()='23'])[1]")
	WebElement return_date;
	
	//@FindBy(xpath="//*[text()='Students']")
	//WebElement select_student;
	
	@FindBy(xpath="//*[@data-testid='home-page-flight-cta']")
	WebElement searchFlight;
	
	@FindBy(xpath="//*[@data-testid='continue-search-page-cta']")
	WebElement continue_search;
	
	@FindBy(xpath="//*[text()='round trip']")
	WebElement roundTrip;
	
	//@FindBy(xpath="//*[text()='Departure Date']")
	//WebElement ClickOnDepDate;
	
	
	public SearchForFlightPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void SelectOneway() throws Exception {
		waitForElement(from_click);
		clickElement(from_click);
		clickElement(From);
		Thread.sleep(5000);
		//clickElement(To_click);
		
		clickElement(To);
		clickElement(select_date);
		//clickElement(select_student);
		waitForElement(searchFlight);
		clickElement(searchFlight);
		clickElement(continue_search);
		//clickElement(ClickOnDepDate);
	}
	public void selectTwoway() throws Exception {
		
		clickElement(roundTrip);
		waitForElement(from_click);
		clickElement(from_click);
		clickElement(From);
		Thread.sleep(5000);
		clickElement(To);
		clickElement(select_date);
		clickElement(return_date);
		waitForElement(searchFlight);
		clickElement(searchFlight);
		
		
		
	}
	

}

