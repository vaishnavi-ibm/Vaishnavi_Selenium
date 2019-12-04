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
import com.training.pom.Tc51POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogTc51 {

	private WebDriver driver;
	private String baseUrl;
	private Tc51POM tc51POM;
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
		tc51POM = new Tc51POM(driver); 
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
		tc51POM.clicksignin(); 
		tc51POM.sendUser("admin");
		tc51POM.sendPass("admin@123");
	    tc51POM.clickLogin();
	 	tc51POM.hoverProperties();
	 	tc51POM.clickAllProperties(); 
	 	tc51POM.clickTrash();
	 	tc51POM.hoverProperty1();
	 	tc51POM.clickRestore();
	 	tc51POM.clickAllLink();
		//screenShot.captureScreenShot("First");
	}
}




