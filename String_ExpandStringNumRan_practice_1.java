package GeeksForGeeks_serious_Practice;

//https://www.geeksforgeeks.org/java-program-expand-string-range-given/
//I/P 1-5,8,11-14,18,20,26-29 ,O/P all numbers expand string
public class String_ExpandStringNumRan_practice_1 {
	
	public static void main(String args[]){
		
		String word="1-5,8,11-19,20,21-26";
		expand(word);
	}

	private static void expand(String word) {
		
		StringBuilder sb=new StringBuilder();
		
		String[] strArr=word.split(",");
		
		for(int i=0;i<strArr.length;i++){
			
			String[] a=strArr[i].split("-");
			
			if(a.length==2){
				int low=Integer.parseInt(a[0]);
				int high=Integer.parseInt(a[a.length-1]);
				
				while(low<high){
					sb.append(low+" ");
					low++;
				}
			}
			else{
				sb.append(strArr[i]+" ");
			}
			
		}
		System.out.println(sb.toString());
	}
}
