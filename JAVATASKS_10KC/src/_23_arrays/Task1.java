package _23_arrays;
public class Task1 {
		void array() {
		int arr[]=new int[3];
		int j=10;
		arr[0]=j;
		System.out.println("Element At Index "+0+" : "+arr[0]);
		for(int i=1;i<arr.length;i++) {
			arr[i]=arr[i-1]+10;
			System.out.println("Element At Index "+i+" : "+arr[i]);
		}
	}
	public static void main(String[] args) {
		Task1 t1=new Task1();
		t1.array();
	}
}
