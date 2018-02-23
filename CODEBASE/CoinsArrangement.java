import java.util.Scanner;
public class CoinsArrangement{
	

	public int arranging(int n){
	int start=0, end=n;
	int mid=0;
	while(start<=end){
		mid=(start+end) >>> 1;
		if((0.5)*mid*mid+(0.5)*mid<=n){
			start=mid+1;
		}
		else{
			end=mid-1;
		}
	}
	return start-1;

}


	public static void main(String [] args){
	Scanner scan=new Scanner(System.in);
	int n= scan.nextInt();
	CoinsArrangement coins=new CoinsArrangement();
	int result=coins.arranging(n);
	System.out.println(result);
	}
}