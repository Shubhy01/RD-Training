import java.util.Scanner;
public class PyramidWhileLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Number:");
		int number1 = input.nextInt();
		System.out.println("Enter X:");
		int number2 = input.nextInt();

		int count = 0;
			
		//Pyramid logic
		int row = 1;
		while(row<=number1){
			int column = 1;
			while(column<=row){
				System.out.print(count + " ");
				count += number2;
				column++;
				}
			System.out.println();
			row++;
			}
		}
	}