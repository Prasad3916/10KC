package _6_objectsinjava;
public class Mobile {
    static String storeName="Tech World";
    String brand;
    int price;
    void displayDetails(String brand,int price){
        System.out.println("StoreName : "+storeName);
        System.out.println("Mobile brand : "+brand);
        System.out.println("Mobile Price : " +price );
        System.out.println("--------------------------------");
    }
    public static void main(String[] args) {
        Mobile obj=new Mobile();
        obj.brand="Apple";
        obj.price=1200;
        obj.displayDetails(obj.brand, obj.price);
        obj.brand="Samsung";
        obj.price=900;
        obj.displayDetails(obj.brand, obj.price);
    }
}