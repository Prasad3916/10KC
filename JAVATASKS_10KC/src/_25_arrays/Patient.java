package _25_arrays;
import java.util.Arrays;
public class Patient {
	int patientid;
	String name;
	double[] testresults=new double[5];
	public Patient(int patientid, String name, double[] testresults) {
		super();
		this.patientid = patientid;
		this.name = name;
		this.testresults = testresults;
	}
	double getAverageResult() {
		int sum=0;
		for(int i=0;i<testresults.length;i++) {
			sum+=testresults[i];
		}
		return (sum)/testresults.length;
	}
	boolean hasCriticalValues() {
		boolean flag=false;
		for(int j=0;j<testresults.length;j++) {
			if(testresults[j]<50) {
				flag=true;
			}
		}
		return flag;
	}
	public String displayPatientReport() {
		return "Patient [patientid=" + patientid + ", name=" + name + ", testresults=" + Arrays.toString(testresults)
				+ "]";
	}
	public static void main(String[] args) {
		Patient p1=new Patient(101,"ABC",new double[] {76,76,67,54,65});
		Patient p2=new Patient(102,"IJK",new double[] {67,57,34,65,76});
		Patient p3=new Patient(103,"PQR",new double[] {56,67,54,45,56});
		Patient p4=new Patient(104,"STU",new double[] {56,54,56,45,54});
		Patient p5=new Patient(105,"XYZ",new double[] {55,65,67,54,56});
		
		Patient p[]= {p1,p2,p3,p4,p5};
		for(Patient ele:p) {
			if(ele.hasCriticalValues()) {
				System.out.println(ele.displayPatientReport());
			}
		}

	}

}
