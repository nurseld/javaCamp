
public class Methods {

	public static void main(String[] args) {
		
		findNumber();
	}
	
	public static void findNumber() {
		
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
			
			setMessage("Number exists in array :" + num);
		} 
		else {
			
			setMessage("Number does not exist in array :" + num);
		}
		
	}

	public static void setMessage(String message) {
		
		System.out.println(message);
		
	}
}
