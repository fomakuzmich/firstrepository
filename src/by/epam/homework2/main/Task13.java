package by.epam.homework2.main;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input x1:");
		double x1 = scan.nextDouble();
		System.out.println("Input y1:");
		double y1 = scan.nextDouble();
		System.out.println("Input x2:");
		double x2 = scan.nextDouble();
		System.out.println("Input y2:");
		double y2 = scan.nextDouble();
		System.out.println("Input x3:");
		double x3 = scan.nextDouble();
		System.out.println("Input y3:");
		double y3 = scan.nextDouble();
		double l1 = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2 - y1), 2)));
		double l2 = Math.sqrt((Math.pow((x3-x2), 2))+(Math.pow((y3 - y2), 2)));
		double l3 = Math.sqrt((Math.pow((x1-x3), 2))+(Math.pow((y1 - y3), 2)));
		double perimeter = l1 + l2 + l3;
		double area = Math.sqrt((perimeter/2)*((perimeter/2)-l1)*((perimeter/2)-l2)*((perimeter/2)-l3));
		System.out.print("P = ");
		System.out.printf("%.2f", perimeter);
		System.out.println();
		System.out.print("S = ");
		System.out.printf("%.2f", area);
		System.out.println();

	}

}
