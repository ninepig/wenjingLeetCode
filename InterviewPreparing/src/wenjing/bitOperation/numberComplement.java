package wenjing.bitOperation;

/**
 * Created by yamengwenjing on 2017-02-16.
 */
/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.

这个题是计算出某个整数，（二进制number 第一位非0），对右侧（第一位非0开始）的部分取余，然后计算取余后的值
看了答案 有个非常巧妙地方法
  int mask = (Integer.highestOneBit(number) << 1) - 1;
  这个操作可以获取到 从左侧数第一位非0位，到右侧结束有几位，并全部给你1的标识符，比如说0100，这个mask 会给你 111
  Create a bit mask which has N bits of 1 from RIGHTMOST. In above example, the mask is 111. And we can use the decent Java built-in function Integer.highestOneBit to get the LEFTMOST bit of 1, left shift one, and then minus one. Please remember this wonderful trick to create bit masks with N ones at RIGHTMOST, you will be able to use it later.
    然后记住 java中取非的操作符~ 按位取非。
    有了这两个就可以计算出题目需求的答案了
    举例 5
    0000······ 0101
    第一步 mask
    111
    第二步取非
    11111*****1010
    用000000000***111 和他相与得出结果
 */
public class numberComplement {
    public int findComplement(int num) {
        // 获取num 第一位为1，并且让mask 变成111的形式
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        num = ~ num;
        return mask&num;
    }
}
