package babbar_450_String;

//Input is i like this program very much
//Output is much very program this like i
public class StringReverseWithoutWordReverse {

	private static void reverse(String str){
		
		String input[]=str.split(" ");
		String nstr="";
		System.out.println("the reversed string with o=word order not changed");
		for(int i=input.length-1;i>=0;i--){
			nstr=nstr+input[i]+" ";
		}
		System.out.println(nstr.toString());
	}
	public static void main(String args[]){
		
		String len="i like this program very much";
		reverse(len);
	}
}
