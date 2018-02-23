
public class TestArray{
   
   Node head;
   public void append(int data){
      if(head==null){
         head=new Node(data);
         return;
      }
      Node current=head;
      while(current.next!=null){
         current=current.next;

      }

      current.next=new Node(data);
   }

   public void prepend(int data){
      Node newHead=new Node(data);
      newHead.next=head;
      head=newHead;
   }

   public void deleteWithValue(int data){
      if(head==null) return;

      if(head.data==data){
         head=head.next;
      }
      Node current = head;

      while(current.next != null){
         if(current.next.data==data){
            current.next=current.next.next;
            return;
         }
         
         current = current.next;
      }
      // to display the nodes of linkedlist

   }

   public void display(){
         if(head==null) return;
         Node current=head;
         while(current!=null){
         System.out.println(current);
         current=current.next;
         }
   }
   public static void main(String [] args){
      LinkedList l=new LinkedList();
      l.append(5);
      l.append(7);   
      l.append(8);

      l.display();
   }
}

class Node{
   int data;
   Node next;

   public Node(int data){
   this.data=data;
   }
   public String toString(){
         return data+" ";
      }
   
}
/*public boolean hasCycle(ListNode head) {
    if(head==null) return false;
    ListNode walker = head;
    ListNode runner = head;
    while(runner.next!=null && runner.next.next!=null) {
        walker = walker.next;
        runner = runner.next.next;
        if(walker==runner) return true;
    }
    return false;
}*/