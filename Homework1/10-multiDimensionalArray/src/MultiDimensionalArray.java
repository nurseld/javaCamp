
public class MultiDimensionalArray {

	public static void main(String[] args) {

		String[][] cities = new String[3][3];

		cities[0][0] = "istanbul";
		cities[0][1] = "Bursa";
		cities[0][2] = "Bilecik";
		cities[1][0] = "Ankara";
		cities[1][1] = "Tekirdağ";
		cities[1][2] = "İzmir";
		cities[2][0] = "Manisa";
		cities[2][1] = "İzmit";
		cities[2][2] = "Gaziantep";

		for (int i = 0; i <= 2; i++) {

			System.out.println("--------------");

			for (int j = 0; j <= 2; j++) {

				System.out.println(cities[i][j]);
			}

		}
	}
}
