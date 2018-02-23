ArrayList:
int n=8;
ArrayList<Integer> arrLis=new ArrayList<Integer> (n);
arrLis.add(3);
System.out.println(arrLis); 
arrLis.remove(i); // remove element at index i
arrLis.get(i)// get element at index i

Stack https://www.geeksforgeeks.org/stack-data-structure/ 
O(1) all operations takes O(1) time Stack <Character> myStack=new Stack<>();
myStack.push(), myStack.pop(), myStack.peek(), return myStack.empty();

HashMap:
hmap.put('c', counter);
hmap.containsKey('C'), containsValue();
hSet set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());

      }

hashSet
HashSet<Integer> h = new HashSet<Integer>();
h.add(2);
h.contains(22));
h.remove(22);
Iterator<Integer> i = h.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}


Queue: 
import java.util.LinkedList;
import java.util.Queue;
 Queue<Integer> q = new LinkedList<>();
 q.add(i);q.remove();// To view the head of queue
    int head = q.peek(); int size = q.size();
    Add()-Adds an element at the tail of queue. More specifically, at the last of linkedlist if it is used, or according to the priority in case of priority queue implementation.
peek()-To view the head of queue without removing it. Returns null if queue is empty.
element()-Similar to peek(). Throws NoSuchElementException if queue is empty.
remove()-Removes and returns the head of the queue. Throws NoSuchElementException when queue is impty.
poll()-Removes and returns the head of the queue. Returns null if queue is empty.
addAll, clear, contains, containsAll, equals, hashCode, isEmpty, iterator, remove, removeAll, retainAll, size, toArray, toArray

Vector : import java.util.*;
Vector object= new vector(int initialcapacity, capacityIncrement);  Vector vec= new Vector(4, 6)
void addElement(Object element): int capacity():int size() : void setSize(int size): boolean contains(Object element):
boolean containsAll(Collection c):  Object elementAt(int index) Object firstElement() ; Object lastElement(); Object get(int index);
boolean isEmpty(): boolean removeElement(Object element): boolean removeAll(Collection c): void setElementAt(Object element, int index)