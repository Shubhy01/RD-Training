//9. Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

package language_constructs;
import java.util.Scanner;

public class Problem09 {
	
	private static int maxBlock(String str) {
		char[] arr = str.toCharArray();

		int cnt = 0;

		 for(int i = 0; i < arr.length; i++) {  
	            int freq = 1;  
	            for(int j = i+1; j < arr.length; j++) {  
	                if(arr[i] == arr[j] && arr[i] != ' ' && arr[i] != '0') {  
	                    freq++;  
	                }
	            }
	            if(freq > cnt)
	            	cnt = freq;
		 }
		 return cnt;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String str = input.nextLine();
		input.close();
		
		System.out.println(maxBlock(str));
	}
}
