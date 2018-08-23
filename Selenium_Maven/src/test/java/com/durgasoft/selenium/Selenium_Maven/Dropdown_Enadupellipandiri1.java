package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Dropdown_Enadupellipandiri1 {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  WebElement header = driver.findElement(By.id("reg_education"));
	  List<WebElement> dd = header.findElements(By.tagName("option"));
	  System.out.println(dd.size());
	  	  for (int i = 1; i <dd.size(); i++) {
	  System.out.println(dd.get(i).getText());
	
	}
	  
	  for (int i = 1; i <dd.size(); i++) {
		  if(!dd.get(i).getText().equalsIgnoreCase("MASTERS")) {
			  System.out.println(dd.get(i).getText());
		  }
		
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.eenadupellipandiri.net/");
	  driver.manage().window().maximize();
  }

}
