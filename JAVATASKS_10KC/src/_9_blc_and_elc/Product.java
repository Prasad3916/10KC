package _9_blc_and_elc;
public class Product {
    int productId;
    String productName;
    double price;
    byte quantity;
    void setproductId(int pid){
        productId=pid;
    }
    void setproductName(String pname){
        productName=pname;
    }
    void setprice(double pprice){
        price=pprice;
    }
    void setquantity(byte pquantity){
        quantity=pquantity;
    }
    int getproductId(){
        return productId;
    }
    String getproductName(){
        return productName;
    }
    double getprice(){
        return price;
    }
    int getquantity(){
        return quantity;
    }
}