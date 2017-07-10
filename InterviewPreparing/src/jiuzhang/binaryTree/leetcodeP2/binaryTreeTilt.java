package jiuzhang.binaryTree.leetcodeP2;

/**
 * Created by yangw on 2017/7/6.Given a binary tree, return the tilt of the whole tree.

 The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.

 The tilt of the whole tree is defined as the sum of all nodes' tilt.

 Example:
 Input:
 1
 /   \
 2     3
 Output: 1
 Explanation:
 Tilt of node 2 : 0
 Tilt of node 3 : 0
 Tilt of node 1 : |2-3| = 1
 Tilt of binary tree : 0 + 0 + 1 = 1
 Note:

 The sum of node values in any subtree won't exceed the range of 32-bit integer.
 All the tilt values won't exceed the range of 32-bit integer.
 */
public class binaryTreeTilt {
    /*
    非生成式，root == null 结束，维护一个sum 去计算 tilt的和 关键是在于tilt是在于 两子树的 sum 的difference 这时候就要使用
    后续遍历，这是计算sum的核心关键,别忘了加入root.VAL
     */
    if(root == null){
        return 0;
    }
    left = ...trav(root.left)
    right = ..trav(root.right)
        tiltSum += math.abs(left-right);
    return left+right + root.val;

}
