package com.dragonfish;

import java.util.Scanner;

public class Main {
	
	public static int linearSearch(int n, int arr[], int target){
		for(int i = 0; i < n; ++i){
			if(arr[i] == target)
				return i;
		}
		return -1;
	}


    public static void main(String[] args){
        System.out.println("Linear Search (O(N) time)");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		System.out.print("Enter the elements of the array, spaced out: ");
		int arr[] = new int[n];
		for(int i = 0; i < n; ++i){
			int k = scanner.nextInt();
			arr[i] = k;
		}
		System.out.print("Enter the element you want to find the index of: ");
		int target = scanner.nextInt();
		int ans = linearSearch(n, arr, target);
		System.out.println("Your element is at index " + ans + ". (-1 means element does not exist in the array)");
    }
}
