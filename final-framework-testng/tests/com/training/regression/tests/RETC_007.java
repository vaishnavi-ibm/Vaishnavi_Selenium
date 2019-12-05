package com.training.regression.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RETC_007 {

	 public WebDriver driver;
	 @Test()
	 public void loginSuccess() throws InterruptedException  {
		 
		 
	 		driver.findElement(By.xpath("//span[@class='listing-compact-title']")).click();
	 		driver.findElement(By.name("your-name")).sendKeys("reva");
	 		driver.findElement(By.name("your-email")).sendKeys("revasharma@gmail.com");
	 		driver.findElement(By.name("your-subject")).sendKeys("apartments");
	 		driver.findElement(By.name("your-message")).sendKeys("looking for an apartments");
	 		driver.findElement(By.xpath("//input[@type='submit']")).click();
	 		driver.findElement(By.id("amount")).sendKeys("400000");
	 		driver.findElement(By.id("downpayment")).sendKeys("20000");
	 		driver.findElement(By.id("years")).sendKeys("20");
	 		driver.findElement(By.id("interest")).sendKeys("7.25");
	 		driver.findElement(By.xpath("//button[@class ='button calc-button']")).click();
	       Thread.sleep(3000);
	 }
		 @BeforeClass
		  public void beforeClass() {
			  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
			  driver =new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("http://realestatem1.upskills.in/region/new-launch-in-bangalore/");
	}
		  @AfterClass
		  public void afterClass() {
			  
	}

}


