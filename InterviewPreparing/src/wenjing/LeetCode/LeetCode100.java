package wenjing.LeetCode;

/*
 * leetcode 100
same tree
�Ƚ����ö������Ƿ���ͬ

�ݹ��˼�룬�ݹ���ڵ�ǰ����жϾͿ�����
���̫������һ��ʼ ���ÿ����Ƿ��������������� 
��Ϊ����ж����node �Ƿ����
������������ȫ���ŵ��ݹ��п��Ǽ���

 */
public class LeetCode100 {
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	       if(p==null && q == null){
	           return true;
	       }
	       if(p!=null&&q==null){
	           return false;
	       }
	       if(p==null&&q!=null){
	           return false;
	       }
	     if(p.val != q.val){
	         return false;
	     }
	         return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
	       
	    }
}


