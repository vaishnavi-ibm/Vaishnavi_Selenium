package com.training.regression.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RETC54 {
	public WebDriver driver;
	 @Test()
	 public void loginSuccess() throws InterruptedException, AWTException  {
		 
		 
	 		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
	 		driver.findElement(By.id("user_login")).sendKeys("admin");
	 		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
	 		driver.findElement(By.name("login")).click();
	 		driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-site-name\"]/a")).click();
	 		driver.findElement(By.xpath("//*[@id=\"menu-item-617\"]/a")).click();
		 	WebElement readmore =driver.findElement(By.xpath("//div[@class='post-content']/a[1]"));
	 		Actions action =new Actions(driver);
	 		 action.contextClick(readmore).build().perform();
		        Robot robot =new Robot();
				robot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
				ArrayList<String> windows =new ArrayList<>(driver.getWindowHandles());
				driver.switchTo().window(windows.get(1));
				driver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys("Verify T054");
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"commentform\"]/p[1]/a[2]")).click();
				WebElement login=driver.findElement(By.xpath("//*[@id=\"responsive\"]/li[7]/a"));
				action.contextClick(login).build().perform();
				robot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
				driver.switchTo().window(windows.get(1));
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"responsive\"]/li[7]/a[@class='sign-in']")).click();
		 		driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("admin");
		 		driver.findElement(By.id("user_pass")).sendKeys("admin@123");
		 		driver.findElement(By.name("login")).click();
		 		driver.findElement(By.xpath("//*[@id=\"menu-dashboard\"]/a/div[3][@class='wp-menu-name']")).click();
		 		WebElement recentc=driver.findElement(By.xpath("//*[@id=\"latest-comments\"]/ul[1]/li[1]/div[1]/blockquote/p"));
			 		action.moveToElement(recentc).build().perform();
			 		driver.findElement(By.xpath("//*[@id=\"latest-comments\"]/ul[1]/li[1]/div[1]/p[2]/span[3]/a")).click();
                    driver.findElement(By.xpath("//*[@id=\"latest-comments\"]/ul[1]/div/fieldset/div[1]//textarea[@name ='replycontent']")).sendKeys("Thanks for TC054");
	                driver.findElement(By.xpath("//*[@id=\"latest-comments\"]/ul[1]/div/fieldset/div[3]//p/a/span[3][@id='replybtn']")).click();
	                driver.navigate().refresh();
	 
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
