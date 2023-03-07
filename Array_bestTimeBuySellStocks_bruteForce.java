package GeeksForGeeks_450_programs;


//refer leet code
public class Array_bestTimeBuySellStocks_bruteForce {
  
	public static int maxProfit(int prices[]){
		int maxProfit=0;
		int profit;
		for(int i=0;i<prices.length-1;i++){
			for(int j=i+1;j<prices.length;j++){
				profit=prices[j]-prices[i];
				if(profit>maxProfit)
					maxProfit=profit;
			}
		}
		return maxProfit;
 }
	public static void main(String args[]){
		
		int arr[]={7,1,5,3,6,4};
		int p=maxProfit(arr);
		
		System.out.print(p);
	}
}
