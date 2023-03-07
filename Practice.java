package geekforGeeks;

public class Practice {

	//string occuerncs in geeksforgeeks without using hashmap
	public static void main(String args[]){
	String str="geeksforgeeks";
	//decalre one more array to tarce the count and convert to array and compare every element with next
	int len=str.length();
	char[] groupArr=str.toCharArray();
	int freq[]=new int[len];
	for(int i=0;i<len;i++){
		freq[i]=0;
		for(int j=i+1;j<len;j++){
			if(groupArr[i]==groupArr[j]){
				freq[i]++;
				//to avoid vsiting same positioj repeated
				groupArr[j]=0;
			}
		}
	}
	for(int i=0;i<len;i++){
	if(groupArr[i]!=' ' && groupArr[i]!=0) //that is didnt want to print blank and visited char
	System.out.println(groupArr[i]+" "+freq[i]);
	}
	}
}
