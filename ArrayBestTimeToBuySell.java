package babbar_450_array;

//Given an array prices[] of length N, representing the prices of the stocks on different days, 
//the task is to find the maximum profit possible for buying and selling the stocks on different days using transactions where at most one transaction is allowed.
//https://www.geeksforgeeks.org/best-time-to-buy-and-sell-stock/
public class ArrayBestTimeToBuySell {

	private static int maxProfit(int arr[]){
		int buy=arr[0]; //or can assign to Integer.MAX_VALUE its fine
		int max_profit=0;
		//buy should be min value since buying and max_profit should be maximum which is difference with current price and buy value
		for(int i=0;i<arr.length;i++){
			if(buy>arr[i])//buy should be min
				buy=arr[i];
			//checking for higher profit
			else if(arr[i]-buy>max_profit){
				max_profit=arr[i]-buy;
			}
		}
		return max_profit;
	}
	public static void main(String args[]){
		int stocks[]={10,40,20,80,40,100,90};
		int bonds[]={7,1,5,6,4};
		//remember first value would not be there because we do not know on first day the future price
		int stockss[]={100,40,10,80,40,20,90};
		//int output=maxProfit(stocks);
		int output1=maxProfit(bonds);
		//int output2=maxProfit(stockss);
		System.out.print("maximum profit can be achieved"+" "+output1);
	}
}
