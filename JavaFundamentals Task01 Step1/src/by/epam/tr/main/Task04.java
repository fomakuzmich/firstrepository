package by.epam.tr.main;

public class Task04 {

	public static void main(String[] args) {
		int x,y;
		boolean answer;
		x=3;
		y=-2;
		if(y>0&&y<=4) {
			answer = x>=-2&&x<=2;
		}
		else if(y<0&&y>=-3) {
			answer = x>=-4&&x<=4;
		}
		else
			answer = false;
		System.out.println(answer);


	}

}
