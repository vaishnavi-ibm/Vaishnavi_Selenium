package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.Tc52POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogTc52 {

	private WebDriver driver;
	private String baseUrl;
	private Tc52POM tc52POM;
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
		tc52POM = new Tc52POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		    
	}
	@Test
	public void validLoginTest() {
		tc52POM.clicksignin(); 
		tc52POM.sendUser("admin");
		tc52POM.sendPass("admin@123");
	    tc52POM.clickLogin();
	 	tc52POM.hoverProperties();
	 	tc52POM.clickAllProperties(); 
	 	tc52POM.hoverProperty1();
	 	tc52POM.clickTrashP();
	 	tc52POM.clickTrash();
	 	tc52POM.hoverPtrash();
	 	tc52POM.clickDelete();
	}
}


