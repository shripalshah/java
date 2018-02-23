public class FactorialTrailingZero{
	public int trail(int n){
	return n==0?0:n/5 + trail(n/5);
	}
	public static void main(String[]args){
	// we just need to calculate number of 5 factosrs.

	FactorialTrailingZero sol=new FactorialTrailingZero();
	int s=sol.trail(60);
	System.out.println(s);

	}
}