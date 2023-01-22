package com.finserv.javatraining3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sum47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String s = sc.next();
		
		try
		{
			if(num2==0) throw new ArithmeticException();
			if(s.length()==1) throw new NullPointerException();
			FileInputStream fos = new FileInputStream("t1.txt");
			if(fos.read()==-1) throw new FileNotFoundException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception caught!");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception caught!");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e+" File not found");
		}
		catch(Exception e)
		{
			System.out.println("General Exception");
		}
	}
}