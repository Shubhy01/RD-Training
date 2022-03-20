//7. Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. 
//If the sum has more digits than a, just return a without b. 

package language_constructs;
import java.util.Scanner;

public class Problem07 {
	
	private static int sumLimit(int a, int b) {
		int sum = a + b;
		String aString = String.valueOf(a);
		String sumString = String.valueOf(sum);
		
		if(sumString.length() == aString.length()) {
			return sum;
		}
		else if(sumString.length() > aString.length()) {
			return a;
		}
		else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("a = ");
		int a = input.nextInt();
		System.out.println("b = ");
		int b = input.nextInt();
		input.close();
		
		System.out.println(sumLimit(a, b));
	}
}
