package _24_arrays;
import java.util.Scanner;
public class Array {
	static int[] getIntArray() {
		System.out.print("Enter The Number Of Elements : ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		if(size<=0) {
			sc.close();
			return null;
		}
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements : ");
		for(int i=0;i<size;i++) {
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		sc.close();
		return arr;
		
	}
}
