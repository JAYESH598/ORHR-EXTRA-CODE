package com.string;

public class StringWhiteSpacesRemove {

	public static void main(String[] args) {
	    String  str = " ja   va   S  ta  r";
		String str1 = str.replaceAll("\\s", "");
		System.out.println(new String (str1));
		
	}

}
