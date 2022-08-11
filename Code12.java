import java.util.*;

public class Code12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int[n];

		for(int i = 0; i<n; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();

		int max = 0;
		for(int i =0; i<n; i++) {
			for (int j=i; j<n; j++ ) {
				int sum =0;
				for (int k =i; k<=j; k++) 
					sum+=data[k];
				if (sum> max) 
					max =sum;
					
				}

			}
			System.out.println(max);
		}

	}


