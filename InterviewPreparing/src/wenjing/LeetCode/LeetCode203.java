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
     				//�����β�ڵ㣬��ֱ�ӽ����� ��Ϊû�취���ƶ��ͻᱨ�� 15�лᱨ��ָ��
     				pointer.next =null;
     				return pre.next;
     			}
     		}//������������val�Ļ� �����ƶ�ָ�룬��Ϊ����val��ʱ���Ѿ��ƶ���ָ����
     		else{
     		pointer = pointer.next;
     		}
 		}
    	
    	return pre.next;
    }
	
}
