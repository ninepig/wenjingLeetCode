package jiuzhang.linkedList;

import java.util.HashMap;

/**
 * Created by yangw on 2017/8/6.
 */
public class copyListWithRandomPointer {
//    public RandomListNode copyRandomList(RandomListNode head) {
////        if (head == null) {
////            return null;
////        }
////
////        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
////        RandomListNode dummy = new RandomListNode(0);
////        RandomListNode pre =dummy,newNode;
////        while (head!=null){
////            if(map.containsKey(head)){
////                newNode = map.get(head);
////            }else {
////                newNode = new RandomListNode(head.label);
////                map.put(head,newNode);
////            }
////            if(head.random!=null){
////                if(map.containsKey(head.random)){
////                    newNode.random = map.get(head.random);
////                }else {
////                    newNode.random = new RandomListNode(head.random.label);
////                    map.put(head.random,newNode.random);
////                }
////            }
////            pre.next = newNode;
////            pre = newNode;
////            head = head.next;
////
////        }
////        return dummy.next;i
//        if(head==null){
//            return head;
//        }
//        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
//        RandomListNode dummpy = new RandomListNode(0);
//        RandomListNode pre = dummpy,newNode;
//
//        while (head!=null){
//            if(map.containsKey(head)){
//                newNode = map.get(head);
//            }else{
//                newNode = new RandomListNode(head.label);
//                map.put(head,newNode);
//            }
//            if(head.random!=null){
//                if(map.containsKey(head.random)){
//                    newNode.random = map.get(head.random);
//                }else {
//                    newNode.random = new RandomListNode(head.random.label);
//                    map.put(head.random,newNode.random);
//                }
//            }
//            pre.next =newNode;
//            pre = newNode;
//            head = head.next;
//        }
//        return dummpy.next;
//
//    }

    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null){
            return head;
        }
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode pre = dummy,newHead;
        HashMap<RandomListNode,RandomListNode> maps = new HashMap<>();

        while (head!=null){

            if(maps.containsKey(head)){
                newHead = maps.get(head);
            }else {
                newHead = new RandomListNode(head.label);
                maps.put(head,newHead);
            }

            if(head.random!=null){
                if(maps.containsKey(head.random)){
                    newHead.random = maps.get(head.random);
                }else {
                    newHead.random = new RandomListNode(head.random.label);
                    maps.put(head.random,newHead.random);
                }
            }

            pre.next = newHead;
            pre = newHead;
            head = head.next;

        }

        return dummy.next;
    }
      class RandomListNode {
      int label;
     RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  }
}
