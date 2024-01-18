package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document_POM_ADMIN 
{

	
	public WebDriver driver;
	public Document_POM_ADMIN(WebDriver driver1)
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
	
	@FindBy(xpath="//*[text()='Documents']")
	@CacheLookup
	WebElement Document_D;
	
	@FindBy(xpath="//*[contains(text(),'Upload Documents')]")
	@CacheLookup
	WebElement UploadDocuments;
	
	@FindBy(name="document_title")
	@CacheLookup
	WebElement DocumentTitle;
	
	
	@FindBy(name="document")
	@CacheLookup
	WebElement DocumentImage;
	
	@FindBy(name="expiry_date")
	@CacheLookup
	WebElement DocumentExpire;
	
	@FindBy(xpath="//*[text()='24']")
	@CacheLookup
	WebElement DocumentExpiryDate;
	
	@FindBy(name="description")
	@CacheLookup
	WebElement DocumentDescription;
	
	
	@FindBy(xpath="//*[text()='Select Display type']")
	@CacheLookup
	WebElement DisplayType;
	
	@FindBy(xpath="(//*[text()='OWNER'])[2]")
	@CacheLookup
	WebElement DocumentOwner;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement ADDDocument;
	
	
	
	
	
	
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

	public void clickDocument_D()
	{
		Document_D.click();
	}
	
	public void clickUploadDocuments()
	{
		UploadDocuments.click();
	}
	

	public void setDocumentTitle(String Text)
	{
		DocumentTitle.sendKeys(Text);
	}
	
	
	public void setDocumentImage(String image)
	{
		DocumentImage.sendKeys(image);
	}
	
	public void clickDocumentExpire()
	{
		DocumentExpire.click();
		DocumentExpiryDate.click();
	}

	public void setDocumentDescription(String Text)
	{
		DocumentDescription.sendKeys(Text);
	}
	
	public void clickDisplayType()
	{
		DisplayType.click();
		
		DocumentOwner.click();
	}
	
	
	public void clickADDDocument()
	{
		ADDDocument.click();
	}
	
	
	
	
	
}
