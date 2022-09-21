
public class RecapDemo1 {

	public static void main(String[] args) {
		
        int num1 = 266;
        int num2 = 25;
        int num3 = 26;
        int maxNum = num1;

        if (maxNum<num2){
            maxNum=num2;
        }

        if (maxNum<num3){
            maxNum=num3;
        }

        System.out.println("Max number = " + maxNum);

	}

}
