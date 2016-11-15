package wenjing.LeetCode.List;

import wenjing.LeetCode.ListNode;
/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTSortedList21 {
	//merge两个链表，不用额外空间,
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
        	return l2;
        }
        if(l2==null){
        	return l1;
        }
	   	 ListNode helper = new ListNode(0);
		 ListNode pre = helper;
		 pre.next = l1;
		 
        
        while(l1!=null&&l2!=null){
        	//if l1 current value is less than l2 , we just move the l1 pointer to the next;
        	if(l1.val<l2.val){
        		l1= l1.next;
        	
        	}else{
        		//if l1 current value is bigger than l2, we need insert l2 to current l1 list;
        		ListNode tempNode = l2.next;
        		//l2 's next is the current pointer's next
        		l2.next = pre.next;
        		pre.next = l2;
        		l2 = tempNode;
        	}
        	
        	pre=pre.next;
        }
        if(l1==null){
        	pre.next = l2;
        }
        
        return helper.next;
		
    }
	//额外空间的方法，就是维护一个新的list
	
	public ListNode mergeTwoListsExtraSpace(ListNode l1, ListNode l2) {
        if(l1==null){
        	return l2;
        }
        if(l2==null){
        	return l1;
        }
	   	 ListNode helper = new ListNode(0);
		 ListNode pre = helper;
//		 ListNode temp = new ListNode(0);
		 while(l1!=null||l2!=null){
			 if(l2==null){
				 pre.next = l1;
			 }
			 if(l1==null){
				 pre.next =l2;
			 }
			 if(l1.val<l2.val){
				 // 新list的下一个是l1
				 pre.next = l1;
				 l1=l1.next;
				 //新的指针指向刚刚加入的新元素
				 pre = pre.next;
			 }else{
				 pre.next=l2;
				 l2=l2.next;
				 pre=pre.next;
			 }
			 
		 }
		 
		 
		 
      
        return helper.next;
		
    }
}
