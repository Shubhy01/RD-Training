public class Variables02{
	public static void main(String[] args){
		double val1 = Double.parseDouble(args[0]);
		double val2 = Double.parseDouble(args[1]);

		// Altenate Method
		//double val1 = Double.valueOf(args[0]);
		//double val2 = Double.valueOf(args[1]);
		
		System.out.println(val1 + val2);
	}
}