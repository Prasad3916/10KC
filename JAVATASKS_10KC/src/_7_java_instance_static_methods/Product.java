package _7_java_instance_static_methods;
public class Product {
    float price;
    static String storeName;
    public static void main(String[] args) {
        Product prod1=new Product();
        Product prod2=new Product();
        prod1.price=prod1.price+25.0f;
        Product.storeName="SuperMart";
        prod2.price=prod1.price+75.0f;
        System.out.println("After modification:");
        System.out.println("prod1.price: " + prod1.price);
        System.out.println("prod2.price: " + prod2.price);
        System.out.println("Using prod1: " + prod1.storeName);
        System.out.println("Using prod2: " + prod2.storeName);
        System.out.println("Using Product: " + Product.storeName);
        prod1.storeName = "MegaStore";
        System.out.println("After modifying static variable using prod1:");
        System.out.println("prod1.storeName: " + prod1.storeName);
        System.out.println("prod2.storeName: " + prod2.storeName);
        System.out.println("Product.storeName: " +Product.storeName);   
    }
}