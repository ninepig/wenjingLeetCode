//package wenjing.interviewTree;
//
//
//public class SortedListToBinarySearchTree {
//
//
//	/*
//	 * �ÿ���ָ��ķ����ҵ�������м�㣬���м������������еݹ飬���Ҳ�ͬ����Ҫ����bst��ԭ���������/������м�ڵ�������rootNode
//	 */
//	public BinaryNode<T> sortedListToBST(ListNode head){
//		// �������Ϊ�� ������
//		if(head == null){
//			return null;
//		}
//		//���ֻʣ�µ����������ˣ�������߻������ұߣ�ֱ�ӷ�������ڵ㣬��Ϊ���ڵ�
//		if(head.next == null){
//			return BinaryNode<T>(head.NodeValue);
//		}
//
//		ListNode fast,pre,slow;
//		fast  = head;
//		slow =head;
//		pre = null;
//		while(fast!=null&&fast.next!=null){
//			fast = fast.next.next;
//			pre = slow;
//			slow = slow.next;
//		}
//
//		ListNode rootNode = slow;
//		// ��ָ��ָ������м�ڵ㣬pre����ָ��֮ǰ���Ǹ��ڵ�
//		BinaryNode<T> root  = new BinaryNode<>(rootNode.NodeValue);
//		//�����������ڵ��õݹ�����
//		if(pre !=null){
//
//			pre.next = null;
//			root.leftChild = sortedListToBST(head);
//		}
//
//		ListNode rootRight = rootNode.next;
//		rootNode.next =null;
//
//		root.rightChild = sortedListToBST(rootRight);
//
//		return root;
//
//	}
//
//
//
//}
