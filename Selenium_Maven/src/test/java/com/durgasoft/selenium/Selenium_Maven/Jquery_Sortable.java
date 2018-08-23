package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Jquery_Sortable {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.switchTo().frame(0);
	 // WebElement sortable = driver.findElement(By.id("sortable"));
	  WebElement item1 = driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
	   WebElement item2 = driver.findElement(By.xpath("//*[@id='sortable']/li[6]"));
	  Actions a = new Actions(driver);
	  a.dragAndDrop(item2, item1).release().build().perform();
	//  a.clickAndHold(sortable).keyDown(item1, (CharSequence) item2).build().perform();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/sortable/");
	  driver.manage().window().maximize();
  }

}
