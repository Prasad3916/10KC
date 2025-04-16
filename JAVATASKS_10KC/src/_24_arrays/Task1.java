package _24_arrays;

public class Task1 {

	static void  displaySumOfArray() {
		int arr[]=Array.getIntArray();
		int sum=0;
		for(int ele:arr) {
			sum+=ele;
		}
		System.out.println("Sum Of Array Elements : "+sum);
	}
	
	public static void main(String[] args) {
		
		displaySumOfArray();
	}

}
