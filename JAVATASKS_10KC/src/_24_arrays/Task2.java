package _24_arrays;
public class Task2 {
	
	static void countOfEvenAndOdd() {
		int arr[]=Array.getIntArray();
		int evencount=0;
		int oddcount=0;
		for(int ele:arr) {
			if(ele%2==0) {
				evencount+=1;
			}
			else {
				oddcount+=1;
			}
		}
		System.out.println("Even Count = "+evencount);
		System.out.println("Odd Count = "+oddcount);		
	}
	    public static void main(String[] args) {
	      countOfEvenAndOdd();
	    }
	}



