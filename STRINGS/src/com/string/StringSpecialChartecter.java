package com.string;
public class StringSpecialChartecter {
     public static void main(String[] args) {
		String str = "@j#a!$v^&&a##St@#$a%$&^r";
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(new String(str1));
		
	}
}
