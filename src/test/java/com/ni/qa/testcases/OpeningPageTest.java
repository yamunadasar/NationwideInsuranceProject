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

public class OpeningPageTest extends TestBase {
	
	
	
	@Test(priority=1)
	public void verifylogo() {
		
		boolean flag=op.logo();
		Assert.assertTrue(flag);	
	
	}
	
	@Test(priority=2)
	public void verifyclickauto() {
		
		
		op.ClickonAuto();
		op.inputzipcode();
		op.clickonstarturquote();
		String title=driver.getTitle();
		String realTitle="Nationwide MultiQuote";
		Assert.assertEquals(title, realTitle);
		
		
		
	}
	
	

}
