package com.auto.gi.ProjNameAI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//CreateMyFile();
			//WriteMyFile();
			try {
				ReadMyFile();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("You are in main mathod");
		}
		
	

		public static void CreateMyFile() 
		{
			File myFileObj = new File("Filename.txt");
			try {
				if(myFileObj.createNewFile())
					System.out.println("File is Created Successfully");
				else
					System.out.println("File is Already Created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Outside Exception");
		}
		
		public static void WriteMyFile() 
		{
			try {
				FileWriter myWriter = new FileWriter("Filename.txt");
				myWriter.write("line from automation Script at the end");
				//myWriter.append("Test");
				myWriter.close();	
			}catch(Exception expObj) {
				expObj.printStackTrace();
			}
			System.out.println("WriteMyFile last Statement");
			
		}
		
		public static void ReadMyFile() throws FileNotFoundException
		{
			File myFileObj = new File("Filename.txt");
		
			Scanner MyFileReader = new Scanner(myFileObj);
			
			while(MyFileReader.hasNextLine()) {
				String lineData = MyFileReader.nextLine();
				System.out.println(lineData);
			}
			MyFileReader.close();
			System.out.println("ReadMyFile last Statement");
		}
}
