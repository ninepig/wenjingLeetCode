package wenjing.Stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by yamengwenjing on 2016-11-16.
 */
//栈的情况还有种考虑，就是有可能是
public class ImplementQueusingStacks {
    // Push element x to the back of queue.
    Stack<Integer> stackOne = new Stack();
    Stack<Integer> stackTwo = new Stack();

    public void push(int x) {
        stackOne.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(stackTwo.isEmpty()) {
            while (!stackOne.empty()) {
                stackTwo.push(stackOne.pop());
            }
        }
        stackTwo.pop();

    }

    // Get the front element.
    public int peek() {
        if(stackTwo.isEmpty()) {
            while (!stackOne.empty()) {
                stackTwo.push(stackOne.pop());
            }
        }
       int result =  stackTwo.peek();
        return  result;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stackOne.empty()&&stackTwo.empty();
    }
}
