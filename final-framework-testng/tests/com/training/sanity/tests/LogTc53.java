package com.training.sanity.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Tc53POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogTc53 {
	private WebDriver driver;
	private String baseUrl;
	private Tc53POM tc53POM;
	private static Properties properties;
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		tc53POM = new Tc53POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		    
	}
	@Test
	public void validLoginTest() throws AWTException, InterruptedException {
		tc53POM.clicksignin(); 
		tc53POM.sendUser("admin");
		tc53POM.sendPass("admin@123");
	    tc53POM.clickLogin();
	 	tc53POM.hoverProperties();
	 	tc53POM.clickAllProperties(); 
	 	tc53POM.clickTrash();
	 	tc53POM.hoverProperty1();
	 	tc53POM.clickRestore();
	 	tc53POM.clickDashboard();
	 	tc53POM.clickPropertiesN();
	 	tc53POM.sendsearch("TC53A");
	 	tc53POM.clickSrcBtn();
	
	}
}






