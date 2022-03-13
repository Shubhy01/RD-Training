public class Variables01{
	public static void main(String[] args){
		int val1 = Integer.parseInt(args[0]);
		int val2 = Integer.parseInt(args[1]);

		// Alternate method
		//int val1 = Integer.valueOf(args[0]);
		//int val2 = Integer.valueOf(args[1]);
		
		System.out.println(val1 + val2);
	}
}