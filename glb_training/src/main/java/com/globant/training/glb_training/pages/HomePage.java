package com.globant.training.glb_training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(id="searchInput")
	private WebElement searchInput;
	
	
	@FindBy(id="searchLanguage")
	private WebElement searchLanguage;
	
	@FindBy(xpath="//*[@id='search-form']/fieldset/button")
	private WebElement submitButton;
	
	public void go(WebDriver driver){
		driver.get("https://www.wikipedia.org/");		
	}
	
	
	public void search(String query,String language){
		searchInput.sendKeys(query);
		searchLanguage.sendKeys(language);
		submitButton.click();
	}
	
	
	
}
