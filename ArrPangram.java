package GeeksForGeeksPractice;
//geeksforgeeks Datastructures-->string

//Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
//Examples : The quick brown fox jumps over the lazy dog ? is a Pangram [Contains all the characters from ?a? to ?z?] 
//?The quick brown fox jumps over the dog? is not a Pangram [Doesn?t contain all the characters from ?a? to ?z?, as ?l?, ?z?, ?y? are missing]
public class ArrPangram {
	// Returns true if the string
    // is pangram else false
	public static boolean checkPangram(String str){
		// Create a hash table to mark the
        // characters present in the string
        // By default all the elements of
        // mark would be false.
		boolean[] mark=new boolean[26];
		
		int index=0;
		
		for(int i=0;i<str.length();i++){  //character will be -1 than we count normaly because we started this from 0
			// If uppercase character, subtract 'A'
            // to find index
			if('A'<=str.charAt(i) && str.charAt(i)<='Z')
				index=str.charAt(i)-'A';
			// If lowercase character, subtract 'a'
            // to find index.
			else if('a'<=str.charAt(i) && str.charAt(i)<='z')
				index=str.charAt(i)-'a';
			
			/*else
				continue;*/
			mark[index]=true;
		}
		for(int i=0;i<=25;i++)  //or i<26 anything same because starting from 0 ,0 to 25 its 26 alphabets
			if(mark[i]==false)
		return false;
		return true;
		
	}
	
	public static void main(String args[]){
		
		String str="The quick brown fox jumps over the lazy dog";
		
		if(checkPangram(str)==true)
			System.out.println(str+ " "+" "+"is a pangram");
		else
			System.out.println(str+" "+" "+"is not a apangram");
		
	}
	
}
