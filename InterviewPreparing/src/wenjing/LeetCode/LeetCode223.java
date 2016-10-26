package wenjing.LeetCode;
/*
 * LeetCode 223 矩形面积
一开始画图
以为会有多种情况，1 相交 （6种）2 不想交（2种）
但是归根结底都可以归纳成一种
A+B - 重合部分
A B 的部分面积就是右上角 减去左上角的点的长宽相乘的绝对值
重合部分 对于XY轴（高度,宽度），左下角较高的那个点 和 右上角较低的那个点作比较  
两个较低点之间比较高 H1 和 两个较高点之间比较低的那个点H2 如果H1>H2 则说明他们不重合 H = 0
同理 两个较低点之间比较靠左边的点W1 和两个较高点之间靠右边的点W2,如果W1在W2的右边，则说明他们不重合 W =0 ;
 

 */
public class LeetCode223 {
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	   int area1;
	   int area2;
	   int overWrittenArea;
	   
	   area1 = Math.abs((D-B)*(C-A));
	   area2 = Math.abs((H-F)*(G-E));
	   int over_h =  Math.max(B, F)>Math.min(H, D)?0:Math.min(D,H) - Math.max(B, F);
	   int over_w = Math.max(A, E)> Math.min(C, G)?0: Math.min(C, G)-Math.max(A, E);
	   overWrittenArea = Math.abs(over_h*over_w);
		 
	   return area1 + area2 - overWrittenArea;
		 
    }
}
