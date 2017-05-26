package secondTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by yamengwenjing on 2017-04-23.
 */
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
            if(findNums==null||nums==null||findNums.length==0||nums.length==0){
                return new int[0];
            }
        ArrayList<Integer> resultArray = new ArrayList<>();

        for(int i = 0; i<findNums.length;i++){

            int thisTargetIndex = 0;
           for(int j=0;j<nums.length;j++){
               if(findNums[i] == nums[j]){
                   thisTargetIndex = j;
               }
           }
           boolean ifExist = false;
           for(int k = thisTargetIndex+1;k<nums.length;k++){
               if(nums[k]>findNums[i]){
                   ifExist=true;
                   resultArray.add(nums[k]);
                   break;
               }
           }

           if(!ifExist){
               resultArray.add(-1);
           }
        }

        int[] result = new int[resultArray.size()];
        for(int i = 0;i<resultArray.size();i++){
            result[i] = resultArray.get(i);
        }
        return  result;

    }

    // better solution
    /*
    Key observation:
Suppose we have a decreasing sequence followed by a greater number
For example [5, 4, 3, 2, 1, 6] then the greater number 6 is the next greater element for all previous numbers in the sequence

We use a stack to keep a decreasing sub-sequence, whenever we see a number x greater than stack.peek() we pop all elements less than x and for all the popped ones, their next greater element is x
For example [9, 8, 7, 3, 2, 1, 6]
The stack will first contain [9, 8, 7, 3, 2, 1] and then we see 6 which is greater than 1 so we pop 1 2 3 whose next greater element should be 6
     */
    public int[] nextGreaterElement2(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }


}
