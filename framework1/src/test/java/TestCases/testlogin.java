package TestCases;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import common_objects.base2;
import common_objects.basetestcase;
import common_objects.login_createAccount_pageobject;
import utility.Common_functions;

public class testlogin extends base2 {



    @Test(priority=0) 
	public static void login() throws InterruptedException{
		login_createAccount_pageobject cf= new login_createAccount_pageobject(driver);
   
		if(!Common_functions.performClick(cf.login_link())) {
    	System.out.println("The Login link visible");
    }
    Common_functions.isElementPresent(cf.logintitle(),"login Title"); 
    Common_functions.isElementPresent(cf.forgot_password_option(),"forgot password option present");
    Common_functions.isElementPresent(cf.signup_login_link(),"Sign up link");
      
    if(!Common_functions.performClick( cf.email_field())) {
    	  System.out.println("The field is visible");
      }
      cf.email_field().sendKeys("appiumtest@gmail.com");
      cf.password_field().click();
      cf.password_field().sendKeys("8892279018");
      cf.done_keyboardbutton().click();
      cf.login_button().click();
      Thread.sleep(5000);
      Common_functions.isElementPresent(cf.welcome_back(), "Welcome Back Text");
    }
		 
	
         
      
	 @Test(priority=1) 
      public void logout() throws InterruptedException {
    	  login_createAccount_pageobject cf= new login_createAccount_pageobject(driver);
    	  if(Common_functions.isElementPresent(cf.hamburger_menu(), "Hamburger Menu") && 
    			  !Common_functions.performClick(cf.hamburger_menu()));{	
    		 //Element is present and clicked
    	   }
    	  
    	  if(!Common_functions.performClick(cf.logout_option()));{
    		  System.out.println("The logout option present");
    	   }
    
    	  Common_functions.isElementPresent(cf.logout_confirmation_msg(),"logout confrmation message");
    	 //	  cf.cancel_button().click();
    	//  cf.hamburger_menu().click();
    	//  cf.logout_option().click();
    	  if(!Common_functions.performClick(cf.logout_button_confirmation()));{
    		  System.out.println("The logout button is present");
    	   }
    	  Common_functions.isElementPresent(cf.get_started(),"get started link");
    	  
    	   }
    	  
    	
     @Test(priority=2)
	 public void login_madatory_validation() {
		 login_createAccount_pageobject cf= new login_createAccount_pageobject(driver);
		 {
				
		
		// CASE- 1. Both Email and Password Fields are blank.
		
		 try{
		cf.login_link().click();
		cf.login_button().click();
		String text =cf.email_Error_MSG().getText();
		if(text.equals("* Please enter Email"))
		{
		   System.out.println("----------Sucess -------");
		}
		}
		catch(Throwable e)
		{
		System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
		  }

	// CASE- 2. Email field is filled and Password field is blank
		    try
		    {	

		    	 cf.email_field().click();
			 cf.email_field().sendKeys("appiumtest@gmail.com");
			 cf.done_keyboardbutton().click();
			 cf.login_button().click();
		    String text = cf.passwd_Error_MSG().getText();
		    if(text.equals("* Please enter Password"))
		    {
		    System.out.println("----------Sucess -------\n-----------------------");
		    }
		    		
		     }
		    catch(Throwable e)
		     {
		    System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
		     }	



		    
		 // CASE- 3. Email field is blank and Password field is filled
		    try
		    {		
		    cf.backNavigatioArrow().click();
		    
		    Thread.sleep(3000);
		    	cf.login_link().click();
			cf.password_field().click();
			cf.password_field().sendKeys("88928");
			cf.done_keyboardbutton().click();
			cf.login_button().click();
		    String text = cf.email_Error_MSG().getText();
		    if(text.equals("* Please enter Email"))
		    {
		    System.out.println("----------Sucess-------\n-----------------------");
		    }
		   }
		    catch(Throwable e)
		     {
		    	System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
		     }	

		  //CASE- 4. Email and Password are entered wrong 	
		    
		    try
		    {		
		    	cf.backNavigatioArrow().click();
		    	 Thread.sleep(3000);
			cf.login_link().click();
		    	cf.email_field().click();
		    	cf.email_field().sendKeys("aa@gmail.com");
		    	cf.done_keyboardbutton().click();
		    	cf.password_field().click();
			cf.password_field().sendKeys("88928");
			cf.done_keyboardbutton().click();
			cf.login_button().click();
		    String text = cf.emailNotExist_Error_MSG().getText();
		    if(text.equals("* Email Id does not exists"))
		    {
		    System.out.println("----------Sucess -------\n-----------------------");
		    }
		   }
		    catch(Throwable e)
		     {
		    		
		    System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
		     }	

		 
		  //CASE- 5. Email is correct and Password is wrong 	
		    try
		    {
		    	cf.backNavigatioArrow().click();
		    	 Thread.sleep(3000);
			cf.login_link().click();
		    	cf.email_field().click();
		    	cf.email_field().sendKeys("appiumtest@gmail.com");
		    	cf.done_keyboardbutton().click();
		    cf.password_field().click();
			cf.password_field().sendKeys("88928");
			cf.done_keyboardbutton().click();
			cf.login_button().click();
		    String text =cf.passwd_MatchError_MSG().getText();
		    if(text.equals("* Password does not match"))
		    {
		    System.out.println("----------Sucess -------");
		    } 
		   }
		    catch(Throwable e)
		    {
			  System.out.println("Elementfound: "+e.getMessage() + "\n-----------------------");
		     }

		   
		    
		   // CASE-6. Both User name and Password are entered correctly. 
		   // Check whether Email field exists or not 
		        try
		            {
		        	    cf.backNavigatioArrow().click();
		        	    Thread.sleep(3000);
					cf.login_link().click();     
		        	    cf.email_field().click();
				    	cf.email_field().sendKeys("appiumtest@gmail.com");
				    	cf.done_keyboardbutton().click();
		             }
		        catch(Throwable e)
		             {
		             System.out.println("Emaild not found: " + e.getMessage());
		             }

		        //Check whether Password field exists or not
		         try
		            {
		        	 	cf.password_field().click();
		    			cf.password_field().sendKeys("8892279018");
		    			cf.done_keyboardbutton().click();
		            }
		        catch(Throwable e)
		            {
		    	 System.out.println("Password not found: " + e.getMessage());
		            }

		         //Asserting the login In button exists or not and clicking it
		        try
		           {
		        	cf.login_button().click();
		        	Thread.sleep(5000);
		    
		            }
		        catch(Throwable e)
		            {
		    	System.out.println("button not found: "+ e.getMessage());
		            }
		        //Check if login was proper or not
		        try
		            {
		  
		            String text = cf.welcome_back().getText();
		            if(text.equals("Welcome back, Appium"))
		           {
		    	System.out.println("----------Sucess -------\n-----------------------");
		           }
		           }
		         catch(Throwable e)
		            {
		    	 System.out.println("not able to login: "+e.getMessage());
		            }
		        }
		 }
     }
	



