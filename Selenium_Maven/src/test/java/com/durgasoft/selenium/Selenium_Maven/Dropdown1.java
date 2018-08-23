package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Dropdown1 {
	public WebDriver driver;
	
  @Test
  public void f() {
//	  driver.findElement(By.id("month")).sendKeys("Jul");
	 
	  WebElement dd = driver.findElement(By.id("month"));
	  Select monthdd= new Select(dd);
	  monthdd.selectByVisibleText("Jul");
	  monthdd.selectByIndex(3);
	  monthdd.selectByValue("2");
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://facebook.com");
	  driver.manage().window().maximize();
	  
  }

}
