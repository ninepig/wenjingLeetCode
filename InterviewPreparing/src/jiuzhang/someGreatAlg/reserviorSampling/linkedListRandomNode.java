package jiuzhang.someGreatAlg.reserviorSampling;

import wenjing.LeetCode.ListNode;

import java.util.Random;

/**
 * Created by yangw on 2017/8/21.
 */
public class linkedListRandomNode {

    ListNode head;
    Random random;

    public Solution(ListNode h) {
        this.head = h;
        this.random = new Random();
    }

    public int getRandom() {

        ListNode c = head;
        int r = c.val;
        for(int i=1;c.next != null;i++){

            c = c.next;
            //随机产生一个1--到目标的随机数，蓄水池sampling 算法
            if(random.nextInt(i + 1) == i) r = c.val;
        }

        return r;
    }
}
