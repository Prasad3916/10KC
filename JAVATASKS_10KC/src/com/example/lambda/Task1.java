package com.example.lambda;
import java.util.function.BiFunction;
public class Task1 {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> bifun=(a,b)->a+b;
		System.out.println(bifun.apply(10, 20));
	}
}
