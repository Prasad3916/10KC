package _24_arrays;
import java.util.Scanner;
public class Task4 {
	static void findingValueInArray() {
		System.out.print("Enter The Number Of Elements : ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		if(size<=0) {
			sc.close();
		}
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements : ");
		for(int i=0;i<size;i++) {
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		System.out.print("Enter Element To Search : ");
		int searchele=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchele) {
				System.out.println("Elemet Found At Position : "+(i+1));
			}
		}
		sc.close();
		
	}
	public static void main(String[] args) {
		findingValueInArray();
	}
	
}



