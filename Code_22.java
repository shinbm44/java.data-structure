package Text_line;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code_22 {

	static String [] words = new String[100000];
	static int [] count = new int [100000];
	static int n = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner( System.in );
		while ( true ) {
			System.out.print("$ ");
			String command = sc.next();
			if( command.equals("read")) {
				String fileName = sc.next(); // 파일 안의 어떤 내용을 찾을건지
				makeIndex( fileName ); // 검색 한 내용의 인덱스 찾기
			} else if(command.equals("find")) {

			} else if(command.equals("saveas")) {

			} else if(command.equals("exit")) {
				break;
			}

		System.out.print(words[n] + " " + count[n]);	
		}
	}
	static void makeIndex( String fileName ) {

		try {
			Scanner inFile = new Scanner( new File(fileName));
			while( inFile.hasNext() ) {
				String str = inFile.next();
				addWord(str);
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			return;
		}
	}

	static int addWord(String str) {
		for(int i=0; i<n; i++) {
			if(words[i].equals(str)) {
				return i;
			}
		}
		return -1;
						
	}

}



