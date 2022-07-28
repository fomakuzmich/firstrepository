package by.epam.homework2.main;

import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input cube edge length:");
		double a = scan.nextDouble();
		double p = Math.pow(a, 2);//cubeFaceArea;
		double q = p*6;//cubeArea;
		double v = Math.pow(a, 3);//cubeVolume;
		System.out.println("Cube face area = " + p);
		System.out.println("Cube area = " + q);
		System.out.println("Cube volume = " + v);
		
	}

}
