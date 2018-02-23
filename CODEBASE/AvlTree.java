class Node {
	Node rightChild;
	Node leftChild;
	int key;
	Node parent;
	String name;

	Node(int key, String name) {
		this.key = key;
		this.name = name;
	}
	public String toString(){
		return "Key"+key+", name" + name+" ";
	} 
}


public class AvlTree {
Node root;
int currentSize;
public AvlTree(){
	root=null;
	currentSize = 0;
}
public void addNode(int key, String name) {
	Node newNode = new Node(key, name);
	Node parent;
	if(root == null) {
	root = newNode;
	currentSize++;
	return;
	}
	add(root, newNode);

	
}

	public void inOrder(Node currentNode) {
	
			if(currentNode != null) {
				inOrder(currentNode.leftChild);
				System.out.println(currentNode);
				inOrder(currentNode.rightChild);

			}		

	}


public void add(Node root, Node newNode) {
    Node currentNode = root;
	Node parent = root;
	while(true){
		parent = currentNode;
		if(newNode.key < currentNode.key) {
			currentNode = currentNode.leftChild;
			if(currentNode == null) {
				parent.leftChild = newNode;
				parent.leftChild.parent = parent; 
				currentSize++;
				return;
			}
		}
		else {
			currentNode = currentNode.rightChild;
			if(currentNode == null) {
				parent.rightChild = newNode;
				parent.rightChild.parent = parent;
				currentSize++;
				return;
			}
		}
	}
}
	public static void main(String [] args) {
		AvlTree aT = new AvlTree();
		aT.addNode(12, "twelve");
		aT.addNode(6,"six");
		aT.addNode(20,"twenty");
		aT.addNode(7,"seven");
		aT.addNode(4,"four");
		aT.addNode(15,"fifteen");
		aT.addNode(30,"thirty");
		aT.inOrder(aT.root);

	}
}

