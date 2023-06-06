package SpiceJetPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import SpiceJetBaseClass.BaseClass;

public class FlightBookingPage extends BaseClass{
	
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	WebElement SelectTown;
	
	@FindBy(xpath="//*[contains(text(),'WhatsApp or e-mail.')]")
	WebElement ClickCheckbox; 
	
	@FindBy(xpath="//*[contains(text(),'I am flying as the primary passenger')]")
	WebElement ClickOnPrimary;
	
	@FindBy(xpath="//*[@data-testid='traveller-info-continue-cta']")
	WebElement continueButton;
	
	@FindBy(xpath="//*[@id='at_addon_close_icon']")
	WebElement closepopup;
	@FindBy(xpath="(//*[text()='Mrs'])[1]")
	WebElement titleSel;
	@FindBy(xpath="//*[@data-testid='first-inputbox-contact-details']")
	WebElement fname;
	@FindBy(xpath="//*[@data-testid='last-inputbox-contact-details']")
	WebElement lname;
	
	@FindBy(xpath="//*[@data-testid='contact-number-input-box']")
	WebElement cNo;
	@FindBy(xpath="//*[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement email;
	@FindBy(xpath="(//*[text()='Mrs'])[2]")
	WebElement titleSel1;
	@FindBy(xpath="//*[@data-testid='traveller-0-first-traveller-info-input-box']")
	WebElement fname1;
	@FindBy(xpath="//*[@data-testid='traveller-0-last-traveller-info-input-box']")
	WebElement lname1;
	@FindBy(xpath="//*[@data-testid='sc-member-mobile-number-input-box']")
	WebElement cNo1;
	
	@FindBy(xpath="//*[text()='Price Summary']")
	WebElement clicksummary;
	@FindBy(xpath="(//div[text()='Continue'])[3]")
	WebElement conti_nue;
	
	@FindBy(xpath="(//span[text()='Skip this to skip comfort.'])[1]")
	WebElement skipPopup;
	
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement cnoframe;
	
	@FindBy(xpath="//input[@id='card_number']")
	WebElement cardno;
	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement cnameframe;
	
	@FindBy(xpath="//input[@placeholder='Cardholder Name']")
	WebElement nameOnCard;
	
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement cexpframe;
	
	@FindBy(xpath="//input[@id='card_exp_month']")
	WebElement card_exp_month;
	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement cexpyearframe;
	
	@FindBy(xpath="//input[@id='card_exp_year']")
	WebElement card_exp_year;
	
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement cvvframe;
	
	@FindBy(xpath="//input[@id='security_code']")
	WebElement security_code;
	
	@FindBy(xpath="(//*[text()='Proceed to pay'])[3]")
	WebElement pay;
	
    public FlightBookingPage() {
	  PageFactory.initElements(driver, this);
	
     }
    
    public void contactDetails(String FirstName,String lastName, String Mobno, String emailid,String Town,String fname,String lname,String mobNo, String cardno, String nameOnCard, String card_exp_month, String card_exp_year, String security_code) throws Exception {
    	//clickElement(titleSel);
    	//this.titleSel.sendKeys(title);
    	this.fname.sendKeys(FirstName);
    	this.lname.sendKeys(lastName);
    	this.cNo.sendKeys(Mobno);
    	this.email.sendKeys(emailid);
    	//waitForElement(SelectTown);
    	this.SelectTown.sendKeys(Town);
    	this.fname1.sendKeys(fname);
    	this.lname1.sendKeys(lname);
    	this.cNo1.sendKeys(mobNo);
    	clickElement(ClickCheckbox);
    	clickElement(ClickOnPrimary);
    	clickElement(continueButton);
         //waitForElement(closepopup);
    	clickElement(clicksummary);
    	
    	
        //js.executeScript("arguments[0].scrollIntoView(true);",conti_nue );
    	
    	//waitForElement(closepopup);
    	//clickElement(closepopup);
    	//JavascriptExecutor jse = (JavascriptExecutor)driver;
    	//jse.executeScript("window.scrollBy(0,2000)");
       // driver.switchTo().alert().dismiss();
    	//JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("arguments[0].click();",closepopup);
    	//waitForElement(conti_nue);
    	Thread.sleep(5000);
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();",conti_nue);
    	//clickElement(conti_nue);
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].click();",skipPopup);
    	//clickElement(skipPopup);
    	
        	waitForElement(cnoframe);
        	driver.switchTo().frame(cnoframe);
        	this.cardno.sendKeys(cardno);
        	driver.switchTo().defaultContent();
    	
    	
    	//JavascriptExecutor js1 = (JavascriptExecutor)driver;
    	//js1.executeScript("arguments[0].click();",nameOnCard);
    	
    	
    		waitForElement(cnameframe);
        	driver.switchTo().frame(cnameframe);
        	this.nameOnCard.sendKeys(nameOnCard);
        	driver.switchTo().defaultContent();
    	
        	//JavascriptExecutor js2 = (JavascriptExecutor)driver;
        	//js2.executeScript("arguments[0].scrollIntoView(true);",card_exp_month );
    	waitForElement(cexpframe);
    	driver.switchTo().frame(cexpframe);
    	this.card_exp_month.sendKeys(card_exp_month);
    	driver.switchTo().defaultContent();
    	
    	
    	waitForElement(cexpyearframe);
    	driver.switchTo().frame(cexpyearframe);
    	this.card_exp_year.sendKeys(card_exp_year);
    	driver.switchTo().defaultContent();
    	
    	waitForElement(cvvframe);
    	driver.switchTo().frame(cvvframe);
    	this.security_code.sendKeys(security_code);
    	driver.switchTo().defaultContent();
    	
    	waitForElement(pay);
    	clickElement(pay);
    	
    	
    	
    }
    
    
    }
