package common_objects;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import utility.Common_functions;

public class simulator_setup {

	 private static AppiumDriverLocalService service;
	 protected static AppiumDriver<IOSElement> driver;


	@BeforeClass
	public void setup() throws MalformedURLException {
		
		
	File classpathRoot = new File(System.getProperty("user.dir")); 
		File appDir = new File(classpathRoot,"/app/");
		File app = new File(appDir,"Handstand.app");
	   File configDir = new File (classpathRoot,"/app/");
	  
		// Created object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		capabilities.setCapability(MobileCapabilityType.CLEAR_SYSTEM_FILES, true);
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Handstand");
		
       capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
     
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       Common_functions.driver = driver;
//		 Common_functions.performClick(driver.findElement(By.id("OK")));
	
	}
	
	@AfterClass
      public void End() {
          if (driver != null) {
              driver.quit();
          }
         
      }}
	




