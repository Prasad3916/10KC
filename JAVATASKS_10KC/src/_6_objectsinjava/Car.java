package _6_objectsinjava;
public class Car {
    static String showroomName="Elite Motors";
    String modelname;
    long price;
    void displayDetails(String model,long price){
        System.out.println("ShowrromName : "+showroomName);
        System.out.println("Car Model : "+model);
        System.out.println("Car Price : " +price );
        System.out.println("--------------------------------");
    }
    public static void main(String[] args) {
        Car obj=new Car();
        obj.modelname="Tesla Model S";
        obj.price=80000;
        obj.displayDetails(obj.modelname, obj.price);
        obj.modelname="Elite Motors";
        obj.price=75000;
        obj.displayDetails(obj.modelname, obj.price);
    }
}