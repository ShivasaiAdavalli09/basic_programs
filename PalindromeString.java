package q4interview.programs;

public class PalindromeString {

	public static void main(String args[]){
		
		String str="madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str))
			System.out.println("this is palindrome"); //we can use str.reverse() only on String builder strings
		else
			System.out.println("this is not palindrome");
	}
}
