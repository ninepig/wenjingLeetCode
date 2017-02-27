//package wenjing.interviewTree;
//
//public class TreeLevlOrder {
//	public void levelIterator(BiTree root)
//	  {
//	      if(root == null)
//	      {
//	          return ;
//	      }
//	      LinkedList<BiTree> queue = new LinkedList<BiTree>();
//	      BiTree current = null;
//	      queue.offer(root);//�����ڵ����
//	      while(!queue.isEmpty())
//	      {
//	          current = queue.poll();//���Ӷ�ͷԪ�ز�����
//	          System.out.print(current.val +"-->");
//	          if(current.left != null)//�����ǰ�ڵ����ڵ㲻Ϊ�����
//	          {
//	              queue.offer(current.left);
//	          }
//	          if(current.right != null)//�����ǰ�ڵ���ҽڵ㲻Ϊ�գ����ҽڵ����
//	          {
//	              queue.offer(current.right);
//	          }
//	      }
//
//	  }
//}
