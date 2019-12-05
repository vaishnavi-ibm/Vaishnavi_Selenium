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
import com.training.pom.Tc66POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogTc67 {
	

	private WebDriver driver;
	private String baseUrl;
	private Tc66POM tc66POM;
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
		tc66POM = new Tc66POM(driver); 
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
	public void validLoginTest() {
		tc66POM.clicksignin(); 
		tc66POM.sendUser("admin");
		tc66POM.sendPass("admin@123");
	    tc66POM.clickLogin();
	 	tc66POM.clickRealState();
	 	tc66POM.hoverNewLaunch();
	 	tc66POM.clickApartment();
	 	tc66POM.sendName("manzoor");
	 	tc66POM.sendEmail(" manzoor@gmail.com");
	 	tc66POM.sendSubject("apartments");
	 	tc66POM.sendMessage("looking for an apartments");
	 	tc66POM.clickSendBtn();
	 	tc66POM.display();
	 	
	 	
		
	}
}









	
	


