package com.training.pom;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Tc7POM {
		private WebDriver driver; 
		
		public Tc7POM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//span[@class='listing-compact-title']")
		private WebElement title; 
		
		@FindBy(name="your-name")
		private WebElement name;
		
		@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[2]/label/span/input")
		private WebElement email;
		
		@FindBy(xpath="//*[@id=\"wpcf7-f4-o1\"]/form/p[3]/label/span/input")
		private WebElement subject;
		
		@FindBy(name="your-message")
		private WebElement message;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement sendBtn; 
		
		public void clickTitle() {
			this.title.click(); 
		}
		public void sendName(String Name) {
			this.name.clear();
			this.name.sendKeys(Name);
		}
		
		public void sendEmail(String Email) {
			this.email.clear(); 
			this.email.sendKeys(Email); 
		}
		
		public void sendSubject(String Subject) {
			this.subject.clear(); 
			this.subject.sendKeys(Subject); 
		}
		
		public void sendMessage(String Message) {
			this.message.clear(); 
			this.message.sendKeys(Message); 
		}
					
		public void clickSendBtn() {
			this.sendBtn.click(); 
		}
	}


