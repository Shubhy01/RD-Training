//2. Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

package loops_and_arrays;
import java.util.Scanner;

public class Problem02 {
	
	private static boolean canBalance(int[] nums) {
		  int lSum = 0;
		  
		  for (int i = 0; i < nums.length; i++) {
		    lSum += nums[i];
		    int rSum = 0;
		    for (int j = nums.length-1; j > i; j--) {
		      rSum += nums[j];
		    }
		    if (rSum == lSum)
		      return true;
		  }
		  return false;
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
		
		System.out.println(canBalance(nums));

	}

}
