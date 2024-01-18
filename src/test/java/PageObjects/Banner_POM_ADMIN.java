package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banner_POM_ADMIN 
{

	
	public WebDriver driver;
	public Banner_POM_ADMIN(WebDriver driver1)
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
	
	@FindBy(xpath="//span[text()='Banner']")
	@CacheLookup
	WebElement Banner;
	
	@FindBy(xpath="//a[text()=' Add Banner']")
	@CacheLookup
	WebElement AddBanner;
	
	@FindBy(id="banner_name")
	@CacheLookup
	WebElement BannerName;
	
	@FindBy(id="banner_url")
	@CacheLookup
	WebElement BannerURL;
	
	@FindBy(id="file")
	@CacheLookup
	WebElement BannerImage;
	
	@FindBy(id="expiry_date")
	@CacheLookup
	WebElement BannerExpiry;
	
	@FindBy(xpath="//td[text()='18']")
	@CacheLookup
	WebElement BannerExpiryDate;
	
	@FindBy(id="banner_priority")
	@CacheLookup
	WebElement BannerPriority;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement BannerAdd;
	
	
	
	
	
	
	
	
	
	
	
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

	public void clickBanner()
	{
		Banner.click();
	}
	
	public void clickAddBanner()
	{
		AddBanner.click();
	}
	
	public void setBannerName(String Text)
	{
		BannerName.sendKeys(Text);
	}
	
	public void setBannerURL(String Text)
	{
		BannerURL.sendKeys(Text);
	}
	
	public void setBannerImage(String image)
	{
		BannerImage.sendKeys(image);
	}
	
	public void clickBannerExpiry()
	{
		BannerExpiry.click();
		BannerExpiryDate.click();
	}
	
	public void setBannerPriority(String num)
	{
		BannerPriority.sendKeys(num);
	}
	
	
	public void clickBannerAdd()
	{
		BannerAdd.click();
	}
	
	
	
}
