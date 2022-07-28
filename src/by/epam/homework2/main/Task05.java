package by.epam.homework2.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first number:");
		int a = scan.nextInt();
		System.out.println("Input second number:");
		int b = scan.nextInt();
		double c = ((a*1.0)+(b*1.0))/2;
		if (c%1==0) {
			int d = (int)c;
			System.out.println("Arithmetic mean is " + d);
		}
		else {
			System.out.println("Arithmetic mean is " + c);
		}
		

	}

}
