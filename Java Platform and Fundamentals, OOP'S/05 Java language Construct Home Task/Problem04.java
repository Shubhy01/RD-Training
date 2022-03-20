//4. You have a blue lottery ticket, with ints a, b, and c on it.
//This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. 
//If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. 
//Otherwise the result is 0.

package language_constructs;
import java.util.Scanner;

public class Problem04 {
		private static int lottery(int a, int b, int c) {
			int abSum = a + b;
			int bcSum = b + c;
			int caSum = c + a;
			
			if(abSum==10 || bcSum==10 || caSum==10) {
				return 10;
			}
			else if(Math.abs(bcSum-abSum)==10 || Math.abs(caSum-abSum)==10) {
				return 5;
			}
			else {
				return 0;
			}
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a = ");
		int a = input.nextInt();
		System.out.println("Enter b = ");
		int b = input.nextInt();
		System.out.println("Enter c = ");
		int c = input.nextInt();
		input.close();
		
		System.out.println(lottery(a, b, c));
	}

}
