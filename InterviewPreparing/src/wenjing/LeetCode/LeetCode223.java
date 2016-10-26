package wenjing.LeetCode;
/*
 * LeetCode 223 �������
һ��ʼ��ͼ
��Ϊ���ж��������1 �ཻ ��6�֣�2 ���뽻��2�֣�
���ǹ����׶����Թ��ɳ�һ��
A+B - �غϲ���
A B �Ĳ�������������Ͻ� ��ȥ���Ͻǵĵ�ĳ�����˵ľ���ֵ
�غϲ��� ����XY�ᣨ�߶�,��ȣ������½ǽϸߵ��Ǹ��� �� ���Ͻǽϵ͵��Ǹ������Ƚ�  
�����ϵ͵�֮��Ƚϸ� H1 �� �����ϸߵ�֮��Ƚϵ͵��Ǹ���H2 ���H1>H2 ��˵�����ǲ��غ� H = 0
ͬ�� �����ϵ͵�֮��ȽϿ���ߵĵ�W1 �������ϸߵ�֮�俿�ұߵĵ�W2,���W1��W2���ұߣ���˵�����ǲ��غ� W =0 ;
 

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
