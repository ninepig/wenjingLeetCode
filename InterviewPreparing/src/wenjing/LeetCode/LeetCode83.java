package wenjing.LeetCode;

/*
 * �Լ����� һ���������Ч���е�ͣ� ��Ϊ����������
 * �뷨��ά��һ����ʱ�������ѵ�ǰ�ڵ��ֵ���������棬Ȼ���������������ֵ��ͬ����ɾ���ڵ㲻��ͬ �����ֵ��
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
