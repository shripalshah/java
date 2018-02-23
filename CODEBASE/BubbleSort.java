// Java program for implementation of Bubble Sort
class BubbleSort
{
	void bubbleSort(int arr[])
	{
		int n = arr.length, count=0;
		boolean flag;
		for (int i = 0; i < n-1; i++){
		flag = false;
			for (int j = 0; j < n-i-1; j++){
			    System.out.println(++count);
			
				if (arr[j] > arr[j+1])
				{
				    flag = true;
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}}
				if(flag == false)
				break;
		}
	}

	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver method to test above
	public static void main(String args[])
	{
		BubbleSort ob = new BubbleSort();
		int arr[] = {3, 4, 6, 5};
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
/* This code is contributed by Rajat Mishra */
