package babbar_450_String;

//javatpoint
public class StringDivideNParts {

	private static void divideNParts(String input,int k){
		
		int len=input.length(),temp=0;
		int parts=len/k;
		
		//result 
		String resultArr[]=new String[len];
		for(int i=0;i<len;i=i+parts){
			
			String res=input.substring(i,i+parts);
			resultArr[temp]=res;
			temp++;
		}
		//System.out.println("the string result in n parts"+resultArr.toString());
		for(int i=0;i<resultArr.length;i++){
			System.out.println(resultArr[i]);
		}
	}
	public static void main(String args[]){
		String str="aaaabbbbcccc";
		divideNParts(str,3);
	}
}
