package babbar_450_String;

//input: "this is abc"
//output:
public class StringReverseLearn {

	private static void reverseString(String str){
		
		char input[]=str.toCharArray();
		System.out.println("reverse of string is");
		for(int i=input.length-1;i>=0;i--){
		System.out.print(input[i]);	
		}
	}
	public static void main(String args[]){
	    String inp="this is abc";
	    reverseString(inp);
	}
}
