
public class Methods2 {

	public static void main(String[] args) {

		String message = "Bugün hava çok güzel.";

		String newMessage = showCity();
		System.out.println(newMessage);

		int sum = sumUp(435, 67);
		System.out.println(sum);

		int sum2 = sumUp2(2, 3, 4);
		System.out.println(sum2);

	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}

	public static int sumUp(int num1, int num2) {
		return (num1 + num2);

	}

	public static int sumUp2(int... numbers) {

		int sum = 0;

		for (int number : numbers) {

			sum += number;
		}

		return sum;
	}

	public static String showCity() {
		return "Tekirdağ";
	}
}
