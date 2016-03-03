package wenjing.LeetCode;
/*
 * leetcode299
bulls and cows
这道题目
一要考虑数的位置 二要考虑数的重复性
如果是bull的话 只要把位置和数字的大小都比较就可以了
但是cow的话就比较麻烦，因为数可能重复
一开始没想出来，看了答案后，这种要看数字重复出现多少次的就是维护一个integer的数组就好了，数作为index，出现次数作为value（之前碰到过的 没想明白#解题技巧）
只要这样一做，就能知道重复的cows有多少只了，然后这里又是一个技巧
用math.min比较两个数组的值。

 */
public class LeetCode299 {

	  public String getHint(String secret, String guess) {
	      
		  int[] secretInt = new int[10];
		  int[] guseeInt = new int[10];
		  int bullNumber = 0;
		  int cowNumber = 0;
		  for(int i = 0;i< secret.length();i++){
			  if(secret.charAt(i) == guess.charAt(i)){
				  bullNumber++;
			  }
			  else{
				  secretInt[secret.charAt(i)-'0']++;
				  guseeInt[guess.charAt(i)-'0']++;
			  }
		  }
		  for(int i = 0;i<10;i++){
			  cowNumber += Math.min(secretInt[i], guseeInt[i]);
		  }
	        
	        return bullNumber+"A"+cowNumber+"B";
	    }
		
}
