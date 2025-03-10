package _8_java_instance_methods;
//Program 2
public class Car {
     String carMake;
     String carModel;
     short manufacturingYear;
     void addCarDetails(String carmake,String carmodel,short manufactureyear){
        carMake=carmake;
        carModel=carmodel;
        manufacturingYear=manufactureyear;
     }
     String displayDetails(){
        return ("CarMake : "+carMake+", CarModel : "+carModel+", ManufacturingYear : "+manufacturingYear);
     }
    public static void main(String[] args) {
        Car c=new Car();
        short s=2020;
        c.addCarDetails("Toyota","5 SUVs",s);
        System.out.println(c.displayDetails());
    }
}
