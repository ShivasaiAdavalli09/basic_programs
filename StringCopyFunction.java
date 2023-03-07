package GeeksForGeeksStrings;

public class StringCopyFunction {

	static void myCopy(char s1[],char s2[]){
		
		for(int i=0;i<s1.length;i++){
			s2[i]=s1[i];
		}
	}
	
	public static void main(String args[]){
		
		char s1[]="geeksforgeeks".toCharArray();
		char s2[] = new char[s1.length];
		
		myCopy(s1,s2);
		System.out.println(String.valueOf(s2));
	}
	
}
