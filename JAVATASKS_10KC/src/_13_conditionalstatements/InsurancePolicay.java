package _13_conditionalstatements;

public class InsurancePolicay {
	
	
	
	public String calculatePremium(int age,int experience) {
		if(age>50 && experience >10) {
			return "Lowest Premium";
		}
		else if(age>=30 && age <=50 && experience > 5) {
			return "Moderate Premium";
		}
		else if(age >=18 && age <30 && experience <=5) {
			return "Highest Premuim";
		}
		else {
			return "Not Eligible For Premuim";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsurancePolicay ip= new InsurancePolicay();
		System.out.println(ip.calculatePremium(21, 3));
	}

}
