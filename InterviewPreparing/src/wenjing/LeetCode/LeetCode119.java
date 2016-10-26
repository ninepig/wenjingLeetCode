package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 119  ��˹�������� 2 �õ�ĳһ�е�ֵ������ ֻ��O��k���Ŀռ临�Ӷ�
����ֻ����O��k���Ķ��⸴�Ӷȣ����Բ�������ʱlist��������һ�е����ݣ�ֻ����һ��arraylist������˵�ˣ�����������Ҫ��ɨ�������������ǰ�ߵĻ�������Ӻ���ǰɨ������������ߵĻ�����������ɨ
����ÿһ������֪�������ǰ����ɨ����i��Ԫ�ص�ֵ������һ�е�res[i]+res[i+1]�����Կ�����������ǰ���ģ��������ֻ��һ�пռ䣬��ô��Ҫ�����ݾͻᱻ���ǵ������������ȡ�ķ����ǴӺ���ǰɨ������ÿ����Ҫ�����ݾ���res[i]+res[i-1]��������Ҫ�����ݲ��ᱻ���ǣ���Ϊ��Ҫ��res[i]ֻ�ڵ�ǰ���ã���һ���Ͳ���Ҫ�ˡ���������ڶ�̬�滮ʡ�ռ�ʱҲ����ʹ�ã���Ҫ���ǿ�������Ҫ��������ԭ�������ݻ����µ��������������Ǳ����ķ���
�Ӻ���ǰɨ�ĸ���д���´���Ĵ��� �о�Ӧ���������ģ� 3+1 = 4 ��4����ԭ��1��λ�ã���Ϊ�´�������3+3������ 4 ������һ��1 ����Ӱ�� �����ǰ����Ļ�
1+3 = 4 4���Ҫ�ŵ���1��3��λ�� �´ξͻᱻȡ���ˡ�
     121 
    1331
   14641

 */
public class LeetCode119 {

	  public List<Integer> getRow(int rowIndex) {
	     
		  List<Integer> result = new ArrayList<Integer>();
		  
		  
		  if(rowIndex <= 0){
			  
			  return result;
			  
		  }
		  
		  result.add(1);
		  
		  // ����ļ�������ԡ�
		  for(int i=1 ; i<=rowIndex ; i++ ){
			  
			// ����ļ�������ԡ� J>=0 
			  for(int j = result.size()-2;j>=0;j--){
				  result.set(j+1,result.get(j)+result.get(j+1));
			  }
			  
		  }
		  result.add(1);
		  
		  return result;
		  
	    }
	
	
	
}