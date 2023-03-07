package GeeksForGeeks_serious_Strings;

//https://www.geeksforgeeks.org/java-program-expand-string-range-given/
public class String_ExpandStringNumRange {

	public static void expand(String word){
		
		// Creating an object of StringBuffer class to
        // make a modifiable string object
		StringBuilder sb=new StringBuilder();
		
		//get all intervals
		String strArr[]=word.split(",");
		
		//traverse through every interval
		for(int i=0;i<strArr.length;i++){
			//Get lower and upper
			String a[]=strArr[i].split("-");
			
			//setting high and lower counters
			if(a.length==2){
				
				int low=Integer.parseInt(a[0]);
				int high=Integer.parseInt(a[a.length-1]);
				
				//condition check holds true till low<high
				while(low<=high){
					
					//append all numbers
					sb.append(low+" ");
					low++;
				}
				
			}
			//there is no range,only one number there hence simply appending to sb
			else{
				sb.append(strArr[i]+" ");
			}
		}
		//System.out.println(sb.toString());
		System.out.println(sb);//or we can also just keep sb and print 
		
	}
	
	public static void main(String args[]){
		
		String str="1-5,8,11-14,18,20,26-29";
		expand(str);
	}
}
