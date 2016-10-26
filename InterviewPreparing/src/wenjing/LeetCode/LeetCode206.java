package wenjing.LeetCode;

import wenjing.interview.cc150.linkedList.Demo.Node;

public class LeetCode206 {

	 public ListNode reverseList(ListNode head) {
		 
		 if(head == null || head.next == null){
			 return head;
		 }
		 
		  ListNode currentNode  = head;
		  ListNode rePreHeadNode = null;
		  while(currentNode!= null){
			  
			  // 保存一个当前节点的引用，作为新的链表的新的头
			  ListNode preNode = currentNode;
			  // 链表向后移动
			  currentNode = currentNode.next ;
			  //新的链表的头结点的next 是之前的头结点
			  preNode.next= rePreHeadNode;
			  //把新的头结点给新链表头结点的引用
			  rePreHeadNode = preNode;
	
			  
		  }
		
		 
		  return rePreHeadNode;
	
	 }
	
	 //递归的方法非常优美。 A--B--C--D 
	 //D--C--B 
	 // B IS head.next
	 
	 public ListNode reverseListRer(ListNode head){
		 if(head == null || head.next == null){
			 return head;
		 }
		 
		 ListNode reHead = reverseList(head.next);
		 head.next.next = head;
		 head.next = null;
		 
		 return reHead;
		 
		 
		 
	 }
}
