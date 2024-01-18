package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEnrollManually_POM_ADMIN 
{

	public WebDriver driver;
	public AddEnrollManually_POM_ADMIN (WebDriver driver1)
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
	WebElement BuildingMgnt_E;
	
	@FindBy(xpath="//span[text()='Classes']")
	@CacheLookup
	WebElement Classes_E;
	
	@FindBy(xpath="//a[contains(text(),'Add Enroll Manually')]")
	@CacheLookup
	WebElement AddEnrollManually_E;
	
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	@CacheLookup
	WebElement Class_E;
	
	@FindBy(xpath="(//span[text()='Demo'])[3]")
	@CacheLookup
	WebElement Cricket_E;
	
	
	@FindBy(xpath="(//*[@role='button'])[3]")
	@CacheLookup
	WebElement User_E;
	
	@FindBy(xpath="(//*[text()='Belinda Potgieter'])[2]")
	@CacheLookup
	WebElement BelindaPotgieter_E;
	
	
	@FindBy(xpath="//*[text()=' Test ']")
	@CacheLookup
	WebElement SelectYourPackage_E;
	
	@FindBy(xpath="//*[text()=' Sunday 08 Oct 2023 ']")
	@CacheLookup
	WebElement SelectYourSchedule_E;
	
	@FindBy(id="id_unit")
	@CacheLookup
	WebElement UnitNumber_E;
	
	@FindBy(xpath="//*[text()='GATE Test Unit 1']")
	@CacheLookup
	WebElement GATETestUnit_E;
	
	@FindBy(id="applicant_name0")
	@CacheLookup
	WebElement ApplicantName_E;
	
	@FindBy(id="applicant_age0")
	@CacheLookup
	WebElement ApplicantAge_E;
	
	
	@FindBy(xpath="//*[@for='tnc_assest']")
	@CacheLookup
	WebElement TermsandConditions_E;
	
	@FindBy(id="submit")
	@CacheLookup
	WebElement AddEnrollMent_E;
	
	
	
	
	
	
	
	
	
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

	public void clickBuildingMgnt_E()
	{
		BuildingMgnt_E.click();
	}
	
	public void clickClasses_E()
	{
		Classes_E.click();
	}
	
	public void clickAddEnrollManually_E()
	{
		AddEnrollManually_E.click();
	}
	
	
	public void clickClass_E()
	{
		Class_E.click();
	}
	
	public void clickCricket_E()
	{
		Cricket_E.click();
	}
	
	public void clickUser_E()
	{
		User_E.click();
	}
	
	
	public void clickBelindaPotgieter_E()
	{
		BelindaPotgieter_E.click();
	}
	
	public void clickSelectYourPackage_E()
	{
		SelectYourPackage_E.click();
	}
	
	public void clickSelectYourSchedule_E()
	{
		SelectYourSchedule_E.click();
	}
	
	public void clickUnitNumber_E() throws InterruptedException
	{
		UnitNumber_E.click();
		Thread.sleep(2000);
		GATETestUnit_E.click();
	}
	
	
	public void setApplicantName_E(String string)
	{
		ApplicantName_E.sendKeys(string);
	}
	
	public void setApplicantAge_E(String string)
	{
		ApplicantAge_E.sendKeys(string);
	}
	
	
	public void clickTermsandConditions_E()
	{
		TermsandConditions_E.click();
	}
	
	public void clickAddEnrollMent_E()
	{
		AddEnrollMent_E.click();
	}
	
	
	
	
}
