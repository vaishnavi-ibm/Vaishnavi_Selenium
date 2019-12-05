package com.training.regression.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RETC51 {
	public WebDriver driver;
	 @Test()
	 public void loginSuccess() throws InterruptedException  {
		 
		 
	 		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
	 		driver.findElement(By.id("user_login")).sendKeys("admin");
	 		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
	 		driver.findElement(By.name("login")).click();
	 		WebElement property=driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/a/div[3]"));
	 		Actions action =new Actions(driver);
	 		action.moveToElement(property).build().perform();// mouse hover
	 		WebElement allproperties =driver.findElement(By.xpath("//li[@class='wp-first-item']/a[text()='All Properties']"));
	    	action.moveToElement(allproperties).click().perform();
	        driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[5]/a")).click();
	        WebElement trash =driver.findElement(By.xpath("//*[@id=\"post-7149\"]/td[1]/strong"));
	        action.moveToElement(trash).build().perform();
	        WebElement restore =driver.findElement(By.xpath("//*[@id=\"post-7149\"]/td[1]/div[2][@class='row-actions']/span/a"));
	        action.moveToElement(restore).click().perform();
	        WebElement alllink =driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/ul/li[1]/a"));
	        action.moveToElement(alllink).click().perform();
	        driver.findElement(By.xpath("//*[@id=\"post-search-input\"]")).sendKeys("Test51");
	        driver.findElement(By.id("search-submit")).click();
	        
	 		
	 }
		 @BeforeClass
		  public void beforeClass() {
			  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
			  driver =new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("http://realestatem1.upskills.in/my-profile/");
	}
		  @AfterClass
		  public void afterClass() {
			  
	}



}
