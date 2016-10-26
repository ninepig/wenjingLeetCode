package wenjing.LeetCode;

public class LeetCode24 {
	//递归方法，注意把图画出来再分析，递归应该先处理后面的，然后在处理前头 因为是交给子问题。。
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
	 * 见图 要画图啊！！少年
	 */
	public ListNode swapPairs(ListNode head) {
        
		 if(head == null || head.next == null)
	            return head;
	        ListNode result = head.next;

	        ListNode preNode = null;//前一循环的尾节点
	        ListNode ANode   = null;//循环的左节点
	        ListNode BNode   = null;//循环的右节点  

	        while(head != null && head.next != null)
	        {
	            ANode = head;
	            BNode = head.next;

	            //为下一循环准备
	            head = BNode.next;
	            if(preNode != null)
	                preNode.next = BNode;//将前一个循环尾节点指向本循环翻转后的头结点
	            preNode = ANode;

	            //翻转A,B
	            ANode.next = BNode.next;
	            BNode.next = ANode; 
	        }   
	        return result;     
		
		
    }
	//递归的方法
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
