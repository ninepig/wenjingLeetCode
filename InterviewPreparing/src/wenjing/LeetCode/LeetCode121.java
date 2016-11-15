package wenjing.LeetCode;

/*
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 */
public class LeetCode121 {

	//���˰���ֻ�����brutal force�ķ������������� ʱ���Ȼ����������走����
	 public static int brutalForceMaxProfit(int[] prices) {
	    
		 int buyingPrice=0,sellingPrice=0,biggestDifference=0;
		 int difference = 0;
		 
		 
		 for(int i = 0; i<prices.length;i++){
			 
			 buyingPrice = prices[i];
			 for(int j = i+1;j<prices.length;j++){
				 sellingPrice = prices[j];
				 if(buyingPrice>sellingPrice){
					 continue;
				 }
				 difference = sellingPrice-buyingPrice;
				 if(biggestDifference<difference){
					 biggestDifference = difference;
				 } 
			 }	 
		 }
		 
		 return biggestDifference;
		 
	    }
	
	//��������ܴ�������ʵ�����Ŀ����ľ��� ǰI����С�ĺ͵�I��֮�� ��Ϊ�������
	 public int maxProfit(int[] prices) {

		    if(prices==null|prices.length==0)return 0;
		    
		    int profit = 0;
		    int t1 = prices[0];//t1 �������һ���������͵ļ۸�Ҳ����ǰI-1���۸����

		    
		    for(int i=1;i<prices.length;i++){
		        if(prices[i]<t1){
		            t1=prices[i];
		        }else{
		            profit = prices[i]-t1>profit? prices[i]-t1:profit;
		        }
		    }
		    return profit;
		}
		
	 
	 public static void main(String[] args){
		 
		 int[] test = {7,1,5,3,6,4};
		 System.out.println(brutalForceMaxProfit(test));
	 }
	
	
}
