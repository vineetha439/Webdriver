package com.java.Ecommerce.Hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticePage {
	
	@FindBy(linkText="Sign in")WebElement signinloc;
	@FindBy(id="email")WebElement emailloc;
	@FindBy(id="passwd")WebElement passwdloc;
	@FindBy(id="SubmitLogin")WebElement submitloginloc;
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")WebElement errormsgloc;
	
	public AutomationPracticePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void login() {
		signinloc.click();
		emailloc.sendKeys("abc@gmail.com");
		passwdloc.sendKeys("abc123");
		submitloginloc.click();
	}
	
	
	public String geterrormsg() {
		return errormsgloc.getText();
	}
	
	
		
	}
	
