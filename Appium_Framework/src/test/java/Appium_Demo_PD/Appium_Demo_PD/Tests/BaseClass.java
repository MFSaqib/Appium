package Appium_Demo_PD.Appium_Demo_PD.Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;

public class BaseClass {

	static AppiumDriver<WebElement> driver;
	
		@BeforeTest
		public static void setup() throws Exception
		
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			
			// Define the capabilities 
			
			cap.setCapability("devicename", "ONEPLUS A6000");
			cap.setCapability("udid", "f94268a4");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "10");
			
			
			// Application capabilities
			cap.setCapability("appPackage", "com.oneplus.calculator");
			cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
			
			// Passing values to Driver and performing actions
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<WebElement>(url,cap);
			System.out.println("Appium started");
			
			
		}

		@AfterTest
		public static void teardown()
		{
			driver.close();
		}
	}