import java.util.*;
public class SolutionStackBalancedBrackets{

	public boolean check(String s){
		int length=s.length();
		if(length%2 != 0)
			return false;
		char[] brackets=s.toCharArray();
		Stack <Character> myStack=new Stack<>();
		for(char bracket:brackets)
		{
			switch (bracket){
				case '{': myStack.push('}'); break;
				case '[': myStack.push(']'); break;
				case '(': myStack.push(')'); break;
				default : if(myStack.empty() || bracket!=myStack.peek()) return false;
							myStack.pop();
							
			}	
			
		}
		return myStack.empty();	
	}

	public static void main(String[]args){
		SolutionStackBalancedBrackets sol=new SolutionStackBalancedBrackets();
		boolean m= false;
		m=sol.check("[}");
		if(m) System.out.println("YES");
		
		else System.out.println("NO");
		
		
	}
}