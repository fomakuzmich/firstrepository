package by.epam.tr.main;

public class Task07 {

	public static void main(String[] args) {
		int a, b, h, x;
		a=-3;
		b=6;
		h=3;
		for (int i = a; i <= b; i += h) {
			x = i;
		double fx = (Math.pow(Math.sin(x), 2))-(Math.cos(2*x));
		System.out.printf("%1$5d |", x);
		System.out.println(" "+fx);
		
		}



	}

}
