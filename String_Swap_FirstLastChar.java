package GeeksForGeeks_serious_Strings;

//ref is https://www.geeksforgeeks.org/java-program-swap-first-last-characters-words-sentence/

//Input : geeks for geeks
//Output :seekg rof seekg

public class String_Swap_FirstLastChar {

	static String swap(String str){
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			
			//we are assigning the initial i to k
			int k=i;
			while(i<ch.length && ch[i]!=' ')
				i++;
			
			//else swap initial i i.ek and incremented i i.e i itself
			char temp=ch[k];
			ch[k]=ch[i-1];
			ch[i-1]=temp;
		}
		
		return new String(ch);//simply String(ch) will convert char array to String
	}
	
	
	public static void main(String args[]){
	String str="geeks for geeks";
	String output=swap(str);
	System.out.println(str);
	System.out.println(output);
		}
}
