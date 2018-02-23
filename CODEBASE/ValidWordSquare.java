import java.util.*;

public class ValidWordSquare{

List<String> str=new ArrayList<String>();

public void addListElement(String s){
	if(checkLength(s)&&checkSize())
		str.add(s);
	else
		System.out.println("Constraints not satisfied");
}
public boolean checkLength(String s){
	int length=s.length();
	if(length<=500)
		return true;
	else
		return false;
}

public boolean checkSize(){
	int size= str.size();
	if(size<=500)
		return true;
	else
		return false;

}

public boolean isWordSquare(){
	for(int i=0; i<str.size();i++)
		for(int j=0; j<str.get(i).length();j++){
			if(str.get(j).length()<=i||str.get(i).charAt(j)!=str.get(j).charAt(i)){
				return false;
			}

		}
		return true;
}
	
	public static void main(String[]args){
		ValidWordSquare word=new ValidWordSquare();
		word.addListElement("alcd");
		word.addListElement("bnrt");
		word.addListElement("crmy");
		word.addListElement("dtye");

		System.out.println(word.isWordSquare());

	}
}