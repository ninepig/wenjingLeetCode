package wenjing.LeetCode;

//�ÿ�ָ�� Ҳ����һ��ǰ��2��ָ�� ��Ȼ�� ��һ��ͼ �����ظ������ؿ������������� �ǵ����Ҫ��ż��ָ���ͷ�ӵ�����ָ���ƨ����
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
