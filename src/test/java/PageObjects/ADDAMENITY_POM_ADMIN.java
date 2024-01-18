package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADDAMENITY_POM_ADMIN
{

	public WebDriver driver;
	public ADDAMENITY_POM_ADMIN(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	

	@FindBy(name="username")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="//button[contains(@type,'submit')]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath="//button[@onclick='closeapppopup()']/..")
	@CacheLookup
	WebElement btnClose;

	@FindBy(xpath="//span[text()='Building Mgnt']")
	@CacheLookup
	WebElement BuildingMgnt_AM;
	
	@FindBy(xpath="//span[text()='Amenity']")
	@CacheLookup
	WebElement Amenity_AM;
	
	@FindBy(xpath="//a[text()=' Add Amenity ']")
	@CacheLookup
	WebElement AddAmenity_AM;
	
	@FindBy(id="assets_name")
	@CacheLookup
	WebElement AmenityName_AM;
	
	@FindBy(id="no_of_hours")
	@CacheLookup
	WebElement NoofMinutes_AM;
	
	@FindBy(name="break_time")
	@CacheLookup
	WebElement TimeInterval_AM;
	
	@FindBy(name="deposit")
	@CacheLookup
	WebElement AmenityDeposit_AM;
	
	@FindBy(name="max_members")
	@CacheLookup
	WebElement MaxmemberperAmenity_AM;
	
	@FindBy(name="max_members_unit")
	@CacheLookup
	WebElement MaxmemberperUnit_AM;
	
	@FindBy(name="check_in_time")
	@CacheLookup
	WebElement StartTime_AM;
	
	@FindBy(name="check_out_time")
	@CacheLookup
	WebElement EndTime_AM;
	
	@FindBy(name="amount")
	@CacheLookup
	WebElement WeekdaysAmount_AM;
	
	@FindBy(name="amount_weekend")
	@CacheLookup
	WebElement WeekendAmount_AM;
	
	@FindBy(name="lead_time")
	@CacheLookup
	WebElement LeadTime_AM;
	
	@FindBy(name="location")
	@CacheLookup
	WebElement Location_AM;
	
	
	@FindBy(xpath="//*[contains(text(),'Wifi')]")
	@CacheLookup
	WebElement Wifi_AM;
	
	
	@FindBy(name="asset_image[]")
	@CacheLookup
	WebElement AmenityImage_AM;
	
	
	@FindBy(xpath="/html/body")
	@CacheLookup
	WebElement Description_AM;
	
	@FindBy(xpath="/html/body")
	@CacheLookup
	WebElement TermsConditions_AM;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Save_AM;
	
	
	
	
	
	
	public void setUserName(String username)
	{
		txtEmail.clear();
		txtEmail.sendKeys(username);
	}

	public void setPassword(String password)
	{
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void clickLogin()
	{
		btnLogin.click();
	}

	public void clickClose()
	{
		btnClose.click();
	}

	public void clickBuildingMgnt_AMN()
	{
		BuildingMgnt_AM.click();
	}
	
	public void clickAmenity_AM()
	{
		Amenity_AM.click();
	}
	
	public void clickAddAmenity_AM()
	{
		AddAmenity_AM.click();
	}
	
	public void setAmenityName_AM(String string)
	{
		AmenityName_AM.sendKeys(string);
	}
	
	public void setNoofMinutes_AM(String string)
	{
		NoofMinutes_AM.sendKeys(string);
	}
	
	public void setTimeInterval_AM(String string)
	{
		TimeInterval_AM.sendKeys(string);
	}
	
	public void setAmenityDeposit_AM(String string)
	{
		AmenityDeposit_AM.sendKeys(string);
	}
	
	
	public void setMaxmemberperAmenity_AM(String string)
	{
		MaxmemberperAmenity_AM.sendKeys(string);
	}
	
	public void setMaxmemberperUnit_AM(String string)
	{
		MaxmemberperUnit_AM.sendKeys(string);
	}
	
	public void setStartTime_AM(String string)
	{
		StartTime_AM.sendKeys(string);
	}
	
	public void setEndTime_AM(String string)
	{
		EndTime_AM.sendKeys(string);
	}
	
	public void setWeekdaysAmount_AM(String string)
	{
		WeekdaysAmount_AM.sendKeys(string);
	}
	
	public void setWeekendAmount_AM(String string)
	{
		WeekendAmount_AM.sendKeys(string);
	}
	
	
	public void setLeadTime_AM(String string)
	{
		LeadTime_AM.sendKeys(string);
	}
	
	public void setLocation_AM(String string)
	{
		Location_AM.sendKeys(string);
	}
	
	
	public void clickWifi_AM()
	{
		Wifi_AM.click();
	}
	
	public void setAmenityImage_AM(String string)
	{
		AmenityImage_AM.sendKeys(string);
	}
	
	
	public void setDescription_AM(String string)
	{
		driver.switchTo().frame(0);
		Description_AM.sendKeys(string);
		driver.switchTo().defaultContent();
	}
	
	
	public void setTermsConditions_AM(String string)
	{
		driver.switchTo().frame(1);
		TermsConditions_AM.sendKeys(string);
		driver.switchTo().defaultContent();
	}
	
	
	public void clickSave_AM()
	{
		Save_AM.click();
	}
	
	
	
	
	
}
