import java.util.ArrayList;
public class ArrayListExample{
	public static void main(String[]args) {
		 ArrayList<Integer> items = new ArrayList<Integer> ();
		 items.add(1);
		 items.add(2);
		 items.add(3);
		 items.add(4);
		 items.add(5);
		 printDouble(items);
	}

	private static void printDouble(ArrayList<Integer> n) {
		for(Object i:n) {
			System.out.println((Integer)i*2);
			System.out.println(n.size()); 

		}
		System.out.println(n);
		//n.remove(2);
		System.out.println(n.contains(3));
	}
}