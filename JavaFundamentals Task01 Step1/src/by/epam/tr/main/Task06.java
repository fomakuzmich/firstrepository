package by.epam.tr.main;

public class Task06 {

	public static void main(String[] args) {
		int a,b,c;
		a=1;
		b=2;
		c=3;
		int sumMinMax=Math.min(a, Math.min(b, c))+Math.max(a, Math.max(b, c));
		System.out.println("The sum of the min and max = "+sumMinMax);

	}

}
