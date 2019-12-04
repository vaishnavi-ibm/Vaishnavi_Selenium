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
import com.training.pom.Tc54POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogTc54 {
	private WebDriver driver;
	private String baseUrl;
	private Tc54POM tc54POM;
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
		tc54POM = new Tc54POM(driver); 
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
		tc54POM.clicksignin(); 
		tc54POM.sendUser("admin");
		tc54POM.sendPass("admin@123");
	    tc54POM.clickLogin();
	 	tc54POM.clickRealState();
	 	tc54POM.clickblog(); 
	 	tc54POM.clickReadMore();
	 	tc54POM.sendComment("Verify TC054AB");
	 	tc54POM.clickSubBtn();
	 	tc54POM.clickLogout();
	 	tc54POM.clickLoginN();
	 	tc54POM.clicksignin(); 
		tc54POM.sendUser("admin");
		tc54POM.sendPass("admin@123");
	    tc54POM.clickLogin();
	    tc54POM.clickDashboard();
	    tc54POM.clickRecentComment();
	    tc54POM.clickreply();
	    tc54POM.sendMessage("Verified TC054AB");
	    tc54POM.clickReplyBtn();
	    driver.navigate().refresh();
	    
	    
	
	}
}






