package com.auto.gi.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class comLib {

	public boolean element_click(WebDriver wbDriver, String objName, String xpath) {
		// Click on Member menu option
		System.out.println("Click on " + objName);
		By memPath = By.xpath(xpath);

		WebElement memObj = wbDriver.findElement(memPath);

		memObj.click();
		return true;
	}

	public boolean enter_text(WebDriver wbDriver, String objName, String objVal, String xpath) {
		// Enter member id

		System.out.println("Enter value in field" + objName);
		By memIdPath = By.xpath(xpath);

		WebElement memIdObj = wbDriver.findElement(memIdPath);

		memIdObj.sendKeys(objVal);
		return true;
	}

	public void hart_wait_time(int timeInsecond) {
		try {
			Thread.sleep(timeInsecond * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean check_table_row_count(WebDriver wbDriver, String xpath, int expRowCount)
	{
		By tablePath = By.xpath(xpath);
		List<WebElement> tableObj = wbDriver.findElements(tablePath);

		Assert.assertTrue(tableObj.size() == expRowCount + 1);

		return true;
	}

	public boolean check_table_col_value(WebDriver wbDriver, String xpath, int expColNo, String expval)
	{
		By tablePath = By.xpath(xpath);
		List<WebElement> tableObj = wbDriver.findElements(tablePath);	
		
		for(int rownum=2; rownum<=tableObj.size(); rownum++)
		{
			By idPath = By.xpath(xpath + "[" + rownum + "]/td[" + expColNo + "]");
			WebElement idObj = wbDriver.findElement(idPath);
		
			Assert.assertEquals(idObj.getText(), expval);
		}
		
		return true;
	}
}
