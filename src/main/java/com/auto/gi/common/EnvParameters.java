package com.auto.gi.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EnvParameters {

	Properties properties;
	
	public EnvParameters() throws FileNotFoundException, IOException
	{
		properties = new Properties();
		
		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\Resources\\framework.properties"));
		
		System.getProperty("user.dir");
	}
	
}
