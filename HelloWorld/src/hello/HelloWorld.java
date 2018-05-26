package hello;

import java.io.IOException;
import java.io.*;
import java.io.InputStreamReader;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.BufferedReader;
public class HelloWorld {
	public static void main(String[] args) 
	{
		//System.out.println("Hello world");
		//usingBufferedReader();
		//usingScanner();O
		boolean a = false;
		if(a=true)
			System.out.println("Hello");
		else
			System.out.println("goodbuy");
		
		
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner scan = new Scanner(System.in);
		
		int iSecond;
		double dSecond;
		String sSecond;
		
		//String inputString = scan.nextLine(); 
		iSecond = scan.nextInt();
		dSecond = scan.nextDouble();
		sSecond = scan.nextLine()+scan.nextLine();
		scan.close();
		
		System.out.println(i+iSecond);
		System.out.format("%.1f%n",d+dSecond);
		System.out.println(s+sSecond);
		
	}

	private static void usingBufferedReader() 
	{
		// TODO Auto-generated method stub
		System.out.println("Name: ");
		try 
		{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String inputString = bufferRead.readLine();
			System.out.println("Name entered: "+inputString);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	/*private static void usingScanner()
	{
		String input = "1 fish 2 fish red fish blue fish";
				Scanner sc = new Scanner(input).useDelimiter("\\s*fish\\s*");
				System.out.println(sc.nextInt());
				System.out.println(sc.nextInt());
				System.out.println(sc.next());
				System.out.println(sc.next());
				sc.close();
	}*/
	
	
}
