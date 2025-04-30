package com.example.lambda;
import java.util.function.Consumer;
public class Task5 {
	public static void main(String[] args) {
		Consumer<Float> con=f-> System.out.println(f>0?"Positive Number":((f<0)?"Negative Number":"Zero"));
		con.accept(-10f);
	}
}
