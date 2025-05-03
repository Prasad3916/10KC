package _27_exceptionhandling.task2;
public class CarTest extends Exception{
	static void stop(String str)throws CarStopped {
		if(str=="stop") {
			throw new CarStopped("Car Not Started");
		}
		else {
			System.out.println("Car not stalled");
		}
	}
	static void puncture(String str)throws CarPuncture {
		if(str=="puncture") {
			throw new CarPuncture("Car Has Puncture");
		}
		else {
			System.out.println("Car not punctured");
		}
	}
	static void carHeat(int i)throws CarHeat {
		if(i>50) {
			throw new CarHeat("Car is heated more than 50 degrees");
		}
		else {
			System.out.println("Car Not Stalled");
		}
	}
	public static void main(String[] args) {
		try {
			stop("stop");
			puncture("puncture");
			carHeat(56);
		}
		catch(CarStopped e) {
			System.out.println(e);
		}
		catch(CarPuncture e) {
			System.out.println(e);
		}
		catch( CarHeat e) {
			System.out.println(e);
		}
	}
}
