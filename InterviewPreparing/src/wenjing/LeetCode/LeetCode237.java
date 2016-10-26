package wenjing.LeetCode;

/*
 * 有点简单啊。。= = 不过好像很费时间。。我这个方法。。还要看看别人的
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
