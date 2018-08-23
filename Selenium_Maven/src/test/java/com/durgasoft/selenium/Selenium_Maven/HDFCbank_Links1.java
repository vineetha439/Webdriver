package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class HDFCbank_Links1 {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Total links in application:"+links.size());
	int count=0;
	for (int i = 0; i <links.size(); i++) {
		if(!links.get(i).getText().isEmpty()) {
			count=count+1;
		System.out.println(count+"."+links.get(i).getText());
		
		//links = driver.findElements(By.tagName("a"));
		
		}
	}
	System.out.println("visible links are:"+count);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://hdfcbank.com");
	  driver.manage().window().maximize();
  }

}
