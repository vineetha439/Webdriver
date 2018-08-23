package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class google_Links {
	public WebDriver driver;
	
  @Test
  public void f() {
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	for (int i = 0; i <links.size(); i++) {
		System.out.println(links.get(i).getText());
		
	}
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }

}
