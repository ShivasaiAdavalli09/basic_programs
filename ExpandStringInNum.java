package GeeksForGeeksStrings;

//Input  : string x = "1-5, 8, 11-14, 18, 20, 26-29" 
//Output : string y = "1, 2, 3, 4, 5, 8, 11, 12, 
//13, 14, 18, 20, 26, 27, 28, 29"
public class ExpandStringInNum {

	static void expand(String word){
		// Creating an object of StringBuffer class to
        // make a modifiable string object
		
		StringBuilder sb=new StringBuilder();
		
		//Get all intervals
		String[] strArr=word.split(",");
		
		//traverse through every interval
		for(int i=0;i<strArr.length;i++){
			
			//get lower and upper
			String[] a=strArr[i].split("-");
			
			//setting high and low counters
			if(a.length==2){
				int low=Integer.parseInt(a[0]);
				int high=Integer.parseInt(a[a.length-1]);
				
				// Condition check holds true
                // Till low counter is lesser or equal to
                // high counter
				while(low<=high){
					
					//Append all numbers
					sb.append(low+" ");
					low++;
				}
			}
			// If we reaches here then
            // High counter exceeds lower counter
			
			else{
				sb.append(strArr[i]+" ");
			}
		}
		 System.out.println(sb.toString());
		// System.out.println(sb); above ad this line both are same
	}
	
	public static void main(String args[]){
		// Custom input string as input
        String s = "1,8,11-14,18,20,26-29";
        expand(s);
	}
	
}
