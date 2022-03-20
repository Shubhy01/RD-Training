//1. Write a program to find the missing number in integer array of 1 to 100 - 

package java_fundamentals_OOP;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
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
		
		int n = arr.length + 1;
		int total = n*(n + 1)/2;
		int sum = Arrays.stream(arr).sum();
		
	    System.out.println(total - sum);
	}
}