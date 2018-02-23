import java.util.*;
public class Main {
	public static void main(String[] args) {
	// Write your code
		// int x=98;
		// int y=0;
		int x = getIntLBYL();
		// System.out.println(divideLBYL(x,y));
		// System.out.println(divideEAFP(x,y));
		// System.out.println(divide(x,y));
		System.out.println("X is "+x);
	}

	private static int getInt(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private static int getIntLBYL() {
		Scanner s = new Scanner(System.in);
		boolean isValid = true;
		System.out.println("Please enter an integer");
		String input = s.next();
		for(int i=0; i<input.length(); i++) {
			if(!Character.isDigit(input.charAt(i))){
				isValid=false;
				break;
			}

			if(isValid){
				return s.nextInt();
			}
		}

	}
	private static int divideLBYL(int x, int y) {
		if(y!=0) {
			return x/y;
		} else {
			return 0;
		}
	}

	private static int divideEAFP(int x, int y) {
		try {
			return x/y;
		} catch (ArithmeticException e) {
			return 0;
		}
	}

	private static int divide(int x, int y) {
		return x/y;
	}
	
}