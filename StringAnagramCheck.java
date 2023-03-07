package babbar_450_String;

import java.util.Arrays;

//javatpoint
public class StringAnagramCheck {

	//convert to lowercase and sort,check for length if same then go forward,convert to array and then check if equal
	private static void checkAnagram(String str1,String str2){
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char input1[]=str1.toCharArray();
		char input2[]=str2.toCharArray();
		
		Arrays.sort(input1);
		Arrays.sort(input2);
		if(input1.length==input2.length){
			if(Arrays.equals(input1,input2)){
				System.out.println("the given string are anagrams");
				
			}
		}
		else
			System.out.println("the given string are not anagram");
		
	}
	
	public static void main(String args[]){
		
		String inp1="this is";
		String inp2="is this";
		checkAnagram(inp1,inp2);

	}
}
