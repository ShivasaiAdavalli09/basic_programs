package GeeksForGeeksStrings;

//Input is "geeks for geeks class"
//Output is "seekg rof seekg slasc"
public class SwapFirLasCharInSent {

	static void Rearrange(String str){
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			
			//k stores the first element and i stores the last element
			int k=i;
			
			//because we want only first and last char of every word to be swapped hence ch[i]!=' '
			while(i<ch.length && ch[i]!=' ')
				i++;
			
			//now swapping
			
			char temp=ch[k];
			ch[k]=ch[i-1];
			ch[i-1]=temp;
			}
		String res=String.valueOf(ch);
		System.out.print(res);
	}
	public static void main(String args[]){
		
		String input="geeks for geeks class";
		Rearrange(input);
	}
	
	
}
