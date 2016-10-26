package wenjing.LeetCode;

/*
 * 自己做的 一遍过，但是效率有点低， 因为是有序链表
 * 想法是维护一个临时变量，把当前节点的值保存在里面，然后向后遍历链表，如果值相同，就删掉节点不相同 则更新值，
 */
public class LeetCode83 {

	  public ListNode deleteDuplicates(ListNode head) {
	      if(head == null || head.next == null){
	    	  return head;
	      }
	      
	      int tempVaule = head.val;
	      ListNode current = head;
		  while(current.next != null){
			  
			  ListNode  temp = current.next;
//			  current = current.next;
			  if(temp.val == tempVaule){
				  
				  current.next = current.next.next;
				  
			  } else{
				  
				  current = current.next;
				  tempVaule = current.val;
				  
			  }
			  
		  
		  }
	      return head;
	      
		  
	    }
	
	
}
