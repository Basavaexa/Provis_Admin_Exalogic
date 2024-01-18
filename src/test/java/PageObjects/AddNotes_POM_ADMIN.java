package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNotes_POM_ADMIN 
{

	
	public WebDriver driver;
	public AddNotes_POM_ADMIN(WebDriver driver1)
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
	
	@FindBy(xpath="//span[text()='Notes']")
	@CacheLookup
	WebElement Notes;
	
	@FindBy(xpath="//span[contains(text(),'Add Note')]")
	@CacheLookup
	WebElement AddNotes;
	
	
	@FindBy(id="title")
	@CacheLookup
	WebElement Title_N;
	
	@FindBy(id="nice_text_area")
	@CacheLookup
	WebElement Description_N;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Add_N;
	
	
	
	
	
	
	
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

	public void clickNotes()
	{
		Notes.click();
	}
	
	public void clickAddNotes()
	{
		AddNotes.click();
	}
	
	
	public void setTitle_N(String Text)
	{
		Title_N.sendKeys(Text);
	}
	
	public void setDescription_N(String Text)
	{
		Description_N.sendKeys(Text);
	}
	
	public void clickAdd_N()
	{
		Add_N.click();
	}
	
	
	
}
