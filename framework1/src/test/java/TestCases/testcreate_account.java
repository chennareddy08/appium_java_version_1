package TestCases;

import org.testng.annotations.Test;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.NoAlertPresentException;
import common_objects.basetestcase;
import common_objects.login_createAccount_pageobject;
import utility.Common_functions;

public class testcreate_account extends basetestcase {

	
	@Test(priority=0)
	 public void createAccount_madatory_validation() {
		 login_createAccount_pageobject cf= new login_createAccount_pageobject(driver);
		 try {
			 Common_functions.performClick(cf.ok_button());	
		} catch (NoAlertPresentException e) {
				Log.getLogger("Alert is not present" + e.getMessage());
				}
		
		// CASE- 1. first name  Fields blank.
		
		 try{
		cf.get_started().click();
		cf.completeButton().click();
		String text =cf.firstname_error().getText();
		if(text.equals("* Please enter First Name"))
		{
		   System.out.println("----------Sucess -------");
		}
		}
		catch(Throwable e)
		{
		System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
		  }
	
	// CASE- 2. last name Fields  blank.
	
			try{
			cf.first_name_field().sendKeys("appium");
			cf.done_keyboardbutton().click();
			cf.completeButton().click();
			String text =cf.lastname_error().getText();
			if(text.equals("* Please enter Last Name"))
			{
			   System.out.println("----------Sucess -------");
			}
			}
			catch(Throwable e)
			{
			System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
			  }
		
			

		// CASE- 3. email Fields  blank.
			
					try{
					
					cf.last_name_field().sendKeys("test");
					cf.done_keyboardbutton().click();
					cf.completeButton().click();
					String text =cf.email_error().getText();
					if(text.equals("* Please enter Email"))
					{
					   System.out.println("----------Sucess -------");
					}
					}
					catch(Throwable e)
					{
					System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
					  }
			

		// CASE- 4. email Fields  blank.
						
			try{
			
				cf.your_email_field().sendKeys("tes@gmail.com");
				cf.done_keyboardbutton().click();
			   cf.completeButton().click();
			 String text =cf.phone_error().getText();
			if(text.equals("* * Please enter valid Phone Number"))
			{
		 System.out.println("----------Sucess -------");
								}
								}
		catch(Throwable e)
		{
		System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
		 }}
	

	@Test(priority=1)
	 public void createAccount_uivalidation() {
		 login_createAccount_pageobject cf= new login_createAccount_pageobject(driver);
	
		 Common_functions.isElementPresent(cf.create_account_title(), "create account title");
		 Common_functions.isElementPresent(cf.back_navigation_CA(), "back navigation");
		 Common_functions.isElementPresent(cf.terms_conditions_link(), "terms and conditions link");
		 Common_functions.isElementPresent(cf.privacy_policy_link(), "privacy policy link");
		 Common_functions.isElementPresent(cf.login_link_CreateAccount(), "link to login account");
	
	}}
