package leetcodeFromEasyTm.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by wenjingyang on 8/31/17.
 */
public class nextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //maitain a stack to get decreaing array, to find the next bigger number ,then use a hashmap to store number:biggerNumber
        Stack<Integer> deStack = new Stack<>();
        HashMap<Integer,Integer>  nextMap = new HashMap<>();
        for(Integer num : nums2){

            while (!deStack.isEmpty()&&deStack.peek()<num){
                nextMap.put(deStack.pop(),num);
            }
            deStack.push(num);
        }
        int[] result = new int[nums1.length];
        for(int i = 0 ;i < result.length; i++){

            result[i] = nextMap.getOrDefault(nums1[i],-1);

        }
        return result;
    }
}
