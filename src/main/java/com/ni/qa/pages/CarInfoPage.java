package com.ni.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ni.qa.base.TestBase;

public class CarInfoPage extends TestBase{
	
	
	@FindBy(xpath="//input[@id='gs-first-name']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='gs-last-name']")
	WebElement LastName;
	
	@FindBy(xpath="//select[@id='gs-quote-state']")
	WebElement stateDD;
	
	@FindBy(xpath="//div[@class='checkbox ng-tns-c128-26 ng-star-inserted']")
	WebElement Autocheckbox;
	
	@FindBy(xpath="//button[@id='nav-continue']")
	WebElement AgreeBtn;
	

	@FindBy(xpath="//h1[contains(text(),'Smart. This is the fast track. Let’s get started')]")
	WebElement headingtext;
	
	
	
	
	public CarInfoPage() {
		
		PageFactory.initElements(driver, this);
	}
	

	
 public void InputInformation() {
	 
	 FirstName.sendKeys("Prajwal");
	 LastName.sendKeys("Dasar");
	Select selectObject = new Select(stateDD);
     selectObject.selectByValue("CT");
     AgreeBtn.click();
     
	 
 }
 
 
	
}
