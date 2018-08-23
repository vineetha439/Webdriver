package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class dropdown2 {
	public WebDriver driver;
	
  @Test
  public void dropdown() {
	  driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
	  driver.findElement(By.className("nav-input")).click();
	  String act_val = driver.getTitle();
	  String exp_val = "Amazon.in:Harry Porter:Books";
	  Assert.assertEquals(act_val, exp_val);
	 
	  
	  
  }
  @Test
  public void dropdown1() {
	  WebElement dd = driver.findElement(By.id("searchDropdownBox"));
	  Select webelement= new Select(dd);
	  driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
	  driver.findElement(By.className("nav-input")).click();
	  String act_val = driver.getTitle();
	  String exp_val = "Amazon.in:Harry Porter:Books";
	  Assert.assertEquals(act_val, exp_val);
	  
	  
  }
  @BeforeMethod
  public void beforeTest() {
	  driver= new FirefoxDriver();
	  driver.get("http://amazon.in");
	  driver.manage().window().maximize();
  }

}
