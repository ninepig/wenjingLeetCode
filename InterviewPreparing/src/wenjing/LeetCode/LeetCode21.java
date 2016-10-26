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
//				 //���Ҫ���� �����pointL2��next ָ��pointL1.next
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
		  * �Լ�������һ��ϸ�ڣ���Ϊ����2��ָ�룬���Ի���Ҫһ������Ľڵ���ָ�����ս������Ϊ2��ָ����ƶ���û��ָ�������׵�ָ���ˣ� ˼·��඼����
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
				 //���Ҫ���� �����pointL2��next ָ��pointL1.next
				 ListNode  pointL2tail = pointL2.next;
				 pointL2.next = pre.next;
				 pre.next = pointL2;
				 pointL2 = pointL2tail;
				 
			 }
			 pre = pre.next;
		 }
		 
		 if(pointL1 == null){
			 //�����ƶ������ һ��Ҫ��һ��helpָ�룬Ҫ��Ȼ�϶�����
			 pre.next = pointL2;
			 
		 }
		 
		 return helper.next;		 
		 
	  
	 }
	 
}
