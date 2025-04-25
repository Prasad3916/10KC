package _26_functionalinterface;
public class Main{
	public static boolean isPrime(int number) {
		boolean flag=true;
		if(number<=1) return false;
		for(int i=2;i*i<number;i++) {
			if(number%i==0) {
				flag=false;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		NumberChecker nc=new NumberChecker() {
			@Override
			public boolean checkNumber(int number) {
				return isPrime(number);
			}
		};
		CharChecker cc=new CharChecker() {
		@Override
		public void checkChar(char character) {
		if(nc.checkNumber((int)character)) {
			System.out.println("Given Character Ascii Value Is Prime i.e "+(int)character+" And The Given Character Is "+character);
		}
		else {
			System.out.println("Given Character Ascii Value Is Not Prime i.e "+(int)character+" And The Given Character Is "+character);
		}}};
		cc.checkChar('C');	
	}
}
