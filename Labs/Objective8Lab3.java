public class Objective8Lab3 {
	public static void main(String[] args) {
		int counter = 1;

		for(int num = 1; num <= 20; num++) {
			counter = num;

			if(counter % 2 == 0) {
				System.out.println(counter + " is even.");
			}
			else {
				System.out.println(counter + " is odd.");
			}
		} 
	}
}