package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Tc8POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogTc8 {
	private WebDriver driver;
	private String baseUrl;
	private Tc8POM tc8POM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		tc8POM = new Tc8POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		    
	}
	@Test
	public void validLoginTest() {
		tc8POM.clickTitle(); 
		tc8POM.sendAmount("400000");
		tc8POM.senddownPayment("20000");
	    tc8POM.sendYears("20");
	 	tc8POM.sendInterest("7.25");
	 	tc8POM.clickCalculateBtn(); 
	 	tc8POM.display();
		//screenShot.captureScreenShot("First");
	}
}
