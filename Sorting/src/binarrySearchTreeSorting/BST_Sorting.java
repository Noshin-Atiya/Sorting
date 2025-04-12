package binarrySearchTreeSorting;

import java.util.Scanner;
class node{
	int data;
	node left;
	node right;
	node(int value){
		data = value;
	}
}
public class BST_Sorting {
	public static node insert(node root,int value) {
		if(root==null) {
			return new node(value);
		}
		if(root.data>value) {
			root.left = insert(root.left, value);
		}
		else {
			root.right = insert(root.right,value);
		}
		return root;
		
	}
	static class indexwrapper {
		int index = 0;
	}
	
	public static void inorder(node root,int[] arr,indexwrapper index) {
		if(root==null) {
			return ;
		}
		inorder(root.left,arr,index);
		arr[index.index++]=root.data;
		inorder(root.right,arr,index);
		
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		node root = null;
		for(int a : arr) {
			root = insert(root,a);
		}
		System.out.print("The original array is : ");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		indexwrapper index = new indexwrapper();
		inorder(root,arr,index);
		System.out.print("The Sorted array is : ");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
		
	}

}
