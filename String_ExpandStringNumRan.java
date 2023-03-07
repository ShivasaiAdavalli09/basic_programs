package GeeksForGeeks_serious_Practice;


//I/P 1-5,8,11-14,18,20,26-29, O/P all numbers expand string
public class String_ExpandStringNumRan {

	public static void main(String args[]){
		
		String str="1-5,7,11-20";
		expand(str);
		}

	private static void expand(String str) {
		
	StringBuilder sb= new StringBuilder();
	
	String strArr[]=str.split(",");
	
	for(int i=0;i<strArr.length;i++){
		
		String arr[]=strArr[i].split("-");
		
		if(arr.length==2){
			int low=Integer.parseInt(arr[0]);
			int high=Integer.parseInt(arr[arr.length-1]);
			
			while(low<=high){
				
				sb.append(low+" ");
				low++;
			}
			
		}
		else
			sb.append(strArr[i]+" ");
	}
	System.out.println("the expanded numbers are"+sb.toString());
	}
}
