package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Jquery_Slider {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.switchTo().frame(0);
	  WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
	  Actions a = new Actions(driver);
	  a.dragAndDropBy(slider, 400,0).perform();
	  a.clickAndHold(slider).moveByOffset(200, 0).release().build().perform();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://jqueryui.com/slider/");
	  driver.manage().window().maximize();
  }

}
