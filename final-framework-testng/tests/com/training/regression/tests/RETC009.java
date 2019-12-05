package com.training.regression.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RETC009 {
	public WebDriver driver;
	@Test()
	
	 public void loginSuccess() throws InterruptedException  {
		 
	 
	 		
	 		driver.findElement(By.xpath("//*[@id=\"keyword_search\"]")).sendKeys("Electronic City");
	 		//Thread.sleep(1000);
	 		driver.findElement(By.xpath("//*[@id='_property_type_chosen']")).click();
		 		
	 	 		driver.findElement(By.xpath("//ul[@class='chosen-results']/li[@data-option-array-index='3']")).click();
	 	 		// driver.findElement(By.linkText("Property type")).click();
	 	       //driver.findElement(By.cssSelector(".active-result:nth-child(4)")).click();
	 	       // driver.findElement(By.cssSelector(".chosen-default > span")).click();
	 	        //driver.findElement(By.cssSelector(".result-selected:nth-child(2)")).click();
	
	
	 }
		 @BeforeClass
		  public void beforeClass() {
			  System.setProperty("webdriver.chrome.driver","C:\\Selenium Jar\\chromedriver.exe");
			  driver =new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("http://realestatem1.upskills.in/region/new-launch-in-bangalore/");
	}
		  @AfterClass
		  public void afterClass() {
			  
	}

}

