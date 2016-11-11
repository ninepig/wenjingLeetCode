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
			  
			  // ����һ����ǰ�ڵ�����ã���Ϊ�µ�������µ�ͷ
			  ListNode preNode = currentNode;
			  // ��������ƶ�
			  currentNode = currentNode.next ;
			  //�µ������ͷ����next ��֮ǰ��ͷ���
			  preNode.next= rePreHeadNode;
			  //���µ�ͷ����������ͷ��������
			  rePreHeadNode = preNode;
	
			  
		  }
		
		 
		  return rePreHeadNode;
	
	 }
	
	 //�ݹ�ķ����ǳ������� A--B--C--D 
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
	 
	 
	  public ListNode reverseListIterAgain(ListNode head) {
	        
		  if(head == null ){
			  return null;
		  }
		  
		  ListNode currentNode = head;
		  //current node 's pre node
		  ListNode preNode = null;
		  
		  while(currentNode!=null){
			  //create a new head node for the new list and it could be a temp node to store currentNode
			  ListNode tempNode = currentNode;
			  // we move current node to next node
			  currentNode = currentNode.next;
			  //new head node's next node pointer to current node's pre node
			  tempNode.next = preNode;
			  // we change the preNode to currentNode
			  preNode = tempNode;
			  
		  }
		  //return new head.
		  return preNode;
		  
	    }
	 
	 

	  public ListNode reverseListRecurAgain(ListNode head) {
	        
		  if(head == null || head.next==null){
			  return head;
		  }
		  
		  // create a newHead which call function recursive  get the reverse of head's next point.
		  ListNode newHead = reverseListRecurAgain(head.next);
		  // head.next.next should be head , draw a picture
		  head.next.next = head;
		  //head next go to null
		  head.next= null;
		  
		  return newHead;
		  
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
}
