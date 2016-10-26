package wenjing.LeetCode;

/*
 * 用一个新的节点，并把它的next指向头结点，这样指针就会方便很多。
 * 
 */
public class LeetCode19 {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	     if(head == null){
	    	 return null;
	     }
	     
	     ListNode tempNode = new ListNode(0);
	     tempNode.next = head;
	     ListNode fasterPointer = tempNode;
	     ListNode slowerPointer = tempNode;
	    
	     //faster go N at first 
	     
	     while(n>0){
	    	 fasterPointer = fasterPointer.next;
	    	 n--; 
	     }

	     
	     if(n>0 || fasterPointer == null){
	    	 return null;
	     }
	     
	     //start slow pointer;
	     
	     while(fasterPointer.next!=null){
	    	
	    	 slowerPointer = slowerPointer.next;
	    	 fasterPointer = fasterPointer.next;
	     }
	     
	     //delete that slow point;
	     
	     slowerPointer.next = slowerPointer.next.next;
		 
		 return tempNode.next;

	
	 
	 }
	 
	 public ListNode removeNthFromEndFromCsdn(ListNode head, int n) {
		 ListNode temp = new ListNode(0);  
	        temp.next=head;  
	        //将两节点置于同一起始点，即head的前节点，均为空。  
	        ListNode p=temp;  
	        ListNode q=temp;  
	        if(head==null)  
	        {  
	            return null;  
	        }  
	        /** 
	         * p先跑n个节点，随后p,q一起跑 
	         * 待p跑到链表尾部时，q节点刚好跑到需要移除的节点的前节点上 
	         * 然后进行跳过处理即可 
	         */  
	        for (int i = 0; i < n; i++)  
	        {  
	            p=p.next;  
	        }  
	        while (p.next!=null)  
	        {  
	            p=p.next;  
	            q=q.next;     
	        }  
	        q.next=q.next.next;  
	          
	        return temp.next;  
	 
	 }
	 
}
