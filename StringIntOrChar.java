package GeeksForGeeksStrings;

import javax.xml.stream.events.Characters;

public class StringIntOrChar {

	private static boolean isDigit(String str){
		
		for(int i=0;i<str.length();i++){
			
			if(Character.isDigit(str.charAt(i))==true)
				
				return true;
				}
		return false;
	}
	
	public static void main(String args[]){
		
		String s="143";
		if(isDigit(s)==true)
			System.out.println("the given string is number");
		else
			System.out.println("the given string is letters");
	}
}
