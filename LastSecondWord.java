package q4interview.programs.practice;

public class LastSecondWord {

	public static void main(String args[]){
		String str="what is my name";
		
		String arr[]=str.split(" ");
		System.out.println(arr[arr.length-2]);
	}
}
