
public class Code1 {

	static int num;
	
	
	public static void main(String[] args) {
		 
		int anotherNum = 5;
		
		num =2;
	
		System.out.println(num + anotherNum);
		System.out.println("Num:" + num);
		System.out.println("AnotherNum: " + anotherNum);
		System.out.println("AnotherNum: " + num + anotherNum);
		System.out.println("AnotherNum: " + (num + anotherNum)); // left associativity
		

	}

}
