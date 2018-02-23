public class Link{
	public String bookName;
	public int millionsSold;

	public Link next;

	public Link(String bookName, int millionsSold){
		this.bookName=bookName;
		this.millionsSold=millionsSold;

	}

	public void display(){
		System.out.println(bookName+":"+millionsSold+",000,000");
	}

	public String toString(){
		return bookName;
	}

	public static void main(String[]args){

	}
}

class LinkList{
	
	public Link firstLink;
	LinkList(){
		firstLink=null;
	}

	public boolean isEmpty(){
		return(firstLink==null);
	}

	public void insertFirstLink(String bookName, int millionsSold){
		Link newLink = new Link(bookName,millionsSold);
		newLink.next=firstLink;

		firstLink= newLink;
	}
}