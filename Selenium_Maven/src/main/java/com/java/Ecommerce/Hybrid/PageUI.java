package com.java.Ecommerce.Hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageUI {
	
	@FindBy(linkText="HMS")WebElement hmsloc;
	@FindBy(name="username")WebElement usernameloc;
	@FindBy(name="password")WebElement passwordloc;
	@FindBy(name="submit")WebElement loginloc;
	@FindBy(linkText="Logout")WebElement logoutloc;
	
	public PageUI(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		public void hmslogin() {
			hmsloc.click();
			usernameloc.sendKeys("admin");
			passwordloc.sendKeys("admin");
			loginloc.click();
		}
		public void hmslogout() {
			logoutloc.click();
			
		}
		
	}
	
	

