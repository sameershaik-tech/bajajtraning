package javatraining4;

import java.util.*;
public class Maps {
	
	public static void main(String[] args)
	{
		Map<Integer,String> map=new HashMap<>();
		
		map.put(101,"pune");
		map.put(102, "Chennai");
		map.put(103, "Mumbai");
		
		
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry) itr.next();
			
			System.out.println(entry.getKey());
		}
		
		
	}
	
	

}
