//1. You are driving a little too fast, and a police officer stops you.
//Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
//If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
//If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

package language_constructs;
import java.util.Scanner;

public class Problem01 {
	static private int grace = 0;

	private static int result(int speed, String status) {
		if(status.equals("yes") || status.equals("Yes")) {
			grace = 5;
		}
		
		if(speed <= 60) {
			return 0;
		}
		else if(61<=speed && speed<=(80+grace)) {
			return 1;
		}
		else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter speed: ");
		int speed = input.nextInt();
		
		String status = "No";
		if(speed>60) {
			System.out.println("Is today your birthday: ");
			status = input.next();
		}
		input.close();
		
		int value = result(speed, status);
		
		switch (value) {
		case 0: {
			System.out.println("No ticket");
			break;
		}
		case 1: {
			System.out.println("Small ticket");
			break;
		}
		case 2: {
			System.out.println("Big ticket");
			break;
		}
		default:
			System.out.println("Invalid input");
		}
	}

}
