package by.epam.tr.main;

public class Task01 {

	public static void main(String[] args) {
		int x = 1450;
		boolean answer;
		int firstOfX = x/1000;
		int secondOfX = (x-firstOfX*1000)/100;
		int thirdOfX = (x-firstOfX*1000-secondOfX*100)/10;
		int fourthOfX = x%10;
		answer = firstOfX+secondOfX==thirdOfX+fourthOfX;
		System.out.println(answer);

	}

}
