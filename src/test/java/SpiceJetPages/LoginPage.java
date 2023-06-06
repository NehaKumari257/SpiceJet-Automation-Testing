package SpiceJetPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SpiceJetBaseClass.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//*[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath="(//input[contains(@class,'css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4')])[1]")
	WebElement mobno;
	
	@FindBy(xpath="(//input[contains(@class,'css-1cwyjr8 r-homxoj r-13awgt0 r-ubezar r-tmtnm0 r-oxtfae r-10paoce r-ymttw5 r-9qu9m4')])[2]")
	WebElement password;
	
	@FindBy(xpath="(//*[contains(@class,'r-1w50u8q r-ah5dr5 r-1otgn73')])[5]")
	WebElement FinalLogin;
	
	@FindBy(xpath="//*[contains(text(),'Please enter a valid mobile number')]")
	WebElement invalidMobno;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		//waitForElement(login);
		
		

}
	public void clickOnLogin() {
		
	  clickElement(login);
	}
	
	public void Login(String mobno, String password) throws Exception {
		
		this.mobno.sendKeys(mobno);	
		this.password.sendKeys(password);
		waitForElement(FinalLogin);
		clickElement(FinalLogin);
		Thread.sleep(5000);
	}
	
	public String invalidMobno() {
		String actual=invalidMobno.getText();
		return actual;
		
		
	}
	
	
	
	
	
	
	
}
