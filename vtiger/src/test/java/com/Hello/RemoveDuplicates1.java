package com.Hello;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String string = "aabbccdefatafaz";

		char[] chars = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    if(charSet.add(c) ){
		        sb.append(c);
		    }

		}
		System.out.println(sb.toString());
	}

}
