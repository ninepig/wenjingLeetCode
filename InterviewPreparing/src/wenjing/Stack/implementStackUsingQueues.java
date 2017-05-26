package wenjing.Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yamengwenjing on 2017-04-10.
 */
public class implementStackUsingQueues {

    Queue<Integer> thisQueue = new LinkedList<>();
    /** Initialize your data structure here. */
    public implementStackUsingQueues() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        thisQueue.add(x);
     for(int i = 1;i<thisQueue.size();i++){
         thisQueue.add(thisQueue.remove());
     }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
     return thisQueue.remove();
    }

    /** Get the top element. */
    public int top() {
       return thisQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return thisQueue.isEmpty();
    }


}
