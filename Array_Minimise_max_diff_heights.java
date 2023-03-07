package GeeksForGeeks_450_programs;

import java.util.Arrays;

//https://www.tutorialcup.com/interview/array/minimize-the-maximum-difference-between-the-heights.htmv
public class Array_Minimise_max_diff_heights {

	public static int getMinimizeHeights(int arr[], int n, int k)
    {
        if (n == 1)
            return 0;
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        int minimum = arr[0] + k;
        int maximum = arr[n-1]-k;
        int temp = 0;
        if (minimum > maximum) //this comparison is not so important,this applies when negative numbers along with positive numbers in array
        {
            temp = minimum;
            minimum = maximum;
            maximum = temp;
       }
        for (int i = 1; i < n-1; i ++)
        {
            int difference = arr[i] - k;
            int sum = arr[i] + k;
            if (difference >= minimum || sum <= maximum)
                continue;
            if (maximum - difference <= sum - minimum)
                minimum = difference;
            else
                maximum = sum;
        }
        return Math.min(diff, maximum - minimum);
    }
    public static void main(String[] args)
    {
        int arr[] = {3,12,9,16,20};
        int n = arr.length;
        int k = 3;
        System.out.println(getMinimizeHeights(arr, n, k));
    }
}
/*1. Sort the given array.
2. Set the diff to the difference between the least element of the array and the first element of an array.
3. Set minimum to the first element of array + k and maximum to last element - k of the array.
4. Traverse the array from i=1 to i<n-1(one less than the length of the array).
  1. Set difference to arr[i]-k.
  2. Set sum to arr[i]+k.
  3. Check if the difference is greater than equal to minimum or sum is less than or equal to maximum.
    1. If true, then continue and skip this traversal.
  4. Check if maximum-difference is less than or equal to sum-minimum.
    1. If true, then update minimum to difference.
  5. Else set the maximum to sum.
5. Return the minimum between the diff and maximum-minimum.*/
