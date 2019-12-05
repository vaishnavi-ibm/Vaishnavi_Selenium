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

public class newwindow {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login = driver.findElement(By.linkText("Log in"));
		Actions action =new Actions(driver);
		action.contextClick(login).build().perform();// context is used for right click
		Thread.sleep(3000);
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		//driver.close(); //close only active browser
		
		System.out.println(driver.getWindowHandle());
		ArrayList<String> windows =new ArrayList<>(driver.getWindowHandles());
		//System.out.println("total number of windows present  "+ windows.size());
		//System.out.println("title of current window is  "+ driver.getTitle());
		//driver.switchTo().window(windows.get(1));
		//System.out.println("title of switched window is   "+ driver.getTitle());
		//driver.quit();//closed all browser		

		
		
		
	}



}
