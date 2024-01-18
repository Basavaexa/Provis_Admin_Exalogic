package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailTemplate_POM_ADMIN 
{
	
	public WebDriver driver;
	public EmailTemplate_POM_ADMIN(WebDriver driver1)
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
	
	@FindBy(xpath="//span[text()='Template']")
	@CacheLookup
	WebElement Template;
	
	@FindBy(xpath="//span[text()='Email Template']")
	@CacheLookup
	WebElement EmailTemplate;
	
	@FindBy(xpath="//*[text()=' Add Email Template']")
	@CacheLookup
	WebElement AddEmailTemplate;
	
	@FindBy(name="template_name")
	@CacheLookup
	WebElement TemplateName;
	
	@FindBy(name="subject")
	@CacheLookup
	WebElement subject_E;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[5]/div/div/div/div/div/form/div[2]/div/div/div/div[3]/div/div/div[3]/div[2]/p")
	@CacheLookup
	WebElement EmailMessage_E;
	
	
	@FindBy(name="sms_message")
	@CacheLookup
	WebElement SMSMessage;
	
	@FindBy(name="notification_message")
	@CacheLookup
	WebElement NotificationMessage;
	
	@FindBy(xpath="(//*[text()='select category'])[2]")
	@CacheLookup
	WebElement select_category;
	
	@FindBy(xpath="(//*[text()='Financial'])[2]")
	@CacheLookup
	WebElement Financial;
	
	@FindBy(name="wall_message")
	@CacheLookup
	WebElement DiscussionWall;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Submit_E;
	

	
	
	
	
	
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

	public void clickTemplate()
	{
		Template.click();
	}
	
	public void clickEmailTemplate()
	{
		EmailTemplate.click();
	}
	
	public void clickAddEmailTemplate()
	{
		AddEmailTemplate.click();
	}
	
	public void setTemplateName(String Text)
	{
		TemplateName.sendKeys(Text);
	}
	
	public void setsubject_E(String Text)
	{
		subject_E.sendKeys(Text);
	}
	
	
	public void setEmailMessage_E(String Text)
	{
		EmailMessage_E.sendKeys(Text);
	}
	
	
	public void setSMSMessage(String Text)
	{
		SMSMessage.sendKeys(Text);
	}
	
	public void setNotificationMessage(String Text)
	{
		NotificationMessage.sendKeys(Text);
	}
	
	public void clickselect_category()
	{
		select_category.click();
		Financial.click();
	}
	
	public void setDiscussionWall(String Text)
	{
		DiscussionWall.sendKeys(Text);
	}
	
	public void clickSubmit_E()
	{
		Submit_E.click();
	}
	
	
	
	
}
