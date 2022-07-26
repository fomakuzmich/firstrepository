package by.epam.tr.main;

public class Task08 {

	public static void main(String[] args) {
		int n, k, sum;
		n=10;
		k=3;
		sum=0;
		int[] a = new int[n];
		for(int i = 0;i<a.length;i++) {
			a[i]=i;
		}
		for(int i = 0;i<a.length;i++) {
			if (a[i]%k==0)
				sum+=a[i];
		}
		System.out.println(sum);
		

	}

}
