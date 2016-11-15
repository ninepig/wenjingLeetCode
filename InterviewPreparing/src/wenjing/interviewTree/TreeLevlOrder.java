package wenjing.interviewTree;

public class TreeLevlOrder {
	public void levelIterator(BiTree root)  
	  {  
	      if(root == null)  
	      {  
	          return ;  
	      }  
	      LinkedList<BiTree> queue = new LinkedList<BiTree>();  
	      BiTree current = null;  
	      queue.offer(root);//将根节点入队  
	      while(!queue.isEmpty())  
	      {  
	          current = queue.poll();//出队队头元素并访问  
	          System.out.print(current.val +"-->");  
	          if(current.left != null)//如果当前节点的左节点不为空入队  
	          {  
	              queue.offer(current.left);  
	          }  
	          if(current.right != null)//如果当前节点的右节点不为空，把右节点入队  
	          {  
	              queue.offer(current.right);  
	          }  
	      }  
	        
	  }  
}
