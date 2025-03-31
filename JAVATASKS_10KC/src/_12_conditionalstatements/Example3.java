package _12_conditionalstatements;

public class Example3 {
		boolean isVowel(char ch) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				return true;
			}
			else {
				return false;
			}
		}
		public static void main(String[] args) {
			Example3 e3=new Example3();
			boolean res1=e3.isVowel('A');
			System.out.println(res1);
			
			
		}
}
