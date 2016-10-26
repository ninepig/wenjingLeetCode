package wenjing.LeetCode;

public class LeetCode21 {
	 @SuppressWarnings("null")
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	     
//		 if(l1==null && l2 == null){
//			 return l1;
//		 }
//		 if(l1==null && l2!= null){
//			 return l2;
//		 }
//		 if(l1!=null && l2== null){
//			 return l1;
//		 }
//		 
//		 ListNode pointL1 = l1;
//		 ListNode pointL2 = l2;
//		 while(pointL1.next!=null && pointL2!=null){
//			 
//			 if(pointL1.val<=pointL2.val){
//				 pointL1 = pointL1.next;
//				 
//			 }else{
//				 //如果要交换 必须把pointL2的next 指向pointL1.next
//				 ListNode  pointL2tail = pointL2.next;
//				 pointL2.next = pointL1.next;
//				 pointL1.next = pointL2;
//				 pointL2 = pointL2tail;
//				 
//			 }
//		 }
//		 
//		 if(pointL1.next == null){
//			 pointL1.next = pointL2;
//			 
//		 }
//		 
//		 return l1;
		 
		 
		 /*
		  * 自己忽视了一个细节，因为用了2个指针，所以还需要一个链表的节点来指向最终结果，因为2个指针的移动，没有指向链表首的指针了！ 思路差不多都对了
		  * 
		  */
		 if(l1==null && l2 == null){
			 return l1;
		 }
		 if(l1==null && l2!= null){
			 return l2;
		 }
		 if(l1!=null && l2== null){
			 return l1;
		 }
		 
		 ListNode pointL1 = l1;
		 ListNode pointL2 = l2;
		 
		 ListNode helper = new ListNode(0);
		 ListNode pre = helper;
		 pre.next = l1;
		 
		 
		 while(pointL1!=null && pointL2!=null){
			 
			 if(pointL1.val<=pointL2.val){
				 pointL1 = pointL1.next;
				 
			 }else{
				 //如果要交换 必须把pointL2的next 指向pointL1.next
				 ListNode  pointL2tail = pointL2.next;
				 pointL2.next = pre.next;
				 pre.next = pointL2;
				 pointL2 = pointL2tail;
				 
			 }
			 pre = pre.next;
		 }
		 
		 if(pointL1 == null){
			 //链表移动这类的 一定要用一个help指针，要不然肯定不对
			 pre.next = pointL2;
			 
		 }
		 
		 return helper.next;		 
		 
	  
	 }
	 
}
