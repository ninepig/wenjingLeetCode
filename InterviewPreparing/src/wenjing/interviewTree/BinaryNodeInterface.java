package wenjing.interviewTree;

public interface BinaryNodeInterface <T>{
	
	public T getData();
	
	public void setData();
	
	public BinaryNodeInterface<T> getLeftChild();
	public BinaryNodeInterface<T> getRightChid();

	public void setLeftChild(BinaryNodeInterface<T> leftChild);
	
	public void setrightChild(BinaryNodeInterface<T> rightChild);
	
	public boolean hasLeftChild();
	
	public boolean hasRightChild();
	
	public boolean isLeaf();;
	
	public int  getNumberOfNodes();
	

	
	public BinaryNodeInterface<T> copy();

	int getHeight(BinaryNode<T> thisNode);
	
	
}
