package com.auto.gi.ProjNameAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumSecond {

	WebDriver chromeBrowser = null;
	
	
	@BeforeClass
	
		public void myBeforeMethod() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Pranav Dave\\Autmation Testing\\GHPrj\\Learning Automation\\ProjNameAI\\src\\test\\Resources\\chromedriver.exe");
			
			chromeBrowser = new ChromeDriver();
			
			chromeBrowser.get("https://mysatsang.web.app/login");
			
			chromeBrowser.manage().window().maximize();
			
			By unamePath3=By.xpath("//ion-button");
			
			WebElement unametxt3=chromeBrowser.findElement(unamePath3);
			
			unametxt3.click();
			
			chromeBrowser.get("https://sso.na.baps.org/sso-v2");
			
			By unamePath=By.xpath("//input[@id='userName']");
			
			WebElement unametxt=chromeBrowser.findElement(unamePath);
			
			System.out.println("Enter User Name");
			unametxt.sendKeys("pdave82@gmail.com");

			By unamePath1=By.xpath("//input[@id='password']");
			
			WebElement unametxt1=chromeBrowser.findElement(unamePath1);
			
			System.out.println("Enter Password");
			unametxt1.sendKeys("MahantSwAmi1933#");
			
			By unamePath2=By.xpath("//button[text()='Sign In']");
			
			WebElement unametxt2=chromeBrowser.findElement(unamePath2);
			
			unametxt2.click();
			
			Thread.sleep(10000);
			
			By unamePath4=By.xpath("//ion-label[text()='Darshan Booking']");
			
			WebElement unametxt4=chromeBrowser.findElement(unamePath4);
			
			unametxt4.click();
		}
	
	@AfterClass
	public void myAfterClass()
	{
		System.out.println("This is from AfterClass");
		chromeBrowser.close();
	}
	
	@BeforeMethod
	public void MyBeforeMethod()
	{
		System.out.println("This is from BeforeMethod");
	}
	
	@AfterMethod
	public void MyAfterMethod()
	{
		System.out.println("This is from AfterMethod");
	}
	
	
	@Test
	public void MyFirstMethod()
	{
		System.out.println("I am from First Test Method");
	}
	
	@Test
	public void MySecondMethod()
	{
		System.out.println("I am from Second Test Method");
	}
	
}
