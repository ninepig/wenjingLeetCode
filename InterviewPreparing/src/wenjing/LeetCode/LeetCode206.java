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
}
