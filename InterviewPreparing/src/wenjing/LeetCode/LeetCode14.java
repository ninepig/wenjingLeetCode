package wenjing.LeetCode;

/*
 * �Լ���ķ�����һ֪��⣬��ʵû��ͷ������ʵֻҪһ���в�ͬ��ǰ׺����Ӧ������ѭ����ֱ�ӽ����ˡ�
���о���û�������ô�ж��Ƿ�Ҫ�Ƚϵ��ַ����Ƿ����ַ��ܺͱ������Ƚϵ��ַ��Ƚ�
���˴���Ĵ��� ��Ȼ����
��ʵ����˼·���Ҳ��
����Ĵ���Ч�ʺܵ͡� ��Ҫ�ٿ������˵�

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
//			   //û�п���charΪ�յ����
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
		        	
		        	//����д�úá���
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
