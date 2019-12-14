package com.leafBot.testng.api.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.DataLibrary;

public class ProjectSpecificMethods {
	public String excelFileName;
	public static ChromeDriver driver; 
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	
  }
  
  
  
  
  
  
  
  
  
  
  
  

}
