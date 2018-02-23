public class MinIntHeap {
private int capacity= 10;
private int size=0;
int [] items = new int[capacity];

private int getParent(int childIndex){

return childIndex-1/2;
}

private int getLeftChild(int parentIndex){
return 2*parentIndex +1;
}

private int getRightChild(int parentIndex) {

return 2*parentIndex+2;
}

private boolean hasParent(int index) {
	return getParent(index)>=0;
}

private boolean hasLeftChild(int index) {

	return getLeftChild(index)<size;
}

private boolean hasRightChild(int index) {

	return getRightChild(index)<size;
}

private int parent(int index) {
	return items[getParent(index)];
}

private int leftChild(int index) {
	return items[getLeftChild(index)];
}

private int hasRightChild(int index) {
	return items[getRightChild(index)];
}

private void swap(int indexOne, int indexTwo) {
	int temp= items[indexOne];
	items[indexOne] = items[indexTwo];
	items[indexTwo] = temp;
}

prvate void ensureExtraCapacity() {
	if(size==capacity){
		items=Arrays.copyOf(items,capacity*2);
	}
}

public int poll(){
	if(size==0) throw new IllegalStateException();
	int item= items[0];
	items[0]=item[size-1];
	size--;
	heapifyDown();
	return item;
}

public void heapifyDown() {
	int index = 0;
	while(hasLeftChild(index)) {
		int smallerIndex = getLeftChild(index);
		if(hasRightChild(index) && rightChild(index)< leftChild(index)) {
			smallerIndex = getRightChild(index);
		}
		if(items[smallerIndex]<items[index]){
			swap(items[smallerIndex], items[index]);
		}
		else {
			break;
		}
		index=smallerIndex;
	}

	public void add(int item) {
		ensureExtraCapacity();
		items[size] = item;
		size++;
		heapifyUp();
	}

	public void heapifyUp();
	index =  size-1;
	while(hasParent(index) && parent(index)>items[index] {
		swap(index, getParent(index));
		index=getParent(index);
	}
}



	public static void main(String [] args) {

		MinIntHeap element = new MinIntHeap();
		element.add(25);
		element.add(29);
		element.add(5);
		element.add(2);
		element.add(20);
		element.add(15);
		for(int i=0;i<6;i++)
			System.out.println(element.items[i]);
	}
}