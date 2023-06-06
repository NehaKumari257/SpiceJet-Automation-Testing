package SpiceJetPages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import SpiceJetBaseClass.BaseClass;

public class SignupPage extends BaseClass {
	
	@FindBy(xpath="//*[contains(text(),'Signup')]")
	WebElement signup;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement selTitle;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastName;
	
	//@FindBy(xpath="//select[@class='form-control form-select']")
	//WebElement selCountry;
	
	//@FindBy(xpath="//input[@id='dobDate']")
	//WebElement dob;
	@FindBy(xpath="//*[@class='d-inline-block datepicker']")
	WebElement click_calender;
	
	@FindBy(xpath="//input[@placeholder='+91 01234 56789']")
	WebElement Mobno;
	
	@FindBy(xpath="//*[@id='email_id']")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement pswd;
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confirmPswd;
	
	@FindBy(xpath="//input[@id='defaultCheck1']")
	WebElement Checkbox;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement Submit;
	
	///(//*[text()='4'])[1]
	
	
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
		
     
		clickElement(signup);
		  Set<String> handles=driver.getWindowHandles(); //parentid,childid,subchildid
		  
			Iterator it=handles.iterator();

			String parentid=(String) it.next();

			String childid=(String) it.next();
			
			driver.switchTo().window(childid);
		
	}
	
	public void Signup(String title, String FirstName,String lastName, String Mobno, String emailid, String pswd, String confirmPswd ) {
		
	//	this.title.sendKeys(title);
		

		clickElement(click_calender);
		Select sel=new Select(selTitle);
		sel.selectByVisibleText(title);
		this.firstName.sendKeys(FirstName);
		this.lastName.sendKeys(lastName);
		//this.country.sendKeys(country);
		//Select se=new Select(selCountry);
		//se.selectByValue(country);
		//waitForElement(click_calender);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", click_calender);
	
    	//jse.executeScript("window.scrollBy(0,8000)");

		clickElement(click_calender);
		
		WebElement tool = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select opt= new Select(tool);
		opt.selectByVisibleText("September");
		WebElement tool_1 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select op= new Select(tool_1);
		op.selectByVisibleText("1993");
		
      List<WebElement> d = driver.findElements(By.xpath("//div[(@class='react-datepicker__day react-datepicker__day--006')]"));
		for (int i = 0; i<d.size(); i++) {
			//check expected data
			String s = d.get(i).getText();
			if (s.equals("6")) {
				clickElement(d.get(i));
				break;
			}
		}
		
		//this.dob.sendKeys(dob);
		this.Mobno.sendKeys(Mobno);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollIntoView();", click_calender);
	
    	js.executeScript("window.scrollBy(0,9500)");
		this.emailid.sendKeys(emailid);
		
		this.pswd.sendKeys(pswd);
		this.confirmPswd.sendKeys(confirmPswd);
		waitForElement(Checkbox);
		clickElement(Checkbox);
		clickElement(Submit);
		
		
	}
	

}
