package com.Hello;

import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="iam software engineer"; 
		// remove e and print it..later reverse the same
		String str="";
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s);
		}
		for(String str1:set)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.equals(s))
				{
					count++;
				}
			}
			
			if(count>1) {   
				
		
			System.out.println(str1+ "  "+count);
			
			
		}
			
		}
	}
	
}

		
	


