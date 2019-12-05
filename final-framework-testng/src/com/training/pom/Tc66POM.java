package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc66POM {
private WebDriver driver; 
	
	
	public Tc66POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"responsive\"]/li[7]/a")
	private WebElement signin; 
	
	@FindBy(id=("user_login"))
	private WebElement user;
	
	@FindBy(id="user_pass")
	private WebElement pass;
	
	@FindBy(name=("login"))
	private WebElement login;
	
	@FindBy(xpath="//*[@id=\"wp-admin-bar-site-name\"]/a")
	private WebElement realstate;
	
	@FindBy(xpath="//*[@id=\"menu-item-354\"]/a")
	private WebElement newlaunch;
	
	@FindBy(xpath="//*[@id=\"wpmm-megamenu\"]/div/div[2]/div[2]/a[text()='Donec quis']")
	private WebElement apartment;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[1]/label/span/input")
	private WebElement name;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[2]/label/span/input")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[3]/label/span/input")
	private WebElement subject;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[4]/label/span/textarea")
	private WebElement message;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[5]/input")
	private WebElement sendbtn;
	
	@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/div[2][@class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ng']")
	private WebElement message1;
	
	
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
	
	public void hoverNewLaunch() {
		Actions action =new Actions(driver);
		action.moveToElement(newlaunch).build().perform(); 
		}
	
	public void clickApartment() {
		this.apartment.click();
	}
	
	public void sendName(String Name) {
		this.name.sendKeys(Name);
	}
	public void sendEmail(String Email) {
		this.email.sendKeys(Email);
	}
	
	public void sendSubject(String Subject) {
		this.subject.sendKeys(Subject);
	}
	public void sendMessage(String Message) {
		this.message.sendKeys(Message);
	}
	
	public void clickSendBtn() {
		this.sendbtn.click();
	}
	
	public void display() {
		String message1 = this.message1.getText();
		System.out.println(message1);
				}
	
}
