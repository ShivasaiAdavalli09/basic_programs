package SortandSearching;

import java.util.Scanner;  

public class SelectionSort
{  
   public static void main(String args[])  
   {  
       int size, i, j, temp;  
       int arr[] = new int[50];  
       Scanner scan = new Scanner(System.in);  
         
       System.out.print("Enter Array Size : ");  
       size = scan.nextInt();  
         
       System.out.print("Enter Array Elements : ");  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
         
       System.out.print("Sorting Array using Selection Sort Technique..\n");  
       for(i=0; i<size; i++)  
       {  
    	// Find the minimum element in unsorted array
          int min=i;
    	   for(j=i+1; j<size; j++)  
           {  
               if(arr[min] > arr[j])  
                   min=j;
            // Swap the found minimum element with the first
               // element
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
              
           }  
       }  
         
       System.out.print("Now the Array after Sorting is :\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ "  ");  
       }  
   }  
}  
