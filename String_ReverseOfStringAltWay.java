package GeeksForGeeks_450_programs_String;

public class String_ReverseOfStringAltWay {

	//Reverse the letters of word
	
	static void reverse(char str[],int start,int end){
		
		//Temporary variable to store character
		char temp;
		
		while(start<end){
			
			//swapping the first and last character
			temp=str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
	}
	
	//function to reverse words
	static char[] reverseWords(char s[]){
		//reversing individual words as explained in first step
		
		int start=0;

		for(int end=0;end<s.length;end++){
			// If we see a space, we
		    // reverse the previous
		    // word (word between
		    // the indexes start and end-1
		    // i.e., s[start..end-1]
			if(s[end]==' '){
				reverse(s,start,end);
				start=end+1;
			}
		}
			//reverse the last word
			reverse(s,start,s.length-1);
			
			//reverse the entire string
			reverse(s,0,s.length-1);
		return s;
		
	}
	public static void main(String args[]){
		
		String s="i like this program very much ";
		
		char p[]=reverseWords(s.toCharArray());
		System.out.print(p);
		
	}
}
