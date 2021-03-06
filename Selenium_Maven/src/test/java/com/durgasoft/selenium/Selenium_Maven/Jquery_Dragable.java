package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Jquery_Dragable {
		
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.switchTo().frame(0);
	  WebElement drag = driver.findElement(By.id("draggable"));
	  Actions a = new Actions(driver);
	  a.clickAndHold(drag).moveByOffset(30, 200).release().build().perform();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/draggable/");
	  driver.manage().window().maximize();
	  
  }

}
