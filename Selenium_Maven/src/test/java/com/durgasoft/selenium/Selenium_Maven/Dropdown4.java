package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Dropdown4 {
	public WebDriver driver;

	
  @Test
  public void f() {
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://bbc.com");
	  driver.manage().window().maximize();
	  
  }

}
