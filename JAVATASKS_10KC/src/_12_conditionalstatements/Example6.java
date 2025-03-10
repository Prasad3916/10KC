package _12_conditionalstatements;

public class Example6 {
	
	boolean numDividibleBy5And11(int num) {
		if(num%5==0 && num %11==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
	Example6 e6=new Example6();
	boolean res1=e6.numDividibleBy5And11(55);
	if(res1) {
		System.out.println("Divisibile By Both 5 and 11");
	}
	else {
		System.out.println("Not Divisible By Both 5 and 11");
	}
		
	
}
}
