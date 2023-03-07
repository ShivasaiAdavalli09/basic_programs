package GeeksForGeeks_450_programs_String;


//Input is i like this program very much
//Output is much very program this like i

public class String_ReverseOfString {

public static void main(String args[]){
	
	String s="I like this program very much";
	
	String str[]=s.split(" ");
	
	String ans="";
	
	for(int i=str.length-1;i>=0;i--){
		ans+=str[i]+" ";  //ans=ans+str[i]+" ";
	}
	
	System.out.println("Reversed String:");
	
	System.out.print(ans.toString());
	
	//or use substring
	//System.out.println(ans.substring(0, ans.length()-1));
	
	}

}

