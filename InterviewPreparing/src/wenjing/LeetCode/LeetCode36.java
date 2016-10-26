package wenjing.LeetCode;

import java.util.HashMap;

/*
 * Leetcode 36 数独问题
自己的思路 每行 每列，每个矩阵都不能有重复的1--9的数字，用hashmap， 但是自己的方法肯定太复杂了。（不复杂，就是暴力处理- -）
自己的方法就错在最后每个block里面的操作，对于hashmap的key没有处理好，key必须是1--9 但是对于block里面 没有很明确的一到9，即不能重复，所以就用了board的值（因为他肯定不能有重复，有重复就错了）
没想到大神的和我一样。可以学习下数组的操作 最后一个针对每个block的方法。还有就是对char的操作 char 字符对应的数组 是char - ‘0’
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
