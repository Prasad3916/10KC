package _9_blc_and_elc;
public class ProductElc {
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product();
        p1.setproductId(101);
        p1.setproductName("Hp Pavilion 15");
        byte b=1;
        p1.setquantity(b);
        p1.setprice(60000);
        p2.setproductId(102);
        p2.setproductName("OnePlusNordCe3");
        b=1;
        p2.setquantity(b);
        p2.setprice(19000);
        System.out.println("----------------Product 1 Details----------------");
        System.out.println("Product Id : "+p1.getproductId());
        System.out.println("Product Name : "+p1.getproductName());
        System.out.println("Product Quantity : "+p1.getquantity());
        System.out.println("Product Price : "+p1.getprice());
        System.out.println("----------------Product 2 Details----------------");
        System.out.println("Product Id : "+p2.getproductId());
        System.out.println("Product Name : "+p2.getproductName());
        System.out.println("Product Quantity : "+p2.getquantity());
        System.out.println("Product Price : "+p2.getprice());
    }
}
