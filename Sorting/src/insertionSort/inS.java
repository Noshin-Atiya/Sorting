package insertionSort;

import java.util.Scanner;

public class inS {
	public static void insertionSort(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Original Array list: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		insertionSort(arr,n);
		System.out.println();
		System.out.println("The Sorted Array list: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
