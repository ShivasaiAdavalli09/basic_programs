package GeeksForGeeks_serious_Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ref is https://www.geeksforgeeks.org/write-regular-expressions/
//Input : Geeks for geeks
//Output :Gfg
//using regex pattern here 
//www.geeksforgeeks.org/write-regular-expressions/
/* /s : matches any whitespace characters such as space and tab
 * /S : matches any non-whitespace characters
 * /d : matches any digit character
 * /D : matches any non-digit characters
 * /w : matches any word character (basically alpha-numeric)
 * /W : matches any non-word character
 * /b : matches any word boundary (this would include spaces, dashes, commas, semi-colons, etc)
 * ^ means start of pattern */
public class String_FirstLetterOfEachWordPatternReg {

	static void printFirst(String s){
		
		Pattern p=Pattern.compile("\\b[a-zA-Z]");
		Matcher m=p.matcher(s);
		
		while(m.find())
			System.out.print(m.group());
		System.out.println();
	}
	public static void main(String args[]){
		
		String s1="Geeks for Geeks";
		printFirst(s1);
	}
}
