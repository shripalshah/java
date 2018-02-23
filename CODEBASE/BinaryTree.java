public class BinaryTree{
	Node root;

	public void addNode(int key, String name){

		Node newNode= new Node(key, name);

		if(root == null){
			root = newNode;
		}
		else{
			Node focusNode = root;
			Node parent;
			while(true){
				parent = focusNode;

				if(key<focusNode.key){
					focusNode = focusNode.leftChild;

					if(focusNode == null){
						parent.leftChild=newNode;
						return;
					}
				}else {
					focusNode=focusNode.rightChild;
					if(focusNode== null){
						parent.rightChild=newNode;
						return;
					}
				}
			}
		}
	}

	public void inOrderTraverseTree(Node focusNode){
		if(focusNode!= null){
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	public static void main (String[]args){

		BinaryTree sol=new BinaryTree();

		sol.addNode(5,"Shripal");
			sol.inOrderTraverseTree(sol.root);
		sol.addNode(6,"Kunal");
			sol.inOrderTraverseTree(sol.root);
		sol.addNode(1,"Sonali");
			sol.inOrderTraverseTree(sol.root);
		sol.addNode(3,"Shrenik");
		sol.addNode(2,"Samir");
		sol.addNode(4,"Minaxi");
		//System.out.println(sol.toString());
		sol.inOrderTraverseTree(sol.root);


	}
}

class Node{
	int key;
	String name;

	Node leftChild;
	Node rightChild;	

	Node(int key, String name ){
		this.key=key;
		this.name=name;
		//toString();
	}

	public String toString(){
		return name +"has "+ key;
	}







  //   boolean checkBST(Node focusNode) {
        
       
  //       if(focusNode!= null){
            
		// 	checkBST(focusNode.left);
  //           if(focusNode.left.data>= focusNode.data)
  //               return false;
		// 	System.out.println(focusNode);
		// 	checkBST(focusNode.right);
  //           if(focusNode.right.data < focusNode.data)    
  //               return false;
            
		// }
  //       return true;
  //   }
