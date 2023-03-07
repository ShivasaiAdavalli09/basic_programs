package q4interview.programs;

public class StringToCamel {

	public static void main(String args[]){
		String st="hello world";
		String res="";
		String rem="";
		
		String[] str=st.split(" ");
		
		for(String s:str){
			res=s.substring(0,1).toUpperCase();
			System.out.print(res);
			rem=s.substring(1,s.length()).toLowerCase();
			
			
			System.out.print(rem+" "); //we add space here only not after above res the remaining word of string ends here and thats whre the space needed
			
		}
	}
}
