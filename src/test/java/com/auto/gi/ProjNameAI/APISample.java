package com.auto.gi.ProjNameAI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;

public class APISample {

	@Test
	public void testAPI() throws IOException
	{
		String endpoint = "http://dummy.restapiexample.com/api/v1/employee/1";
		
		URL oUrl = new URL(endpoint);
				
		HttpURLConnection oConnection = (HttpURLConnection) oUrl.openConnection();
		
		oConnection.setRequestMethod("GET");
		oConnection.setRequestProperty("Accept", "*/*");
		oConnection.setReadTimeout(100000);
		oConnection.setConnectTimeout(100000);
		
		if (oConnection.getResponseCode() !=200)
			System.out.println("There is some error : " + oConnection.getResponseMessage());
	
		String strResponse= "";
		
		Reader oReader = new BufferedReader(new InputStreamReader(oConnection.getInputStream(), "UTF-8" ));
				for (int c; (c= oReader.read()) >= 0;)
					strResponse = strResponse + ((char)c);
		
		System.out.println("Response : " + strResponse);
		
	}
	
	
	//public String StringSample()
	//{
		//return "";
	//}
	
	//public int IntegerSample()
	//{
		//return 1;
	//}
	
	//public boolean BooleanSample()
	//{
	//	return true;
	//}
	
}
