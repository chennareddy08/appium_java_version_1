package common_objects;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.pagefactory.iOSFindAll;

import io.appium.java_client.pagefactory.iOSBy;

import io.appium.java_client.pagefactory.iOSXCUITFindBys;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class booking_rebook_pageobjects {
	WebDriver driver;
	public booking_rebook_pageobjects(WebDriver driver) {
		this.driver = driver ;
	
		PageFactory.initElements(new AppiumFieldDecorator(driver,5,TimeUnit.SECONDS), this);
	}
	
	//(new TouchAction(driver)).tap(283, 150).perform()
	
	//-------------------List of Webelements--------------------------------------------------------------------	

	

		
@iOSFindBy(accessibility= "Book a Trainer") WebElement bookTrainerHome;
@iOSFindBy(accessibility = "Allow") WebElement allow_button;
@iOSFindBy(accessibility = "Don't Allow") WebElement donotAllow_button;
@iOSFindBy(xpath ="(//XCUIElementTypeTextField[@name=\"AX error -25205\"])[3]") WebElement locationField;
//@iOSFindBy(xpath ="//XCUIElementTypeButton[@label = 'Clear text']") WebElement ClearButton;
@iOSFindBy(accessibility="Clear text") WebElement ClearButton;
//@iOSFindBy(xpath ="//XCUIElementTypeButton[@label = 'Use this Location']") WebElement useThisLocation_button;
@iOSFindBy(accessibility="Use this Location") WebElement useThisLocation_button;
@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label = 'SANTA MONICA']") WebElement dropdownselect;
//@iOSFindBy(accessibility="SANTA MONICA, CA 90405, United States") WebElement dropdownselect;
@iOSFindBy(accessibility= "developer4 handstand") WebElement trainerSelect;
@iOSFindBy(accessibility = "Start Booking") WebElement startBookingButton;
@iOSFindBy(accessibility ="Confirm Details") WebElement confirmDetailsButton;
@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'Select Date/Time']") WebElement dateTime_field;
@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'Select Workout Type']") WebElement workoutType_field;
@iOSFindBy(accessibility = "Power Yoga") WebElement select_PowerYoga;
@iOSFindBy(accessibility = "No active plan") WebElement selectplanOption;
@iOSFindBy(accessibility = "1 Session, $79") WebElement selectSingleSession;
@iOSFindBy(accessibility = "Pay Now") WebElement payNowButton;


//XCUIElementTypeButton







public WebElement book_trainer_home()  {
	return bookTrainerHome;
}
	
public WebElement allow()  {
	return bookTrainerHome;
}

public WebElement donot_allow()  {
	return donotAllow_button;
}
	
public WebElement location_field() {
	return locationField;
	
}

public WebElement clear_button() {
	return ClearButton;
	
}

public WebElement drop_down_select() {
	return dropdownselect;
	
}

public WebElement use_this_location_button() {
	return useThisLocation_button;
	
}


public WebElement trainer_select() {
	return trainerSelect;
}

public WebElement start_booking_button() {
	return startBookingButton;
}

public WebElement confirm_details_button() {
	return confirmDetailsButton;
}


public WebElement dateTime_option() {
	return dateTime_field;

}

public WebElement WorkoutType_option() {
	return workoutType_field;


}


public WebElement PowerYoga_option() {
	return select_PowerYoga;
	
	
}

public WebElement selectPlan_option() {
	return selectplanOption;


}


public WebElement select_Single_Session_() {
	return selectSingleSession;
}

public WebElement pay_now_button_() {
	return payNowButton;
}}