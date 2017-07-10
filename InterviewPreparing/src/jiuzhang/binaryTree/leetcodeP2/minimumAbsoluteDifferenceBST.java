package jiuzhang.binaryTree.leetcodeP2;

/**
 * Created by yangw on 2017/7/6.
 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

 Example:

 Input:

 1
 \
 3
 /
 2

 Output:
 1

 Explanation:
 The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 Note: There are at least two nodes in this BST.
 */
public class minimumAbsoluteDifferenceBST {
        /*
              非生成节点，利用BST 和中序遍历的特点，维护一个prev number 保存上一个值，然后一个一个比较，就可以得到difference
         */

        if(prev != null)

    {
        Math.min(prev, root.val)
    }
    prev = root.val;
    }

}
