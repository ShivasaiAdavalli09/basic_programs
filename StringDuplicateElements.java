package babbar_450_String;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicateElements {

	private static void duplicateElements(String str){
		
		HashMap<Character,Integer> count=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++){
			if(!count.containsKey(str.charAt(i))){
				count.put(str.charAt(i),1);
			}
			else
				count.put(str.charAt(i),count.get(str.charAt(i))+1);
		}
		
		for(Map.Entry mapElement:count.entrySet()){
			char num=(char) mapElement.getKey();
			int val=(int) mapElement.getValue();
			if(val>1){
				System.out.println(num+" "+val);
			}
		}
	}
	
	public static void main(String args[]){
		String str="ddunjj";
		duplicateElements(str);
	}
}
