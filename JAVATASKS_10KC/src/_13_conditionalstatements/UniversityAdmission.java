package _13_conditionalstatements;

public class UniversityAdmission {
	
	
	
	public String evaluateAdmission(int marks,boolean sportsAchievement) {
		if(marks>=95) {
			return "Admitted With ScholarShip";
		}
		else if(marks >=85 && marks <95) {
			return "Admitted Without ScholarShip";
		}
		else if(marks >=70 && marks <85 && sportsAchievement) {
			return "Admitted Under Sports Quota";
		}
		else if(marks >=60 && marks <70) {
			return "Interview Required";
		}
		else {
			return "Admission Rejected";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniversityAdmission ua= new UniversityAdmission();
			
		System.out.println(ua.evaluateAdmission(77, true));


	}

}
