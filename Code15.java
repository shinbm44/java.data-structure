import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] data = new int [n];
		
		for(int i=0; i<n; i++) {
			int tmp = sc.nextInt();
			
			int j = i-1;
			while(j>=0 && data[j] > tmp) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = tmp;
			
			for(int k =0; k <= i; k++) {
				System.out.print(data[k] + " ");
				
			}
			System.out.println();
		}
		

	

	}
}
