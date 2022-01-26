package com.ni.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ni.qa.base.TestBase;
import com.ni.qa.pages.CarInfoPage;
import com.ni.qa.pages.OpeningPage;

public class CarInfoPageTest extends TestBase {
	
	
	
	@Test(priority=3)
	
	public void verifyClickonAgreebtn() {
		
		carinfo.InputInformation();
	}

}
