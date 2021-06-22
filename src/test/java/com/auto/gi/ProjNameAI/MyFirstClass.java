package com.auto.gi.ProjNameAI;

public class MyFirstClass {

	public static void main(String[] args) {
		myStringFunction("Fisrst_Name");
		/*
		 * TwoDigitMaths cMaths = new TwoDigitMaths();
		 * 
		 * System.out.println("value of I: " + cMaths.getI());
		 * System.out.println("value of J: " + cMaths.getJ());
		 * System.out.println("Addition value: "+ cMaths.addNumbers());
		 * System.out.println("Overloading 1 Value: " + cMaths.addNumbers(11));
		 * System.out.println("Overloading 2 Value: " + cMaths.addNumbers(10, 7));
		 * System.out.println("multiple value: "+ cMaths.multipleNumbers());
		 * System.out.println("subtract value: "+ cMaths.lessNumbers());
		 * System.out.println("devide value: "+ cMaths.devideNumbers());
		 */

		// Loop 2 - if.......else....else.....if
		// int j =10;
		// int i= 5;

		/*
		 * if( i < 25 & j > 2 ) System.out.println("True"); else
		 * System.out.println("False"); if( j < 5 | i < 20 ) System.out.println(j +
		 * " - Value is less than 5"); else System.out.println(j + " - " + i);
		 * 
		 * if( j < 10 ) System.out.println(j + " - Value is less than 10"); else if( j <
		 * 20 ) System.out.println(j + " - Value is NOT less than 20"); else
		 * System.out.println(j + " - Value is NOT less than 10 or 20"); if( j < 20 ) {
		 * System.out.println(j + " - Value is less than 20"); System.out.println(j +
		 * " - Value is less than 20"); } else { System.out.println(j +
		 * " - Value is NOT less than 20"); System.out.println(j +
		 * " - Value is NOT less than 20"); }
		 */

		// Loop 2 : For :- l++ or l = l+1

		// for(int l=5 ; l>-2; l=l-2 )
		// {
		// System.out.println("loop counter " + l);
		// }
		/*
		 * System.out.println("Do....While"); do { i= i+1; switch(i) { case 0:
		 * System.out.println("It is Zero"); break; case 1:
		 * System.out.println("It is One"); break; case 2:
		 * System.out.println("It is Two"); break; case 3:
		 * System.out.println("It is Three"); break;
		 * 
		 * default: System.out.println("Unknown " + i); } System.out.println(i);
		 * }while(i<5);
		 * 
		 * System.out.println("While...."); while(i>0) { i= i-1; System.out.println(i);
		 * 
		 * }
		 * 
		 * System.out.println("While....."); while(i>0) { for (int l=0; l<i; l++) {
		 * System.out.println(i + " : loop counter " + l); } i = i-1; }
		 * 
		 * System.out.println("While....."); for(i=5; i>0; i--) { for (int l=0; l<i;
		 * l++) { System.out.println(i + " : loop counter " + l); }
		 * 
		 * }
		 */

		// System.out.println("Switch....");

		/*
		 * switch(i) { case 0: System.out.println("It is Zero"); break; case 1:
		 * System.out.println("It is One"); break; case 2:
		 * System.out.println("It is Two"); break; case 3:
		 * System.out.println("It is Three"); break;
		 * 
		 * default: System.out.println("Unknown " + i); }
		 */

		// Array
		// int myInt[] = {10, 20, 30, 40, 50};

		// int[] myInt1 = {1, 2, 3, 4, 5};

		// System.out.println("Length of Array: " + myInt.length);
		// for(int j=0; j<myInt.length; j++)
		// {
		// System.out.println(j + "index value:" + myInt[j]);
		// }

		/*
		 * String myStr[][] = {{"Riteshbhai" , "Patel"}, {"Jaybhai" , "Chauhan"} ,
		 * {"Kunalbhai", "Patel"} , {"Pranav" , "Dave"}};
		 * 
		 * System.out.println("Length of Array :" + myStr.length); for(int j=0;
		 * j<myStr.length; j++) { for(int k=0; k<myStr[j].length; k++)
		 * System.out.println(j + " 1st index " + k + " 2nd index : " + myStr[j][k]); }
		 */

		// for(int l=0 ; l<10; l=l+1 )
		// {
		// System.out.println("counter " + l);

		// }
	}

	/*public static void jaybhai() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int row = scan.nextInt();

		for (int i = 1; i <= row; i++) {
			String prtLine = "*";

			for (int j = 2; j <= i; j++)
				prtLine = prtLine + "*";

			System.out.println(prtLine);
		}
	}*/

	/*public static void jaybhai1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int row = scan.nextInt();

		for (int i = 1; i <= row; i++) {
			String prtLine = "";

			for (int j = 1; j <= row - i; j++)
				prtLine = prtLine + " ";

			for (int j = 1; j <= i; j++)
				prtLine = prtLine + "*";

			System.out.println(prtLine);
		}
	}*/

	/*public static void jaybhai2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int row = scan.nextInt();

		for (int i = 3; i > 0; i--) {
			String prtLine = "";

			for (int j = 2; j > -i; j--)
				prtLine = prtLine + " ";

			for (int j = 1; j < i; j--)
				prtLine = prtLine + "*";

			System.out.println(prtLine);
		}
	}*/

	/*public static void pranavbhai() {
		int myanswer = 0;

		for (int l = 1; l <= 10; l++) {
			myanswer = myanswer + l;
		}

		System.out.println("sum of first 10 number : " + myanswer);
	}*/
	
	public static void myStringFunction(String myStr)
	{
		//char myChar = 'c'; 
		//String myStr = "FirstName01";
		//char myChar = 'c'; 
				//String myStr = "FirstName01";
				int l = 100;
				int m = 100;
				String strI = "100";
				String covertStr = String.valueOf(l);
				
				System.out.println(l+m);
				System.out.println(strI+m);
		if(myStr.startsWith("First"))
			System.out.println("Ritesh");
		else if(myStr.equals("Lastname"))
			System.out.println("Patel");
		
		System.out.println("Contains underscore : " + myStr.contains("_"));
		
		System.out.println("concat : " + myStr.concat(" : Kunal"));
		
		System.out.println("plus symbol : " + myStr + " : Kunal");
		
		System.out.println("length of string : " + myStr.length());
		
		String[] mySplit = myStr.split("_");
		
		for(int i=0; i<mySplit.length; i++)
			System.out.println(i + " index value = " + mySplit[i]);
		
		System.out.println(myStr + l);		
		
		
		/*System.out.println("Lower Case Value : " + myStr.toLowerCase());
		System.out.println("First Start With : " + myStr.startsWith("First"));
		System.out.println("Second Start With : " + myStr.startsWith("Second"));*/
	}
	
	
}
