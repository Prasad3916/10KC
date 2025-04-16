package _24_arrays;

import java.util.Arrays;

public class Task5 {
	
	static void copyArray() {
		int arr[]=Array.getIntArray();
		int newarr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newarr[i]=arr[i];
		}
		System.out.println("Elements Copied To New Array : "+Arrays.toString(newarr));
	}
	
	public static void main(String[] args) {
		copyArray();
	}
	
	}



