package _13_conditionalstatements;

public class BonusCalculator {
	
	
	public double calculateBonus(int experience ,int rating,double salary) {
		if(experience>5 && rating>9) {
			return .5*salary;
		}
		else if(experience >=3 && experience<=5 && rating >7 && rating <=9) {
			return .3*salary;
		}
		else if(experience >=1 && experience<3 && rating >5 && rating <=7) {
			return .1*salary;
		}
		else {
			return 0;		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BonusCalculator bc=new BonusCalculator();
		System.out.println(bc.calculateBonus(4, 8, 1000000));

	}

}
