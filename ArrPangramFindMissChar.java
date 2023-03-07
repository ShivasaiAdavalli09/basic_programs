package GeeksForGeeksPractice;

import java.util.ArrayList;

public class ArrPangramFindMissChar {

	private static void missingChars(String str){
		
		
		boolean[] present=new boolean[26];
		int index=0;
		ArrayList<Character> charsList=new ArrayList<>();
		
		for(int i=0;i<str.length();i++){
			
			if('A'<=str.charAt(i) && str.charAt(i)<='Z')
				 index=str.charAt(i)-'A';
		
			else if('a'<=str.charAt(i) && str.charAt(i)<='z')
				index=str.charAt(i)-'a';
			
			present[index]=true;
				
		}
		
		for(int i=0;i<26;i++){
			if(present[i]==false)
				charsList.add((char) (i+'a'));
		}
		System.out.println(charsList);
	}
	
	public static void main(String[] args)
	{
	    String str = "The quick brown fox jumps " +
	                 "over the dog";
	                  
	    missingChars(str);
}
}