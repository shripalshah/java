Replace every element with the greatest element on right side
1

public static void main(String args[]) throws Exception {
		int arr[] = { 1, 2, 3, 4, 9, 5, 6 };
		nextHigherElem(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] nextHigherElem(int arr[]) {
		int op[] = new int[arr.length];
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				stack.pop();
			}
			if (!stack.isEmpty()) {
				op[i] = arr[stack.peek()];
			} else {
				op[i] = -1;
			}
			stack.push(i);
		}
		System.arraycopy(op, 0, arr, 0, arr.length);
		return arr;
	}