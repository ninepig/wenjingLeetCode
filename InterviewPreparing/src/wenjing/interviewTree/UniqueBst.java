package wenjing.interviewTree;
/*
 * http://blog.csdn.net/linhuanmars/article/details/24761459
 * https://leetcode.com/discuss/75282/easy-to-understand-top-down-dp-solution
 * ����N����0---n �������ɶ��ٸ�����������
 * ���͵Ķ�̬�滮��Ŀ����������һ������洢������Ĵ�
 * �������������K����ȡ0---N֮���һ����Ϊ������Ϊ��bst ����ֵΪ0--k-1��K����������N-K��K��������������KΪ���ڵ��ʱ��Kӵ�е�BST������Ϊ
 * ����������BST��������������������bst������
 * 
 */
public class UniqueBst {

	public int numTrees(int n){
		int[] result = new int[n+1];
		return getNumTrees(n, result);
		
	}

	private int getNumTrees(int n, int[] result) {
		// TODO Auto-generated method stub
		int treeNumbers = 0;
		if(n<=1){
			
			return 1;
		}
		//����Ѿ�������ˣ���ֱ�ӷ��ؽ����DP�ı�ɱ������ʱ����+�ݹ�
		if(result[n-1] > 0) {
			return result[n-1];
		}
		
		for(int i = 2;i<=n;i++){
			treeNumbers += getNumTrees(i-1, result)*getNumTrees(n-1, result);
		}
		result[n-1] = treeNumbers;
		
		return treeNumbers;
	}
	
	//���񷽷�
	public int numTreesDaShen(int n) {  
	    if(n<=0)  
	        return 0;  
	    int[] res = new int[n+1];  
	    res[0] = 1;  
	    res[1] = 1;  
	    for(int i=2;i<=n;i++)  
	    {  
	        for(int j=0;j<i;j++)  
	        {  
	            res[i] += res[j]*res[i-j-1];  
	        }  
	    }  
	    return res[n];  
	} 
	
	
}
