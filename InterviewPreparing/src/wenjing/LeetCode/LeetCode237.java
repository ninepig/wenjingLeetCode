package wenjing.LeetCode;

/*
 * �е�򵥰�����= = ��������ܷ�ʱ�䡣�����������������Ҫ�������˵�
 */
public class LeetCode237 {
	   public void deleteNode(ListNode node) {
	     
		   if(node == null){
			   return ;
		   }
		   if(node.next != null){
			  node.val = node.next.val;
			  node.next = node.next.next;
		   }
		   
		   
		   
	    }
}
