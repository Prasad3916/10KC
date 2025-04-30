package com.example.lambda;
import java.util.function.Predicate;
public class Task3 {
	public static void main(String[] args) {
		Predicate<Integer> pre=(a)->a%2==0;
		System.out.println(pre.test(10)?"Even":"Odd");
	}
}
