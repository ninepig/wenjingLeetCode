package wenjing.interviewTree;

import wenjing.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yamengwenjing on 2017-03-21.
 */
public class FindModeInBst {
    Integer preNumber = null;
    int max = 0;
    int count = 1;
    public int[] findMode(TreeNode root) {
        if(root==null)
            return new int[0];

        ArrayList<Integer> tempList = new ArrayList<>();
        inOrderTravel(root,tempList);

        int[] res = new int[tempList.size()];
        for(int i = 0;i<tempList.size();i++){
            res[i] = tempList.get(i);
        }

    return res;

    }

    private void inOrderTravel(TreeNode root, ArrayList<Integer> tempList) {
            if(root==null)
                return ;
            inOrderTravel(root.left,tempList);

            if(preNumber !=null){
                if(root.val==preNumber)
                    count++;
                else
                    count = 1;
            }
            if(count>max){
                max = count;
                tempList.clear();
                tempList.add(root.val);
            } else if(count == max){
                tempList.add(root.val);
            }
            preNumber = root.val;
            inOrderTravel(root.right,tempList);



    }


//    Integer prev = null;
//    int count = 1;
//    int max = 0;
//    public int[] findMode(TreeNode root) {
//        if (root == null) return new int[0];
//
//        List<Integer> list = new ArrayList<>();
//        traverse(root, list);
//
//        int[] res = new int[list.size()];
//        for (int i = 0; i < list.size(); ++i) res[i] = list.get(i);
//        return res;
//    }
//
//    private void traverse(TreeNode root, List<Integer> list) {
//        if (root == null) return;
//        traverse(root.left, list);
//        if (prev != null) {
//            if (root.val == prev)
//                count++;
//            else
//                count = 1;
//        }
//        if (count > max) {
//            max = count;
//            list.clear();
//            list.add(root.val);
//        } else if (count == max) {
//            list.add(root.val);
//        }
//        prev = root.val;
//        traverse(root.right, list);
//    }

}
