// Java program to demonstrate working of HashSe
itmport java.util.*;

class HashSetTest
{
	public static void main(String[]args)
	{
		HashSet<Integer> h = new HashSet<Integer>();

		// adding into HashSet
		h.add(2);
		h.add(22);
		h.add(22);
		h.add(1);// adding duplicate elements

		// printing HashSet
		System.out.println(h);
		System.out.println("At position 1");
		System.out.println("List contains 22 or not:" +
						h.contains(22));

		// Removing an item
		h.remove(22);
		System.out.println("List after removing 22:"+h);

		// Iterating over hash set items
		System.out.println("Iterating over list:");
		Iterator<Integer> i = h.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}
