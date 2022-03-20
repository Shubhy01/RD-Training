//8. Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
//You may assume that the remove string is length 1 or more. 
//Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

package language_constructs;
import java.util.Scanner;

public class Problem08 {
	static String res = "";
	
	private static String withoutString(String base, String remove) {
		String result = base.replace(remove.toLowerCase(), "");
		result = result.replace(remove.toUpperCase(), "");
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Base = ");
		String base = input.nextLine();
		System.out.println("Remove = ");
		String remove = input.nextLine();
		input.close();
		
		System.out.println(withoutString(base, remove));
	}

}
