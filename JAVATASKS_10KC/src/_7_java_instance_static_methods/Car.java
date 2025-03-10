package _7_java_instance_static_methods;
public class Car {
    int mileage;
    static String manufacturer;
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        car1.mileage=car1.mileage+50;
        Car.manufacturer="AutoMaker Inc.";
        car2.mileage=car1.mileage+30;
        System.out.println("After modification:");
        System.out.println("car1.mileage: " + car1.mileage);
        System.out.println("car2.mileage: " + car2.mileage);
        System.out.println("Using car1: " + car1.manufacturer);
        System.out.println("Using car2: " + car2.manufacturer);
        System.out.println("Using Car: " + Car.manufacturer);
        car1.manufacturer = "Speedster Co.";
        System.out.println("After modifying static variable using car1:");
        System.out.println("car1.manufacturer: " + car1.manufacturer);
        System.out.println("car2.manufacturer: " + car2.manufacturer);
        System.out.println("Car.manufacturer: " +Car.manufacturer);   
    }
}