package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ADDRENTAL_POM_ADMIN 
{

	public WebDriver driver;
	public ADDRENTAL_POM_ADMIN(WebDriver driver1)
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

	
	
	@FindBy(xpath="//*[text()='Building Mgnt']")
	@CacheLookup
	WebElement BuildingMgnt_R;
	
	@FindBy(xpath="//span[text()='Classes']")
	@CacheLookup
	WebElement Classes_R;
	
	@FindBy(xpath="//a[contains(text(),'Add Rental')]")
	@CacheLookup
	WebElement AddRental_R;
	
	@FindBy(id="program_name")
	@CacheLookup
	WebElement Title_R;
	
	@FindBy(id="image")
	@CacheLookup
	WebElement ImageFlyer_R;
	
	
	@FindBy(id="fees")
	@CacheLookup
	WebElement Perweekfees_R;
	
	
	@FindBy(xpath="(//*[@class='cke_editable cke_editable_themed cke_contents_ltr'])[1]")
	@CacheLookup
	WebElement Description_R;
	
	@FindBy(xpath="/html/body/p")
	@CacheLookup
	WebElement TermsConditions_R;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement ADD_R;
	
	
	
	
	
	
	
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

	public void clickBuildingMgnt_R()
	{
		BuildingMgnt_R.click();
	}
	
	public void clickClasses_R()
	{
		Classes_R.click();
	}
	
	public void clickAddRental_R()
	{
		AddRental_R.click();
	}
	
	public void setTitle_R(String string)
	{
		Title_R.sendKeys(string);
	}
	
	public void setImageFlyer_R(String string)
	{
		ImageFlyer_R.sendKeys(string);
	}
	
	public void setPerweekfees_R(String string)
	{
		Perweekfees_R.sendKeys(string);
	}
	
	public void setDescription_R(String string)
	{
		driver.switchTo().frame(0);
		Description_R.sendKeys(string);
		driver.switchTo().defaultContent();
	}
	
	public void setTermsConditions_R(String string)
	{
		driver.switchTo().frame(1);
		TermsConditions_R.sendKeys(string);
		driver.switchTo().defaultContent();
	}
	
	public void clickADD_R()
	{
		ADD_R.click();
	}
	
	
	
}
