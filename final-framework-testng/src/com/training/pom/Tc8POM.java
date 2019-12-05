package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc8POM {
	private WebDriver driver; 
	
	public Tc8POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='listing-compact-title']")
	private WebElement title; 
	
	@FindBy(id="amount")
	private WebElement amount; 
	
	@FindBy(id="downpayment")
	private WebElement downpayment;
	
	@FindBy(id="years")
	private WebElement years;
	
	@FindBy(id="interest")
	private WebElement interest;
	
	
	@FindBy(xpath="//*[@id=\"widget_mortgage_calc_properties-4\"]/form/button")
	private WebElement calculateBtn; 
		
	@FindBy(xpath="//*[@id=\"widget_mortgage_calc_properties-4\"]/form/div[5]/div")
	private WebElement message1;
	
	@FindBy(xpath="//*[@id=\"widget_mortgage_calc_properties-4\"]/form/div[5]/div/strong")
	private WebElement message2;
	
	public void clickTitle() {
		this.title.click(); 
	}
	
	public void sendAmount(String Amount) {
		this.amount.clear();
		this.amount.sendKeys(Amount);
	}
	
	public void senddownPayment(String downPayment) {
		this.downpayment.clear(); 
		this.downpayment.sendKeys(downPayment); 
	}
	
	public void sendYears(String Years) {
		this.years.clear(); 
		this.years.sendKeys(Years); 
	}
	
	public void sendInterest(String Interest) {
		this.interest.clear(); 
		this.interest.sendKeys(Interest); 
	}
				
	public void clickCalculateBtn() {
		this.calculateBtn.click(); 
	}
	public void display() {
		String message1 = this.message1.getText();
		System.out.println(message1);
		
				}
}



