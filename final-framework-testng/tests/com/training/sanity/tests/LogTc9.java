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
import com.training.pom.Tc9POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogTc9 {
	private WebDriver driver;
	private String baseUrl;
	private Tc9POM tc9POM;
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
		tc9POM = new Tc9POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		//Thread.sleep(1000);
		    
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		
		tc9POM.sendSearch("Electronic City");
		tc9POM.clickpropertyType(); 
		tc9POM.clickplots(); 
		tc9POM.clickregions(); 
		tc9POM.clicktextbox();
		tc9POM.clickSearchBtn(); 
		//Thread.sleep(30000);
		//screenShot.captureScreenShot("First");
	}
}


