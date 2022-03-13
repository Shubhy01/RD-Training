import java.util.Scanner;
public class PyramidForLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int number1 = input.nextInt();
		System.out.println("Enter X:");
		int number2= input.nextInt();

		int count = 0;

		//logic for Pyramid
		for(int row=1; row<=number1; row++){
			for(int column=1; column<=row; column++){
				System.out.print(count + " ");
				count += number2;
				}
			System.out.println();
			}
		}
	}