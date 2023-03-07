package q4interview.programs;

public class StringToSentence {

	public static void main(String args[]){
		
		String str="this is Shiva.I am from hyderabad";
		char[] ch=str.toCharArray();
		
		System.out.print(str.substring(0, 1).toUpperCase());
		
		for(int i=1;i<ch.length;i++){
			
			if(ch[i]=='.'){
				System.out.print(Character.toUpperCase(ch[i]));
				System.out.print(Character.toUpperCase(ch[i+2]));
			}
			else
				System.out.print(ch[i]);
		}
		
	}
}
