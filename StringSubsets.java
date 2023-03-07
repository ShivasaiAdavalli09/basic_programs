package babbar_450_String;

public class StringSubsets {

	private static void subSets(String input){
		
		int temp=0;
		int len=input.length();
		String arr[]=new String[len*(len+1)/2];
		for(int i=0;i<len;i++){
			for(int j=i;j<len;j++){
				arr[temp]=input.substring(i,j+1);
				temp++;
			}
		}
		for(String p:arr)
			System.out.println(p);
	}
	public static void main(String args[]){
		String str="FUN";
		subSets(str);
	}
}
