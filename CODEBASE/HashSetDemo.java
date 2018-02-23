import java.util.*;
public class HashSetDemo{
	public static void main(String args[]){

	HashSet <String>hs=new HashSet<String>();

	hs.add("B");
	hs.add("g");
	hs.add("b");
	hs.add("c");
	hs.add("A");

	System.out.println(hs);
	System.out.println(hs.contains("a"));


	HashSet <Integer,Integer> hs1=new HashSet <Integer, Integer>();
	}
}