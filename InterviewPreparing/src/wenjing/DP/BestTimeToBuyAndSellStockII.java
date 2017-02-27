package wenjing.DP;

/**
 * Created by yamengwenjing on 2017-02-27.
 */
/*
只要有利润的时候加把利润添加上就可以了，因为不能同一天买卖，所以只要有利润就做
You thought too much. If you talk about multiple day, say 3 days,

and the price is 3,1,5, and you thought about 3 buy, 5 sell. But actually you will make the most if buy at 1 and sell at 5. If the price is 3,9,5,
 the best would just do 3->9, and forget about the 5. If 3,4,5, you can say 3->5 is the best, but my code will give you 3->4 and 4->5, which is the same.



 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int total = 0 ;
        for(int i = 0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                total = total+prices[i+1]-prices[i];
            }
        }
        return total;
    }
}
