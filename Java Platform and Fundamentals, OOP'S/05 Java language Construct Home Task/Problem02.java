//2. The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
//Or if their sum or difference is  

package language_constructs;
import java.util.Scanner;

public class Problem02 {
	
	private static boolean greatNumber(int a, int b) {
		if(a==6 || b==6 || (a+b)==6 || Math.abs(a-b)==6) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		int a = input.nextInt();
		System.out.println("Enter 1st number: ");
		int b = input.nextInt();
		input.close();
		
		System.out.println(greatNumber(a, b));
	}
}