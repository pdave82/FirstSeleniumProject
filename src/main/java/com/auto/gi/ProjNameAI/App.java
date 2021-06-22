package com.auto.gi.ProjNameAI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
String name = "Ritesh";
    	
    	char charVar = 'D';
    	
    	int id = 1001;
    	
    	long longVar = 1542565478;
    	
    	double dblVar = 12456.25;
    	
    	float fltVar = 5487;
    	
    	boolean indVal = true;
        
        System.out.println( "Hello World!" );
        
        System.out.println(name);
        System.out.println(id);        
        System.out.println(indVal);
        //System.out.println( "Hello World!" );
    	//System.setProperty("webdriver.chrome.driver", "C:\\Pranav Dave\\Autmation Testing\\GHPrj\\Learning Automation\\ProjNameAI\\src\\test\\Resources\\chromedriver.exe");
    	
    	//WebDriver myBrowser = new ChromeDriver();
    	
    	//myBrowser.get("https://google.com");
    	
    	//System.setProperty("webdriver.ie.driver", "C:\\Pranav Dave\\Autmation Testing\\GHPrj\\Learning Automation\\ProjNameAI\\src\\test\\Resources\\IEDriverServer.exe");
    	
    	//WebDriver myieBrowser = new InternetExplorerDriver();
    	
    	//myieBrowser.get("https://yahoo.com");
    	
    	//firefox 
    	// WebDriver firefoxBrowser = new FirefoxDriver(); 
    	// firefoxBrowser.get("https://espncricinfo.com");
    }
}
