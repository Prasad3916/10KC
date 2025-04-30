package com.example.lambda;
import java.util.function.Function;
public class Task4 {
	public static void main(String[] args) {
		Function<String,Integer> fun=s->s.length();
		System.out.println("The Lenght Of Given String Is "+fun.apply("Hello"));
	}
}
