//5. Given three ints, a b c, return true if b is greater than a, and c is greater than b. 
//However, with the exception that if "bOk" is true, b does not need to be greater than a.

package language_constructs;
import java.util.Scanner;

public class Problem05 {
	private static boolean bOk = false;
	
	private static boolean inOrder(int a, int b, int c, boolean bOk) {
		if (c>b) {
			if(bOk == true) {
				return true;
			}
			else {
				if(b>a) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("a =");
		int a = input.nextInt();
		System.out.println("b =");
		int b = input.nextInt();
		System.out.println("c =");
		int c = input.nextInt();
		System.out.println("bOk = ");
		bOk = input.nextBoolean();
		input.close();
		
		System.out.println(inOrder(a, b, c, bOk));
	}

}
