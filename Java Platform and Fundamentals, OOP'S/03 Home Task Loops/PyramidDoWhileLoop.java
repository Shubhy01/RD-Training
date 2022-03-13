import java.util.Scanner;
public class PyramidDoWhileLoop{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter Number:");
			int number1 = input.nextInt();
			System.out.println("Enter X:");
			int number2 = input.nextInt();

			int count = 0;
			
			//Pyramid logic
			int row = 1;
			do{	
				int column = 1;
				do{	
					System.out.print(count + " ");
					count += number2;
					column++;
					}while(column <= row);

				System.out.println();
				row++;
				}while(row <= number1);
			
		}
	}