package wenjing.LeetCode;
/*
 * Find the sum of all left leaves in a given binary tree.
 */
public class LeetCode404 {
	
		//�Լ���˼·û���ݹ�����ҽ���̬��ʣ�µĶ������ݹ�ȥ��ɾ����ˣ�����ǳ����ֹ�����ֵ�
			
		//���ڽ�������������ڵ�Ϊ�գ��򷵻�0 
	//ĳһ���ڵ����ڵ㲻Ϊnull�������ڵ�û���ӽڵ㣬�򷵻�����ڵ���ҽڵ����ڵ��
	//��������£��ݹ�����ڵ㼴�ɡ�
	public int sumOfLeftLeaves(TreeNode root) {
			if(root == null){
				return 0;
			}
			if(root.left!=null&&root.left.left==null&&root.left.right==null){
				return root.left.val+sumOfLeftLeaves(root.right);
			}else{
				return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
			}
		  
		  
	    }
}
