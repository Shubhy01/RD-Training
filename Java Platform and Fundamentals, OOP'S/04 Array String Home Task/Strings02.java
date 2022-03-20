//2. write a program to check if two strings are rotations of each other

package java_fundamentals_OOP;
import java.util.Scanner;

public class Strings02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str1 = input.next();
		String str2 = input.next();
		input.close();
		
		String str3 = str1 + str2;
		if(str1.length() == str2.length() && str3.indexOf(str2) != -1) {
			System.out.println(str1 +" and " + str2 + "are rotation of each other");
		}
		else {
			System.out.println("entered strings are not rotation of each other");
		}
	}
}
