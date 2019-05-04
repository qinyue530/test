package com.base.Algorithm;

public class Sort {
	public static void main(String[] args) {
		int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
		quickSort(arr , 0 , arr.length-1);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public static void quickSort(int[] arr,int low,int high){
		if (low>high) {
			return;
		}
	   int i = low;
	   int j = high;
	   int temp = arr[low];
	   while (i<j) {		   
		 
		  while (temp >= arr[i] && i < j) {
			   i++;
		   }	
  		  while (temp <= arr[j] && i < j) {
			   j--;
		   }	   
		   if (i<j) {
			   int t = arr[i];
			   arr[i] = arr[j];
			   arr[j] = t;
		   }
	   }
	   if(arr[i]<arr[low]) {
		   arr[low] = arr[i];
		   arr[i] = temp;		   
	   }

	   quickSort(arr, low, j-1);
	   quickSort(arr, j+1 ,high);	   
	}
}
