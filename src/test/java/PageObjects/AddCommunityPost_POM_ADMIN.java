package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCommunityPost_POM_ADMIN 
{

	public WebDriver driver;
	public AddCommunityPost_POM_ADMIN(WebDriver driver1)
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
	WebElement BuildingMgnt_AC;
	
	@FindBy(xpath="//span[text()='Building, Chat Mgnt']")
	@CacheLookup
	WebElement BuildingChatMgnt_AC;
	
	@FindBy(xpath="//a[contains(text(),'Add Community Chat Post')]")
	@CacheLookup
	WebElement AddCommunityChatPost_AC;	
	
	@FindBy(xpath="//*[@title='- Select Community -']")
	@CacheLookup
	WebElement Community_AC;	
	
	@FindBy(xpath="(//*[text()='All'])[2]")
	@CacheLookup
	WebElement All_AC;
	
	@FindBy(name="topic")
	@CacheLookup
	WebElement Title_AC;
	
	@FindBy(xpath="/html/body")
	@CacheLookup
	WebElement Description_AC;
	
	@FindBy(name="location")
	@CacheLookup
	WebElement Location_AC;
	
	@FindBy(name="video_url")
	@CacheLookup
	WebElement Videourl_AC;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[5]/div/div/div/div/div/form/div[2]/div[3]/div[3]/div/div/label")
	@CacheLookup
	WebElement UploadImageorPDF_ACC;
	
	@FindBy(id="start_date")
	@CacheLookup
	WebElement StartDate_AC;
	
	@FindBy(xpath="//*[text()='15']")
	@CacheLookup
	WebElement SDate_AC;
	
	@FindBy(id="time")
	@CacheLookup
	WebElement StartTime_AC;
	
	
	@FindBy(id="end_date")
	@CacheLookup
	WebElement EndDate_AC;
	
	@FindBy(xpath="//td[text()='18']")
	@CacheLookup
	WebElement EDate_AC;
	
	@FindBy(name="end_time")
	@CacheLookup
	WebElement EndTime_AC;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Save_AC;
	
	
	
	
	
	
	
	
	
	
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

	public void clickBuildingMgnt_AC()
	{
		BuildingMgnt_AC.click();
	}
	
	public void clickBuildingChatMgnt_AC()
	{
		BuildingChatMgnt_AC.click();
	}
	
	public void clickAddCommunityChatPost_AC()
	{
		AddCommunityChatPost_AC.click();
	}
	
	public void clickCommunity_AC()
	{
		Community_AC.click();
		All_AC.click();
	}
	
	public void setTitle_AC(String string)
	{
		Title_AC.sendKeys(string);
	}
	
	
	public void setDescription_AC(String string)
	{
		driver.switchTo().frame(0);
		Description_AC.sendKeys(string);
		driver.switchTo().defaultContent();
	}
	
	
	public void setLocation_AC(String string)
	{
		Location_AC.sendKeys(string);
	}
	
	public void setVideourl_AC(String string)
	{
		Videourl_AC.sendKeys(string);
		driver.switchTo().defaultContent();
	}
	
	
	public void setUploadImageorPDF_ACC(String string)
	{
		UploadImageorPDF_ACC.sendKeys(string);
	}
	
	public void clickStartDate_AC() throws InterruptedException
	{
		StartDate_AC.click();
		Thread.sleep(2000);
		SDate_AC.click();
	}
	
	
	public void setStartTime_AC(String string)
	{
		StartTime_AC.sendKeys(string);
	}
	
	public void clickEndDate_AC() throws InterruptedException
	{
		EndDate_AC.click();
		Thread.sleep(2000);
		EDate_AC.click();
		Thread.sleep(2000);
	}
	
	
	public void setEndTime_AC(String string)
	{
		EndTime_AC.sendKeys(string);
	}
	
	
	public void clickSave_AC()
	{
		Save_AC.click();
	}
	
	
	
	
}
