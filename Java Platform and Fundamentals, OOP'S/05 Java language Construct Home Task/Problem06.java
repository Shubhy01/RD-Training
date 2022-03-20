//6. Given two ints, each in the range 10..99,
//return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. 

package language_constructs;
import java.util.Scanner;

public class Problem06 {
	
	private static boolean shareDigit(int a, int b) {
		int aLeft = a/10;
		int aRight  = a%10;
		int bLeft = b/10;
		int bRight  = b%10;
		
		if(aLeft==bLeft || aLeft==bRight || aRight==bLeft || aRight == bRight) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("a = ");
		int a = input.nextInt();
		System.out.println("b = ");
		int b = input.nextInt();
		input.close();
		
		System.out.println(shareDigit(a, b));
		
	}

}
