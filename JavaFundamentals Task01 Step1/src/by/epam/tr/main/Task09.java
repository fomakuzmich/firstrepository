package by.epam.tr.main;

public class Task09 {

	public static void main(String[] args) {
		int[] first = {1,2,7,8,9};
		int[] second = {3,4,5,6,7};
		int k = 2;
		int count = 0;
		int[] answer = new int[first.length+second.length];
			for(int j=0;j<k;j++) {
				answer[j]=first[j];
				count++;
			}
			for (int i=0;i<second.length;i++) {
				answer[count] = second[i];
				count++;
			}
			for (int l = k; l<first.length; l++) {
				answer[count] = first[l];
				count++;
			}
			for (int s=0;s<answer.length;s++) {
			System.out.print(answer[s]+" ");
			}
			
		
		

	}

}
