package wenjing.LeetCode;

import java.util.ArrayList;

public class LeetCode234 {
public static boolean isPalindrome(ListNode head) {
	
		if(head==null){
			return true;
		}
		ArrayList<Integer> resultList = new ArrayList<>();
		ListNode temp = new ListNode(0);
		temp.next = head;
//		resultList.add(head.val);
		ListNode currentNode;
		
		while(temp.next!=null){
			currentNode = temp.next;
			temp = temp.next;
			resultList.add(currentNode.val);
		}
		
		int left = 0 ;
		int right = resultList.size()-1;
		
		while(left<right){
			
			
//			if(resultList.get(left)!=resultList.get(right)){
//				return false;
//			}
//			left++;
//			right--;

			int leftNumber = resultList.get(left);
			int rightNumber =resultList.get(right);
			//System.out.println(leftNumber +"right"+ rightNumber);
			if(leftNumber!=rightNumber){
				return false;
			}
			left++;
			right--;
			
		}	
		return true;
    }
//[-16557,-8725,-29125,28873,-21702,15483,-28441,-17845,-4317,-10914,-10914,-4317,-17845,-28441,15483,-21702,28873,-29125,-8725,-16557]
	public static void main(String[] args) {
		ListNode Node1 = new ListNode(-16557);
		ListNode Node2 = new ListNode(-8725);
		ListNode Node3 = new ListNode(-29125);
		ListNode Node4 = new ListNode(28873);
		ListNode Node5 = new ListNode(-21702);
		ListNode Node6 = new ListNode(15483);
		ListNode Node7 = new ListNode(-28441);
		ListNode Node8 = new ListNode(-17845);
		ListNode Node9 = new ListNode(-4317);
		ListNode Node10 = new ListNode(-10914);
		ListNode Node11 = new ListNode(-10914);
		ListNode Node12 = new ListNode(-4317);
		ListNode Node13 = new ListNode(-17845);
		ListNode Node14 = new ListNode(-28441);
		ListNode Node15 = new ListNode(15483);
		ListNode Node16 = new ListNode(-21702);
		ListNode Node17 = new ListNode(28873);
		ListNode Node18 = new ListNode(-29125);
		ListNode Node19 = new ListNode(-8725);
		ListNode Node20 = new ListNode(-16557);
		Node1.next=Node2;
		Node2.next=Node3;
		Node3.next=Node4;
		Node4.next=Node5;
		Node5.next=Node6;
		Node6.next=Node7;
		Node7.next=Node8;
		Node8.next=Node9;
		Node9.next=Node10;
		Node10.next=Node11;
		Node11.next=Node12;
		Node12.next=Node13;
		Node13.next=Node14;
		Node14.next=Node15;
		Node15.next=Node16;
		Node16.next=Node17;
		Node17.next=Node18;
		Node18.next=Node19;
		Node19.next=Node20;
	
	System.out.print(isPalindrome(Node1));
		
	}
}
