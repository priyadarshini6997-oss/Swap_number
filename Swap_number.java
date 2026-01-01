package com.index;

import java.util.Scanner;

public class Swap_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Numbers before swap: first number- "+a+" second number- "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Numbers after swap:first number- "+a+" second number- "+b);
		sc.close();
		

	}

}
