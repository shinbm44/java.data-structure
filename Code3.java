import java.util.*;

public class Code3 {

	public static void main(String[] args) {
		String str = "Hello";
		String input = null;
		Scanner kb = new Scanner(System.in);
		System.out.print("please type a string: ");
		
		input = kb.next();
		
		if(str.equals(input)) { //input.equals(str) || '=='의 사용은 프리미티브 타입의 변수에만 사용가능
			System.out.println("String match!");
		} else {
			System.out.println("String do not match!");
		}
		kb.close();
	}

}
