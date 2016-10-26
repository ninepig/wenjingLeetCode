package wenjing.interviewTree;


public class SortedListToBinarySearchTree {

	
	/*
	 * 用快慢指针的方法找到链表的中间点，对中间点左侧的链表进行递归，对右侧同样。要明白bst的原则就是数组/链表的中间节点是树的rootNode
	 */
	public BinaryNode<T> sortedListToBST(ListNode head){
		// 如果链表为空 ，返回
		if(head == null){
			return null;
		}
		//如果只剩下单独的链表了，即最左边或者最右边，直接返回这个节点，作为树节点
		if(head.next == null){
			return BinaryNode<T>(head.NodeValue);
		}
		
		ListNode fast,pre,slow;
		fast  = head;
		slow =head;
		pre = null;
		while(fast!=null&&fast.next!=null){
			fast = fast.next.next;
			pre = slow;
			slow = slow.next;
		}
		
		ListNode rootNode = slow;
		// 慢指针指向的是中间节点，pre是慢指针之前的那个节点
		BinaryNode<T> root  = new BinaryNode<>(rootNode.NodeValue);
		//根的左树根节点用递归计算出
		if(pre !=null){
			
			pre.next = null;
			root.leftChild = sortedListToBST(head);			
		}

		ListNode rootRight = rootNode.next;
		rootNode.next =null;
		
		root.rightChild = sortedListToBST(rootRight); 
		
		return root;
		
	}
	
	
	
}
