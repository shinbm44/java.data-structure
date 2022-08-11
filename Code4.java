import java.util.Scanner;

public class Code4 {

	public static void main(String[] args) {


		String name = null;
		int age;
		String gender;

		Scanner kb = new Scanner( System.in );

		System.out.print("please type your name and age and gender : ");
		name = kb.next();
		age = kb.nextInt();
		gender =kb.next();

		if(gender.equals("male")) {
			System.out.println(name + ", you're " + age + "yours old man.");
		} else if(gender.equals("female")) {
			System.out.println(name + ", you're " + age + "yours old woman.");

		} else { 
			System.out.println("Hmm.... interesting..?");
		}
		
		kb.close(); 
	}

}
