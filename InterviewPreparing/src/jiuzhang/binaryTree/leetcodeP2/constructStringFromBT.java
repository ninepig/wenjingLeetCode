package jiuzhang.binaryTree.leetcodeP2;

/**
 * Created by yangw on 2017/7/6.
 *You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

 The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect the one-to-one mapping relationship between the string and the original binary tree.

 Example 1:
 Input: Binary tree: [1,2,3,4]
 1
 /   \
 2     3
 /
 4

 Output: "1(2(4))(3)"

 Explanation: Originallay it needs to be "1(2(4)())(3()())",
 but you need to omit all the unnecessary empty parenthesis pairs.
 And it will be "1(2(4))(3)".
 Example 2:
 Input: Binary tree: [1,2,3,null,4]
 1
 /   \
 2     3
 \
 4

 Output: "1(2()(4))(3)"

 Explanation: Almost the same as the first example,
 except we can't omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the o
 *
 */
public class constructStringFromBT {
    /* 非生成的节点，只要遍历下去就行了，用一个中间变量，当最后的返回值
    这道题目的关键在于明白题目的trick
    如果左子树没有节点，需要显示括号
    右子树没有节点，但是左有，则不需要空号
    左右都没有，不需要显示括号
    所以前序遍历的条件就出来了，
    只要有节点，左边肯定有括号的，右边不一定有括号
     */

    if(root!=null)}{
        if(root.left!=null||root.right!=null){
            ....
            if(root.right!=null){

        }
}


}
