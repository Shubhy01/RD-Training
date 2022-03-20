//3. Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
package loops_and_arrays;
import java.util.Scanner;

public class Problem03 {
	
	private static int countClumps(int[] nums) {
		  boolean match = false;
		  int count = 0;
		  for (int i = 0; i < nums.length-1; i++) {
		    if (nums[i] == nums[i+1] && !match) {
		      match = true;
		      count++;
		    } 
		    else if (nums[i] != nums[i+1]) {
		      match = false;
		    }
		  }
		  return count;
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of Array: ");
		int size = input.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0; i<size; i++) {
			nums[i] = input.nextInt();
		}
		input.close();
		
		System.out.println(countClumps(nums));
		
	}

}
