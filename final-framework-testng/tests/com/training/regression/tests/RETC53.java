package com.training.regression.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RETC53 {
	public WebDriver driver;
	 @Test()
	 public void loginSuccess() throws InterruptedException, AWTException  {
		 
		 
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
	       WebElement trash =driver.findElement(By.xpath("//*[@id=\"post-7154\"]/td[1]/strong"));
	        action.moveToElement(trash).build().perform();
	        driver.findElement(By.xpath("//*[@id=\"post-7154\"]/td[1]/div[2]/span[1]/a[text()='Restore']")).click();
	     	WebElement dashboard =driver.findElement(By.xpath("//*[@id=\"menu-dashboard\"]/a/div[3]"));
	        action.contextClick(dashboard).build().perform();
	        Robot robot =new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			ArrayList<String> windows =new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(windows.get(1));
			driver.findElement(By.xpath("//div[@id ='adminmenuwrap']/ul/li[8]//div[3][text()='Properties']")).click();	
			Thread.sleep(1000);
			driver.switchTo().window(windows.get(0));
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




