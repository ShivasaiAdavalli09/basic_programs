package q4interview.programs;

public class SecondLastWord {

public static void main(String args[]){
	
	//if we want to give user input
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));<br />
    //String str;<br />
    //System.out.println("Enter the String : ");<br />
    //str=br.readLine();<br />
    //System.out.println(str);<br />
    //String s[] = str.split(" ");<br />
	String str="what is my name";
	String s[]=str.split(" ");
	System.out.println(s[s.length-2]);//in array length-1 is last elemnt and length-2 is second last
}
}
