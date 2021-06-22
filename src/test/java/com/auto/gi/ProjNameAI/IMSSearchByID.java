package com.auto.gi.ProjNameAI;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.auto.gi.IMS.loginIMS;
import com.auto.gi.common.comLib;
import com.auto.gi.common.myBrowser;

public class IMSSearchByID {

	WebDriver localBrowser = null;

	comLib cl = new comLib();
	/*
	@BeforeClass
	public void login()
	{
		myBrowser mb = new myBrowser();

		mb.launchBrowase("http://ims.na.baps.org/Login.aspx");

		mb.loginIMS("rpatel79", "Swami123");

		localBrowser = mb.getBrowser();
	}
	
	
	@AfterClass
	public void logout()
	{
		localBrowser.close();
		localBrowser.quit();
	}*/
	
	@Test
	public void SearchByID() {

		myBrowser mb = new myBrowser();
		
		loginIMS imslogin = new loginIMS();
		
		imslogin.login();
		
		
		// Click on Member menu option
		cl.element_click(localBrowser, "Member", "//li/a[text()='Members']");
		//System.out.println("Click on Members Option");
		//By memPath = By.xpath("//li/a[text()='Members']");

		//WebElement memObj = localBrowser.findElement(memPath);

		//memObj.click();

		// Enter member id
		
		cl.enter_text(localBrowser, "member id", "134061", "//input[@id='txtPersonID']");
		//System.out.println("Enter memebr id");
		//By memIdPath = By.xpath("//input[@id='txtPersonID']");

		//WebElement memIdObj = localBrowser.findElement(memIdPath);

		//memIdObj.sendKeys("134061"); ObjVal

		// Click on Go Button
		cl.element_click(localBrowser, "Go Button", "//input[@id='cphPageContainer_gobtn']");
		//System.out.println("Click on Go Button");
		//By goPath = By.xpath("//input[@id='cphPageContainer_gobtn']");

		//WebElement goObj = localBrowser.findElement(goPath);

		//goObj.click();

		cl.hart_wait_time(6);
		//try {
			//Thread.sleep(6000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}

		//check table row must be 1
		cl.check_table_row_count(localBrowser, "//table[@id='cphPageContainer_gvPerson']/tbody/tr", 1);

		cl.check_table_col_value(localBrowser, "//table[@id='cphPageContainer_gvPerson']/tbody/tr", 5, "134061");
		
		//for (int rownum = 2; rownum <= tableObj.size(); rownum++) {
			//By rowPath = By.xpath("//table[@id='cphPageContainer_gvPerson']/tbody/tr[" + rownum + "]");
		//	WebElement rowObj = localBrowser.findElement(rowPath);

			//System.out.println("row getText : " + rowObj.getText());

		//	By idPath = By.xpath("//table[@id='cphPageContainer_gvPerson']/tbody/tr[" + rownum + "]/td[5]");
		//	WebElement idObj = localBrowser.findElement(idPath);

		//	Assert.assertEquals(idObj.getText(), "134061");
		

	
	}

}
