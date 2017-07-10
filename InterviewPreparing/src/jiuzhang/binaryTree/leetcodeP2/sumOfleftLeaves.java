package jiuzhang.binaryTree.leetcodeP2;

/**
 * Created by yangw on 2017/7/6
 * Find the sum of all left leaves in a given binary tree.

 Example:

 3
 / \
 9  20
 /  \
 15   7

 There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
public class sumOfleftLeaves {
/*
这个题虽然也是遍历的题，但是有些不一样，因为我们要找的是左节点，所以只有确定是左节点，我们才加入sum，然后正常的前序遍历就可以了
如何是左节点，root.left !=null, root.left.left ==null root.left.right == null
sum + = root.left.val
 */
}
