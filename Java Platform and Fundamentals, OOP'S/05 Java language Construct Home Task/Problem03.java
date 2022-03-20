//3. We are having a party with amounts of tea and candy. 
//Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. 
//A party is good (1) if both tea and candy are at least 5.
//However, if either tea or candy is at least double the amount of the other one, the party is great (2). 
//However, in all cases, if either tea or candy is less than 5, the party is always bad (0).

package language_constructs;
import java.util.Scanner;

public class Problem03 {
	
	private static int party(int tea, int candy) {
		if(tea<5 || candy<5) {
			return 0;
		}
		else if(tea>=5 && candy>=5) {
			return 1;
		}
		else if(tea>=(candy*2) || candy>=(tea*2)) {
			return 2;
		}
		else {
			return 10;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter No. of Tea:= ");
		int tea = input.nextInt();
		System.out.println("Enter No. of Candy:= ");
		int candy = input.nextInt();
		input.close();
		
		switch (party(tea, candy)) {
		case 0: {
			System.out.println("Bad");
			break;
		}
		case 1: {
			System.out.println("Good");
			break;
		}
		case 2: {
			System.out.println("Great");
			break;
		}
		default:
			System.out.println("Invalid input");
		}
	}
}
