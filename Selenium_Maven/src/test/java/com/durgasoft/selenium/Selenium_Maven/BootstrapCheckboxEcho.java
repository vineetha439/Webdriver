package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BootstrapCheckboxEcho {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  List<WebElement> checkbox = driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
	  System.out.println(checkbox.size());
	  for (int i = 0;i<checkbox.size(); i++) {
		  System.out.println(checkbox.get(i).getAttribute("value")+"---"+checkbox.get(i).getAttribute("checked"));
		  checkbox.get(i).click();
			  
	}
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://echoecho.com/htmlforms09.htm");
	  driver.manage().window().maximize();
  }

}
