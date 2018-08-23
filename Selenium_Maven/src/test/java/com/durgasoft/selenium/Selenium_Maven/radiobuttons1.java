package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class radiobuttons1 {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  List<WebElement> radioboxes = driver.findElements(By.xpath("//input[@type='radio']"));
	  System.out.println("total radio buttons are:"+radioboxes.size());
	  int vinita=0;
	  for (int i = 0; i <radioboxes.size(); i++) {
		  vinita=vinita+1;
		System.out.println(vinita+"."+radioboxes.get(i).getAttribute("value"));
		
	}
	  
	  
}
@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
  }

}
