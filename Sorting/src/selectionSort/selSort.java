package selectionSort;

import java.util.Scanner;

public class selSort {
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Before Sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<n-1;i++) {
			int min_index = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index = j;
				}
			}
			swap(arr,i,min_index);
		}
		System.out.print("After Sorting : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void swap(int[] arr,int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
