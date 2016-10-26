package wenjing.LeetCode;

//用快指针 也就是一次前进2个指针 ，然后 画一个图 就嗯呢该清晰地看到这道题的脉络 记得最后要把偶数指针的头加到奇数指针的屁股上
public class LeetCode328 {
	  public ListNode oddEvenList(ListNode head) {
	        if( head == null || head.next == null ){
	        	return head;
	        }
	        
	        ListNode odd = head;
	        ListNode even = odd.next;
	        ListNode evenHead = even ;
	        
	        while(odd.next!=null&&even.next!=null){
	        	odd.next= even.next;
	        	odd = odd.next;
	        	even.next = odd.next;
	        	even = even.next;
	        	
	        }
	        odd.next = evenHead;
	        
	        return head;
	        
	        
	        
	    }
}
