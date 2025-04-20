package _25_arrays;
public class MaximumAndMinimum {
	int arr[]= {3,9,2,5,6};
	void getMaxAndMinValue() {
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(min>arr[i+1]) {
				min=arr[i+1];
			}
			else if(max<arr[i+1]) {
				max=arr[i+1];
			}
		}
		System.out.println("Maximum Value : "+max);
		System.out.println("Minimum Value : "+min);
	}
	public static void main(String[] args) {
		MaximumAndMinimum mm=new MaximumAndMinimum();
		mm.getMaxAndMinValue();
	}
}
