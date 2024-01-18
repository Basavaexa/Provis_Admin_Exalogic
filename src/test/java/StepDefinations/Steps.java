//Provis

package StepDefinations;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import PageObjects.ADDAMENITY_POM_ADMIN;
import PageObjects.ADDCLASS_POM_ADMIN;
import PageObjects.ADDRENTAL_POM_ADMIN;
import PageObjects.AddCommunityPost_POM_ADMIN;
import PageObjects.AddEnrollManually_POM_ADMIN;
import PageObjects.AddNotes_POM_ADMIN;
import PageObjects.Banner_POM_ADMIN;
import PageObjects.Document_POM_ADMIN;
import PageObjects.EmailTemplate_POM_ADMIN;
import PageObjects.FAQ_POM_ADMIN;
import PageObjects.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;




public class Steps extends BaseClass {


	@Before
	public void setup() throws IOException
	{

		logger=Logger.getLogger("Provis");//Added logger
		PropertyConfigurator.configure("log4j.properties");//Added logger


		//Reading properties

		Properties configProp = new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);




		String br=configProp.getProperty("browser");

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath") );	
			//driver=new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(br.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath") );	
			driver=new FirefoxDriver();
		}

		else if(br.equals("ie")) 
		{
			System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath") );	
			driver=new InternetExplorerDriver();
		}

		logger.info("************* Launching browser**************");	
	}


	//Login Page Feature

	@Given("User launches browser")
	public void user_launches_browser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		
		
		
		
		lp=new LoginPage(driver);
		
		
		
		//// ADMIN ////
		
		
		ADD_A=new ADDCLASS_POM_ADMIN(driver);
        ADD_R=new ADDRENTAL_POM_ADMIN(driver);
        AEM_A=new AddEnrollManually_POM_ADMIN (driver);
        ADD_AM=new ADDAMENITY_POM_ADMIN(driver);
        ACP_A=new AddCommunityPost_POM_ADMIN(driver);
        FQ=new FAQ_POM_ADMIN(driver);
        AN=new AddNotes_POM_ADMIN(driver);
        ET=new EmailTemplate_POM_ADMIN (driver);
        BN=new Banner_POM_ADMIN(driver);
        DC=new Document_POM_ADMIN(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) 
	{
		driver.get(url);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) 
	{
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException 
	{
		lp.clickLogin();
		Thread.sleep(2000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) 
	{
		if(driver.getPageSource().contains("Invalid Username or Password"))
		{
			driver.close();
			Assert.assertTrue(false);  
		}
		else
		{
			Assert.assertEquals(driver.getTitle(),"Provis");
		}	   
	}

	@Then("user click on close")
	public void user_click_on_close() 
	{
		lp.clickClose();
	}

	@Then("user click on account")
	public void user_click_on_account() 
	{
		lp.clickProfile(); 
	}

	@When("user click on logout")
	public void user_click_on_logout() 
	{
		lp.clickLogout();
		lp.clickLogout1();
	}

	@Then("Page2 title should be {string}")
	public void page2_title_should_be(String string)
	{
		Assert.assertEquals(driver.getTitle(),"Login to Provis");

	}

	@When("close browser")
	public void close_browser() {
		logger.info("************* Closing Browswer*******************");
		driver.quit();
	}

	
	
	
	/////////////////////////////////// ADMIN /////////////////////////////////////////////
	
	/////////////////////////////// Add Class ////////////////////////////////////
	
	
	@Then("click on Building Mgmt for Add class")
	public void click_on_Building_Mgmt_for_Add_class() 
	{
	    ADD_A.clickBuildingMgnt_A();
	}

	@Then("click on Classes for Add class")
	public void click_on_Classes_for_Add_class() 
	{
	    ADD_A.clickClasses_A();
	}

	@Then("Click on Add Class")
	public void click_on_Add_Class() 
	{
	    ADD_A.clickAddClass_A();
	}

	@Then("Enter Class Title for Add class {string}")
	public void enter_Class_Title_for_Add_class(String string) 
	{
	    ADD_A.setClassTitle_A(string);
	}

	@Then("Enter Service Provider for Add class {string}")
	public void enter_Service_Provider_for_Add_class(String string) 
	{
	    ADD_A.setServiceProvider_A(string);
	}

	@Then("Enter the Service Provider Email for Add class {string}")
	public void enter_the_Service_Provider_Email_for_Add_class(String string) 
	{
	    ADD_A.setServiceProviderEmail_A(string);
	}

	@Then("Upload Website Images for Add class {string}")
	public void upload_Website_Images_for_Add_class(String string) 
	{
	    ADD_A.setWebsiteImages_A(string);
	}

	@Then("Upload Mobile Images for Add class {string}")
	public void upload_Mobile_Images_for_Add_class(String string) throws InterruptedException, AWTException 
	{
	    ADD_A.setMobileImages_A(string);
	    Thread.sleep(2000);
	}

	/*@Then("click ok on pop up")
	public void click_ok_on_pop_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/

	@Then("Enter location for Add class {string}")
	public void enter_location_for_Add_class(String string) 
	{
	    ADD_A.setLocation_A(string);
	}

	@Then("click on Start Date for Add class")
	public void click_on_Start_Date_for_Add_class() 
	{
	    ADD_A.clickStartDate_A();
	}

	@Then("select the date on Start Date for Add class")
	public void select_the_date_on_Start_Date_for_Add_class() 
	{
	    ADD_A.clickSDate_A();
	}

	@Then("click on End Date for Add class")
	public void click_on_End_Date_for_Add_class() 
	{
	    ADD_A.clickEndDate_A();
	}

	@Then("select the date on End Date for Add class")
	public void select_the_date_on_End_Date_for_Add_class() 
	{
	    ADD_A.clickEDate_A();
	}

	@Then("Enter Max No of Application for Add class {string}")
	public void enter_Max_No_of_Application_for_Add_class(String string) 
	{
	    ADD_A.setMaxNoofApplication_A(string);
	}

	@Then("Enter Description for Add class {string}")
	public void enter_Description_for_Add_class(String string) 
	{
	    ADD_A.setDescription_A(string);
	}

	@Then("Enter Terms & Conditions for Add class {string}")
	public void enter_Terms_Conditions_for_Add_class(String string) 
	{
	    ADD_A.setTermsConditions_A(string);
	}

	@Then("Enter the Package Title for Add class {string}")
	public void enter_the_Package_Title_for_Add_class(String string) 
	{
	    ADD_A.setPackageTitle_A(string);
	}

	@Then("Enter Fee for Add class {string}")
	public void enter_Fee_for_Add_class(String string) 
	{
	    ADD_A.setFees_A(string);
	}

	@Then("Enter age Range for Add class {string}")
	public void enter_age_Range_for_Add_class(String string) throws InterruptedException 
	{
	    ADD_A.setAgeRange_A(string);
	    Thread.sleep(2000);
	}

	@Then("Enter first time for Add class {string}")
	public void enter_first_time_for_Add_class(String string) 
	{
	    ADD_A.setFTime_Ad(string);
	}

	@Then("Enter second time for Add class {string}")
	public void enter_second_time_for_Add_class(String string) 
	{
	    ADD_A.setSTime_Ad(string);
	}

	@Then("Click on Add button for Add class")
	public void click_on_Add_button_for_Add_class() 
	{
	    ADD_A.clickSubmit_A();
	}


	@Then("User can view the confrmation mesage {string}")
	public void user_can_view_the_confrmation_mesage(String string) 
	{
	    
		
		if(driver.getPageSource().contains("Added Successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Added Successfully!");
			
		}
		else
		{
			System.out.println("FAILED -> Not Added");
		}	   
	
	}
	
	
	
	/////////////////////////////////// Add Rental Admin///////////////////////////////////////
	
	@Then("click on Building Mgmt for Add Rental")
	public void click_on_Building_Mgmt_for_Add_Rental() 
	{
	    ADD_R.clickBuildingMgnt_R();
	}

	@Then("click on Classes for Add Rental")
	public void click_on_Classes_for_Add_Rental() 
	{
	    ADD_R.clickClasses_R();
	}

	@Then("Click on Add Rental")
	public void click_on_Add_Rental() 
	{
	    ADD_R.clickAddRental_R();
	}

	@Then("Enter Title Add Rental {string}")
	public void enter_Title_Add_Rental(String string) 
	{
	    ADD_R.setTitle_R(string);
	}

	@Then("Upload Image Flyer on Add Rental {string}")
	public void upload_Image_Flyer_on_Add_Rental(String string) 
	{
	    ADD_R.setImageFlyer_R(string);
	}

	@Then("Enter Per week fees on Add Rental {string}")
	public void enter_Per_week_fees_on_Add_Rental(String string) 
	{
	    ADD_R.setPerweekfees_R(string);
	}

	@Then("Enter Description on Add Rental {string}")
	public void enter_Description_on_Add_Rental(String string) 
	{
	    ADD_R.setDescription_R(string);
	}

	@Then("Enter Terms & Conditions for Add Rental {string}")
	public void enter_Terms_Conditions_for_Add_Rental(String string) 
	{
	    ADD_R.setTermsConditions_R(string);
	}

	@Then("Click on Add button for Add Rental")
	public void click_on_Add_button_for_Add_Rental()
	{
	    ADD_R.clickADD_R();
	}

	@Then("User can view the conformation message {string}")
	public void user_can_view_the_conformation_message(String string) 
	{
	    
		
		if(driver.getPageSource().contains("Added Successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Added Successfully!");
			
		}
		else
		{
			System.out.println("FAILED ->Not Added");
		}	   
	
	}
	
	
	
	/////////////////////////////////Add Enroll Manually//////////////////////////////////////
	
	@Then("click on Building Mgmt for Add Enroll Manually")
	public void click_on_Building_Mgmt_for_Add_Enroll_Manually() 
	{
	    AEM_A.clickBuildingMgnt_E();
	}

	@Then("click on Classes for Add Enroll Manually")
	public void click_on_Classes_for_Add_Enroll_Manually() 
	{
	    AEM_A.clickClasses_E();
	}

	@Then("Click on Add Enroll Manually")
	public void click_on_Add_Enroll_Manually() 
	{
	    AEM_A.clickAddEnrollManually_E();
	}

	@Then("click on class drop down Add Enroll Manually")
	public void click_on_class_drop_down_Add_Enroll_Manually() 
	{
	    AEM_A.clickClass_E();
	}

	@Then("select any option under class on Add Enroll Manually")
	public void select_any_option_under_class_on_Add_Enroll_Manually() 
	{
	    AEM_A.clickCricket_E();
	}

	@Then("lick on User  drop down Add Enroll Manually")
	public void lick_on_User_drop_down_Add_Enroll_Manually() 
	{
	    AEM_A.clickUser_E();
	}

	@Then("select any option under User on Add Enroll Manually")
	public void select_any_option_under_User_on_Add_Enroll_Manually() 
	{
	    AEM_A.clickBelindaPotgieter_E();
	}

	@Then("click on Select Your Package on Add Enroll Manually")
	public void click_on_Select_Your_Package_on_Add_Enroll_Manually() 
	{
	    AEM_A.clickSelectYourPackage_E();
	}

	@Then("click on Select Your Schedule on Add Enroll Manually")
	public void click_on_Select_Your_Schedule_on_Add_Enroll_Manually() 
	{
	    AEM_A.clickSelectYourSchedule_E();
	}

	@Then("click on unit number and select the any one option on Add Enroll Manually")
	public void click_on_unit_number_and_select_the_any_one_option_on_Add_Enroll_Manually() throws InterruptedException
	{
	   AEM_A.clickUnitNumber_E();
	}

	@Then("Enter Applicant Name on Add Enroll Manually {string}")
	public void enter_Applicant_Name_on_Add_Enroll_Manually(String string) 
	{
	    AEM_A.setApplicantName_E(string);
	}

	@Then("Enter Applicant Age on Add Enroll Manually {string}")
	public void enter_Applicant_Age_on_Add_Enroll_Manually(String string) 
	{
	    AEM_A.setApplicantAge_E(string);
	}

	@Then("click on Terms Conditions on Add Enroll Manually")
	public void click_on_Terms_Conditions_on_Add_Enroll_Manually() 
	{
	    AEM_A.clickTermsandConditions_E();
	}

	@Then("click on Add Enrollment on Add Enroll Manually")
	public void click_on_Add_Enrollment_on_Add_Enroll_Manually()
	{
	    AEM_A.clickAddEnrollMent_E();
	}
   
	@Then("User can see the conformtion messag {string}")
	public void user_can_see_the_conformtion_messag(String string) 
	{
	    
		
		if(driver.getPageSource().contains("Enrollment added"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Enrollment Added Successfully!");
			
		}
		else
		{
			System.out.println("FAILED -> Enrollment Not Added");
		}	   
	}
	
	
	
	///////////////////////////////////////////// Add Amenity //////////////////////////////////
	
	
	@Then("click on Building Mgmt for Add Amenity")
	public void click_on_Building_Mgmt_for_Add_Amenity() 
	{
	    ADD_AM.clickBuildingMgnt_AMN();
	}

	@Then("click on Amenity for Add Amenity")
	public void click_on_Amenity_for_Add_Amenity()
	{
	    ADD_AM.clickAmenity_AM();
	}

	@Then("Click on Add Amenity Manually")
	public void click_on_Add_Amenity_Manually() 
	{
	    ADD_AM.clickAddAmenity_AM();
	}

	@Then("Enter Amenity Name {string}")
	public void enter_Amenity_Name(String string) 
	{
	    ADD_AM.setAmenityName_AM(string);
	}

	@Then("Enter No of Minutes {string}")
	public void enter_No_of_Minutes(String string) 
	{
	    ADD_AM.setNoofMinutes_AM(string);
	}

	@Then("Enter Time Interval {string}")
	public void enter_Time_Interval(String string) 
	{
	    ADD_AM.setTimeInterval_AM(string);
	}

	@Then("Enter Amenity Deposit {string}")
	public void enter_Amenity_Deposit(String string) 
	{
	    ADD_AM.setAmenityDeposit_AM(string);
	}

	@Then("Enter Max member per Amenity {string}")
	public void enter_Max_member_per_Amenity(String string) 
	{
	    ADD_AM.setMaxmemberperAmenity_AM(string);
	}

	@Then("Enter Max member per Unit {string}")
	public void enter_Max_member_per_Unit(String string) 
	{
	    ADD_AM.setMaxmemberperUnit_AM(string);
	}

	@Then("Enter Start Time for Add Amenity {string}")
	public void enter_Start_Time_for_Add_Amenity(String string) 
	{
	    ADD_AM.setStartTime_AM(string);
	}

	@Then("Enter End Time for Add Amenity {string}")
	public void enter_End_Time_for_Add_Amenity(String string) 
	{
	    ADD_AM.setEndTime_AM(string);
	}

	@Then("Enter Weekdays Amount {string}")
	public void enter_Weekdays_Amount(String string) 
	{
	    ADD_AM.setWeekdaysAmount_AM(string);
	}

	@Then("Enter Weekend Amount {string}")
	public void enter_Weekend_Amount(String string) 
	{
	    ADD_AM.setWeekendAmount_AM(string);
	}

	@Then("Enter Lead Time {string}")
	public void enter_Lead_Time(String string) 
	{
	    ADD_AM.setLeadTime_AM(string);
	}

	@Then("Enter Location Name Add Amenity {string}")
	public void enter_Location_Name_Add_Amenity(String string) 
	{
	    ADD_AM.setLocation_AM(string);
	}

	@Then("Click on Amenity Features")
	public void click_on_Amenity_Features() 
	{
	    ADD_AM.clickWifi_AM();
	}

	@Then("Upload Amenity Image {string}")
	public void upload_Amenity_Image(String string) 
	{
	    ADD_AM.setAmenityImage_AM(string);
	}

	@Then("Enter Description for Add Amenity {string}")
	public void enter_Description_for_Add_Amenity(String string) 
	{
	    ADD_AM.setDescription_AM(string);
	}

	@Then("Enter Terms Conditions for Add Amenity {string}")
	public void enter_Terms_Conditions_for_Add_Amenity(String string) 
	{
	    ADD_AM.setTermsConditions_AM(string);
	}

	@Then("click on Save for Add Amenity")
	public void click_on_Save_for_Add_Amenity() 
	{
	    ADD_AM.clickSave_AM();
	}

	@Then("User can see the conformat messag {string}")
	public void user_can_see_the_conformat_messag(String string)
	{

		if(driver.getPageSource().contains("Added Successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Added Successfully!");
			
		}
		else
		{
			System.out.println("FAILED ->Not Added");
		}	
	}

	
	
	/////////////////////////////// Add Community Post ADMIN /////////////////////////////
	
	
	
	@Then("click on Building Mgmt for Add Community Post")
	public void click_on_Building_Mgmt_for_Add_Community_Post() 
	{
	    ACP_A.clickBuildingMgnt_AC();
	}

	@Then("click on Building chat Mgmt for Add Community Post")
	public void click_on_Building_chat_Mgmt_for_Add_Community_Post() 
	{
	    ACP_A.clickBuildingChatMgnt_AC();
	}

	@Then("Click on Add Community chat Post")
	public void click_on_Add_Community_chat_Post() 
	{
	    ACP_A.clickAddCommunityChatPost_AC();
	}

	@Then("click on Community dropdown and select community for Add Community Post")
	public void click_on_Community_dropdown_and_select_community_for_Add_Community_Post() 
	{
	    ACP_A.clickCommunity_AC();
	}

	@Then("Enter the title for Add Community Post {string}")
	public void enter_the_title_for_Add_Community_Post(String string) 
	{
	    ACP_A.setTitle_AC(string);
	}

	@Then("Enter the Description for Add Community Post {string}")
	public void enter_the_Description_for_Add_Community_Post(String string) 
	{
	    ACP_A.setDescription_AC(string);
	}

	@Then("Enter the Location for Add Community Post {string}")
	public void enter_the_Location_for_Add_Community_Post(String string)
	{
	    ACP_A.setLocation_AC(string);
	}

	@Then("Enter the video url for Add Community Post {string}")
	public void enter_the_video_url_for_Add_Community_Post(String string) throws InterruptedException 
	{
	    ACP_A.setVideourl_AC(string);
	    Thread.sleep(2000);
	}

	@Then("upload Upload Image or PDF for Add Community Post {string}")
	public void upload_Upload_Image_or_PDF_for_Add_Community_Post(String string) 
	{
	    ACP_A.setUploadImageorPDF_ACC(string);
	}

	@Then("Click on Start date and select the date for Add Community Post")
	public void click_on_Start_date_and_select_the_date_for_Add_Community_Post() throws InterruptedException 
	{
	    ACP_A.clickStartDate_AC();
	}

	@Then("Enter Start Time for Add Community Post {string}")
	public void enter_Start_Time_for_Add_Community_Post(String string) 
	{
	    ACP_A.setStartTime_AC(string);
	}

	@Then("Click on End date and select the date for Add Community Post")
	public void click_on_End_date_and_select_the_date_for_Add_Community_Post() throws InterruptedException 
	{
	    ACP_A.clickEndDate_AC();
	}

	@Then("Enter End Time for Add Community Post {string}")
	public void enter_End_Time_for_Add_Community_Post(String string) 
	{
	    ACP_A.setEndTime_AC(string);
	}

	@Then("Click on Save for Add Community Post")
	public void click_on_Save_for_Add_Community_Post() 
	{
	    ACP_A.clickSave_AC();
	}

	@Then("User can view the confrm mesage {string}")
	public void user_can_view_the_confrm_mesage(String string) 
	{
	    
		/*
		if(driver.getPageSource().contains("You have successfully added a new community post."))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> You have successfully added a new community post.");
			
		}
		else
		{
			System.out.println("FAILED -> Community Not Added");
		}	
		 */
	
		WebElement popup = driver.findElement(By.xpath("//p[text()='You have successfully added a new community post.']"));
        // Perform your assertions on the popup element
        // Example: Assert that the popup contains specific text
		
        Assert.assertEquals(true, popup.isDisplayed());
        System.out.println("Passed - Community Added successfully");
		
	
	} 
	
	
	
	//////////////////////////// FAQ ADMIN ////////////////////////////////////////
	
	
	@Then("click on FAQ")
	public void click_on_FAQ() 
	{
	    FQ.clickFAQ();
	}

	@Then("Click on faq for admin")
	public void click_on_faq_for_admin() 
	{
	    FQ.clickfaq_A();
	}

	@Then("click on Add FAQ for Admin")
	public void click_on_Add_FAQ_for_Admin() 
	{
	    FQ.clickAddFaq_A();
	}

	@Then("Enter Question for Faq {string}")
	public void enter_Question_for_Faq(String string)
	{
	    FQ.setQuestionF_A(string);
	}

	@Then("Enter Answer for Faq {string}")
	public void enter_Answer_for_Faq(String string) 
	{
	    FQ.setAnswerF_A(string);
	}

	@Then("Click on Status for Faq")
	public void click_on_Status_for_Faq() 
	{
	    FQ.clickStatusF_A();
	}

	@Then("Click on Save for Faq")
	public void click_on_Save_for_Faq() 
	{
	    FQ.clicksubmitF_A();
	}

	@Then("User can see the conform messag {string}")
	public void user_can_see_the_conform_messag(String string) 
	{
	    
		
		if(driver.getPageSource().contains("FAQ Added Successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> FAQ Added Successfully!");
			
		}
		else
		{
			System.out.println("FAILED -> FAQ Not Added");
		}	   
	}

	
	//////////////////////// Notes ////////////////////////////
	
	
	@Then("Click on Notes")
	public void click_on_Notes() 
	{
	    AN.clickNotes();
	}

	@Then("Click on Add Note")
	public void click_on_Add_Note() 
	{
	    AN.clickAddNotes();
	}

	@Then("Enter Title for Admin {string}")
	public void enter_Title_for_Admin(String string) 
	{
	    AN.setTitle_N(string);
	}

	@Then("Enter Description for Admin {string}")
	public void enter_Description_for_Admin(String string) 
	{
	    AN.setDescription_N(string);
	}

	@Then("Click on Add for Admin")
	public void click_on_Add_for_Admin() 
	{
	    AN.clickAdd_N();
	}
	
	@Then("User can view the confrm messag {string}")
	public void user_can_view_the_confrm_messag(String string) 
	{
	    
		
		if(driver.getPageSource().contains("Notes Added Successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Notes Added Successfully!");
			
		}
		else
		{
			System.out.println("FAILED -> Note Not Added");
		}	   
	
	}
	


//////////////////////////////Email Template//////////////////////////////////
	
	
	
	@Then("Click on Template")
	public void click_on_Template() 
	{
	   ET.clickTemplate();
	}

	@Then("Click on Email Template")
	public void click_on_Email_Template() 
	{
	    ET.clickEmailTemplate();
	}

	@Then("Click on Add Email Template")
	public void click_on_Add_Email_Template() 
	{
	    ET.clickAddEmailTemplate();
	}

	@Then("Enter Template Name {string}")
	public void enter_Template_Name(String string) 
	{
	    ET.setTemplateName(string);
	}

	@Then("Enter Subject for Template {string}")
	public void enter_Subject_for_Template(String string)
	{
	    ET.setsubject_E(string);
	}

	@Then("Enter Email Message for Template {string}")
	public void enter_Email_Message_for_Template(String string)
	{
	    ET.setEmailMessage_E(string);
	}

	@Then("Enter SMS Message for Template {string}")
	public void enter_SMS_Message_for_Template(String string) 
	{
	    ET.setSMSMessage(string);
	}

	@Then("Enter Notification Message for Template {string}")
	public void enter_Notification_Message_for_Template(String string)
	{
	    ET.setNotificationMessage(string);
	}

	@Then("Click category drop down and select any one option for Email template")
	public void click_category_drop_down_and_select_any_one_option_for_Email_template() 
	{
	   ET.clickselect_category();
	}

	@Then("Enter Discussion Wall for Email Template {string}")
	public void enter_Discussion_Wall_for_Email_Template(String string)
	{
	    ET.setDiscussionWall(string);
	}

	@Then("click on submit for Email Template")
	public void click_on_submit_for_Email_Template()
	{
	 ET.clickSubmit_E();  
	}

	@Then("User can view the conform message {string}")
	public void user_can_view_the_conform_message(String string) 
	{
	    //Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Email Template Added Successfully!"));
	    //String title= "Provis";
	   // Assert.assertEquals(title, driver.getTitle());
	    //System.out.println("Passed -> Email Template Added Successfully!");
		
		if(driver.getPageSource().contains("Email Template Added Successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Email Template Added Successfully!");
			
		}
		else
		{
			System.out.println("FAILED -> Email Template Not Added ");
		}	   
	
	}

	
	///////////////////////////////Banner Admin///////////////////////////
	
	@Then("Click on Banner")
	public void click_on_Banner() 
	{
	   BN.clickBanner();
	}

	@Then("click on Add Banner")
	public void click_on_Add_Banner() 
	{
	    BN.clickAddBanner();
	}

	@Then("Enter Banner Name {string}")
	public void enter_Banner_Name(String string) throws InterruptedException 
	{
	    BN.setBannerName(string);
	    Thread.sleep(2000);
	}

	@Then("Enter Banner Url {string}")
	public void enter_Banner_Url(String string) throws InterruptedException 
	{
	    BN.setBannerURL(string);
	    Thread.sleep(2000);
	}

	@Then("Upload the image for Banner {string}")
	public void upload_the_image_for_Banner(String string) throws InterruptedException 
	{
	    BN.setBannerImage(string);
	    Thread.sleep(2000);
	}

	@Then("Click on Expiry Date and select any date for Banner")
	public void click_on_Expiry_Date_and_select_any_date_for_Banner() throws InterruptedException 
	{
	    BN.clickBannerExpiry();
	    Thread.sleep(2000);
	}

	@Then("Enter Priority for Banner {string}")
	public void enter_Priority_for_Banner(String string) throws InterruptedException 
	{
	    BN.setBannerPriority(string);
	    Thread.sleep(2000);
	}

	@Then("Click on Add for Banner")
	public void click_on_Add_for_Banner() throws InterruptedException 
	{
	    BN.clickBannerAdd();
	    Thread.sleep(2000);
	}
	
	@Then("User can view the confrm message {string}")
	public void user_can_view_the_confrm_message(String string) 
	{
	    
		
		if(driver.getPageSource().contains("Banner added successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Banner added successfully!");
			
		}
		else
		{
			System.out.println("FAILED -> Banner Not Added");
		}	   
	
	}
	
	///////////////////////// Document ////////////////////////////
	
	@Then("Click on Document for Admin")
	public void click_on_Document_for_Admin() 
	{
	    DC.clickDocument_D();
	}

	@Then("Click on Upload Documents for Admin")
	public void click_on_Upload_Documents_for_Admin()
	{
	   DC.clickUploadDocuments();
	}

	@Then("Enter Document Title {string}")
	public void enter_Document_Title(String string) 
	{
	    DC.setDocumentTitle(string);
	}

	@Then("Enter Document Image {string}")
	public void enter_Document_Image(String string) 
	{
	    DC.setDocumentImage(string);
	}

	@Then("Click on Expiry Date and select any date for Document")
	public void click_on_Expiry_Date_and_select_any_date_for_Document() throws InterruptedException 
	{
	    DC.clickDocumentExpire();
	    Thread.sleep(2000);
	}

	@Then("Enter Description for Document {string}")
	public void enter_Description_for_Document(String string) 
	{
	    DC.setDocumentDescription(string);
	}

	@Then("Click on Display Type and select any option for Document")
	public void click_on_Display_Type_and_select_any_option_for_Document() throws InterruptedException 
	{
	   DC.clickDisplayType();
	   Thread.sleep(2000);
	}

	@Then("Click on Add Document for Admin")
	public void click_on_Add_Document_for_Admin() 
	{
	   DC.clickADDDocument();
	   
	}
	
	@Then("User can view the confirm message {string}")
	public void user_can_view_the_confirm_message(String string) 
	{
	    //Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Document added successfully!"));
	    //String title= "Provis";
	   // Assert.assertEquals(title, driver.getTitle());
	    //System.out.println("Passed -> Document added successfully!");
		
		if(driver.getPageSource().contains("Document added successfully!"))
		{
			Assert.assertTrue(true); 
			System.out.println("PASSED -> Document Added Successfully!");
			
		}
		else
		{
			System.out.println("FAILED -> Document Not Added");
		}	
		 
	}
	
	
}

