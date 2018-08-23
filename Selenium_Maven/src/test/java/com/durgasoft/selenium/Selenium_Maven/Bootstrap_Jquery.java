package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Bootstrap_Jquery {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
	 WebElement header = driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
	 List<WebElement> links = header.findElements(By.tagName("input"));
	 System.out.println(links.size());
	 
	 for (int i = 0; i <links.size(); i++) {
		 System.out.println(links.get(i).getAttribute("value"));
		 links.get(i).click();
		 //System.out.println(links.get(i).getText());
		
	}
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
	  driver.manage().window().maximize();
  }

}
