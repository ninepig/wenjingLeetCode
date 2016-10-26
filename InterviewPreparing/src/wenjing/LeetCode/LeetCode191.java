package wenjing.LeetCode;

public class LeetCode191 {
	 // you need to treat n as an unsigned value
	
	//自己差一点就做对了！ 不过算法都是自己想出来的，问题是i应该是32 不是31， 因为我是从移动0位开始，最多需要移动31位，所以应该是I<=31 OR I <32
    public int hammingWeight(int n) {
        int counter = 0 ;
        int temp = 0;
        for(int i = 0; i<32;i++){
        	
        	temp = (n>>i)&1;
        	if(temp == 1)
        		counter++;
        	
        	
        }
        
        return counter;
        
    }
}
