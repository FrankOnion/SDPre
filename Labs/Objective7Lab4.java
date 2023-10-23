public class Objective7Lab4 {
	public static void main(String[] args) {
		int sum, count;

		sum = 0;
		count = 1;


		do {
			sum = sum + count;
			count = count + 1;
		} while (count < 21);

		System.out.println(sum);
	}
}