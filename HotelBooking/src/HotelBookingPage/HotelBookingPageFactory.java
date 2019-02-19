package HotelBookingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageFactory {
	WebDriver driver;
	
	//Step1: Identify Elements
	@FindBy(name= "txtFN")
	@CacheLookup
	WebElement pffname;
	
	//Using How Class
	@FindBy(how= How.ID, using= "btnPayment")
	@CacheLookup
	WebElement pfbutton;
	
	@FindBy(xpath= "//*[@id='txtLastName']")
	@CacheLookup
	WebElement pflname;
	
	@FindBy(how= How.NAME, using= "Email")
	@CacheLookup
	WebElement pfemail;
	
	@FindBy(css= "input[pattern= '[789][0-9]{9}']")
	@CacheLookup
	WebElement pfmobile;
	
	@FindBy(how= How.NAME, using= "city")
	@CacheLookup
	WebElement pfcity;
	
	@FindBy(how= How.NAME, using= "state")
	@CacheLookup
	WebElement pfstate;
	
	@FindBy(how= How.NAME, using= "persons")
	@CacheLookup
	int pfpersons;
	
	@FindBy(xpath= "//*[@id='rooms']")
	@CacheLookup
	WebElement pfrooms;
	
	@FindBy(how= How.ID, using= "txtCardholderName")
	@CacheLookup
	WebElement pfcardholder;
	
	@FindBy(how= How.ID, using= "txtDebit")
	@CacheLookup
	WebElement pfdebit;
	
	@FindBy(name= "cvv")
	@CacheLookup
	WebElement pfcvv;
	
	@FindBy(id= "txtMonth")
	@CacheLookup
	WebElement pfmonth;
	
	@FindBy(id="txtYear")
	@CacheLookup
	WebElement pfyear;
	

	//Step2: Setters
	public void setPffname(String sfname) {
		pffname.sendKeys(sfname);
	}

	public void setPfbutton() {
		pfbutton.click();
	}

	public void setPflname(String slname) {
		pflname.sendKeys(slname);
	}

	public void setPfemail(String semail) {
		pfemail.sendKeys(semail);
	}

	public void setPfmobile(String smobile) {
		pfmobile.sendKeys(smobile);
	}

	public void setPfcity(String scity) {
		Select drpCity= new Select(pfcity);
		drpCity.selectByVisibleText(scity);
	}

	public void setPfstate(String sfstate) {
		new Select(pfstate).selectByVisibleText(sfstate);
	}

	public void setPfpersons(int arg1) {
		pfpersons= arg1;
	}

	public void setPfcardholder(String sfcardholder) {
		pfcardholder.sendKeys(sfcardholder);
	}

	public void setPfdebit(String sfdebit) {
		pfdebit.sendKeys(sfdebit);
	}

	public void setPfcvv(String sfcvv) {
		pfcvv.sendKeys(sfcvv);
	}

	public void setPfmonth(String sfmonth) {
		pfmonth.sendKeys(sfmonth);
	}

	public void setPfyear(String sfyear) {
		pfyear.sendKeys(sfyear);
	}

	//Step3: Getters
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPffname() {
		return pffname;
	}

	public WebElement getPfbutton() {
		return pfbutton;
	}

	public WebElement getPflname() {
		return pflname;
	}

	public WebElement getPfemail() {
		return pfemail;
	}

	public WebElement getPfmobile() {
		return pfmobile;
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public WebElement getPfstate() {
		return pfstate;
	}
	public int getPfpersons() {
		return pfpersons;
	}

	public WebElement getPfrooms() {
		return pfrooms;
	}

	public WebElement getPfcardholder() {
		return pfcardholder;
	}

	public WebElement getPfdebit() {
		return pfdebit;
	}

	public WebElement getPfcvv() {
		return pfcvv;
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public WebElement getPfyear() {
		return pfyear;
	}	
	//initiating Elements
	public HotelBookingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
