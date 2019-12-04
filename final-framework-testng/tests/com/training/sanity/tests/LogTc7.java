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
import com.training.pom.Tc7POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogTc7 {

	private WebDriver driver;
	private String baseUrl;
	private Tc7POM tc7POM;
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
		tc7POM = new Tc7POM(driver); 
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
		
		  tc7POM.clickTitle(); 
		  tc7POM.sendName("reva");
		  tc7POM.sendEmail("revasharma@gmail.com");
		  tc7POM.sendSubject("apartments");
		  tc7POM.sendMessage("looking for an apartments"); 
		  tc7POM.clickSendBtn();
		 //screenShot.captureScreenShot("First");
		
	}
	}



