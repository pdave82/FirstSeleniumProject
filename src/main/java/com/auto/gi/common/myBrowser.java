package com.auto.gi.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myBrowser {

	WebDriver chromeBrowser = null;
	public void launchBrowase(String appURL)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Pranav Dave\\Autmation Testing\\GHPrj\\Learning Automation\\ProjNameAI\\src\\test\\Resources\\chromedriver.exe");

		chromeBrowser = new ChromeDriver();
				
		System.out.println("Launch Application URL");		
		chromeBrowser.get(appURL);
		
		chromeBrowser.manage().window().maximize();
	}
	
	public void loginIMS(String userName, String userPwd)
	{
		//Enter User Name
				By usernameXPath = By.xpath("//input[@id='txtUserName']");
				
				WebElement unameTxt = chromeBrowser.findElement(usernameXPath);
				
				System.out.println("Enter User name");
				unameTxt.sendKeys(userName);
				
				//Enter password
				By pwdXPath = By.xpath("//input[@id='txtPassword']");
				
				WebElement pwdTxt = chromeBrowser.findElement(pwdXPath);
				
				System.out.println("Enter Password");
				pwdTxt.sendKeys(userPwd);
				
				//Click on Login Button
				By loginXPath = By.xpath("//input[@id='btnLogin']");
				
				WebElement loginBtn = chromeBrowser.findElement(loginXPath);
				
				System.out.println("Click Login Button");
				loginBtn.click();
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	public WebDriver getBrowser()
	{
		return chromeBrowser;
	}
}


