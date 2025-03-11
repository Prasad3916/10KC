package _14_loops;
public class Example2 {
	void evenoroddNumbers() {
		  String even_numbers="Even Numbers : ";
		  String odd_numbers="Odd Numbers : ";
		  for(int i=1;i<=200;i++) {
			  if(i%2==0) {
				  even_numbers+=i+" ";
			  }
			  else {
				  odd_numbers+=i+" ";
			  }
		  }
		  System.out.println(even_numbers);
		  System.out.println(odd_numbers);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e1=new Example2();
		e1.evenoroddNumbers();
		
	}

}
