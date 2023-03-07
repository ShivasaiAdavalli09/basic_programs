package geekforGeeks;

import java.util.HashMap;
import java.util.Map;

public class StringNoOfOccurences {

	//geeksforgeeks occurences of each element
	public static void main(String args[]){
	String str="geeksforgeeks";
	int len=str.length();
	char[] setChar=str.toCharArray();
	Map<Character,Integer> countMap=new HashMap<Character,Integer>();
			
	for(int i=0;i<len;i++){
		
	if(countMap.containsKey(setChar[i])){
		countMap.put(setChar[i],countMap.get(setChar[i])+1 );
	}
	countMap.put(setChar[i], 1);
		
	}
	System.out.println(countMap);
}
}
