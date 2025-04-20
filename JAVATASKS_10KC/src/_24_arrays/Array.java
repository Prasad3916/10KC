package _24_arrays;
import java.util.Scanner;
public class Array {
	static Scanner sc=new Scanner(System.in);
	static int[] getIntArray() {
		System.out.print("Enter The Number Of Elements : ");
		int size=sc.nextInt();
		if(size<=0) {
			return null;
		}
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements : ");
		for(int i=0;i<size;i++) {
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		return arr;
		
	}
}
