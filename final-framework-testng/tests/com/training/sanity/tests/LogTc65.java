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
import com.training.pom.Tc65POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LogTc65 {
	private WebDriver driver;
	private String baseUrl;
	private Tc65POM tc65POM;
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
		tc65POM = new Tc65POM(driver); 
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
		tc65POM.clicksignin(); 
		tc65POM.sendUser("admin");
		tc65POM.sendPass("admin@123");
	    tc65POM.clickLogin();
	 	tc65POM.hoverPosts();
	 	tc65POM.clickallpost();
	 	tc65POM.clickaddnew();
	 	tc65POM.sendtitle("New Launches_TC65AB");
	 	tc65POM.sendtextbox(" New Launch_TC65AB in HomeVillas");
	 	tc65POM.clickcheckbox();
	 	tc65POM.clickedit();
	 	tc65POM.clickdropdown();
	 	tc65POM.clickreview();
	 	tc65POM.clickpublish();
	 	tc65POM.hoveradmin();
	    tc65POM.clicklogout();
	    tc65POM.clickhomepage();
	    tc65POM.clickblog();
	    tc65POM.sendsearch("New Launches_TC65AB");
	    tc65POM.clickTitle1();
	 	
		
	}
}






