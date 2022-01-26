package com.ni.qa.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ni.qa.pages.CarInfoPage;
import com.ni.qa.pages.OpeningPage;

//import com.crm.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public  OpeningPage op;
	public CarInfoPage carinfo;
	
	
	@BeforeClass()
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		driver.get("https://www.nationwide.com/sem/brand-b-pey.html?utm_medium=cpc&utm_source=google&utm_campaign=ni&utm_content=brand:desktop:google:na:um:na:brand-core&utm_term=nationwide%20insurance&engine=GoogleBrandGeneric&TFN=18888910148&tfn=18888910148&gclid=CjwKCAiAxJSPBhAoEiwAeO_fPzbUKIqUJZ-xh8aDV5t1WE_sJS-0HlbjCDRgVT_Sxzis5lk52ugxMBoCHDEQAvD_BwE");
	    //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");	
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
          op= new OpeningPage();
          carinfo=new CarInfoPage();
		
		
	}
 
   @AfterClass()
	public void teardown() {
		
	//driver.close();
		
	}
}
