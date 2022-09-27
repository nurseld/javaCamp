
public class FindNumber {

	public static void main(String[] args) {
		
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int num = 4546;

		boolean isExist = false;

		for(int number : numbers) {
			
			if (num == number) {
				
				isExist = true;
				break;
			}
		}

		if (isExist) {
			
			System.out.println("Number exists in array.");
		} 
		else {
			
			System.out.println("Number does not exist in array.");
		}

	}

}
