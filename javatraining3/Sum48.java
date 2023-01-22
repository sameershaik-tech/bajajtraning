package com.finserv.javatraining3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CartEmptyException extends Exception
{
	public CartEmptyException(String message){
		super(message);
	}
}


class Records
{
	int itemId;
	String name;
	int price;
	
	public Records(int itemId,String name,int price)
	{
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}
}

public class Sum48 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number  = sc.nextInt();
		
		try{
			if(number==0) throw new CartEmptyException("Your cart is Empty");
		}catch(CartEmptyException e){
			System.out.println(e.getMessage());
		}
		
		List<Records> list = new ArrayList<Records>();
		Records[] records = new Records[number];
		
		for(int i=0;i<number;i++)
		{
			records[i] = new Records(sc.nextInt(),sc.next(),sc.nextInt());
			list.add(records[i]);
		}
		
		for(Records x:list)
		{
			System.out.println(x.itemId+" "+x.name+" "+x.price);
		}
	}

}