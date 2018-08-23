package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Dropdown_Enadupellipandiri {
	
	public WebDriver driver;
	
  @Test(enabled=false)
  public void bytagname() {
	  WebElement header = driver.findElement(By.id("reg_mothertongue"));
	  List<WebElement> dd = header.findElements(By.tagName("options"));
	  System.out.println(dd.size());
	  
	  for (int i = 0; i <dd.size(); i++) {
		  System.out.println(dd.get(i).getText());
	}  
  }

 @Test
 public void dropdown() {
	 WebElement header = driver.findElement(By.id("reg_mothertongue"));
	 Select dd = new Select(header);
	 List<WebElement> value = dd.getOptions();
	 System.out.println(value.size());
	 
	 for (int i = 1; i <value.size(); i++) {
		 System.out.println(value.get(i).getText());
		 }
	 for (int i = 1; i <value.size(); i++) {
		 if(value.get(i).getText().equalsIgnoreCase("TELUGU")){
			 System.out.println(value.get(i).getText());
		 }
	 }
		
	 for (int i = 0; i <value.size(); i++) {
		 if(!value.get(i).getText().equalsIgnoreCase("TELUGU")){
			 System.out.println(value.get(i).getText());
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
