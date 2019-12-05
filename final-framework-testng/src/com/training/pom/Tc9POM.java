package com.training.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc9POM {
private WebDriver driver; 
	
	public Tc9POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(id="keyword_search")
	private WebElement search; 
	
	@FindBy(xpath="//*[@id=\"_property_type_chosen\"]/a/span")
	public WebElement propertytype;
	

	@FindBy(xpath="//ul[@class='chosen-results']/li[@data-option-array-index='3']")
	private WebElement plot;
	
	@FindBy(xpath="//*[@id=\"realteo-search-form\"]/div[2]/div[2]/div/a")
	private WebElement regions;
	
	
	@FindBy(xpath="//ul[@class = 'chosen-results']/li[@class='active-result' and contains(text(), 'Central Bangalore')][1]")
	private WebElement textbox;
	
	
	
	@FindBy(xpath="//*[@id=\'realteo-search-form\']/div[3]/div/button")
	private WebElement searchBtn;
	
	
	public void sendSearch(String Search) {
		this.search.clear();
		this.search.sendKeys(Search);
	}
	
	public void clickpropertyType() {
		this.propertytype.click(); 
	}
	
	
	public void clickplots() {
		this.plot.click();
	}
	
	public void clickregions() {
		this.regions.click(); 
	}
	
	public void clicktextbox() {
		this.textbox.click();
	}
			
	public void clickSearchBtn() {
		this.searchBtn.click(); 
	}

	
}





