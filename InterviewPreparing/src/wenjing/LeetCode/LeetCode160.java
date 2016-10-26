package wenjing.LeetCode;

public class LeetCode160 {
	
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		if(headA == null || headB == null){
			return null;
		}
	
		int ListALength =0;
		int ListBLength = 0;
		ListNode preA = headA;
		ListNode preB = headB;
		
		// judge if they intersect
		// 一开始出错！！纯 因为要遍历next 所以不能用pre 来判断，如果要用pre来判断，长度就不对了
//		while(preA.next!=null){
//			preA = preA.next;
//			ListALength++;
//		}
//		while(preB.next!=null){
//			preB = preB.next;
//			ListBLength++;
//		}
	
		while(preA!=null){
			preA = preA.next;
			ListALength++;
		}
		while(preB!=null){
			preB = preB.next;
			ListBLength++;
		}
		ListALength = ListALength -1;
		ListBLength = ListBLength -1;
		
		
		if(preA != preB){
			return null;
		}

		// they intersect
		
		if(ListALength >= ListBLength){
			int difference = ListALength - ListBLength;
			while(difference>0){
				headA = headA.next;
				difference--;
			}
		}else{
			int difference = ListBLength - ListALength;
			while(difference>0){
				headB = headB.next;
				difference--;
			}
		}
		
		while(headA != headB){
			headA = headA.next;
			headB =headB.next;
		}

		return headA;
		
}


	
}
