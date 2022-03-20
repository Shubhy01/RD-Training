//2. Write a program to find biggest and smallest number in a array.

package java_fundamentals_OOP;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of Array:-");
		int size = input.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter Array elements:-");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		input.close();
		
		Arrays.sort(arr);
		System.out.println("Smallest number is " + arr[0]);
		System.out.println("Biggest number is " + arr[arr.length-1]);
	}
}
