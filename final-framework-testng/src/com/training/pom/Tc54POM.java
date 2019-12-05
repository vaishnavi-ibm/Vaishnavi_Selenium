package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc54POM {
private WebDriver driver; 
	
	
	public Tc54POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"responsive\"]/li[7]/a")
	private WebElement signin; 
	
	@FindBy(name=("log"))
	private WebElement user;
	
	@FindBy(id="user_pass")
	private WebElement pass;
	
	@FindBy(name=("login"))
	private WebElement login;
	
	@FindBy(xpath=("//*[@id=\"wp-admin-bar-site-name\"]/a"))
	private WebElement realstate;
	
	@FindBy(xpath=("//*[@id=\"menu-item-617\"]/a"))
	private WebElement blog; 
	
	@FindBy(xpath=("//div[@class='post-content']/a[1]"))
	private WebElement readmore;
	
	@FindBy(xpath=("//*[@id=\"comment\"]"))
	private WebElement comment;
	
	@FindBy(xpath=("//*[@id=\"submit\"]"))
    private WebElement subbtn;
	
	@FindBy(xpath=("//*[@id=\"commentform\"]/p[1]/a[2]"))
	private WebElement logout;
	
	@FindBy(xpath=("//*[@id=\"responsive\"]/li[7]/a"))
	private WebElement loginn;
	@FindBy(xpath=("//*[@id=\"menu-dashboard\"]/a/div[3][@class='wp-menu-name']"))
	private WebElement dashbaord;
	
	@FindBy(xpath=("//*[@id=\"latest-comments\"]/ul[1]/li[1]/div[1]/blockquote/p"))
	private WebElement recentComment;
	
	@FindBy(xpath=("//*[@id=\"latest-comments\"]/ul[1]/li[1]/div[1]/p[2]/span[3]/a"))
	private WebElement reply;
	//@FindBy(xpath=("//*[@id=\"latest-comments\"]/ul[1]/div/fieldset/div[1]//textarea[@name ='replycontent']"))
	@FindBy(xpath=("//div[@id='replyrow']/fieldset/div[1]/div[1]/div[1]/textarea[@name='replycontent']"))
	private WebElement message;
	
	@FindBy(xpath=("//*[@id=\"latest-comments\"]/ul[1]/div/fieldset/div[3]//p/a/span[3][@id='replybtn']"))
	private WebElement replybtn;
	

	
	public void clicksignin() {
		this.signin.click(); 
	}
	public void sendUser(String User) {
		this.user.sendKeys(User);
	}
	
	public void sendPass(String Pass) {
	this.pass.sendKeys(Pass); 
	}
	
	public void clickLogin() {
	this.login.click(); 
	}
	
	public void clickRealState() {
	this.realstate.click();
	}
				
	public void clickblog() {
		this.blog.click(); 
	}

	public void clickReadMore() throws AWTException, InterruptedException {
		Actions action =new Actions(driver);
		 action.contextClick(readmore).build().perform();
	        Robot robot =new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			ArrayList<String> windows =new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(windows.get(1));
		
	}

	public void sendComment(String Comment) {
		this.comment.sendKeys(Comment);
	}
	
	public void clickSubBtn() {
		this.subbtn.click();
	}
	public void clickLogout() {
		this.logout.click();
		}
	public void clickLoginN() throws AWTException, InterruptedException{
		Actions action =new Actions(driver);
		action.contextClick(loginn).build().perform();
		ArrayList<String> windows =new ArrayList<>(driver.getWindowHandles());
		 Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.switchTo().window(windows.get(1));
	}
	public void clickDashboard() {
		this.dashbaord.click();
		
	}
	
public void clickRecentComment() {
	Actions action =new Actions(driver);
	action.moveToElement(recentComment).build().perform(); 
}
public void clickreply() {
	this.reply.click();
}

public void sendMessage(String Message) {
	this.message.sendKeys(Message);
}

public void clickReplyBtn() {
	this.replybtn.click();
}


}


