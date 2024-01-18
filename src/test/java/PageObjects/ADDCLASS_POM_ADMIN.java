package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADDCLASS_POM_ADMIN 
{

	
	public WebDriver driver;
	public ADDCLASS_POM_ADMIN(WebDriver driver1)
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
	WebElement BuildingMgnt_A;
	
	@FindBy(xpath="//span[text()='Classes']")
	@CacheLookup
	WebElement Classes_A;
	
	@FindBy(xpath="//a[contains(text(),'Add Class')]")
	@CacheLookup
	WebElement AddClass_A;
	
	@FindBy(id="program_name")
	@CacheLookup
	WebElement ClassTitle_A;
	
	@FindBy(id="serviceProvider")
	@CacheLookup
	WebElement ServiceProvider_A;
	
	@FindBy(id="serviceProviderEmail")
	@CacheLookup
	WebElement ServiceProviderEmail_A;
	
	@FindBy(id="image")
	@CacheLookup
	WebElement WebsiteImages_A;
	
	@FindBy(id="mob_image")
	@CacheLookup
	WebElement MobileImages_A;
	
	@FindBy(id="venue")
	@CacheLookup
	WebElement Location_A;
	
	
	@FindBy(id="start_date")
	@CacheLookup
	WebElement StartDate_A;
	
	
	@FindBy(xpath="//td[text()='20']")
	@CacheLookup
	WebElement SDate_A;
	
	
	@FindBy(id="end_date")
	@CacheLookup
	WebElement EndDate_A;
	
	
	@FindBy(xpath="//td[text()='24']")
	@CacheLookup
	WebElement EDate_A;
	
	
	@FindBy(id="no_application")
	@CacheLookup
	WebElement MaxNoofApplication_A;
	
	
	@FindBy(xpath="(//*[@class='cke_editable cke_editable_themed cke_contents_ltr'])[1]")
	@CacheLookup
	WebElement Description_A;

	
	@FindBy(xpath="/html/body/p")
	@CacheLookup
	WebElement TermsConditions_A;
	
	@FindBy(id="package")
	@CacheLookup
	WebElement PackageTitle_A;
	
	@FindBy(id="fees")
	@CacheLookup
	WebElement Fees_A;
	
	@FindBy(id="age_range")
	@CacheLookup
	WebElement AgeRange_A;
	
	@FindBy(xpath="//*[@id=\"start_time\"]")
	@CacheLookup
	WebElement FTime_Ad;
	
	@FindBy(xpath="//*[@id=\"end_time\"]")
	@CacheLookup
	WebElement STime_Ad;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Submit_A;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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

	public void clickBuildingMgnt_A()
	{
		BuildingMgnt_A.click();
	}
	
	public void clickClasses_A()
	{
		Classes_A.click();
	}
	
	public void clickAddClass_A()
	{
		AddClass_A.click();
	}
	
	public void setClassTitle_A(String string)
	{
		ClassTitle_A.sendKeys(string);
	}
	
	public void setServiceProvider_A(String string)
	{
		ServiceProvider_A.sendKeys(string);
	}
	
	public void setServiceProviderEmail_A(String string)
	{
		ServiceProviderEmail_A.sendKeys(string);
	}
	
	public void setWebsiteImages_A(String string)
	{
		WebsiteImages_A.sendKeys(string);
	}
	
	public void setMobileImages_A(String string) throws InterruptedException, AWTException
	{
		MobileImages_A.sendKeys(string);
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
	public void setLocation_A(String string)
	{
		Location_A.sendKeys(string);
	}
	
	public void clickStartDate_A()
	{
		StartDate_A.click();
	}
	
	public void clickSDate_A()
	{
		SDate_A.click();
	}
	
	public void clickEndDate_A()
	{
		EndDate_A.click();
	}
	
	public void clickEDate_A()
	{
		EDate_A.click();
	}
	
	public void setMaxNoofApplication_A(String string)
	{
		MaxNoofApplication_A.sendKeys(string);
	}
	
	public void setDescription_A(String string)
	{
		driver.switchTo().frame(0);
		Description_A.sendKeys(string);
		driver.switchTo().defaultContent();
		
	}
	
	public void setTermsConditions_A(String string)
	{
		driver.switchTo().frame(1);
		TermsConditions_A.sendKeys(string);
		driver.switchTo().defaultContent();
	}
	
	public void setPackageTitle_A(String string)
	{
		PackageTitle_A.sendKeys(string);
	}
		
	public void setFees_A(String string)
	{
		Fees_A.sendKeys(string);
	}
	
	public void setAgeRange_A(String string)
	{
		AgeRange_A.sendKeys(string);
	}
	
	public void setFTime_Ad(String string)
	{
		FTime_Ad.sendKeys(string);
	}
	
	public void setSTime_Ad(String string)
	{
		STime_Ad.sendKeys(string);
	}
	
	public void clickSubmit_A()
	{
		Submit_A.click();
	}
	
}
