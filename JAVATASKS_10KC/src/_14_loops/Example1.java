package _14_loops;

public class Example1 {
	void printNumbersFrom1To10() {
		System.out.println("1 to 10 Numbers");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	void printNumbersFrom10To1() {
		System.out.println("10 to 1 Numbers");
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
	}
	void printEvenNumbersFrom2To20() {
		System.out.println("2 to 20 Even Numbers");
		for(int i=2;i<=20;i+=2) {
			System.out.println(i);
		}
	}
	void printOddNumbersFrom1To15() {
		System.out.println("1 to 15 Odd Numbers");
		for(int i=1;i<=15;i+=2) {
			System.out.println(i);
		}
	}
	void print5MultipleFrom5To50() {
		System.out.println("5 to 50 Five Multiples");
		for(int i=5;i<=50;i+=5) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e1=new Example1();
		e1.printNumbersFrom1To10();
		e1.printNumbersFrom10To1();
		e1.printEvenNumbersFrom2To20();
		e1.printOddNumbersFrom1To15();
		e1.print5MultipleFrom5To50();
		

	}

}
