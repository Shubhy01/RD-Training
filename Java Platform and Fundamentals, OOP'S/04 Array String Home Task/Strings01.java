//1. write a program to Print duplicate characters from String -

package java_fundamentals_OOP;
import java.util.Scanner;

public class Strings01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		char[] arr = str.toCharArray();
		input.close();
		
		System.out.print("Duplicate Characters are: ");
		for (int i = 0; i < str.length(); i++) {
		for (int j = i + 1; j < str.length(); j++) {
		if (arr[i] == arr[j]) {
		     System.out.println(arr[j]);
			}
		  }
		}
	}
}
