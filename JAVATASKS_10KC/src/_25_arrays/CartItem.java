package _25_arrays;
import java.util.Arrays;
public class CartItem {
	int itemid;
	String itemname;
	double [] pricesfromsellers=new double[3];
	public CartItem(int itemid, String itemname, double[] pricesfromsellers) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.pricesfromsellers = pricesfromsellers;
	}
}
class ShoppingCart {
	CartItem[] c=new CartItem[5];
	ShoppingCart(CartItem[] c){
		this.c=c;
	}
	double sum;
	void displayCart(CartItem[] c) {
		for(int i=0;i<c.length;i++) {  // {35,45,2,3,12,56} 
			Arrays.sort(c[i].pricesfromsellers);  //{ 2,3,12,35,46,56}
			double lowestprice=c[i].pricesfromsellers[0];
			sum+=lowestprice;
			System.out.println("Item Id : "+c[i].itemid);
			System.out.println("Item Name : "+c[i].itemname);
			System.out.println("Best Price : "+lowestprice);
		}
	}
	void calculatetotalcost() {
		System.out.println("Total Cost Of All Products : "+sum);
	}
	public static void main(String[] args) {
		CartItem c1=new CartItem(101,"Mobiles",new double[] {37674,76376,38783});
		CartItem c2=new CartItem(102,"Computers",new double[] {65376,74654,74674});
		CartItem c3=new CartItem(103,"Laptop",new double[] {27637,38373,27828});
		CartItem c4=new CartItem(104,"Buds",new double[] {387387,873873,287877});
		CartItem c5=new CartItem(105,"Watches",new double[] {38738,37837,39839});	
		CartItem[] c= {c1,c2,c3,c4,c5};
		ShoppingCart s=new ShoppingCart(c);
		s.displayCart(c);
		s.calculatetotalcost();
	}
}

