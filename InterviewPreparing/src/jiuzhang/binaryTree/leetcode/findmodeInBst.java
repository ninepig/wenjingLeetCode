package jiuzhang.binaryTree.leetcode;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenjingyang on 7/3/17.
 */
public class findmodeInBst {

    //to store preNumber
    Integer preNumber;
    //for counting
    int max = 0;
    int count =1;
    public int[] findMode(TreeNode root) {
//        int[] result = new int[]
        if(root==null){
            return new int[]{};
        }

        ArrayList<Integer> temp = new ArrayList<>();
        inOrderTravel(root,temp);

        int[] result = new int[temp.size()];
        for(int i = 0;i<temp.size();i++){
            result[i] = temp.get(i);
        }
        return result;
    }

    private void inOrderTravel(TreeNode root, ArrayList<Integer> temp) {
        if(root==null){
            return ;
        }
        inOrderTravel(root.left,temp);

        if(preNumber != null){
           if(preNumber ==root.val){
               count++;
           }else {
               count = 1;
           }
        }
        if(count>max){
            max = count;
            temp.clear();;
            temp.add(root.val);
        } else if(count==max){
            temp.add(root.val);
        }
        preNumber = root.val;
        inOrderTravel(root.right,temp);
    }
}
