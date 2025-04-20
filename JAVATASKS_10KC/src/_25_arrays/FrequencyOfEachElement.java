package _25_arrays;
public class FrequencyOfEachElement {
	int arr[]= {1,2,2,3,3,3};
	void getFrequencyOfElement() {
		for(int ele:arr) {
			int  count=0;
			for(int i=0;i<arr.length;i++) {
				if(ele==arr[i]) {
					count++;
					arr[i]=0;
				}
			}
			if(ele!=0) {
				System.out.println("Frequency of "+ele+" is "+count);
			}
		}
	}
	
	public static void main(String[] args) {
		FrequencyOfEachElement fe=new FrequencyOfEachElement();
		fe.getFrequencyOfElement();
	}
}
