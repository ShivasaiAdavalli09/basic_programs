package q4interview.programs;

public class UpToLowViceVersa {

	public static void main(String args[]){
		String str="WhAt is THis";
		String res;
		
		//char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)){
				System.out.print(Character.toLowerCase(ch));
			}
			else 
				System.out.print(Character.toUpperCase(ch));
		}
	}
}
