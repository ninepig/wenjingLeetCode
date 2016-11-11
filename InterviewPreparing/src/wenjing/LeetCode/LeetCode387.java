package wenjing.LeetCode;
/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 */
public class LeetCode387 {
	/*
	 * �����Ҫ�ҵ���first char's index�� ���������⣬������˳���array�����Ƚϣ�����˳��ͱ��ˣ�һ��ʼ��˼·������
	 */
	 public static int firstUniqChar(String s) {
//		 int targetIndex = 0;
//	       int[] resultArray = new int[26];
//	       for(int i =0 ; i< s.length();i++){
//	    	   resultArray[s.charAt(i)-'a']++;
//	       }
//	       for(;targetIndex<s.length();targetIndex++){
//	    	   if(resultArray[targetIndex]==1){
//	    		   return targetIndex;
//	    	   }
//	       }
//	       return -1;

	 //�ñ���������һ���Ƚ�ʣ�µģ����ظ���������û���ظ��ľ�������,�ⷨ���������⣬���ǵò���ϸ��
		 //��ȷ�ı�������
//		 char [] charr = s.toCharArray();
//			for(int i=0;i<charr.length;i++){
//				if(s.indexOf(s.charAt(i), i+1) == -1 ){
//				if(s.indexOf(s.charAt(i)) == i){
//					return i;
//				}
//				}
//			}
//			return -1;
		 //����ǻ����ҵ�һ�ַ����ģ� ά����һ�������index���飬�ҳ�˭���ȱ��ų����ģ��ҵ��Ǹ���С�� ���ؼ���
		    int array_num[] = new int[26];
	        int array_index[] = new int[26];
	        char char_array[] = s.toCharArray();
	        int length = char_array.length;
	        for (int i = 0; i < length; i++) {
	            char c = char_array[i];
	            array_num[c-'a']++;
	            array_index[c-'a'] = i;
	        }
	        int min_index = -1;
	        for (int j = 0; j < array_num.length; j++) {
	            if (array_num[j] == 1) {
	                if (min_index != -1) {
	                    if (min_index > array_index[j]) {
	                        min_index = array_index[j];
	                    }
	                } else {
	                    min_index = array_index[j];
	                }
	            }
	        }
	        return min_index;
		 
		 
		 }
	 
	 public static void main(String[] args){
		String testString = "loveleetcode";
		System.out.println(firstUniqChar(testString));
	 }
}
