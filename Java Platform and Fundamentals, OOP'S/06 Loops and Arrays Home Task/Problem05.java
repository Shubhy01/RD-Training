//5. Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, 
//taking advantage of the fact that both arrays are already in sorted order

package loops_and_arrays;
import java.util.Scanner;

public class Problem05 {
	
	private static boolean linearIn(int[] outer, int[] inner) {
		  int numFound = 0;
		  if(inner.length == 0) {
		     return true;
		  }
		 
		  int k = 0;
		  for(int i = 0; i < outer.length; i++) {
		     if(outer[i] == inner[k]) {
		        numFound++;
		        k++;
		     } else if(outer[i] > inner[k]) {
		        return false;
		     }
		    
		     if(numFound == inner.length)
		        return true;
		  }
		     
		  return false;
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of outer Array: ");
		int size1 = input.nextInt();
		int[] outer = new int[size1];
		System.out.println("Enter outer array elements: ");
		for(int i=0; i<size1; i++) {
			outer[i] = input.nextInt();
		}
		System.out.println("Enter size of inner Array: ");
		int size2 = input.nextInt();
		int[] inner = new int[size2];
		System.out.println("Enter inner array elements: ");
		for(int i=0; i<size2; i++) {
			inner[i] = input.nextInt();
		}
		input.close();
		
		System.out.println(linearIn(outer, inner));
	}

}
