package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BBC_Links2 {
	
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  WebElement header = driver.findElement(By.xpath("//div[@class='most-popular']"));
	  List<WebElement> links = header.findElements(By.tagName("a"));
	  System.out.println("Available links are:"+links.size());
	  for (int i = 0; i < links.size(); i++) {
		  System.out.println(links.get(i).getText());
		  links.get(i).click();
		  Thread.sleep(8000);
		  System.out.println(driver.getCurrentUrl());
		  driver.navigate().back();
		  Thread.sleep(5000);
		  header = driver.findElement(By.xpath("//div[@class='most-popular']"));
		  links = header.findElements(By.tagName("a"));
	}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://BBC.com");
	  driver.manage().window().maximize();
	  
  }

}
