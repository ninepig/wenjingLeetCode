package wenjing.interview.cc150.linkedList;

import java.util.HashSet;
import java.util.Stack;

public class LinkedListInterViewSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = new Node();
		
		removeDuplicateInUnsorted(head);
		
		
		
	}

	//wenjing solution 和答案一样诶！！
	private static Node removeDuplicateInUnsorted(Node head) {
		// TODO Auto-generated method stub
		if(head == null){
			return head;
		}
		Node currentNode = head;
		
		HashSet<Integer> buffer  = new HashSet<>();
		
		while(currentNode.next!=null){
			if(!buffer.add(currentNode.data)){
				currentNode.next = currentNode.next.next;
			}
			currentNode = currentNode.next; 
	
		}
		return head;
		
	}
	//wenjing solution  runner pointer
	private static Node removeDuplicatedInUnsortedWithoutBuffer(Node head){
		if(head == null){
			return head;
		}
		Node currentNode = head;
		//Node FirstNode = head;
		while(currentNode.next!=null){
		Node runner = currentNode;
		while(runner.next!=null){
			if(runner.next.data == currentNode.data){
				runner.next = runner.next.next;
			}
			runner = runner.next;
		}
		currentNode = currentNode.next;
		}
		           
		return head;
	}
	
	private static Node getKthLastNodeFromLinkedList(Node head,int k){
		
		if(k<=0||head==null){
			return head;
		}
		
		Node targetNode = new Node();
		Node currentNode = head;
		Node  runner = head;
		
		while(k>0){
			if(runner.next!=null){
				runner = runner.next;
			}else{
				return head;
			}
			k--;
		}
		
		while(runner.next!=null){
			currentNode = currentNode.next;
			runner = runner.next;
		}
		
		targetNode = currentNode;	
		return targetNode;
		

	}
	//递归的方式解 ,没能理解。
private static int getKthLastNodeFromLinkedListRecursive(Node head,int k){
	if(head ==null){
		return 0;
	}
	int i = getKthLastNodeFromLinkedListRecursive(head.next, k)+1;
	if(i==k){
		System.out.println(head.data);
	}
	return i;

}


private static Node deleteMiddlePointOfLinkedList(Node head){

	if(head == null){
		return null;
	}
	
	Node runner = head;
	int delayStep =1 ;
	Node previous =head;
	while(runner.next!=null && runner.next.next!=null){
		if(runner.next.next==null){
			runner =runner.next;
		}
		runner = runner.next.next;
		if(delayStep>0){
			delayStep--;
			continue;
		}
		previous = previous.next;
	}	
	previous =previous.next.next;

	return head;
}
	
	
private static Node getFirstNodeOfCircle(Node head){
	
	if(head == null){
		return null;
	}

	Node faster = head;
	Node slower = head;
	
	//judge if there is a circle
	while(faster !=null&&faster.next!=null){
		faster = faster.next.next;
		slower = slower.next;
		if(faster == slower){
			break;
		}
	}
	
	if(faster==null&&faster.next==null){
		return null;
	}
	
	
	//put slower to head
	slower = head;
	//get the first Circle
	while(slower!=faster){
		slower = slower.next;
		faster =faster.next;
	}
	
	return slower;
	
	
}

public static Node reverseLinkedList(Node head){
	
	if(head == null){
		return null;
	}
	Node newList = new Node();
	Node current = head;
	
	while(current!=null){
		
		Node thisCurrnet = current;
		//指向新的指针，新的指针的头结点永远是老链表的遍历的当前节点
		//当前节点的下一个节点指向当前节点
		thisCurrnet.next = newList;
		newList = thisCurrnet;
		
		current = current.next;
	}
	
	return newList;
	
}
// 太巧秒了递归
public static Node reverseLinkedListRec(Node head){
	if(head == null && head.next ==null){
		return null;
	}
	Node newHead = reverseLinkedList(head.next);
	head.next.next = head;
	head.next =null;
	return newHead;	
}

public static void reversePrint(Node head){
	
	if(head == null){
		return;
	}
	Stack<Integer> valueStack = new Stack<Integer>();
	
	Node current = head;
	
	while(current!=null){
		valueStack.push(current.data);
		current= current.next;
	}
	
	//print value;
	
}

public static void reversePrintRec(Node head){
	
	if(head == null){
		return;
	}
	
	reversePrintRec(head.next);
	//print current value;
	
}


}
