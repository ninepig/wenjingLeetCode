package wenjing.LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 119  帕斯卡三角形 2 得到某一行的值，但是 只用O（k）的空间复杂度
由于只能用O（k）的额外复杂度，所以不能用临时list来保存上一行的数据，只能用一个arraylist，大神说了，看数组所需要的扫动方向，如果是往前走的话，数组从后向前扫，如果是往后走的话，数组往后扫
对于每一行我们知道如果从前往后扫，第i个元素的值等于上一行的res[i]+res[i+1]，可以看到数据是往前看的，如果我们只用一行空间，那么需要的数据就会被覆盖掉。所以这里采取的方法是从后往前扫，这样每次需要的数据就是res[i]+res[i-1]，我们需要的数据不会被覆盖，因为需要的res[i]只在当前步用，下一步就不需要了。这个技巧在动态规划省空间时也经常使用，主要就是看我们需要的数据是原来的数据还是新的数据来决定我们遍历的方向。
从后往前扫的概念写了下大神的代码 感觉应该是这样的， 3+1 = 4 把4放在原来1的位置，因为下次用是用3+3，所以 4 替代最后一个1 不会影响 如果从前往后的话
1+3 = 4 4如果要放到第1个3的位置 下次就会被取代了。
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
		  
		  // 大神的技巧妙不可言。
		  for(int i=1 ; i<=rowIndex ; i++ ){
			  
			// 大神的技巧妙不可言。 J>=0 
			  for(int j = result.size()-2;j>=0;j--){
				  result.set(j+1,result.get(j)+result.get(j+1));
			  }
			  
		  }
		  result.add(1);
		  
		  return result;
		  
	    }
	
	
	
}
