
public class SwitchDemo {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
		case 'C':
			System.out.println("Good!");
			break;
		case 'D':
			System.out.println("Passed!");
			break;
		case 'F':
			System.out.println("Failure!");
			break;
		default:
			System.out.println("Invalid grade entered.");
			break;
		}

	}
}