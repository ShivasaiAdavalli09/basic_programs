package GeeksForGeeks_serious_Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//ref is https://www.geeksforgeeks.org/check-given-string-valid-number-integer-floating-point-java-set-2-regular-expression-approach/
//we can use anyone among below 3
//[+-]?[0-9]+
//[+-]?\d\d*
//[+-]?\d+
public class String_ValiNumberOrNotRegPattern {

	public static void main(String args[]){
		
		String input1="1234";
		//String input2="1234";
		
		String regex="[+-]?[0-9]+";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input1);
		
		if(m.find() && m.group() .equals(input1))
			System.out.println(input1+" "+"input is a integer");
		else
			System.out.println(input1+" "+"input is not integer");
	}
}
