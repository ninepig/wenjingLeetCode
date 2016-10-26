package wenjing.LeetCode;

import java.util.ArrayList;

/*
 * ά������stack����һ��stack�洢һ����Сֵ
��ջ��ʱ��Ƚϣ��������Сջ��ֵС����һ����2��Ԫ��
top�����Ƿ���ջ����Ԫ��
��ջ�Ļ��������ջ��Ԫ������С��Ԫ�أ���Ҫ����Сջ��Ԫ��Ҳ���ˣ���ʱ����Сջ�����ڶ�С��Ԫ�ؾͱ����Сջ��С��Ԫ����
getmin ����top��Сջ��ջ��

 */
public class LeetCode155 {

	ArrayList<Integer> normalStack = new ArrayList<>();
	ArrayList<Integer> minStack = new ArrayList<>();
	

	  public void push(int x) {
		  normalStack.add(x);
		  if(minStack.isEmpty()||minStack.get(minStack.size()-1)>=x){
			  minStack.add(x);
		  }
	    }

	    public void pop() {
	    	if(normalStack.isEmpty()){
	    	return;
	    	}
    		int elment = normalStack.get(normalStack.size()-1);
	        normalStack.remove(normalStack.size()-1);
	        if((!minStack.isEmpty())&&elment==minStack.get(minStack.size()-1)){
	        	minStack.remove(minStack.size()-1);
	        }
	    }

	    public int top() {
	     
	    	if(!normalStack.isEmpty()){
	    		return normalStack.get(normalStack.size()-1);
	    	}
	    	return 0;
	    	
	    }

	    public int getMin() {
	    	 if(!minStack.isEmpty()){
		        	return minStack.get(minStack.size()-1);
	        }
	    	 return 0;
	    }
	
	
}
