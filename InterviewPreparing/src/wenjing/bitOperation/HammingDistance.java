package wenjing.bitOperation;

/**
 * Created by yamengwenjing on 2017-02-16.
 */
/*
question:
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

找2个整数对应位置不同数的个数
 思路就是位运算，
 利用异或xor 得出相应位置不同数 为1的串，相同位置为0，然后再扫描这个interger，每一位和1 进行与操作，记录下1的数量即可。
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        //counter for result
        int count = 0;
        // do the xor
        int target = x ^ y ;
        // do the bit operation ,every time remove bit to right , then do and  operation with 1, count the number of 1
        for(int i= 0;i<=31;i++){
            count += (target>>1)&1;
        }
        return count;
    }


}
