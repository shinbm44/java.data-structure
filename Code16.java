package Section2;

import java.util.Scanner;


public class Code16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = power(a,b);
		
		System.out.print(k);
		
		sc.close();
	}

	static int power(int n, int m) {
		int result = 1;
		for(int i=0; i<m; i++) {
			result *= n;	
		}
		return result;
	}
}
