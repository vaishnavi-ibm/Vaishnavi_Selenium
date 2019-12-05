package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc65POM {
private WebDriver driver; 
	
	
	public Tc65POM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"menu-posts\"]/a/div[3]")
	private WebElement post;
	
	
	@FindBy(xpath="//*[@id=\"menu-posts\"]/ul/li[2]/a[text()='All Posts']")
	private WebElement allposts;
	
	@FindBy(xpath="//*[@id=\"wpbody-content\"]/div[3]/a[text()='Add New']")
	private WebElement addnew;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	private WebElement title;
	
	@FindBy(xpath="//*[@id=\"content\"]")
	private WebElement textbox;
	
	@FindBy(xpath="//ul[@class='categorychecklist form-no-clear']/li[24]/label[1]/input")
	private WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"misc-publishing-actions\"]/div[1]/a/span[text()='Edit']")
	private WebElement edit;
	
	@FindBy(xpath="//*[@id=\"post_status\"]")
	private WebElement dropdown;
	
	@FindBy(xpath="//*[@id=\"post_status\"]/option[1]")
	private WebElement review;
	
	@FindBy(xpath="//*[@class='button button-primary button-large']")
	private WebElement publish;
	
	@FindBy(xpath="//*[@id=\"message\"]/p/a[text()='View post']")
	private WebElement view;
	
	@FindBy(xpath="//*[@id=\"wp-admin-bar-my-account\"]/a/span")
	     private WebElement admin;
	
	@FindBy(xpath="//*[@id=\"wp-admin-bar-logout\"]/a[text()='Log Out']")
	//@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/div/ul/li[3]/a")
	private WebElement logout;
	
	@FindBy(xpath="//*[@id=\"logo\"]/h2/a")
	private WebElement homepage;
	
	@FindBy(xpath="//*[@id=\"menu-item-617\"]/a")
	private WebElement blog;
	
	@FindBy(xpath="//*[@id=\"ajaxsearchlite1\"]/div/div[3]/form/input[1]")
	private WebElement search;
	
	@FindBy(xpath="//*[@id=\"mCSBap_1_container\"]/div/div[1]/div[1]/h3/a/span")
	private WebElement title1;
	
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
	
	public void hoverPosts() {
		Actions action =new Actions(driver);
	action.moveToElement(post).build().perform(); 
	}
	
				
	public void clickallpost(){
		this.allposts.click();
		
	}
	
	public void clickaddnew() {
		this.addnew.click();
	}
	
	public void sendtitle(String title) {
		this.title.sendKeys(title);
		}
	public void sendtextbox(String textbox) {
		this.textbox.sendKeys(textbox);
		}
	
	public void clickcheckbox() {
		this.checkbox.click();
	}
	public void clickedit() {
		this.edit.click();
	}
	public void clickdropdown() {
		this.dropdown.click();
	}
	public void clickreview() {
		this.review.click();
	}
	
	public void clickpublish() {
		this.publish.click();
	}
	
	public void clickView() {
		this.view.click();
	
	}
	
	
    public void hoveradmin() {
		Actions action =new Actions(driver);
		action.moveToElement(admin).build().perform(); 
	}
	
	public void clicklogout() {
		this.logout.click();
	}
	public void clickhomepage() {
		this.homepage.click();
	}
	public void clickblog() {
		this.blog.click();
	}
	
	public void sendsearch(String search) {
		this.search.sendKeys(search);
		}
	public void clickTitle1() {
		this.title1.click();
	}
}
