//Replace every element with the greatest element on right side
import java.util.*;
public class ReplaceWithGreatestOnRight{
public static void main(String args[]) throws Exception {
	ReplaceWithGreatestOnRight sol= new ReplaceWithGreatestOnRight();
		int arr[] = { 1, 2, 3, 4, 9,3, 4 };
		arr=sol.nextHigherElem(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] nextHigherElem(int arr[]) {
		int op[] = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		//Stack <Integer> myStack=new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				stack.pop();
			}
			if (!stack.isEmpty()) {
				op[i] = arr[stack.peek()];
			}
			 else {
				op[i] = arr[i];
			}
			stack.push(i);
		}
		for(int i=0; i<op.length; i++)
			System.out.println(op[i]);
		System.arraycopy(op, 0, arr, 0, arr.length);
		return arr;
	}
}