package by.epam.tr.main;

public class Task05 {

	public static void main(String[] args) {
		double a,b,c;
		a=1.5;
		b=2.2;
		c=-3.0;
	
		System.out.println(mathPow(a));
		System.out.println(mathPow(b));
		System.out.println(mathPow(c));
		
	}
	public static double mathPow(double x) {
		double answer;
		if (x>=0) {			
			answer = Math.pow(x, 2);
		}
		else {
			answer = Math.pow(x, 4);
		}
		return answer;
	}
}
