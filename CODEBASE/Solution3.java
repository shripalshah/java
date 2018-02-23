import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;


public class Solution3{
	public static void main(String[]args){
		HashMap<String, String>hmap=new HashMap<String,String>();
		hmap.put("{","}");
		hmap.put("[","]");
		hmap.put("(",")");
		System.out.println(hmap.get("{"));
		System.out.println("Values stored in the HashMap");
		Set set=hmap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			 Map.Entry me=(Map.Entry)iterator.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		Scanner scan =new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(str);
		int len=str.length();
		System.out.println(len);
		if(len%2==0){
			System.out.println("1");
			// call the method to find whether it is an anagram
			len=len/2;
			System.out.println("2");
			int i=len-1;
			System.out.println("i value"+i);
			System.out.println("3");
			int j=len;
			System.out.println("j value"+j);
			//int flag=1;
			String s,t,r;
			
			 
			//System.out.println(t);
			System.out.println("4");
			while(i>=0 && j<str.length()){
				
			
				System.out.println(i);
				
				if(hmap.get(Character.toString(str.charAt(i))).equals(Character.toString(str.charAt(j)))){
					//flag=1;
					System.out.println("entered if");
					i=i-1;
					j=j+1;
				}
				else{
					i=-2;
					
				}
				

			}

if(i+1==0 ){
			System.out.println("YES");
		}	else
				System.out.println("No");
		}


			
				
		
		else{

			System.out.println("NO");
		}
	}
	
}

