package by.epam.tr.main;

public class Task10 {

	public static void main(String[] args) {
		int n = 25;
		
		for (int i=0;i<n;i++) {
			if (i%2==0) {
			for (int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			}
			else {
				for(int l=n;l>0;l--) {
					System.out.print(l+" ");
				}
			} System.out.println("");
		}
	}

}
