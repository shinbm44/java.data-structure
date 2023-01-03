package Section2;

import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] data = new int [a];
		for(int i=0; i<a; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		bubbleSort( a, data );
		
		System.out.println("Sorted data:");
		for(int i=0; i<a; i++) {
			System.out.println(data[i]);
		}
	}
	
	static void bubbleSort(int n, int [] data) {
		for(int i = n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j] > data[j+1]) {
					
					swap( data[j], data[j+1] );
				}
			}
			
		}
	}
	
	static void swap(int a, int b) 
	{
		int tmp = a;
		a = b;
		b = tmp;
	}
}
/* 이 코드의 경우 swap이라는 매소드듣 만들어 bubbleSort메소드에서 구현함에 따라 정렬이 제대로 이뤄지지
 * 않는다. why?? 그 이유는 int는 프리미티브 변수이고 참조형 변수가 아니기 때문이다. */

