package com.ni.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ni.qa.base.TestBase;

public class OpeningPage extends TestBase {

	public OpeningPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[name()='svg'  and @name='Car_Front_View-outline']")
	WebElement autoicon;

	@FindBy(xpath = "//input[@id='auto-zip']")
	WebElement zipcode;

	@FindBy(xpath = "//form[@id='AutoQuoteForm']//input[@title='Start your quote']")
	WebElement startyourquoteBtn;

	@FindBy(xpath = "//div[@id='headerIcon']")
	WebElement logo;

	public void inputzipcode() {
		zipcode.sendKeys("06001");
	}

	public void clickonstarturquote() {
		//startyourquoteBtn.click();
		startyourquoteBtn.sendKeys(Keys.ENTER);

	}

	public boolean logo() {
		logo.isDisplayed();
		return true;
	}

	public void ClickonAuto() {

		Actions action = new Actions(driver);
		action.moveToElement(autoicon).click().build().perform();

	}
}
