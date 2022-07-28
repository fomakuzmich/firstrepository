package by.epam.homework2.main;

import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input boat speed in km/h:");
		double vBoat = scan.nextDouble();//boat speed
		System.out.println("Input river speed in km/h:");
		double vRiver = scan.nextDouble();//river speed
		System.out.println("Input lake sailing time in minutes:");
		double tLake = scan.nextDouble()/60;//lake time
		System.out.println("Input river sailing time in minutes:");
		double tRiver = scan.nextDouble()/60;//river time
		double distance = (vBoat*tLake)+((vBoat-vRiver)*tRiver);
		System.out.print("Distance = ");
		if (distance>1) { 
			System.out.printf("%.3f", distance);
			System.out.println("km");
		}
		else {
			int distanceInMeters = (int)(distance*1000);
			System.out.println(distanceInMeters + "m");
		}
		

	}

}
