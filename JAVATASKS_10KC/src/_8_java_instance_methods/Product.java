//Product 4
package _8_java_instance_methods;
public class Product {
    String productName;
    String productId;
    int productPrice;
    void addProductDetails(String pname,String pid,int pprice){
            productName=pname;
            productId=pid;
            productPrice=pprice;
     }
     String displayDetails(){
           return ("ProductName : "+productName+", ProductId : "+productId+", ProductPrice : "+productPrice);
     }
    public static void main(String[] args) {
        Product p=new Product();
        int  i=64000;
        p.addProductDetails("Laptop Pavilion 15s","15eg2009tu",i);
        System.out.println(p.displayDetails());
    }
}
