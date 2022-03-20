//4. We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, 
//the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.

package loops_and_arrays;
import java.util.Scanner;

public class Problem04 {
	
	private static int maxMirror(int[] nums) {
		  int len = nums.length;
		  int count= 0;
		  int max = 0;
		  for (int i = 0; i < len; i++){
		    count=0;
		    for (int j = len-1; i + count < len && j > -1; j--){
		      if(nums[i+count] == nums[j]){
		        count++;
		      }
		      else{
		        if (count > 0){
		          max = Math.max(count,max);
		          count = 0;
		        }
		      }
		    }
		    max = Math.max(count,max);
		  }
		  return max;
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
		
		System.out.println(maxMirror(nums));
	}

}
