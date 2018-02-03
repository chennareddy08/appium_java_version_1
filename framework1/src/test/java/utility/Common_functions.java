package utility;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_objects.booking_rebook_pageobjects;
import io.appium.java_client.AppiumDriver ;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Common_functions {
	
	//Initialization mandatory
static public WebDriver driver;
//public static AppiumDriver driver1;
	
public static boolean performClick(WebElement element2click) {
	if(driver == null)
	{
		System.out.println("Common Function driver not initialized");
		return false;
	}
	new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(element2click));
	if(element2click!=null) {
		element2click.click();
		return true;
	}
	return false;

}



public static boolean waitfor_element(WebElement element) {
	if(driver == null)
	{
		System.out.println("Common Function driver not initialized");
		return false;
	}
	new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated((By) element));
	if(element!=null) {
		return true;
	}
	return false;

}






public static boolean isElementPresent(final WebElement element2verify, String elementName) {
	
	if(element2verify!=null && element2verify.isDisplayed()){
  	  
		System.out.println(elementName+" is Visible");
  	  return true;
  	  }
    else{
  	  System.out.println(elementName+" is InVisible");
  	  return false;
  	  }}

public static boolean searchtrainer(CharSequence[] e1, CharSequence[] e2) {
	 booking_rebook_pageobjects bo = new  booking_rebook_pageobjects(driver);
	if(driver == null)
	{
		System.out.println("Common Function driver not initialized");
		return false;
	}
if(e1!=null && e2!=null){
		bo.location_field().sendKeys(e1);
		bo.location_field().sendKeys(e2);
		return true;
	}
	return false;
}


}











