package com.string;
public class StringRevers {
  public static void main(String[] args) {
     /*String str = "Nagendra babu";
		 for(int i= str.length()-1; i>= 0;i--) {
			 System.out.print(str.charAt(i));
		 }*/
	  
	  
	  String reverseWord = " ";
	  String str = "Nagendra Babu";
	  String[] split = str.split(" ");

	   

	  for (String s : split) {
	  StringBuilder sb = new StringBuilder(s);
	  sb.reverse();
	  reverseWord = reverseWord + sb.toString()+" ";
	  }

	   

	  System.out.println(reverseWord);
	}

}
