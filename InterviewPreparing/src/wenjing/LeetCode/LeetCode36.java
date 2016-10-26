package wenjing.LeetCode;

import java.util.HashMap;

/*
 * Leetcode 36 ��������
�Լ���˼· ÿ�� ÿ�У�ÿ�����󶼲������ظ���1--9�����֣���hashmap�� �����Լ��ķ����϶�̫�����ˡ��������ӣ����Ǳ�������- -��
�Լ��ķ����ʹ������ÿ��block����Ĳ���������hashmap��keyû�д���ã�key������1--9 ���Ƕ���block���� û�к���ȷ��һ��9���������ظ������Ծ�����board��ֵ����Ϊ���϶��������ظ������ظ��ʹ��ˣ�
û�뵽����ĺ���һ��������ѧϰ������Ĳ��� ���һ�����ÿ��block�ķ��������о��Ƕ�char�Ĳ��� char �ַ���Ӧ������ ��char - ��0��
http://blog.csdn.net/linhuanmars/article/details/20748171

 */
public class LeetCode36 {
	
	public boolean isValidSudoku(char[][] board) {
		HashMap<Integer, Character> testMap = new HashMap<>();
		
		//for row
		for(int i = 0 ; i<9;i++){
			testMap.clear();
			for(int j = 0 ; j<9 ; j++){
				if(board[i][j]!='.'){
					if(testMap.containsValue(board[i][j])){
						return false;
					}
					
						testMap.put(j, board[i][j]);
						
					
					
				}
			}
		}
		
		//for colomn
		for(int j = 0 ; j<9;j++){
			testMap.clear();
			for(int i = 0 ; i<9 ; i++){
				if(board[i][j]!='.'){
					if(testMap.containsValue(board[i][j])){
						return false;
					}
					
						testMap.put(i, board[i][j]);
						
					}
					
				}
			
		}
		
		//for square
		for(int block = 0;block<9;block++){
			testMap.clear();
			for(int i = block/3*3;i<block/3*3+3;i++){
				for(int j = block%3*3;j<block%3*3+3;j++){
					if(board[i][j]!='.'){
					if(testMap.containsValue(board[i][j])){
						return false;
					}
					
						testMap.put(board[i][j]-'0', board[i][j]);
						
					}
					
				}
			}
		}	
			
			
		
		
		

		return true;
    }
}
