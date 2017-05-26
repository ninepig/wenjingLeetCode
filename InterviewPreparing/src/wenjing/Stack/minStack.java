package wenjing.Stack;

import java.util.Stack;

/**
 * Created by yamengwenjing on 2017-04-14.
 */
public class minStack {

    Stack<Integer> normalStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    /** initialize your data structure here. */
    public minStack() {

    }

    public void push(int x) {

        normalStack.push(x);
        if(minStack.isEmpty()||minStack.peek()>=x){
            minStack.push(x);
        }

    }
    public void pop() {
//错误的方法，因为用==有问题么？用equals就是正确的
//        if(normalStack.peek()==minStack.peek()){
//            normalStack.pop();
//            minStack.pop();
//        }else {
//            normalStack.pop();
//        }
        if(normalStack.pop().equals(minStack.peek()))
            minStack.pop();

    }

    public int top() {
        return normalStack.peek();
    }

    public int getMin() {
       return   minStack.peek();
    }
}
