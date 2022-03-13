public class Calculator{
	public static void main(String[] args){
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		String operation = args[2];
		
		if(operation.equals("add")){
			System.out.println(add(firstNum, secondNum));
			}
		else if(operation.equals("substract")){
			System.out.println(substract(firstNum, secondNum));
			}
		else if(operation.equals("multiply")){
			System.out.println(multiplication(firstNum, secondNum));
			}
		else if(operation.equals("division")){
			System.out.println(division(firstNum, secondNum));
			}
		else if(operation.equals("remainder")){
			System.out.println(remainder(firstNum, secondNum));
			}
		else if(operation.equals("percentage")){
			System.out.println(percentage(firstNum, secondNum));
			}
		else{
			System.out.println("Invalid Operation");
			}
		
	}
	
	//add functionality
	public static int add(int firstNum, int secondNum){
		return (firstNum + secondNum);
	}

	//Substract functionality
	public static int substract(int firstNum, int secondNum){
		return (firstNum - secondNum);
	}

	//Multiplication functionality
	public static int multiplication(int firstNum, int secondNum){
		return (firstNum * secondNum);
	}

	//Division functionality
	public static double division(int firstNum, int secondNum){
		return (firstNum / secondNum);
	}

	//Remainder functionality
	public static int remainder(int firstNum, int secondNum){
		return (firstNum % secondNum);
	}

	//Percentage functionality
	public static int percentage(int firstNum, int secondNum){
		return ((firstNum * secondNum)/100);
	}


}