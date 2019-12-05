package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc51POM {
	private WebDriver driver; 
	
	
	public Tc51POM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"menu-posts-property\"]/a/div[3]")
	private WebElement properties;
	
	@FindBy(xpath="//li[@class='wp-first-item']/a[text()='All Properties']")
	private WebElement allproperties; 
	
	@FindBy(xpath="//*[@id=\"wpbody-content\"]/div[3]/ul/li[5]/a")
	private WebElement trash;
	
	@FindBy(xpath=("//*[@id=\"post-7220\"]/td[1]/strong"))
	private WebElement property1;
	
	@FindBy(xpath=("//*[@id=\"post-7220\"]/td[1]/div[2]/span/a[text()='Restore']"))
    private WebElement restore;
	
	@FindBy(xpath=("//*[@id=\"wpbody-content\"]/div[3]/ul/li[1]/a"))
	private WebElement alllink;
	
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
	
	public void hoverProperties() {
		Actions action =new Actions(driver);
	action.moveToElement(properties).build().perform(); 
	}
				
	public void clickAllProperties() {
		this.allproperties.click(); 
	}

	public void clickTrash() {
		this.trash.click();
	}
	public void hoverProperty1() {
		Actions action =new Actions(driver);
		action.moveToElement(property1).build().perform(); 
		}
	public void clickRestore() {
		this.restore.click();
	}
	
	public void clickAllLink() {
		this.alllink.click();
	}


}
