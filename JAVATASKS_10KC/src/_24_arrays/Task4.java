package _24_arrays;
import java.util.Scanner;
public class Task4 {
	static void findingValueInArray() {
		int arr[]=Array.getIntArray();
		Scanner sc= Array.sc;
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



