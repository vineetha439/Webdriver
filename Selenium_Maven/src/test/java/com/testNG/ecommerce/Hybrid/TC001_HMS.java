package com.testNG.ecommerce.Hybrid;

import org.testng.annotations.Test;

import com.java.Ecommerce.Hybrid.AutomationPracticePage;
import com.java.Ecommerce.Hybrid.BasePage;
import com.java.Ecommerce.Hybrid.PageUI;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

	public class TC001_HMS extends BasePage{
//  @Test( description="This test case is to verify login and logout in HMS")
//  public void TC001() {
//	  PageUI page=new PageUI(driver);
//	  page.hmslogin();
//	  page.hmslogout();
	  
//  }

  @Test(description="This test case is to verify login and logout in automationpractice")
  public void TC002() {
	  AutomationPracticePage p=new AutomationPracticePage(driver);
	  p.login();
	  p.geterrormsg();
	  
  }
  
  
  @BeforeTest
//  public void beforeTest() {
//	  browserlaunch("chrome","http://seleniumbymahesh.com");
//	  
//  }
  public void beforeTest() {
	  browserlaunch("chrome","http://automationpractice.com");
  }
	
@AfterTest
  public void afterTest() {
  }

}
