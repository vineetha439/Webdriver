package com.durgasoft.selenium.Selenium_Maven;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class rediffmail {
	
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.linkText("Create a Rediffmail account")).click();
	  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("vineetha chinthakula");
	  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("chinthakulavineetha");
	  driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("indrasena123");
	  driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("indrasena123");
	  driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("sunilesampelli");
	  driver.findElement(By.id("mobno")).sendKeys("8519847496");
	  Thread.sleep(3000);
	  new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"))).selectByVisibleText("03");
	  new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"))).selectByVisibleText("OCT");
	  new Select(driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"))).selectByVisibleText("2018");
	  driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]")).click();
	  driver.findElement(By.id("country")).sendKeys("India");
	  driver.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select")).sendKeys("Hyderabad");
	
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://rediff.com");
	  driver.manage().window().maximize();
  }

}
