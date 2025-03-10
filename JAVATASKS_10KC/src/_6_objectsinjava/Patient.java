package _6_objectsinjava;
public class Patient {
    static String hospitalName="City Care Hospital";
    String patientName;
    byte age;
    void displayDetails(String name,byte age){
        System.out.println("HospitalName : "+hospitalName);
        System.out.println("Patient Name : "+name);
        System.out.println("Patient Age : " +age);
        System.out.println("--------------------------------");
    }
    public static void main(String[] args) {
        Patient obj=new Patient();
        obj.patientName="John Doe";
        obj.age=45;
        obj.displayDetails(obj.patientName, obj.age);
        obj.patientName="Emma Watson";
        obj.age=20;
        obj.displayDetails(obj.patientName, obj.age);
       
    }
}