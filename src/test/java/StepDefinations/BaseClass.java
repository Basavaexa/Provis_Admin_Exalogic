//Provis

package StepDefinations;

import org.apache.log4j.Logger;
//import java.util.Properties;
import org.openqa.selenium.WebDriver;
import PageObjects.LoginPage;

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



public class BaseClass
{
	public WebDriver driver;
	
	
	
	
	
	public LoginPage lp;
	
	
	public ADDCLASS_POM_ADMIN ADD_A;
	public ADDRENTAL_POM_ADMIN ADD_R;
	public AddEnrollManually_POM_ADMIN AEM_A;
	public ADDAMENITY_POM_ADMIN ADD_AM;
	public AddCommunityPost_POM_ADMIN ACP_A;
	public FAQ_POM_ADMIN FQ;
	public AddNotes_POM_ADMIN AN;
	public EmailTemplate_POM_ADMIN ET;
	public Banner_POM_ADMIN BN;
	public Document_POM_ADMIN DC;
	
	public static Logger logger;

}
