package wenjing.LeetCode;

/*
 * ��һ���µĽڵ㣬��������nextָ��ͷ��㣬����ָ��ͻ᷽��ܶࡣ
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
	        //�����ڵ�����ͬһ��ʼ�㣬��head��ǰ�ڵ㣬��Ϊ�ա�  
	        ListNode p=temp;  
	        ListNode q=temp;  
	        if(head==null)  
	        {  
	            return null;  
	        }  
	        /** 
	         * p����n���ڵ㣬���p,qһ���� 
	         * ��p�ܵ�����β��ʱ��q�ڵ�պ��ܵ���Ҫ�Ƴ��Ľڵ��ǰ�ڵ��� 
	         * Ȼ��������������� 
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
