
public class Loops {

	public static void main(String[] args) {
		
		//For Loop
		for (int i=2; i<10 ; i+=2 ) {
			
			System.out.println(i);
		}

		System.out.println("End of the for loop.");
		
		//While Loop
		
		int i = 2;
		while(i<10) {
			
			System.out.println(i);
			i += 2;
		}
		
		System.out.println("End of the while loop.");
		
		//Do-While Loop
		
		int j = 100;
		do {
			
			System.out.println(j);
			j += 2;
			
		}while(j<10);
		
		System.out.println("End of the do-while loop.");
	}

}
