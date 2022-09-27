
public class ArraysDemo {

	public static void main(String[] args) {

		String stu1 = "Engin";
		String stu2 = "Nursel";
		String stu3 = "Belinay";
		String stu4 = "Ahmet";

		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);

		System.out.println("-------------");

		String[] students = new String[4];
		students[0] = "Engin";
		students[1] = "Nursel";
		students[2] = "Belinay";
		students[3] = "Ahmet";
		// students[4] = "Ali";

		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i]);
		}

		System.out.println("-------------");

		for (String student : students) {

			System.out.println(student);

		}
	}
}
