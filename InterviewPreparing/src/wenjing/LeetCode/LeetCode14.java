package wenjing.LeetCode;

/*
 * 自己想的方法，一知半解，其实没想头彻，其实只要一旦有不同的前缀，就应该跳出循环，直接结束了。
还有就是没想出来怎么判断是否要比较的字符串是否有字符能和被拿来比较的字符比较
看了大神的代码 豁然开朗
其实整体思路和我差不多
大神的代码效率很低。 需要再看看别人的

 */
public class LeetCode14 {
	   public String longestCommonPrefix(String[] strs) {
	     
//		   if(strs == null){
//			   return null;
//		   }
//		   if(strs.length == 0){
//			   return "";
//		   }
//		   String result = "";
//		   String compareString = strs[0];
//		   boolean eqaulFlag ;
//		   
//		   for(int i = 0 ; i<compareString.length();i++){
//			   eqaulFlag =false ;
//		   for(int j = 1 ; j<strs.length;j++){
//			   //没有考虑char为空的情况
//			   
//			   if(strs[i].length()<=i||compareString.charAt(i)!=strs[j].charAt(i)){
//				   eqaulFlag =false ;
//				   break;   
//			   }else{
//				   eqaulFlag = true;
//			   }
//			   
//		   }
//		   if(eqaulFlag){
//			   result += compareString.charAt(i);
//		   }
//		   
//		   }
//		   
//		   return result;
		   
	
		   StringBuilder res = new StringBuilder();  
		    if(strs == null || strs.length==0)  
		        return res.toString();  
		    boolean sameFlag = true;  
		    int idx = 0;  
		    while(sameFlag)  
		    {  
		        for(int i=0;i<strs.length;i++)  
		        {  
		        	
		        	//这行写得好。。
		            if(strs[i].length()<=idx || strs[i].charAt(idx)!=strs[0].charAt(idx))  
		            {  
		                sameFlag = false;  
		                break;  
		            }  
		        }  
		        if(sameFlag)  
		            res.append(strs[0].charAt(idx));  
		        idx++;  
		    }  
		    return res.toString();  
		   
		   
	    }
}
