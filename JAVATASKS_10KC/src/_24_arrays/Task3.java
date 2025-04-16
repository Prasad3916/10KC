package _24_arrays;

import java.util.Arrays;

public class Task3 {
	static void reverseAnArray() {
		int arr[]=Array.getIntArray();
		int revarr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			revarr[i]=arr[arr.length-(i+1)];
		}
		System.out.println("Array In Reverse Order : "+Arrays.toString(revarr));
	}
	    public static void main(String[] args) {
	    	reverseAnArray();
	    }
	}



