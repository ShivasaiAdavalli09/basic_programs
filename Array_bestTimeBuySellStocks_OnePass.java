package GeeksForGeeks_450_programs;

public class Array_bestTimeBuySellStocks_OnePass {

	static int minPrice=Integer.MAX_VALUE;
	static int maxProfit=0;
	
	public static int maxProfit(int prices[]){
		
		for(int i=0;i<prices.length;i++){
			if(prices[i]<minPrice){
				minPrice=prices[i];
			}
			else if(prices[i]-minPrice>maxProfit)
				maxProfit=prices[i]-minPrice;
		}
		
		return maxProfit;
		}
	public static void main(String args[]){
		
		int arr[]={7,1,5,3,6,4};
		int p=maxProfit(arr);
		
	}
}
