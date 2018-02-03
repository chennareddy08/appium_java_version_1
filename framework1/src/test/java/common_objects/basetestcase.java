package common_objects;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.FlickAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;
import utility.Common_functions;

public class basetestcase {

	
	protected static WebDriver driver;

	@BeforeClass
	public void setup() throws MalformedURLException {
	File classpathRoot = new File(System.getProperty("user.dir"));  
		File appDir = new File(classpathRoot,"/app/");
		File app = new File(appDir,"HandstandStage.ipa");
	   File configDir = new File (classpathRoot,"/app/");
	   File config  = new File(configDir,"Config.xcconfig");
		// Created object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("deviceName", "iPod touch");
		//capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("noReset", "true");
	    capabilities.setCapability("autoAcceptAlerts	", "true");
	    capabilities.setCapability("--session-override", "true");
       capabilities.setCapability("platformVersion", "9.3.5");
       // capabilities.setCapability("platformVersion", "10.3.2");
		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("xcodeOrgId","PJEK78SY7H");   
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("udid", "1c42a464b8e12a75625ef88ba6e59c08ac8d5ed3");
        //capabilities.setCapability("udid", "84970839f5109ea46fc4e271fe918408d269e9df");
        capabilities.setCapability("xcodeConfigfile", config.getAbsolutePath());
		  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  Common_functions.driver = driver;
//		  try {
//			  driver.findElement(By.id("OK")).click();
//			  
////				cf.skip_button().click();
////				cf.start_screen().click();
//				//driver.switchTo().alert().accept();
//				} catch (NoAlertPresentException e) {
//				Log.getLogger("Alert is not present" + e.getMessage());
//				}
	}
	
	@AfterClass
      public void End() {
    	  driver.quit();
	 }
}
	




