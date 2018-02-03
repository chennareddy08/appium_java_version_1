package TestCases;


import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.Test;

import common_objects.booking_rebook_pageobjects;
import common_objects.login_createAccount_pageobject;
import common_objects.simulator_setup;
import utility.Common_functions;

public class booking_session extends simulator_setup{
   
	

	@Test(priority=0) 
	public void booking_session() throws InterruptedException {
		 booking_rebook_pageobjects bo = new  booking_rebook_pageobjects(driver);
		 login_createAccount_pageobject cf= new login_createAccount_pageobject(driver);
		//testlogin.login();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap scrollObject = new HashMap();
		scrollObject.put("direction", "down");
		//scrollObject.put("element",bo.book_trainer_home());
		js.executeScript("mobile: scroll", scrollObject);
		scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);
        Common_functions.performClick(bo.book_trainer_home());
     
        //Common_functions.performClick(bo.allow());
       // (new TouchAction(driver)).tap(245, 127).perform();
        //(new TouchAction(driver)).tap(248, 130).perform()
      
      
	   Thread.sleep(2000);
	   try {
		   bo.allow().click();
		   bo.location_field().click();
	       bo.clear_button().click();
	   	  // (new TouchAction(driver)).tap(65, 130).perform();
	  
	       bo.location_field().sendKeys("SANTA MONICA, CA 90405, United States");
	       bo.drop_down_select().click();
	       bo.use_this_location_button().click(); 
		   bo.trainer_select().click();
				} catch (NoSuchElementException e) {
				Log.getLogger("element is not present" + e.getMessage());
				}
	   Thread.sleep(2000);
	   bo.start_booking_button().click();
       bo.dateTime_option().click();
       bo.WorkoutType_option().click();
       bo.PowerYoga_option().click();
       bo.selectPlan_option().click();
       bo.confirm_details_button().click();
       bo.select_Single_Session_().click();
       //bo.pay_now_button_().click();
	   
	  
       
		
        
	}

	





}


