package Section2;

public class Code17 {

	public static void main(String[] args) {
		for(int i =1; i<=10000; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	static boolean isPrime(int i) {
		if(i<2) {
			return false;
		}
		for(int k=2; k*k<=i; k++) {
			if(i%k==0) {
				return false;
			}
		}
		return true;
	}

}
