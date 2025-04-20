package _25_arrays;
public class SecondMaxFromArray {
	int arr[]= {12,35,1,10,34,1};
	void getSecondMaxElement() {
		int max=arr[0];
		int secondmax=0;
		for(int i=0;i<arr.length-1;i++) {
			if(max<arr[i+1]) {
				max=arr[i+1];
			}
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=max && secondmax<arr[j]) {
				secondmax=arr[j];
			}
			
		}
		System.out.println("Second Largest : "+secondmax);
	}
	public static void main(String[] args) {
		SecondMaxFromArray sa=new SecondMaxFromArray();
		sa.getSecondMaxElement();
	}
}
