package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BootStrapRadiobutton {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  WebElement radio = driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
	  List<WebElement> radiobutton = radio.findElements(By.name("group1"));
	  System.out.println(radiobutton.size());
	  
	  for (int i = 0; i <radiobutton.size(); i++) {
		  System.out.println(radiobutton.get(i).getAttribute("value")+"---"+radiobutton.get(i).getAttribute("checked"));
		
	}
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://echoecho.com/htmlforms10.htm");
	  driver.manage().window().maximize();
  }

}
