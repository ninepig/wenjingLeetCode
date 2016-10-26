package wenjing.LeetCode;

public class LeetCode203 {

    public ListNode removeElements(ListNode head, int val) {
     if(head == null){
    	 return head;
     }
    	
     ListNode pre = new ListNode(0);
     pre.next = head;
     ListNode pointer = pre;
     ListNode current = null;
     
     	while(pointer.next!=null){
     		current = pointer.next;
     		if(current.val == val){
     			if(current.next!=null){
     				pointer.next = pointer.next.next;
     			}else{
     				//如果是尾节点，则直接结束了 因为没办法再移动就会报错。 15行会报空指针
     				pointer.next =null;
     				return pre.next;
     			}
     		}//这边如果不等于val的话 才能移动指针，因为等于val的时候已经移动过指针了
     		else{
     		pointer = pointer.next;
     		}
 		}
    	
    	return pre.next;
    }
	
}
