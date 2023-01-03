package Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

	static String [] name = new String[1000];
	static String [] number = new String[1000];
	static int n = 0;

	public static void main(String[] args) {

		String[] name = new String[1000];
		String[] number = new String[1000];
		int n = 0;

		try {
			Scanner inFile = new Scanner(new File("input.txt"));

			while( inFile.hasNext() ) {
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}


		} catch (FileNotFoundException e) {

			System.out.print("No File");
			System.exit(9);
		}
		
		bubbleSort();
		
		for(int i=0; i<n; i++) {
			System.out.println(name[i] + " : " + number[i]);
		}
		
		
	}

	static void bubbleSort ( ) {
		for (int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if( name[j].compareTo(name[j+1]) >0 ) {
					String tmp =name[j];
					name[j] = name[j+1];
					name[j+1] = tmp;
				}
			}
		}
	}
	
}
