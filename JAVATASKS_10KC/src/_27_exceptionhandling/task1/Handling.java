package _27_exceptionhandling.task1;
public class Handling {
	static void timethod(int i) {
		try {
			System.out.println("10000");
			ti1method(i);
			System.out.println("Coders");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void ti1method(int i) {
		try {
			int j=10/i;
			System.out.println("Completed");
		}
		catch(Exception e){
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
		}
	}
}

