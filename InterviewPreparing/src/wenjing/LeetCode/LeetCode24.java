package wenjing.LeetCode;

public class LeetCode24 {
	//�ݹ鷽����ע���ͼ�������ٷ������ݹ�Ӧ���ȴ������ģ�Ȼ���ڴ���ǰͷ ��Ϊ�ǽ��������⡣��
	public ListNode swapPairsRec(ListNode head) {
        
		if(head == null || head.next == null){
			return head;
		}
		ListNode newHead ;
		
		ListNode newTail = swapPairsRec(head.next.next);
		
		newHead = head.next;
		newHead.next = head;
		head.next = newTail;

		return newHead;
		
		
		
    }
	
	/*
	 * ��ͼ Ҫ��ͼ����������
	 */
	public ListNode swapPairs(ListNode head) {
        
		 if(head == null || head.next == null)
	            return head;
	        ListNode result = head.next;

	        ListNode preNode = null;//ǰһѭ����β�ڵ�
	        ListNode ANode   = null;//ѭ������ڵ�
	        ListNode BNode   = null;//ѭ�����ҽڵ�  

	        while(head != null && head.next != null)
	        {
	            ANode = head;
	            BNode = head.next;

	            //Ϊ��һѭ��׼��
	            head = BNode.next;
	            if(preNode != null)
	                preNode.next = BNode;//��ǰһ��ѭ��β�ڵ�ָ��ѭ����ת���ͷ���
	            preNode = ANode;

	            //��תA,B
	            ANode.next = BNode.next;
	            BNode.next = ANode; 
	        }   
	        return result;     
		
		
    }
	//�ݹ�ķ���
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

	    ListNode start;
	    if(l1 == null)
	    return l2;
	    if(l2 == null)
	    return l1;
	    if(l1.val < l2.val){
	        start = l1;
	        start.next = mergeTwoLists(l1.next, l2);
	    }
	    else{
	        start = l2;
	        start.next = mergeTwoLists(l1, l2.next);
	    }
	    return start;
	}
	
	
}
