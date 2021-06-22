package com.auto.gi.IMS;

import org.openqa.selenium.WebDriver;

import com.auto.gi.common.myBrowser;

public class loginIMS 
{
	WebDriver localBrowser = null;


	public void login()
	{
		myBrowser mb = new myBrowser();

		mb.launchBrowase("http://ims.na.baps.org/Login.aspx");

		mb.loginIMS("rpatel79", "Swami123");

		localBrowser = mb.getBrowser();
	}
	
	public void logout()
	{
		localBrowser.close();
		localBrowser.quit();
	}
}
