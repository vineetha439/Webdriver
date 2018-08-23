package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Dropdown3 {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	   List<WebElement> str = new Select((WebElement) driver.findElements(By.id("searchDropdownBox"))).getOptions();
	   	System.out.println(str.size());
	   	for(int i=0; i<str.size();i++) {
	   		System.out.println(str.get(i).getText());
	   	}
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://amazon.in");
	  driver.manage().window().maximize();
	  
  }

}
