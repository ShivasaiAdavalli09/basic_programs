package geekforGeeks;

public class StringNoOfOccurences2 {

	//geeksforgeeks occurences of each element
	public static void main(String args[]){
	String str="geeksforgeeks";
	int len=str.length();
	char[] groupChar=str.toCharArray();
	int freq[]=new int[len];
	for(int i=0;i<len;i++){
		freq[i]=1;
		for(int j=i+1;j<len;j++){
			if(groupChar[i]==groupChar[j]){
				freq[i]++;
				groupChar[j]='0';
			}
		}
	}
	for(int i=0;i<freq.length;i++){
		if(groupChar[i] != ' ' && groupChar[i] != '0') 
		System.out.println(groupChar[i]+" "+freq[i]);
	}
}
}
