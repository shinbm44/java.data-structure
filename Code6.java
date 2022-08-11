
public class Code6 {

	public static void main(String[] args) {
		
		int grades [] = new int[5];
		
		grades[0]=100;
		grades[1]=76;
		grades[2]=21;
		grades[3]=83;
		grades[4]=45;

		for(int i = 0; i<grades.length; i++) {
			System.out.println("Grade"+(i+1)+":"+grades[i]);
		}
	}

}
