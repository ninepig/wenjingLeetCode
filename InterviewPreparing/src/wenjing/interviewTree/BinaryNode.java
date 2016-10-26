package wenjing.interviewTree;

public class BinaryNode<T> implements BinaryNodeInterface<T> {

	private T data;
	public BinaryNode<T> leftChild;
	public BinaryNode<T> rightChild;
	 
	public BinaryNode() {
		
		this(null);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public  BinaryNode(T data) {
		// TODO Auto-generated method stub
		this(data,null,null);
		
	}


	public BinaryNode(T data2, BinaryNode<T> leftNode, BinaryNode<T> rightNode) {
		// TODO Auto-generated constructor stub
		this.data = data2;
		this.leftChild = leftNode;
		this.rightChild = rightNode;
	}


	@Override
	public T getData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public void setData() {
		// TODO Auto-generated method stub
	

	}

	@Override
	public BinaryNodeInterface<T> getLeftChild() {
		// TODO Auto-generated method stub
		return this.leftChild;
	}

	@Override
	public BinaryNodeInterface<T> getRightChid() {
		// TODO Auto-generated method stub
		return this.rightChild;
	}

	@Override
	public void setLeftChild(BinaryNodeInterface<T> leftChild) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setrightChild(BinaryNodeInterface<T> rightChild) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasLeftChild() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRightChild() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumberOfNodes() {
		// TODO Auto-generated method stub
		int leftNumber =0;
		int rightNumber= 0;
		if(leftChild != null){
			leftNumber = leftChild.getNumberOfNodes();
			
		}
		
		if(rightChild != null){
			rightNumber = rightChild.getNumberOfNodes();		
		}
		return 1+ leftNumber+rightNumber;
	}

	@Override
	public int getHeight(BinaryNode<T> thisNode) {
		// TODO Auto-generated method stub
		int height = 0 ;
		if(this!= null){
			height = 1+ Math.max(getHeight(this.leftChild),getHeight(this.rightChild));
		}
		return height;
	}

	@Override
	public BinaryNodeInterface<T> copy() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void preOrderTraverse(BinaryNode<T> treeNode){
		
		
		if(treeNode != null){
		
			System.out.println(treeNode.data);
			preOrderTraverse(treeNode.leftChild);
			preOrderTraverse(treeNode.rightChild);
			
		}
		
	}
	public void inOrderTraverse(BinaryNode<T> treeNode){
		
		
		if(treeNode != null){
		
			
			inOrderTraverse(treeNode.leftChild);
			System.out.println(treeNode.data);
			inOrderTraverse(treeNode.rightChild);
			
		}
		
	}
public void postOrderTraverse(BinaryNode<T> treeNode){
		
		
		if(treeNode != null){		
			postOrderTraverse(treeNode.leftChild);
			postOrderTraverse(treeNode.rightChild);
			System.out.println(treeNode.data);
		}
		
	}
	
	
	
	
}
