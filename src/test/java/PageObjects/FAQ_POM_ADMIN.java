package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FAQ_POM_ADMIN 

{

	public WebDriver driver;
	public FAQ_POM_ADMIN(WebDriver driver1)
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

	@FindBy(xpath="//span[text()='FAQ']")
	@CacheLookup
	WebElement FAQ;
	
	@FindBy(xpath="//span[text()='Faq']")
	@CacheLookup
	WebElement faq_A;
	
	@FindBy(xpath="//span[contains(text(),'Add FAQ ')]")
	@CacheLookup
	WebElement AddFaq_A;
	
	
	@FindBy(id="faq")
	@CacheLookup
	WebElement QuestionF_A;
	
	@FindBy(xpath="/html/body")
	@CacheLookup
	WebElement AnswerF_A;
	
	@FindBy(xpath="//*[text()='Active']")
	@CacheLookup
	WebElement StatusF_A;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement submitF_A;
	
	
	
	
	
	
	
	
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

	public void clickFAQ()
	{
		FAQ.click();
	}
	
	public void clickfaq_A()
	{
		faq_A.click();
	}
	
	public void clickAddFaq_A()
	{
		AddFaq_A.click();
	}
	

	public void setQuestionF_A(String string)
	{
		QuestionF_A.sendKeys(string);
	}
	
	public void setAnswerF_A(String string)
	{
		driver.switchTo().frame(0);
		AnswerF_A.sendKeys(string);
		driver.switchTo().defaultContent();
	}
	
	public void clickStatusF_A()
	{
		StatusF_A.click();
	}
	
	public void clicksubmitF_A()
	{
		submitF_A.click();
	}
	
	
}
