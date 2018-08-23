package com.java.Ecommerce.Hybrid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage {
	public WebDriver driver;
	public void browserlaunch(String browser,String url) {
		if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();	
		}	
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\library\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
