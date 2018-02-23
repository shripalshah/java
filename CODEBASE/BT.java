
class BT{
	
	Node root ;

	public void addNode(int value){
	Node newNode= new Node(value);
		if(root==null){
			root=newNode;
		}
		else{
			Node focusNode= root;
			Node parent;
			while(focusNode!=null){
				parent=focusNode;
				if(value<focusNode.value){
					focusNode=focusNode.leftChild;
					if(focusNode==null){
						parent.leftChild=newNode;
						return;
					}
										
				}
				else{
					focusNode= focusNode.rigthChild;
					if(focusNode==null){
						parent.rigthChild=newNode;
					}
				}

			}
		}
	}

	public void inOrderTraverseTree(Node focusNode){
		if(focusNode!= null){
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rigthChild);
		}
	}


	public double getNumbers(Node root){
		double count=root.value;
		Node focusNode=root;
		return getValues( focusNode, count);
	}

	public double getValues(Node focusNode, double count){
		if(focusNode==null) return 0;
		if(focusNode.leftChild!=null){

			return getValues(focusNode.leftChild,focusNode.leftChild.value*10+count);
		}
		else
 			else{
			return  count ;
				
		}

	}

public static void main(String[]args){
	BT btree=new BT();
	btree.addNode(6);
	btree.addNode(5);
	btree.addNode(4);
	btree.addNode(7);
	btree.addNode(8);

	btree.inOrderTraverseTree(btree.root);
	System.out.println(btree.getNumbers(btree.root));
}
	
}
class Node{
	
	int value; 
	Node leftChild;
	Node rigthChild;

	Node(int value){
	this.value=value;
	}

	public String toString(){
		return value +" ";
	}

}