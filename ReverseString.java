package q4interview.programs;

public class ReverseString {

	public static void main(String args[]){
		String str="what is my name";
		String rev="";
		
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+ch[i];
		}
		System.out.println("the reverse string is"+rev);
	}
}
