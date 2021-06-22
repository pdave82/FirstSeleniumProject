package com.auto.gi.ProjNameAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.auto.gi.common.myBrowser;

public class IMSSearchByPhone {

	WebDriver localBrowser = null;
	
	
	@Test
	public void mySecondMethod()
	{	
		myBrowser mb = new myBrowser();
		
		mb.launchBrowase("http://ims.na.baps.org/Login.aspx");
		
		mb.loginIMS("rpatel79", "Swami123");
		
		localBrowser =mb.getBrowser();
		
		//Click on Member menu option 
				System.out.println("Click on Members Option");
				By memPath = By.xpath("//li/a[text()='Members']");
				
				WebElement memObj = localBrowser.findElement(memPath);
				
				memObj.click();
		//Enter phone number
		System.out.println("Enter phone number");
		By phonePath = By.xpath("//input[@id='txtHomePhone']");
		
		WebElement phoneObj = localBrowser.findElement(phonePath);
		
		phoneObj.sendKeys("609-617-0749");
		
		//Click on Go Button
		System.out.println("Click on Go Button");
		By goPath = By.xpath("//input[@id='cphPageContainer_gobtn']");
		
		WebElement goObj = localBrowser.findElement(goPath);
		
		goObj.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		localBrowser.close();
		localBrowser.quit();
	}
}
