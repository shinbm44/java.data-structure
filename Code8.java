import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int [] data = new int[n];
		for(int i = 0; i < n; i++)
			data[i] = sc.nextInt();
		sc.close();
	
		int sum = 0 , max = data[0];
		for (int i=0; i<n; i++) {
			sum += data[i];
			if(data[i]>max) {
				data[i] = max;
			}
		}
		
		System.out.println("The sum is" + sum + " and the maximum" + max);
	}

}
