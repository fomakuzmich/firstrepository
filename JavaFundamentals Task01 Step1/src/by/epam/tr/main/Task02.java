package by.epam.tr.main;

public class Task02 {

	public static void main(String[] args) {
		int a, b, c;
		double answer;
		a=1;
		b=2;
		c=3;
		answer = ((b+Math.sqrt(Math.pow(b, 2)+4*a*c)) / (2*a)) - Math.pow(a, 3)*c + Math.pow(b, -2);
		System.out.println(answer);

	}

}
