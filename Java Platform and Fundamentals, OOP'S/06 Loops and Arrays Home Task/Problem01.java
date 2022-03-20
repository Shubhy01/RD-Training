//1. Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1.
//Returns the largest span found in the given array. (Efficiency is not a priority.)

package loops_and_arrays;
import java.util.Scanner;

public class Problem01 {
	
	public static int maxSpan(int[] arr) {
		  int range = 0;
		  int cnt = 0;
		  
		  for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr.length; j++) {
		      if (arr[i] == arr[j]) {
		        cnt = j-i+1;
		        range = Math.max(cnt,range);
		      }
		    }
		  }
		  return range;
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of Array: ");
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		input.close();
		
		System.out.println(maxSpan(arr));
	}

}
